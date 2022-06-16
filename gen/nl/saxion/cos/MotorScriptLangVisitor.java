// Generated from C:/Users/Stephen/Documents/saxion/year2/compilers/MotorScript/src\MotorScriptLang.g4 by ANTLR 4.9.2
package nl.saxion.cos;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MotorScriptLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MotorScriptLangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MotorScriptLangParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(MotorScriptLangParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link MotorScriptLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(MotorScriptLangParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MotorScriptLangParser#printStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStmt(MotorScriptLangParser.PrintStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MotorScriptLangParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(MotorScriptLangParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MotorScriptLangParser#varDecleration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecleration(MotorScriptLangParser.VarDeclerationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MotorScriptLangParser#ifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(MotorScriptLangParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MotorScriptLangParser#elseIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIf(MotorScriptLangParser.ElseIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link MotorScriptLangParser#elseBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseBlock(MotorScriptLangParser.ElseBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MotorScriptLangParser#blockStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStmt(MotorScriptLangParser.BlockStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MotorScriptLangParser#whileLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoop(MotorScriptLangParser.WhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link MotorScriptLangParser#returnStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStmt(MotorScriptLangParser.ReturnStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MotorScriptLangParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBody(MotorScriptLangParser.FunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MotorScriptLangParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(MotorScriptLangParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link MotorScriptLangParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(MotorScriptLangParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MotorScriptLangParser#functionDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDecl(MotorScriptLangParser.FunctionDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link MotorScriptLangParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(MotorScriptLangParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link MotorScriptLangParser#scanner}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScanner(MotorScriptLangParser.ScannerContext ctx);
	/**
	 * Visit a parse tree produced by {@link MotorScriptLangParser#scannerDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScannerDecl(MotorScriptLangParser.ScannerDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link MotorScriptLangParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(MotorScriptLangParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link MotorScriptLangParser#arrayAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAssign(MotorScriptLangParser.ArrayAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprIdentifier}
	 * labeled alternative in {@link MotorScriptLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprIdentifier(MotorScriptLangParser.ExprIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprEqualityOp}
	 * labeled alternative in {@link MotorScriptLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprEqualityOp(MotorScriptLangParser.ExprEqualityOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprCompareOp}
	 * labeled alternative in {@link MotorScriptLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprCompareOp(MotorScriptLangParser.ExprCompareOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprNumbLiteral}
	 * labeled alternative in {@link MotorScriptLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNumbLiteral(MotorScriptLangParser.ExprNumbLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprFloatLiteral}
	 * labeled alternative in {@link MotorScriptLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprFloatLiteral(MotorScriptLangParser.ExprFloatLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprAddOp}
	 * labeled alternative in {@link MotorScriptLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAddOp(MotorScriptLangParser.ExprAddOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprBoolLiteral}
	 * labeled alternative in {@link MotorScriptLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBoolLiteral(MotorScriptLangParser.ExprBoolLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprIncrement}
	 * labeled alternative in {@link MotorScriptLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprIncrement(MotorScriptLangParser.ExprIncrementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprAndOp}
	 * labeled alternative in {@link MotorScriptLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAndOp(MotorScriptLangParser.ExprAndOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprParenthesis}
	 * labeled alternative in {@link MotorScriptLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprParenthesis(MotorScriptLangParser.ExprParenthesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprScanner}
	 * labeled alternative in {@link MotorScriptLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprScanner(MotorScriptLangParser.ExprScannerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprArray}
	 * labeled alternative in {@link MotorScriptLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprArray(MotorScriptLangParser.ExprArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprFunctionCall}
	 * labeled alternative in {@link MotorScriptLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprFunctionCall(MotorScriptLangParser.ExprFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprNegate}
	 * labeled alternative in {@link MotorScriptLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNegate(MotorScriptLangParser.ExprNegateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprStringLiteral}
	 * labeled alternative in {@link MotorScriptLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStringLiteral(MotorScriptLangParser.ExprStringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprMulDivOp}
	 * labeled alternative in {@link MotorScriptLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMulDivOp(MotorScriptLangParser.ExprMulDivOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprOrOp}
	 * labeled alternative in {@link MotorScriptLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprOrOp(MotorScriptLangParser.ExprOrOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link MotorScriptLangParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(MotorScriptLangParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MotorScriptLangParser#booleanLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(MotorScriptLangParser.BooleanLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link MotorScriptLangParser#incr_decr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncr_decr(MotorScriptLangParser.Incr_decrContext ctx);
}