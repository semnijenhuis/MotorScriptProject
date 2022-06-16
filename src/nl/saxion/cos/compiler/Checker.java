package nl.saxion.cos.compiler;

import nl.saxion.cos.MotorScriptLangBaseVisitor;
import nl.saxion.cos.MotorScriptLangParser;
import nl.saxion.cos.type.DataType;
import nl.saxion.cos.type.symbol.SymbolTable;
import nl.saxion.cos.type.symbol.FunctionSymbol;
import nl.saxion.cos.type.symbol.ObjectSymbol;
import nl.saxion.cos.type.symbol.Symbol;
import nl.saxion.cos.type.symbol.VariableSymbol;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

public class Checker extends MotorScriptLangBaseVisitor<DataType> {

    private final ParseTreeProperty<DataType> types;
    private final ParseTreeProperty<SymbolTable> scopes;
    private SymbolTable currentScope;

    private static final String INT = "inline4";
    private static final String FLOAT = "flat4";
    private static final String STRING = "sentence";
    private static final String BOOL = "ev";
    private static final String VOID = "void";


    public Checker(ParseTreeProperty<DataType> types, ParseTreeProperty<SymbolTable> scopes) {
        this.types = types;
        this.scopes = scopes;
        this.currentScope = new SymbolTable(null, 0);

    }

    @Override
    public DataType visitPrintStmt(MotorScriptLangParser.PrintStmtContext ctx) {
        DataType dataType = visit(ctx.expression());

        if (dataType == null) {
            throw new CompilerException("Type of expression is null");
        }

        types.put(ctx, dataType);
        return dataType;
    }

    @Override
    public DataType visitExprNumbLiteral(MotorScriptLangParser.ExprNumbLiteralContext ctx) {
        types.put(ctx, DataType.INT);
        return DataType.INT;
    }

    @Override
    public DataType visitExprStringLiteral(MotorScriptLangParser.ExprStringLiteralContext ctx) {
        types.put(ctx, DataType.STRING);
        return DataType.STRING;
    }

    @Override
    public DataType visitExprFloatLiteral(MotorScriptLangParser.ExprFloatLiteralContext ctx) {
        types.put(ctx, DataType.FLOAT);
        return DataType.FLOAT;
    }

    @Override
    public DataType visitExprBoolLiteral(MotorScriptLangParser.ExprBoolLiteralContext ctx) {
        types.put(ctx, DataType.BOOL);
        return DataType.BOOL;
    }

    @Override
    public DataType visitDeclaration(MotorScriptLangParser.DeclarationContext ctx) {
        String name = ctx.IDENTIFIER().getText();

        DataType type = switch (ctx.type().getText()) {
            case INT -> DataType.INT;
            case FLOAT -> DataType.FLOAT;
            case STRING -> DataType.STRING;
            case BOOL -> DataType.BOOL;
            default -> throw new CompilerException("unknown declaration type: " + ctx.type().getText());
        };

        this.currentScope.addVariableSymbol(name, type);
        this.scopes.put(ctx, this.currentScope);
        types.put(ctx, type);
        return null;
    }

    @Override
    public DataType visitVarDecleration(MotorScriptLangParser.VarDeclerationContext ctx) {
        DataType exprType = visit(ctx.expression());
        DataType varType = null;
        String name = ctx.IDENTIFIER().getText();

        if (ctx.type() == null) {
            varType = exprType; // Comment this code out to disable type inference.
        } else {
            varType = switch (ctx.type().getText()) {
                case INT -> typeHandler(name, exprType, DataType.INT);
                case FLOAT -> typeHandler(name, exprType, DataType.FLOAT);
                case STRING -> typeHandler(name, exprType, DataType.STRING);
                case BOOL -> typeHandler(name, exprType, DataType.BOOL);
                default -> throw new CompilerException("Unknown type " + ctx.type().getText());
            };
        }

        types.put(ctx, varType);
        this.currentScope.addVariableSymbol(name, varType);
        this.scopes.put(ctx, this.currentScope);

        return null;
    }

    DataType typeHandler(String name, DataType exprType, DataType type) {
        if (exprType != type) {
            throw new CompilerException(name + " should be an " + type + " but is " + exprType);
        }
        return type;
    }

    @Override
    public DataType visitExprIdentifier(MotorScriptLangParser.ExprIdentifierContext ctx) {
        Symbol symbol = this.currentScope.lookup(ctx.IDENTIFIER().getText());

        if (symbol == null) {
            throw new CompilerException("Variable '" + ctx.IDENTIFIER().getText() + "' does not exist.");
        }
        if (!(symbol instanceof VariableSymbol)) {
            throw new CompilerException("IDENTIFIER is not a variable: " + ctx.IDENTIFIER().getText() + "it is a " + symbol.getClass().getSimpleName());
        }
        DataType type = ((VariableSymbol) symbol).getDataType();

        this.currentScope.addVariableSymbol(ctx.IDENTIFIER().getText(), type);
        this.scopes.put(ctx, this.currentScope);
        types.put(ctx, type);
        return type;
    }

    @Override
    public DataType visitExprAddOp(MotorScriptLangParser.ExprAddOpContext ctx) {
        DataType leftType = visit(ctx.left);
        DataType rightType = visit(ctx.right);

        if (leftType == null) {
            throw new CompilerException("Type of left expression is null");
        }
        System.getLogger("leftType: " + leftType);
        if (leftType != rightType) {
            throw new CompilerException("The values cannot be added/subtracted because they need to be the same type");
        }
        types.put(ctx, leftType);
        return leftType;
    }

    @Override
    public DataType visitExprMulDivOp(MotorScriptLangParser.ExprMulDivOpContext ctx) {
        DataType leftType = visit(ctx.left);
        DataType rightType = visit(ctx.right);
        if (leftType != rightType) {
            throw new CompilerException("The values cannot be multiplied/divided because they need to be of the same type");
        }
        types.put(ctx, leftType);
        return leftType;
    }

    @Override
    public DataType visitExprEqualityOp(MotorScriptLangParser.ExprEqualityOpContext ctx) {
        DataType leftType = visit(ctx.left);
        DataType rightType = visit(ctx.right);
        if (leftType != rightType) {
            throw new CompilerException("'" + ctx.left.getText() + "' & '" + ctx.right.getText() + "' should be of the same type to be compared");
        }
        types.put(ctx, DataType.BOOL);
        return DataType.BOOL;
    }

    @Override
    public DataType visitExprCompareOp(MotorScriptLangParser.ExprCompareOpContext ctx) {
        DataType leftType = visit(ctx.left);
        DataType rightType = visit(ctx.right);
        if (leftType != rightType) {
            throw new CompilerException("'" + ctx.left.getText() + "' & '" + ctx.right.getText() + "' need to be of the same type to be compared");
        }
        types.put(ctx, DataType.BOOL);
        return DataType.BOOL;
    }

    @Override
    public DataType visitIfStmt(MotorScriptLangParser.IfStmtContext ctx) {
        if (visit(ctx.condition) != DataType.BOOL)
            throw new CompilerException("Condition of if-statement must be boolean");

        visitChildren(ctx);

        return null;
    }

    @Override
    public DataType visitWhileLoop(MotorScriptLangParser.WhileLoopContext ctx) {
        if (visit(ctx.condition) != DataType.BOOL)
            throw new CompilerException("Condition of while-loop must be boolean");

        visitChildren(ctx);

        return null;
    }

    @Override
    public DataType visitBlockStmt(MotorScriptLangParser.BlockStmtContext ctx) {
        this.scopes.put(ctx, this.currentScope);

        this.currentScope = this.currentScope.openScope(currentScope.getLastUsedIndex() - 1);

        visitChildren(ctx);

        this.currentScope = this.currentScope.closeScope();
        return null;
    }

    @Override
    public DataType visitExprIncrement(MotorScriptLangParser.ExprIncrementContext ctx) {
        VariableSymbol variableSymbol = (VariableSymbol) currentScope.lookup(ctx.IDENTIFIER().getText());
        DataType type = variableSymbol.getDataType();
        if (type != DataType.INT) {
            throw new CompilerException("Cannot increment/decrement a variable of type " + type);
        }

        types.put(ctx, type);
        this.scopes.put(ctx, this.currentScope);
        return null;
    }

    @Override
    public DataType visitExprParenthesis(MotorScriptLangParser.ExprParenthesisContext ctx) {
        DataType subType = visit(ctx.expression());
        types.put(ctx, subType);
        return subType;
    }

    @Override
    public DataType visitExprAndOp(MotorScriptLangParser.ExprAndOpContext ctx) {
        DataType leftType = visit(ctx.left);
        DataType rightType = visit(ctx.right);
        if (leftType != DataType.BOOL || rightType != DataType.BOOL) {
            throw new CompilerException("Both expression types of '&&' ~ 'AND' must be booleans");
        }
        types.put(ctx, DataType.BOOL);
        return DataType.BOOL;
    }

    @Override
    public DataType visitExprOrOp(MotorScriptLangParser.ExprOrOpContext ctx) {
        DataType leftType = visit(ctx.left);
        DataType rightType = visit(ctx.right);
        if (leftType != DataType.BOOL || rightType != DataType.BOOL) {
            throw new CompilerException("Both expression types of '||' ~ 'OR' must be booleans");
        }
        types.put(ctx, DataType.BOOL);
        return DataType.BOOL;
    }

    @Override
    public DataType visitArray(MotorScriptLangParser.ArrayContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        String arrayType = ctx.arrayType.getText();
        String arraysize = ctx.arraysize.getText();
        DataType type = visit(ctx.arraysize);


        if (!arrayType.equals(INT)) {
            throw new CompilerException("Only array types of INT are supported");
        } else if (type != DataType.INT) {
            throw new CompilerException("Size must be a number");

        } else if (arraysize.equals("0")) {
            throw new CompilerException("Size cannot be 0");
        } else if (arraysize.startsWith("-")) {
            throw new CompilerException("Size cannot be a negative number");
        } else if (!arrayType.equals(ctx.arraysizeType.getText())) {
            throw new CompilerException("Both types must be the same");
        }


        this.currentScope.addObjectSymbol(name);
        this.scopes.put(ctx, this.currentScope);

        return null;
    }

    @Override
    public DataType visitExprArray(MotorScriptLangParser.ExprArrayContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        Symbol symbol = this.currentScope.lookup(name);
        DataType exprType = visit(ctx.expression());
        String index = ctx.expression().getText();

        arrayHandler(null, exprType, symbol, name, index);

        this.scopes.put(ctx, this.currentScope);

        types.put(ctx, DataType.INT);
        return DataType.INT;
    }

    @Override
    public DataType visitArrayAssign(MotorScriptLangParser.ArrayAssignContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        Symbol symbol = this.currentScope.lookup(name);
        DataType type = visit(ctx.index);
        DataType exprType = visit(ctx.data);
        String index = ctx.index.getText();

        arrayHandler(type, exprType, symbol, name, index);

        this.scopes.put(ctx, this.currentScope);
        return null;
    }

    void arrayHandler(DataType type, DataType exprType, Symbol symbol, String name, String index) {

        if (symbol == null) {
            throw new CompilerException("arrays.md " + name + " does not exist");
        }

        if (!(symbol instanceof ObjectSymbol)) {
            throw new CompilerException("Symbol " + name + " is not an ObjectSymbol");
        }

        if ((type != null) && type != DataType.INT) {
            throw new CompilerException("arrays.md index must be a number");
        }

        if ((index != null) && index.startsWith("-")) {
            throw new CompilerException("arrays.md index cannot be a negative number");
        }

        if ((exprType != null) && exprType != DataType.INT) {
            throw new CompilerException("Data to add to array must be a number");
        }
    }

    @Override
    public DataType visitScannerDecl(MotorScriptLangParser.ScannerDeclContext ctx) {
        String name = ctx.IDENTIFIER().getText();

        if (this.currentScope.lookup(name) != null) {
            throw new CompilerException("Symbol " + name + " already exists");
        }

        this.currentScope.addObjectSymbol(name);
        this.scopes.put(ctx, this.currentScope);
        return null;
    }

    @Override
    public DataType visitExprScanner(MotorScriptLangParser.ExprScannerContext ctx) {
        Symbol symbol = this.currentScope.lookup(ctx.scanner().int_id.getText());
        if (symbol == null) {
            throw new CompilerException("Variable " + ctx.scanner().int_id.getText() + " is not declared");
        }
        if (!(symbol instanceof VariableSymbol)) {
            throw new CompilerException("IDENTIFIER is not a variable it is a " + symbol.getClass().getSimpleName());
        }

        DataType type = ((VariableSymbol) symbol).getDataType();

        if (type != DataType.INT && type != DataType.STRING) {
            throw new CompilerException("Cannot use scanner on a variable of type " + type);
        } else {
            types.put(ctx, type);
            this.scopes.put(ctx, this.currentScope);
            return type;
        }
    }

    DataType getType(String type) {
        return switch (type) {
            case INT -> DataType.INT;
            case FLOAT -> DataType.FLOAT;
            case STRING -> DataType.STRING;
            case BOOL -> DataType.BOOL;
            case VOID -> DataType.VOID;
            default -> null;
        };

    }

    @Override
    public DataType visitFunctionDecl(MotorScriptLangParser.FunctionDeclContext ctx) {
        DataType type = getType(ctx.type().getText());
        DataType[] argumentTypes = new DataType[0];

//        implement function parameters here
        if (ctx.arguments() != null) {
            argumentTypes = new DataType[ctx.arguments().children.size()];
            for (int i = 0; i < argumentTypes.length; i++) {
                argumentTypes[i] = getType(ctx.arguments().getChild(0).getChild(0).getText());
            }
        }

        //add the return-type to the types map
        types.put(ctx, type);

        this.currentScope.addFunctionSymbol(ctx.IDENTIFIER().getText(), type, argumentTypes);
        this.currentScope = this.currentScope.openFunctionScope();

        //open a scope and visit the function body
        visitChildren(ctx);
        this.currentScope = this.currentScope.closeScope();

        //add the scope to the scopes map
        this.scopes.put(ctx, this.currentScope);
        return type;
    }

    @Override
    public DataType visitFunctionCall(MotorScriptLangParser.FunctionCallContext ctx) {
        FunctionSymbol functionSymbol = (FunctionSymbol) this.currentScope.lookup(ctx.IDENTIFIER().getText());
        if (functionSymbol == null) {
            throw new CompilerException("Function " + ctx.IDENTIFIER().getText() + " is not declared");
        }

        if (!(functionSymbol instanceof FunctionSymbol)) {
            throw new CompilerException("IDENTIFIER is not a function it is a " + functionSymbol.getClass().getSimpleName());
        }

        this.scopes.put(ctx, this.currentScope);

        return functionSymbol.getReturnType();

    }

        @Override
    public DataType visitFunctionBody(MotorScriptLangParser.FunctionBodyContext ctx) {
        this.scopes.put(ctx, this.currentScope);

        visitChildren(ctx);

        if (ctx.returnStmt() == null) {
            types.put(ctx, DataType.VOID);
            return DataType.VOID;
        } else {
            System.out.println(ctx.parent.getPayload().getText());
            DataType returnType = visit(ctx.returnStmt().expression());

            types.put(ctx, returnType);
            return returnType;
        }

    }

    void bla() {
        while (true) {
            System.out.println("bla");
        }
    }

}
