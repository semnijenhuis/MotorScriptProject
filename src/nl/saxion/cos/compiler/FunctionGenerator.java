package nl.saxion.cos.compiler;

import nl.saxion.cos.MotorScriptLangBaseVisitor;
import nl.saxion.cos.MotorScriptLangParser;
import nl.saxion.cos.type.DataType;
import nl.saxion.cos.type.symbol.SymbolTable;
import nl.saxion.cos.type.symbol.FunctionSymbol;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

public class FunctionGenerator extends MotorScriptLangBaseVisitor<Void> {

    private final ParseTreeProperty<DataType> types;
    private final JasminBytecode jasminBytecode;
    private final ParseTreeProperty<SymbolTable> scopes;
    private final CodeGenerator codeGenerator;

    public FunctionGenerator(ParseTreeProperty<DataType> types,
                             JasminBytecode jasminBytecode,
                             ParseTreeProperty<SymbolTable> scope,
                             CodeGenerator codeGenerator) {
        this.types = types;
        this.jasminBytecode = jasminBytecode;
        this.scopes = scope;
        this.codeGenerator = codeGenerator;
    }

    @Override
    public Void visitFunctionDecl(MotorScriptLangParser.FunctionDeclContext ctx) {
        SymbolTable symbolTable = this.scopes.get(ctx);
        FunctionSymbol functionSymbol = (FunctionSymbol) symbolTable.lookup(ctx.IDENTIFIER().getText());

        StringBuilder arguments = new StringBuilder();
        for (DataType argument : functionSymbol.getParamTypes()) {
            arguments.append(argument.getDescriptor());
        }

        jasminBytecode.add(".method public static " + ctx.IDENTIFIER().getText() + "(" + arguments + ")" + functionSymbol.getReturnType().getDescriptor());

        jasminBytecode
                .add(".limit stack 20")
                .add(".limit locals 20");

        visit(ctx.functionBody());

        if (functionSymbol.getReturnType() == DataType.VOID) {
            jasminBytecode.add("return");
        } else if (functionSymbol.getReturnType() == DataType.INT) {
            jasminBytecode.add("ireturn");
        } else if (functionSymbol.getReturnType() == DataType.FLOAT) {
            jasminBytecode.add("freturn");
        } else if (functionSymbol.getReturnType() == DataType.STRING) {
            jasminBytecode.add("areturn");
        } else if (functionSymbol.getReturnType() == DataType.BOOL) {
            jasminBytecode.add("ireturn");
        }

        jasminBytecode.add(".end method");

        return null;
    }

    @Override
    public Void visitFunctionBody(MotorScriptLangParser.FunctionBodyContext ctx) {
        this.codeGenerator.visitChildren(ctx);

        return null;
    }



}
