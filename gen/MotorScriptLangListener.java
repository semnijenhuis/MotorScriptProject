// Generated from /Users/semnijenhuis/Desktop/Gitlab/MotorScriptProject/src/MotorScriptLang.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MotorScriptLangParser}.
 */
public interface MotorScriptLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MotorScriptLangParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MotorScriptLangParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MotorScriptLangParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MotorScriptLangParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MotorScriptLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MotorScriptLangParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MotorScriptLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MotorScriptLangParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MotorScriptLangParser#printStmt}.
	 * @param ctx the parse tree
	 */
	void enterPrintStmt(MotorScriptLangParser.PrintStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MotorScriptLangParser#printStmt}.
	 * @param ctx the parse tree
	 */
	void exitPrintStmt(MotorScriptLangParser.PrintStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MotorScriptLangParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(MotorScriptLangParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MotorScriptLangParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(MotorScriptLangParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MotorScriptLangParser#varDecleration}.
	 * @param ctx the parse tree
	 */
	void enterVarDecleration(MotorScriptLangParser.VarDeclerationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MotorScriptLangParser#varDecleration}.
	 * @param ctx the parse tree
	 */
	void exitVarDecleration(MotorScriptLangParser.VarDeclerationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MotorScriptLangParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(MotorScriptLangParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MotorScriptLangParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(MotorScriptLangParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MotorScriptLangParser#elseIf}.
	 * @param ctx the parse tree
	 */
	void enterElseIf(MotorScriptLangParser.ElseIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link MotorScriptLangParser#elseIf}.
	 * @param ctx the parse tree
	 */
	void exitElseIf(MotorScriptLangParser.ElseIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link MotorScriptLangParser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void enterElseBlock(MotorScriptLangParser.ElseBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MotorScriptLangParser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void exitElseBlock(MotorScriptLangParser.ElseBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MotorScriptLangParser#blockStmt}.
	 * @param ctx the parse tree
	 */
	void enterBlockStmt(MotorScriptLangParser.BlockStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MotorScriptLangParser#blockStmt}.
	 * @param ctx the parse tree
	 */
	void exitBlockStmt(MotorScriptLangParser.BlockStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MotorScriptLangParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(MotorScriptLangParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link MotorScriptLangParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(MotorScriptLangParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link MotorScriptLangParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(MotorScriptLangParser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MotorScriptLangParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(MotorScriptLangParser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MotorScriptLangParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(MotorScriptLangParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MotorScriptLangParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(MotorScriptLangParser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MotorScriptLangParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(MotorScriptLangParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link MotorScriptLangParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(MotorScriptLangParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link MotorScriptLangParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(MotorScriptLangParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MotorScriptLangParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(MotorScriptLangParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MotorScriptLangParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDecl(MotorScriptLangParser.FunctionDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MotorScriptLangParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDecl(MotorScriptLangParser.FunctionDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MotorScriptLangParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(MotorScriptLangParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link MotorScriptLangParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(MotorScriptLangParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link MotorScriptLangParser#scanner}.
	 * @param ctx the parse tree
	 */
	void enterScanner(MotorScriptLangParser.ScannerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MotorScriptLangParser#scanner}.
	 * @param ctx the parse tree
	 */
	void exitScanner(MotorScriptLangParser.ScannerContext ctx);
	/**
	 * Enter a parse tree produced by {@link MotorScriptLangParser#scannerDecl}.
	 * @param ctx the parse tree
	 */
	void enterScannerDecl(MotorScriptLangParser.ScannerDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MotorScriptLangParser#scannerDecl}.
	 * @param ctx the parse tree
	 */
	void exitScannerDecl(MotorScriptLangParser.ScannerDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MotorScriptLangParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(MotorScriptLangParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link MotorScriptLangParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(MotorScriptLangParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link MotorScriptLangParser#arrayAssign}.
	 * @param ctx the parse tree
	 */
	void enterArrayAssign(MotorScriptLangParser.ArrayAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link MotorScriptLangParser#arrayAssign}.
	 * @param ctx the parse tree
	 */
	void exitArrayAssign(MotorScriptLangParser.ArrayAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprIdentifier}
	 * labeled alternative in {@link MotorScriptLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprIdentifier(MotorScriptLangParser.ExprIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprIdentifier}
	 * labeled alternative in {@link MotorScriptLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprIdentifier(MotorScriptLangParser.ExprIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprEqualityOp}
	 * labeled alternative in {@link MotorScriptLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprEqualityOp(MotorScriptLangParser.ExprEqualityOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprEqualityOp}
	 * labeled alternative in {@link MotorScriptLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprEqualityOp(MotorScriptLangParser.ExprEqualityOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprCompareOp}
	 * labeled alternative in {@link MotorScriptLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprCompareOp(MotorScriptLangParser.ExprCompareOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprCompareOp}
	 * labeled alternative in {@link MotorScriptLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprCompareOp(MotorScriptLangParser.ExprCompareOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprNumbLiteral}
	 * labeled alternative in {@link MotorScriptLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprNumbLiteral(MotorScriptLangParser.ExprNumbLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprNumbLiteral}
	 * labeled alternative in {@link MotorScriptLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprNumbLiteral(MotorScriptLangParser.ExprNumbLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprFloatLiteral}
	 * labeled alternative in {@link MotorScriptLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprFloatLiteral(MotorScriptLangParser.ExprFloatLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprFloatLiteral}
	 * labeled alternative in {@link MotorScriptLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprFloatLiteral(MotorScriptLangParser.ExprFloatLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprAddOp}
	 * labeled alternative in {@link MotorScriptLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprAddOp(MotorScriptLangParser.ExprAddOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprAddOp}
	 * labeled alternative in {@link MotorScriptLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprAddOp(MotorScriptLangParser.ExprAddOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprBoolLiteral}
	 * labeled alternative in {@link MotorScriptLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprBoolLiteral(MotorScriptLangParser.ExprBoolLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprBoolLiteral}
	 * labeled alternative in {@link MotorScriptLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprBoolLiteral(MotorScriptLangParser.ExprBoolLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprIncrement}
	 * labeled alternative in {@link MotorScriptLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprIncrement(MotorScriptLangParser.ExprIncrementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprIncrement}
	 * labeled alternative in {@link MotorScriptLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprIncrement(MotorScriptLangParser.ExprIncrementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprAndOp}
	 * labeled alternative in {@link MotorScriptLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprAndOp(MotorScriptLangParser.ExprAndOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprAndOp}
	 * labeled alternative in {@link MotorScriptLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprAndOp(MotorScriptLangParser.ExprAndOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprParenthesis}
	 * labeled alternative in {@link MotorScriptLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprParenthesis(MotorScriptLangParser.ExprParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprParenthesis}
	 * labeled alternative in {@link MotorScriptLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprParenthesis(MotorScriptLangParser.ExprParenthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprScanner}
	 * labeled alternative in {@link MotorScriptLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprScanner(MotorScriptLangParser.ExprScannerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprScanner}
	 * labeled alternative in {@link MotorScriptLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprScanner(MotorScriptLangParser.ExprScannerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprArray}
	 * labeled alternative in {@link MotorScriptLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprArray(MotorScriptLangParser.ExprArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprArray}
	 * labeled alternative in {@link MotorScriptLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprArray(MotorScriptLangParser.ExprArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprFunctionCall}
	 * labeled alternative in {@link MotorScriptLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprFunctionCall(MotorScriptLangParser.ExprFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprFunctionCall}
	 * labeled alternative in {@link MotorScriptLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprFunctionCall(MotorScriptLangParser.ExprFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprNegate}
	 * labeled alternative in {@link MotorScriptLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprNegate(MotorScriptLangParser.ExprNegateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprNegate}
	 * labeled alternative in {@link MotorScriptLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprNegate(MotorScriptLangParser.ExprNegateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprStringLiteral}
	 * labeled alternative in {@link MotorScriptLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprStringLiteral(MotorScriptLangParser.ExprStringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprStringLiteral}
	 * labeled alternative in {@link MotorScriptLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprStringLiteral(MotorScriptLangParser.ExprStringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprMulDivOp}
	 * labeled alternative in {@link MotorScriptLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprMulDivOp(MotorScriptLangParser.ExprMulDivOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprMulDivOp}
	 * labeled alternative in {@link MotorScriptLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprMulDivOp(MotorScriptLangParser.ExprMulDivOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprOrOp}
	 * labeled alternative in {@link MotorScriptLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprOrOp(MotorScriptLangParser.ExprOrOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprOrOp}
	 * labeled alternative in {@link MotorScriptLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprOrOp(MotorScriptLangParser.ExprOrOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link MotorScriptLangParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(MotorScriptLangParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MotorScriptLangParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(MotorScriptLangParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MotorScriptLangParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(MotorScriptLangParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MotorScriptLangParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(MotorScriptLangParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link MotorScriptLangParser#incr_decr}.
	 * @param ctx the parse tree
	 */
	void enterIncr_decr(MotorScriptLangParser.Incr_decrContext ctx);
	/**
	 * Exit a parse tree produced by {@link MotorScriptLangParser#incr_decr}.
	 * @param ctx the parse tree
	 */
	void exitIncr_decr(MotorScriptLangParser.Incr_decrContext ctx);
}