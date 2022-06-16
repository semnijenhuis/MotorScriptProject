package nl.saxion.cos.compiler;

import nl.saxion.cos.*;
import nl.saxion.cos.type.DataType;
import nl.saxion.cos.type.symbol.SymbolTable;
import nl.saxion.cos.type.symbol.FunctionSymbol;
import nl.saxion.cos.type.symbol.ObjectSymbol;
import nl.saxion.cos.type.symbol.VariableSymbol;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

public class CodeGenerator extends MotorScriptLangBaseVisitor<Void> {
    private final ParseTreeProperty<DataType> types;
    private final JasminBytecode jasminBytecode;
    private final ParseTreeProperty<SymbolTable> scopes;
    private final String className;

    private int labelCount = 0;
    private int labelCountCompare = 0;
    private int labelCountWhile = 0;

    private static final String LABEL_TRUE = "isTrue";
    private static final String LABEL_FALSE = "isFalse";
    private static final String LABEL_END = "end";
    private static final String LABEL_START = "start";
    private static final String LABEL_GOTO = "goto ";
    private static final String LABEL_FCMPG = "fcmpg";
    private static final String LABEL_IFEQ = "ifeq ";
    private static final String TRUE = "iconst_1";
    private static final String FALSE = "iconst_0";
    private static final String ALOAD = "aload ";
    private static final String STORE = "store ";


    public CodeGenerator(ParseTreeProperty<DataType> types,
                         JasminBytecode jasminBytecode,
                         ParseTreeProperty<SymbolTable> scope, String className) {
        this.types = types;
        this.jasminBytecode = jasminBytecode;
        this.scopes = scope;
        this.className = className;
    }

    @Override
    public Void visitFunctionDecl(MotorScriptLangParser.FunctionDeclContext ctx) {
        // Skip this, because we're visiting it in a different visitor
        return null;
    }



    @Override
    public Void visitFunctionCall(MotorScriptLangParser.FunctionCallContext ctx) {
        SymbolTable symbolTable = this.scopes.get(ctx);
        FunctionSymbol functionSymbol = (FunctionSymbol) symbolTable.lookup(ctx.IDENTIFIER().getText());

        StringBuilder arguments = new StringBuilder();
        for (DataType argument : functionSymbol.getParamTypes()) {
            arguments.append(argument.getDescriptor());
        }

        jasminBytecode.add("invokestatic " + className + "/" + functionSymbol.getName() + "(" + arguments + ")" + functionSymbol.getReturnType().getDescriptor());

        return null;
    }

    @Override
    public Void visitPrintStmt(MotorScriptLangParser.PrintStmtContext ctx) {
        DataType dataType = types.get(ctx.expression());

        jasminBytecode.add("getstatic java/lang/System/out Ljava/io/PrintStream;");
        visit(ctx.expression());
        jasminBytecode.add("invokevirtual java/io/PrintStream/println(" + dataType.getDescriptor() + ")V");

        return null;
    }

    @Override
    public Void visitExprStringLiteral(MotorScriptLangParser.ExprStringLiteralContext ctx) {
        jasminBytecode.add("ldc " + ctx.STRING().getText());
        return null;
    }

    @Override
    public Void visitExprNumbLiteral(MotorScriptLangParser.ExprNumbLiteralContext ctx) {
        jasminBytecode.add("ldc " + ctx.INLINE4().getText());
        return null;
    }

    @Override
    public Void visitExprFloatLiteral(MotorScriptLangParser.ExprFloatLiteralContext ctx) {
        jasminBytecode.add("ldc " + ctx.FLAT4().getText());
        return null;
    }

    @Override
    public Void visitExprBoolLiteral(MotorScriptLangParser.ExprBoolLiteralContext ctx) {

        if (ctx.booleanLiteral().TRUE() != null) {
            jasminBytecode.add(TRUE);
        } else if (ctx.booleanLiteral().FALSE() != null) {
            jasminBytecode.add(FALSE);
        } else {
            throw new CompilerException("Boolean literal not recognized");
        }
        return null;
    }

    @Override
    public Void visitExprAddOp(MotorScriptLangParser.ExprAddOpContext ctx) {
        visit(ctx.left);
        visit(ctx.right);

        String op = ctx.op.getText();
        DataType dataType = types.get(ctx.left);
        typeHandler(op, dataType);
        return null;
    }

    @Override
    public Void visitExprMulDivOp(MotorScriptLangParser.ExprMulDivOpContext ctx) {
        visit(ctx.left);
        visit(ctx.right);

        String op = ctx.op.getText();
        DataType type = types.get(ctx.left);
        typeHandler(op, type);
        return null;
    }

    void typeHandler(String type, DataType dataType) {
        switch (type) {
            case "upshift":
                if (dataType == DataType.INT) {
                    jasminBytecode.add("iadd");
                } else if (dataType == DataType.FLOAT) {
                    jasminBytecode.add("fadd");
                }
                break;
            case "downshift":
                if (dataType == DataType.INT) {
                    jasminBytecode.add("isub");
                } else if (dataType == DataType.FLOAT) {
                    jasminBytecode.add("fsub");
                }
                break;
            case "nitro":
                if (dataType == DataType.INT) {
                    jasminBytecode.add("imul");
                } else if (dataType == DataType.FLOAT) {
                    jasminBytecode.add("fmul");
                }
                break;
            case "divide":
                if (dataType == DataType.INT) {
                    jasminBytecode.add("idiv");
                } else if (dataType == DataType.FLOAT) {
                    jasminBytecode.add("fdiv");
                }
                break;
            default:
                throw new CompilerException("Operator not recognized");
        }
    }


    @Override
    public Void visitExprIdentifier(MotorScriptLangParser.ExprIdentifierContext ctx) {
        SymbolTable symbolTable = this.scopes.get(ctx);
        VariableSymbol variableSymbol = (VariableSymbol) symbolTable.lookup(ctx.IDENTIFIER().getText());
        jasminBytecode.add(variableSymbol.getDataType().getMnemonic() + "load " + variableSymbol.getIndex());
        return null;
    }


    @Override
    public Void visitExprEqualityOp(MotorScriptLangParser.ExprEqualityOpContext ctx) {
        visit(ctx.left);
        visit(ctx.right);

        DataType type = types.get(ctx.left);
        String op = ctx.op.getText();

        comparisonHandler(type, op);
        labelHandler();
        return null;
    }

    @Override
    public Void visitExprCompareOp(MotorScriptLangParser.ExprCompareOpContext ctx) {
        visit(ctx.left);
        visit(ctx.right);

        DataType type = types.get(ctx.left);
        String op = ctx.op.getText();

        comparisonHandler(type, op);
        labelHandler();
        return null;
    }

    void comparisonHandler(DataType type, String op) {
        switch (op) {
            case "==":
                if (type == DataType.INT) {
                    jasminBytecode.add("if_icmpeq " + LABEL_TRUE + labelCountCompare++);
                } else if (type == DataType.FLOAT) {
                    jasminBytecode.add(LABEL_FCMPG);
                    jasminBytecode.add(LABEL_IFEQ + LABEL_TRUE + labelCountCompare++);
                }
                break;
            case "!=":
                if (type == DataType.INT) {
                    jasminBytecode.add("if_icmpne " + LABEL_TRUE + labelCountCompare++);
                } else if (type == DataType.FLOAT) {
                    jasminBytecode.add(LABEL_FCMPG);
                    jasminBytecode.add("ifne " + LABEL_TRUE + labelCountCompare++);
                }
                break;
            case "<":
                if (type == DataType.INT) {
                    jasminBytecode.add("if_icmplt " + LABEL_TRUE + labelCountCompare++);
                } else if (type == DataType.FLOAT) {
                    jasminBytecode.add(LABEL_FCMPG);
                    jasminBytecode.add("iflt " + LABEL_TRUE + labelCountCompare++);
                }
                break;
            case ">":
                if (type == DataType.INT) {
                    jasminBytecode.add("if_icmpgt " + LABEL_TRUE + labelCountCompare++);
                } else if (type == DataType.FLOAT) {
                    jasminBytecode.add(LABEL_FCMPG);
                    jasminBytecode.add("ifgt " + LABEL_TRUE + labelCountCompare++);
                }
                break;
            default:
                throw new CompilerException("Comparison handler cannot compute type");
        }
    }

    void labelHandler() {
        jasminBytecode.add(LABEL_FALSE + (labelCountCompare -1)  +":");
        jasminBytecode.add(FALSE);
        jasminBytecode.add(LABEL_GOTO + LABEL_END + (labelCount));
        jasminBytecode.add(LABEL_TRUE + (labelCountCompare -1) +":");
        jasminBytecode.add(TRUE);
        jasminBytecode.add(LABEL_END+ (labelCount++) +":");
    }

    @Override
    public Void visitIfStmt(MotorScriptLangParser.IfStmtContext ctx) {
        // visit(ctx.condition) will put either a 1 or 0 on the stack (1 if true, 0 if false)
        visit(ctx.condition);

        // pop the value off the stack and compare it to 0 )
        jasminBytecode.add(LABEL_IFEQ + LABEL_END + ++labelCount);
        // if it is 0 then we skip this block
        visit(ctx.blockStmt());
        jasminBytecode.add(LABEL_GOTO + LABEL_END + ++labelCount);

        // if we get here then the condition is false so we check if there is an else block and visit it
        jasminBytecode.add(LABEL_END + (--labelCount) + ":");
        if (ctx.elseBlock() != null) {
            visit(ctx.elseBlock());
        }
        // label to jump to end of statement after the block has been visited
        jasminBytecode.add(LABEL_END + (++labelCount) + ":");

        return null;
    }

    @Override
    public Void visitWhileLoop(MotorScriptLangParser.WhileLoopContext ctx) {
        // label to jump to if the condition is (still) false
        jasminBytecode.add(LABEL_START + (labelCountWhile) + ":");

        // visit the condition (again)
        visit(ctx.condition);

        // pop the value off the stack and compare it to 0 )
        jasminBytecode.add(LABEL_IFEQ + LABEL_END + (++labelCount));
        visit(ctx.blockStmt());

        // jump back to the start of the loop
        jasminBytecode.add(LABEL_GOTO + LABEL_START + (labelCountWhile++));
        // label to jump to if the condition is true
        jasminBytecode.add(LABEL_END + (labelCount) + ":");

        return null;
    }



    @Override
    public Void visitArrayAssign(MotorScriptLangParser.ArrayAssignContext ctx) {
        SymbolTable symbolTable = scopes.get(ctx);
        ObjectSymbol objectSymbol = (ObjectSymbol) symbolTable.lookup(ctx.IDENTIFIER().getText());

        jasminBytecode.add(ALOAD + objectSymbol.getIndex());
        visit(ctx.index);
        visit(ctx.data);

        if (types.get(ctx.data) == DataType.INT) {
            jasminBytecode.add("iastore");
        }

        return null;
    }


    @Override
    public Void visitArray(MotorScriptLangParser.ArrayContext ctx) {
        SymbolTable symbolTable = scopes.get(ctx);
        ObjectSymbol symbol = (ObjectSymbol) symbolTable.lookup(ctx.IDENTIFIER().toString());

        if (symbol == null) {
            throw new CompilerException("Symbol " + ctx.IDENTIFIER().toString() + " not found");
        }
        visit(ctx.arraysize);

        jasminBytecode.add("newarray int");
        jasminBytecode.add("astore " + symbol.getIndex());

        return null;
    }


    @Override
    public Void visitExprArray(MotorScriptLangParser.ExprArrayContext ctx) {
        ObjectSymbol objectSymbol = (ObjectSymbol) scopes.get(ctx).lookup(ctx.IDENTIFIER().getText());

        jasminBytecode.add(ALOAD + objectSymbol.getIndex());
        visit(ctx.expression());
        jasminBytecode.add("iaload");

        return null;
    }

    @Override
    public Void visitScannerDecl(MotorScriptLangParser.ScannerDeclContext ctx) {
        SymbolTable symbolTable = this.scopes.get(ctx);
        ObjectSymbol objectSymbol = (ObjectSymbol) symbolTable.lookup(ctx.IDENTIFIER().getText());

        jasminBytecode.add("new java/util/Scanner");
        jasminBytecode.add("dup");
        jasminBytecode.add("getstatic java/lang/System/in Ljava/io/InputStream;");
        jasminBytecode.add("invokenonvirtual java/util/Scanner/<init>(Ljava/io/InputStream;)V");
        jasminBytecode.add("astore " + objectSymbol.getIndex());

        return null;
    }

    @Override
    public Void visitExprScanner(MotorScriptLangParser.ExprScannerContext ctx) {
        SymbolTable symbolTable = this.scopes.get(ctx);
        VariableSymbol variableSymbol = (VariableSymbol) symbolTable.lookup(ctx.scanner().int_id.getText());
        ObjectSymbol objectSymbol = (ObjectSymbol) symbolTable.lookup(ctx.scanner().scanner_id.getText());

        DataType dataType = variableSymbol.getDataType();

        jasminBytecode.add(ALOAD + objectSymbol.getIndex());

        if (dataType == DataType.INT) {
            jasminBytecode.add("invokevirtual java/util/Scanner.nextInt()" + variableSymbol.getDataType().getDescriptor());
            jasminBytecode.add(variableSymbol.getDataType().getMnemonic() + STORE + variableSymbol.getIndex());
        } else if (dataType == DataType.STRING) {
            jasminBytecode.add("invokevirtual java/util/Scanner.nextLine()" + variableSymbol.getDataType().getDescriptor());
            jasminBytecode.add(variableSymbol.getDataType().getMnemonic() + STORE + symbolTable.getLastUsedIndex());
        }


        return null;
    }

    @Override
    public Void visitExprAndOp(MotorScriptLangParser.ExprAndOpContext ctx) {
        // visit the left operand
        visit(ctx.left);
        visit(ctx.right);
        jasminBytecode.add("iand");
        return null;
    }

    @Override
    public Void visitExprOrOp(MotorScriptLangParser.ExprOrOpContext ctx) {
        // visit the left operand
        visit(ctx.left);
        visit(ctx.right);
        jasminBytecode.add("ior");
        return null;
    }

    @Override
    public Void visitExprIncrement(MotorScriptLangParser.ExprIncrementContext ctx) {
        SymbolTable symbolTable = this.scopes.get(ctx);
        VariableSymbol variableSymbol = (VariableSymbol) symbolTable.lookup(ctx.IDENTIFIER().getText());

        jasminBytecode.add("iload " + variableSymbol.getIndex());
        jasminBytecode.add(TRUE);

        String operator = ctx.incr_decr().getText();
        if ("^^".equals(operator)) {
            jasminBytecode.add("iadd");
        } else if ("--".equals(operator)) {
            jasminBytecode.add("isub");
        }

        jasminBytecode.add("istore " + variableSymbol.getIndex());

        return null;
    }

    @Override
    public Void visitVarDecleration(MotorScriptLangParser.VarDeclerationContext ctx) {
        SymbolTable symbolTable = this.scopes.get(ctx);
        VariableSymbol variableSymbol = (VariableSymbol) symbolTable.lookup(ctx.IDENTIFIER().getText());
        visit(ctx.expression());

        jasminBytecode.add(variableSymbol.getDataType().getMnemonic() + STORE + variableSymbol.getIndex());
        return null;
    }

}
