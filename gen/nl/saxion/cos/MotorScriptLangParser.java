// Generated from C:/Users/Stephen/Documents/saxion/year2/compilers/MotorScript/src\MotorScriptLang.g4 by ANTLR 4.9.2
package nl.saxion.cos;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MotorScriptLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, LPAREN=4, RPAREN=5, COMMA=6, OPEN_BRACK=7, CLOSE_BRACK=8, 
		OPEN_BLOCK=9, CLOSE_BLOCK=10, END=11, NEG=12, IF=13, ELSE_IF=14, ELSE=15, 
		WHILE=16, PRINT=17, RETURN=18, INT_TYPE=19, FLOAT_TYPE=20, STRING_TYPE=21, 
		BOOL_TYPE=22, VOID_TYPE=23, ASSIGNMENT_OP=24, COMPARE_OPERATOR=25, EQUALITY_OPERATOR=26, 
		AND_OPERATOR=27, OR_OPERATOR=28, INCREMENT=29, DECREMENT=30, ADDSUB_OPERATOR=31, 
		MULDIV_OPERATOR=32, SCANNER=33, FUNC=34, FLAT4=35, STRING=36, INLINE4=37, 
		TRUE=38, FALSE=39, IDENTIFIER=40, WS=41;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_printStmt = 2, RULE_declaration = 3, 
		RULE_varDecleration = 4, RULE_ifStmt = 5, RULE_elseIf = 6, RULE_elseBlock = 7, 
		RULE_blockStmt = 8, RULE_whileLoop = 9, RULE_returnStmt = 10, RULE_functionBody = 11, 
		RULE_functionCall = 12, RULE_arguments = 13, RULE_functionDecl = 14, RULE_parameters = 15, 
		RULE_scanner = 16, RULE_scannerDecl = 17, RULE_array = 18, RULE_arrayAssign = 19, 
		RULE_expression = 20, RULE_type = 21, RULE_booleanLiteral = 22, RULE_incr_decr = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "printStmt", "declaration", "varDecleration", 
			"ifStmt", "elseIf", "elseBlock", "blockStmt", "whileLoop", "returnStmt", 
			"functionBody", "functionCall", "arguments", "functionDecl", "parameters", 
			"scanner", "scannerDecl", "array", "arrayAssign", "expression", "type", 
			"booleanLiteral", "incr_decr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.scan'", "'[]'", "'new'", "'('", "')'", "','", "'{'", "'}'", 
			"'['", "']'", "'#'", "'-'", "'if'", "'elif'", "'else'", "'while'", "'burnout'", 
			"'return'", "'inline4'", "'flat4'", "'sentence'", "'ev'", "'void'", "'is'", 
			null, null, "'AND'", "'OR'", "'^^'", "'--'", null, null, "'scanner'", 
			"'funky'", null, null, null, "'true'", "'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "LPAREN", "RPAREN", "COMMA", "OPEN_BRACK", "CLOSE_BRACK", 
			"OPEN_BLOCK", "CLOSE_BLOCK", "END", "NEG", "IF", "ELSE_IF", "ELSE", "WHILE", 
			"PRINT", "RETURN", "INT_TYPE", "FLOAT_TYPE", "STRING_TYPE", "BOOL_TYPE", 
			"VOID_TYPE", "ASSIGNMENT_OP", "COMPARE_OPERATOR", "EQUALITY_OPERATOR", 
			"AND_OPERATOR", "OR_OPERATOR", "INCREMENT", "DECREMENT", "ADDSUB_OPERATOR", 
			"MULDIV_OPERATOR", "SCANNER", "FUNC", "FLAT4", "STRING", "INLINE4", "TRUE", 
			"FALSE", "IDENTIFIER", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "MotorScriptLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MotorScriptLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MotorScriptLangParser.EOF, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MotorScriptLangVisitor ) return ((MotorScriptLangVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << OPEN_BRACK) | (1L << NEG) | (1L << IF) | (1L << WHILE) | (1L << PRINT) | (1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << STRING_TYPE) | (1L << BOOL_TYPE) | (1L << VOID_TYPE) | (1L << SCANNER) | (1L << FUNC) | (1L << FLAT4) | (1L << STRING) | (1L << INLINE4) | (1L << TRUE) | (1L << FALSE) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(50);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(48);
					expression(0);
					}
					break;
				case 2:
					{
					setState(49);
					statement();
					}
					break;
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(55);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public BlockStmtContext blockStmt() {
			return getRuleContext(BlockStmtContext.class,0);
		}
		public VarDeclerationContext varDecleration() {
			return getRuleContext(VarDeclerationContext.class,0);
		}
		public PrintStmtContext printStmt() {
			return getRuleContext(PrintStmtContext.class,0);
		}
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public WhileLoopContext whileLoop() {
			return getRuleContext(WhileLoopContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ArrayAssignContext arrayAssign() {
			return getRuleContext(ArrayAssignContext.class,0);
		}
		public FunctionDeclContext functionDecl() {
			return getRuleContext(FunctionDeclContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ScannerDeclContext scannerDecl() {
			return getRuleContext(ScannerDeclContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MotorScriptLangVisitor ) return ((MotorScriptLangVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(68);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				blockStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				varDecleration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(59);
				printStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(60);
				ifStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(61);
				whileLoop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(62);
				array();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(63);
				arrayAssign();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(64);
				functionDecl();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(65);
				functionCall();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(66);
				scannerDecl();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(67);
				declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintStmtContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(MotorScriptLangParser.PRINT, 0); }
		public TerminalNode LPAREN() { return getToken(MotorScriptLangParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MotorScriptLangParser.RPAREN, 0); }
		public TerminalNode END() { return getToken(MotorScriptLangParser.END, 0); }
		public PrintStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MotorScriptLangVisitor ) return ((MotorScriptLangVisitor<? extends T>)visitor).visitPrintStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStmtContext printStmt() throws RecognitionException {
		PrintStmtContext _localctx = new PrintStmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_printStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(PRINT);
			setState(71);
			match(LPAREN);
			setState(72);
			expression(0);
			setState(73);
			match(RPAREN);
			setState(74);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(MotorScriptLangParser.IDENTIFIER, 0); }
		public TerminalNode END() { return getToken(MotorScriptLangParser.END, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MotorScriptLangVisitor ) return ((MotorScriptLangVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			type();
			setState(77);
			match(IDENTIFIER);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==END) {
				{
				setState(78);
				match(END);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDeclerationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MotorScriptLangParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGNMENT_OP() { return getToken(MotorScriptLangParser.ASSIGNMENT_OP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode END() { return getToken(MotorScriptLangParser.END, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VarDeclerationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecleration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MotorScriptLangVisitor ) return ((MotorScriptLangVisitor<? extends T>)visitor).visitVarDecleration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclerationContext varDecleration() throws RecognitionException {
		VarDeclerationContext _localctx = new VarDeclerationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_varDecleration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << STRING_TYPE) | (1L << BOOL_TYPE) | (1L << VOID_TYPE))) != 0)) {
				{
				setState(81);
				type();
				}
			}

			setState(84);
			match(IDENTIFIER);
			setState(85);
			match(ASSIGNMENT_OP);
			setState(86);
			expression(0);
			setState(87);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStmtContext extends ParserRuleContext {
		public ExpressionContext condition;
		public TerminalNode IF() { return getToken(MotorScriptLangParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(MotorScriptLangParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MotorScriptLangParser.RPAREN, 0); }
		public BlockStmtContext blockStmt() {
			return getRuleContext(BlockStmtContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<ElseIfContext> elseIf() {
			return getRuleContexts(ElseIfContext.class);
		}
		public ElseIfContext elseIf(int i) {
			return getRuleContext(ElseIfContext.class,i);
		}
		public ElseBlockContext elseBlock() {
			return getRuleContext(ElseBlockContext.class,0);
		}
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MotorScriptLangVisitor ) return ((MotorScriptLangVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ifStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(IF);
			setState(90);
			match(LPAREN);
			setState(91);
			((IfStmtContext)_localctx).condition = expression(0);
			setState(92);
			match(RPAREN);
			setState(93);
			blockStmt();
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSE_IF) {
				{
				{
				setState(94);
				elseIf();
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(100);
				elseBlock();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseIfContext extends ParserRuleContext {
		public ExpressionContext condition;
		public TerminalNode ELSE_IF() { return getToken(MotorScriptLangParser.ELSE_IF, 0); }
		public TerminalNode LPAREN() { return getToken(MotorScriptLangParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MotorScriptLangParser.RPAREN, 0); }
		public BlockStmtContext blockStmt() {
			return getRuleContext(BlockStmtContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ElseIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIf; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MotorScriptLangVisitor ) return ((MotorScriptLangVisitor<? extends T>)visitor).visitElseIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseIfContext elseIf() throws RecognitionException {
		ElseIfContext _localctx = new ElseIfContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_elseIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(ELSE_IF);
			setState(104);
			match(LPAREN);
			setState(105);
			((ElseIfContext)_localctx).condition = expression(0);
			setState(106);
			match(RPAREN);
			setState(107);
			blockStmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseBlockContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(MotorScriptLangParser.ELSE, 0); }
		public BlockStmtContext blockStmt() {
			return getRuleContext(BlockStmtContext.class,0);
		}
		public ElseBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MotorScriptLangVisitor ) return ((MotorScriptLangVisitor<? extends T>)visitor).visitElseBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseBlockContext elseBlock() throws RecognitionException {
		ElseBlockContext _localctx = new ElseBlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_elseBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(ELSE);
			setState(110);
			blockStmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStmtContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACK() { return getToken(MotorScriptLangParser.OPEN_BRACK, 0); }
		public TerminalNode CLOSE_BRACK() { return getToken(MotorScriptLangParser.CLOSE_BRACK, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> END() { return getTokens(MotorScriptLangParser.END); }
		public TerminalNode END(int i) {
			return getToken(MotorScriptLangParser.END, i);
		}
		public BlockStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MotorScriptLangVisitor ) return ((MotorScriptLangVisitor<? extends T>)visitor).visitBlockStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStmtContext blockStmt() throws RecognitionException {
		BlockStmtContext _localctx = new BlockStmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_blockStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(OPEN_BRACK);
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << OPEN_BRACK) | (1L << NEG) | (1L << IF) | (1L << WHILE) | (1L << PRINT) | (1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << STRING_TYPE) | (1L << BOOL_TYPE) | (1L << VOID_TYPE) | (1L << SCANNER) | (1L << FUNC) | (1L << FLAT4) | (1L << STRING) | (1L << INLINE4) | (1L << TRUE) | (1L << FALSE) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(118);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(113);
					expression(0);
					setState(115);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==END) {
						{
						setState(114);
						match(END);
						}
					}

					}
					break;
				case 2:
					{
					setState(117);
					statement();
					}
					break;
				}
				}
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(123);
			match(CLOSE_BRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileLoopContext extends ParserRuleContext {
		public ExpressionContext condition;
		public TerminalNode WHILE() { return getToken(MotorScriptLangParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(MotorScriptLangParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MotorScriptLangParser.RPAREN, 0); }
		public BlockStmtContext blockStmt() {
			return getRuleContext(BlockStmtContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MotorScriptLangVisitor ) return ((MotorScriptLangVisitor<? extends T>)visitor).visitWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(WHILE);
			setState(126);
			match(LPAREN);
			setState(127);
			((WhileLoopContext)_localctx).condition = expression(0);
			setState(128);
			match(RPAREN);
			setState(129);
			blockStmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStmtContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(MotorScriptLangParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode END() { return getToken(MotorScriptLangParser.END, 0); }
		public ReturnStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MotorScriptLangVisitor ) return ((MotorScriptLangVisitor<? extends T>)visitor).visitReturnStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStmtContext returnStmt() throws RecognitionException {
		ReturnStmtContext _localctx = new ReturnStmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_returnStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(RETURN);
			setState(132);
			expression(0);
			setState(133);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionBodyContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACK() { return getToken(MotorScriptLangParser.OPEN_BRACK, 0); }
		public TerminalNode CLOSE_BRACK() { return getToken(MotorScriptLangParser.CLOSE_BRACK, 0); }
		public ReturnStmtContext returnStmt() {
			return getRuleContext(ReturnStmtContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> END() { return getTokens(MotorScriptLangParser.END); }
		public TerminalNode END(int i) {
			return getToken(MotorScriptLangParser.END, i);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MotorScriptLangVisitor ) return ((MotorScriptLangVisitor<? extends T>)visitor).visitFunctionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_functionBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(OPEN_BRACK);
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(136);
				returnStmt();
				}
			}

			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << OPEN_BRACK) | (1L << NEG) | (1L << IF) | (1L << WHILE) | (1L << PRINT) | (1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << STRING_TYPE) | (1L << BOOL_TYPE) | (1L << VOID_TYPE) | (1L << SCANNER) | (1L << FUNC) | (1L << FLAT4) | (1L << STRING) | (1L << INLINE4) | (1L << TRUE) | (1L << FALSE) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(144);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(139);
					expression(0);
					setState(141);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==END) {
						{
						setState(140);
						match(END);
						}
					}

					}
					break;
				case 2:
					{
					setState(143);
					statement();
					}
					break;
				}
				}
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(149);
			match(CLOSE_BRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MotorScriptLangParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(MotorScriptLangParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MotorScriptLangParser.RPAREN, 0); }
		public TerminalNode END() { return getToken(MotorScriptLangParser.END, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MotorScriptLangVisitor ) return ((MotorScriptLangVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(IDENTIFIER);
			setState(152);
			match(LPAREN);
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << NEG) | (1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << STRING_TYPE) | (1L << BOOL_TYPE) | (1L << VOID_TYPE) | (1L << FLAT4) | (1L << STRING) | (1L << INLINE4) | (1L << TRUE) | (1L << FALSE) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(153);
				parameters();
				}
			}

			setState(156);
			match(RPAREN);
			setState(157);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MotorScriptLangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MotorScriptLangParser.COMMA, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MotorScriptLangVisitor ) return ((MotorScriptLangVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			declaration();
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(160);
				match(COMMA);
				setState(161);
				declaration();
				}
				}
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDeclContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(MotorScriptLangParser.FUNC, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(MotorScriptLangParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(MotorScriptLangParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MotorScriptLangParser.RPAREN, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public FunctionDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MotorScriptLangVisitor ) return ((MotorScriptLangVisitor<? extends T>)visitor).visitFunctionDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclContext functionDecl() throws RecognitionException {
		FunctionDeclContext _localctx = new FunctionDeclContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_functionDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(FUNC);
			setState(168);
			type();
			setState(169);
			match(IDENTIFIER);
			setState(170);
			match(LPAREN);
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << STRING_TYPE) | (1L << BOOL_TYPE) | (1L << VOID_TYPE))) != 0)) {
				{
				setState(171);
				arguments();
				}
			}

			setState(174);
			match(RPAREN);
			setState(175);
			functionBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametersContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MotorScriptLangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MotorScriptLangParser.COMMA, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MotorScriptLangVisitor ) return ((MotorScriptLangVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			expression(0);
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(178);
				match(COMMA);
				setState(179);
				expression(0);
				}
				}
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScannerContext extends ParserRuleContext {
		public TypeContext scannertype;
		public Token int_id;
		public Token scanner_id;
		public TerminalNode ASSIGNMENT_OP() { return getToken(MotorScriptLangParser.ASSIGNMENT_OP, 0); }
		public TerminalNode END() { return getToken(MotorScriptLangParser.END, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(MotorScriptLangParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(MotorScriptLangParser.IDENTIFIER, i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ScannerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scanner; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MotorScriptLangVisitor ) return ((MotorScriptLangVisitor<? extends T>)visitor).visitScanner(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScannerContext scanner() throws RecognitionException {
		ScannerContext _localctx = new ScannerContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_scanner);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << STRING_TYPE) | (1L << BOOL_TYPE) | (1L << VOID_TYPE))) != 0)) {
				{
				setState(185);
				((ScannerContext)_localctx).scannertype = type();
				}
			}

			setState(188);
			((ScannerContext)_localctx).int_id = match(IDENTIFIER);
			setState(189);
			match(ASSIGNMENT_OP);
			setState(190);
			((ScannerContext)_localctx).scanner_id = match(IDENTIFIER);
			setState(191);
			match(T__0);
			setState(192);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScannerDeclContext extends ParserRuleContext {
		public TerminalNode SCANNER() { return getToken(MotorScriptLangParser.SCANNER, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MotorScriptLangParser.IDENTIFIER, 0); }
		public TerminalNode END() { return getToken(MotorScriptLangParser.END, 0); }
		public ScannerDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scannerDecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MotorScriptLangVisitor ) return ((MotorScriptLangVisitor<? extends T>)visitor).visitScannerDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScannerDeclContext scannerDecl() throws RecognitionException {
		ScannerDeclContext _localctx = new ScannerDeclContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_scannerDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(SCANNER);
			setState(195);
			match(IDENTIFIER);
			setState(196);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayContext extends ParserRuleContext {
		public TypeContext arrayType;
		public TypeContext arraysizeType;
		public ExpressionContext arraysize;
		public TerminalNode IDENTIFIER() { return getToken(MotorScriptLangParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGNMENT_OP() { return getToken(MotorScriptLangParser.ASSIGNMENT_OP, 0); }
		public TerminalNode OPEN_BLOCK() { return getToken(MotorScriptLangParser.OPEN_BLOCK, 0); }
		public TerminalNode CLOSE_BLOCK() { return getToken(MotorScriptLangParser.CLOSE_BLOCK, 0); }
		public TerminalNode END() { return getToken(MotorScriptLangParser.END, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MotorScriptLangVisitor ) return ((MotorScriptLangVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			((ArrayContext)_localctx).arrayType = type();
			setState(199);
			match(T__1);
			setState(200);
			match(IDENTIFIER);
			setState(201);
			match(ASSIGNMENT_OP);
			setState(202);
			match(T__2);
			setState(203);
			((ArrayContext)_localctx).arraysizeType = type();
			setState(204);
			match(OPEN_BLOCK);
			setState(205);
			((ArrayContext)_localctx).arraysize = expression(0);
			setState(206);
			match(CLOSE_BLOCK);
			setState(207);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayAssignContext extends ParserRuleContext {
		public ExpressionContext index;
		public ExpressionContext data;
		public TerminalNode IDENTIFIER() { return getToken(MotorScriptLangParser.IDENTIFIER, 0); }
		public TerminalNode OPEN_BLOCK() { return getToken(MotorScriptLangParser.OPEN_BLOCK, 0); }
		public TerminalNode CLOSE_BLOCK() { return getToken(MotorScriptLangParser.CLOSE_BLOCK, 0); }
		public TerminalNode ASSIGNMENT_OP() { return getToken(MotorScriptLangParser.ASSIGNMENT_OP, 0); }
		public TerminalNode END() { return getToken(MotorScriptLangParser.END, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAssign; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MotorScriptLangVisitor ) return ((MotorScriptLangVisitor<? extends T>)visitor).visitArrayAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAssignContext arrayAssign() throws RecognitionException {
		ArrayAssignContext _localctx = new ArrayAssignContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_arrayAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(IDENTIFIER);
			setState(210);
			match(OPEN_BLOCK);
			setState(211);
			((ArrayAssignContext)_localctx).index = expression(0);
			setState(212);
			match(CLOSE_BLOCK);
			setState(213);
			match(ASSIGNMENT_OP);
			setState(214);
			((ArrayAssignContext)_localctx).data = expression(0);
			setState(215);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprIdentifierContext extends ExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(MotorScriptLangParser.IDENTIFIER, 0); }
		public ExprIdentifierContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MotorScriptLangVisitor ) return ((MotorScriptLangVisitor<? extends T>)visitor).visitExprIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprEqualityOpContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQUALITY_OPERATOR() { return getToken(MotorScriptLangParser.EQUALITY_OPERATOR, 0); }
		public ExprEqualityOpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MotorScriptLangVisitor ) return ((MotorScriptLangVisitor<? extends T>)visitor).visitExprEqualityOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprCompareOpContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COMPARE_OPERATOR() { return getToken(MotorScriptLangParser.COMPARE_OPERATOR, 0); }
		public ExprCompareOpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MotorScriptLangVisitor ) return ((MotorScriptLangVisitor<? extends T>)visitor).visitExprCompareOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprNumbLiteralContext extends ExpressionContext {
		public TerminalNode INLINE4() { return getToken(MotorScriptLangParser.INLINE4, 0); }
		public ExprNumbLiteralContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MotorScriptLangVisitor ) return ((MotorScriptLangVisitor<? extends T>)visitor).visitExprNumbLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprFloatLiteralContext extends ExpressionContext {
		public TerminalNode FLAT4() { return getToken(MotorScriptLangParser.FLAT4, 0); }
		public ExprFloatLiteralContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MotorScriptLangVisitor ) return ((MotorScriptLangVisitor<? extends T>)visitor).visitExprFloatLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprAddOpContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ADDSUB_OPERATOR() { return getToken(MotorScriptLangParser.ADDSUB_OPERATOR, 0); }
		public ExprAddOpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MotorScriptLangVisitor ) return ((MotorScriptLangVisitor<? extends T>)visitor).visitExprAddOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprBoolLiteralContext extends ExpressionContext {
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public ExprBoolLiteralContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MotorScriptLangVisitor ) return ((MotorScriptLangVisitor<? extends T>)visitor).visitExprBoolLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprIncrementContext extends ExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(MotorScriptLangParser.IDENTIFIER, 0); }
		public Incr_decrContext incr_decr() {
			return getRuleContext(Incr_decrContext.class,0);
		}
		public TerminalNode END() { return getToken(MotorScriptLangParser.END, 0); }
		public ExprIncrementContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MotorScriptLangVisitor ) return ((MotorScriptLangVisitor<? extends T>)visitor).visitExprIncrement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprAndOpContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND_OPERATOR() { return getToken(MotorScriptLangParser.AND_OPERATOR, 0); }
		public ExprAndOpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MotorScriptLangVisitor ) return ((MotorScriptLangVisitor<? extends T>)visitor).visitExprAndOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprParenthesisContext extends ExpressionContext {
		public TerminalNode LPAREN() { return getToken(MotorScriptLangParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MotorScriptLangParser.RPAREN, 0); }
		public ExprParenthesisContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MotorScriptLangVisitor ) return ((MotorScriptLangVisitor<? extends T>)visitor).visitExprParenthesis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprScannerContext extends ExpressionContext {
		public ScannerContext scanner() {
			return getRuleContext(ScannerContext.class,0);
		}
		public ExprScannerContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MotorScriptLangVisitor ) return ((MotorScriptLangVisitor<? extends T>)visitor).visitExprScanner(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprArrayContext extends ExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(MotorScriptLangParser.IDENTIFIER, 0); }
		public TerminalNode OPEN_BLOCK() { return getToken(MotorScriptLangParser.OPEN_BLOCK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_BLOCK() { return getToken(MotorScriptLangParser.CLOSE_BLOCK, 0); }
		public ExprArrayContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MotorScriptLangVisitor ) return ((MotorScriptLangVisitor<? extends T>)visitor).visitExprArray(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprFunctionCallContext extends ExpressionContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ExprFunctionCallContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MotorScriptLangVisitor ) return ((MotorScriptLangVisitor<? extends T>)visitor).visitExprFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprNegateContext extends ExpressionContext {
		public TerminalNode NEG() { return getToken(MotorScriptLangParser.NEG, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExprNegateContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MotorScriptLangVisitor ) return ((MotorScriptLangVisitor<? extends T>)visitor).visitExprNegate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprStringLiteralContext extends ExpressionContext {
		public TerminalNode STRING() { return getToken(MotorScriptLangParser.STRING, 0); }
		public ExprStringLiteralContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MotorScriptLangVisitor ) return ((MotorScriptLangVisitor<? extends T>)visitor).visitExprStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprMulDivOpContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MULDIV_OPERATOR() { return getToken(MotorScriptLangParser.MULDIV_OPERATOR, 0); }
		public ExprMulDivOpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MotorScriptLangVisitor ) return ((MotorScriptLangVisitor<? extends T>)visitor).visitExprMulDivOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprOrOpContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OR_OPERATOR() { return getToken(MotorScriptLangParser.OR_OPERATOR, 0); }
		public ExprOrOpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MotorScriptLangVisitor ) return ((MotorScriptLangVisitor<? extends T>)visitor).visitExprOrOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				_localctx = new ExprParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(218);
				match(LPAREN);
				setState(219);
				expression(0);
				setState(220);
				match(RPAREN);
				}
				break;
			case 2:
				{
				_localctx = new ExprNegateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(222);
				match(NEG);
				setState(223);
				expression(16);
				}
				break;
			case 3:
				{
				_localctx = new ExprBoolLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(224);
				booleanLiteral();
				}
				break;
			case 4:
				{
				_localctx = new ExprScannerContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(225);
				scanner();
				}
				break;
			case 5:
				{
				_localctx = new ExprFunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(226);
				functionCall();
				}
				break;
			case 6:
				{
				_localctx = new ExprArrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(227);
				match(IDENTIFIER);
				setState(228);
				match(OPEN_BLOCK);
				setState(229);
				expression(0);
				setState(230);
				match(CLOSE_BLOCK);
				}
				break;
			case 7:
				{
				_localctx = new ExprIncrementContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(232);
				match(IDENTIFIER);
				setState(233);
				incr_decr();
				setState(234);
				match(END);
				}
				break;
			case 8:
				{
				_localctx = new ExprIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(236);
				match(IDENTIFIER);
				}
				break;
			case 9:
				{
				_localctx = new ExprStringLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(237);
				match(STRING);
				}
				break;
			case 10:
				{
				_localctx = new ExprNumbLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(238);
				match(INLINE4);
				}
				break;
			case 11:
				{
				_localctx = new ExprFloatLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(239);
				match(FLAT4);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(262);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(260);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new ExprMulDivOpContext(new ExpressionContext(_parentctx, _parentState));
						((ExprMulDivOpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(242);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(243);
						((ExprMulDivOpContext)_localctx).op = match(MULDIV_OPERATOR);
						setState(244);
						((ExprMulDivOpContext)_localctx).right = expression(16);
						}
						break;
					case 2:
						{
						_localctx = new ExprAddOpContext(new ExpressionContext(_parentctx, _parentState));
						((ExprAddOpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(245);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(246);
						((ExprAddOpContext)_localctx).op = match(ADDSUB_OPERATOR);
						setState(247);
						((ExprAddOpContext)_localctx).right = expression(15);
						}
						break;
					case 3:
						{
						_localctx = new ExprCompareOpContext(new ExpressionContext(_parentctx, _parentState));
						((ExprCompareOpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(248);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(249);
						((ExprCompareOpContext)_localctx).op = match(COMPARE_OPERATOR);
						setState(250);
						((ExprCompareOpContext)_localctx).right = expression(14);
						}
						break;
					case 4:
						{
						_localctx = new ExprEqualityOpContext(new ExpressionContext(_parentctx, _parentState));
						((ExprEqualityOpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(251);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(252);
						((ExprEqualityOpContext)_localctx).op = match(EQUALITY_OPERATOR);
						setState(253);
						((ExprEqualityOpContext)_localctx).right = expression(13);
						}
						break;
					case 5:
						{
						_localctx = new ExprAndOpContext(new ExpressionContext(_parentctx, _parentState));
						((ExprAndOpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(254);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(255);
						((ExprAndOpContext)_localctx).op = match(AND_OPERATOR);
						setState(256);
						((ExprAndOpContext)_localctx).right = expression(12);
						}
						break;
					case 6:
						{
						_localctx = new ExprOrOpContext(new ExpressionContext(_parentctx, _parentState));
						((ExprOrOpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(257);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(258);
						((ExprOrOpContext)_localctx).op = match(OR_OPERATOR);
						setState(259);
						((ExprOrOpContext)_localctx).right = expression(11);
						}
						break;
					}
					} 
				}
				setState(264);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT_TYPE() { return getToken(MotorScriptLangParser.INT_TYPE, 0); }
		public TerminalNode STRING_TYPE() { return getToken(MotorScriptLangParser.STRING_TYPE, 0); }
		public TerminalNode FLOAT_TYPE() { return getToken(MotorScriptLangParser.FLOAT_TYPE, 0); }
		public TerminalNode BOOL_TYPE() { return getToken(MotorScriptLangParser.BOOL_TYPE, 0); }
		public TerminalNode VOID_TYPE() { return getToken(MotorScriptLangParser.VOID_TYPE, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MotorScriptLangVisitor ) return ((MotorScriptLangVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << STRING_TYPE) | (1L << BOOL_TYPE) | (1L << VOID_TYPE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanLiteralContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(MotorScriptLangParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(MotorScriptLangParser.FALSE, 0); }
		public BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MotorScriptLangVisitor ) return ((MotorScriptLangVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanLiteralContext booleanLiteral() throws RecognitionException {
		BooleanLiteralContext _localctx = new BooleanLiteralContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_booleanLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Incr_decrContext extends ParserRuleContext {
		public TerminalNode INCREMENT() { return getToken(MotorScriptLangParser.INCREMENT, 0); }
		public TerminalNode DECREMENT() { return getToken(MotorScriptLangParser.DECREMENT, 0); }
		public Incr_decrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incr_decr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MotorScriptLangVisitor ) return ((MotorScriptLangVisitor<? extends T>)visitor).visitIncr_decr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Incr_decrContext incr_decr() throws RecognitionException {
		Incr_decrContext _localctx = new Incr_decrContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_incr_decr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			_la = _input.LA(1);
			if ( !(_la==INCREMENT || _la==DECREMENT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 20:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 15);
		case 1:
			return precpred(_ctx, 14);
		case 2:
			return precpred(_ctx, 13);
		case 3:
			return precpred(_ctx, 12);
		case 4:
			return precpred(_ctx, 11);
		case 5:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u0112\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\7\2\65\n\2\f\2\16\28\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\5\3G\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\5\5R\n\5"+
		"\3\6\5\6U\n\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7b\n\7\f\7"+
		"\16\7e\13\7\3\7\5\7h\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\5\nv\n\n\3\n\7\ny\n\n\f\n\16\n|\13\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\5\r\u008c\n\r\3\r\3\r\5\r\u0090\n\r\3"+
		"\r\7\r\u0093\n\r\f\r\16\r\u0096\13\r\3\r\3\r\3\16\3\16\3\16\5\16\u009d"+
		"\n\16\3\16\3\16\3\16\3\17\3\17\3\17\7\17\u00a5\n\17\f\17\16\17\u00a8\13"+
		"\17\3\20\3\20\3\20\3\20\3\20\5\20\u00af\n\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\7\21\u00b7\n\21\f\21\16\21\u00ba\13\21\3\22\5\22\u00bd\n\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00f3\n\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\7\26\u0107\n\26\f\26\16\26\u010a\13\26\3\27\3\27\3\30\3\30"+
		"\3\31\3\31\3\31\2\3*\32\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*"+
		",.\60\2\5\3\2\25\31\3\2()\3\2\37 \2\u0125\2\66\3\2\2\2\4F\3\2\2\2\6H\3"+
		"\2\2\2\bN\3\2\2\2\nT\3\2\2\2\f[\3\2\2\2\16i\3\2\2\2\20o\3\2\2\2\22r\3"+
		"\2\2\2\24\177\3\2\2\2\26\u0085\3\2\2\2\30\u0089\3\2\2\2\32\u0099\3\2\2"+
		"\2\34\u00a1\3\2\2\2\36\u00a9\3\2\2\2 \u00b3\3\2\2\2\"\u00bc\3\2\2\2$\u00c4"+
		"\3\2\2\2&\u00c8\3\2\2\2(\u00d3\3\2\2\2*\u00f2\3\2\2\2,\u010b\3\2\2\2."+
		"\u010d\3\2\2\2\60\u010f\3\2\2\2\62\65\5*\26\2\63\65\5\4\3\2\64\62\3\2"+
		"\2\2\64\63\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\679\3\2\2\2"+
		"8\66\3\2\2\29:\7\2\2\3:\3\3\2\2\2;G\5\22\n\2<G\5\n\6\2=G\5\6\4\2>G\5\f"+
		"\7\2?G\5\24\13\2@G\5&\24\2AG\5(\25\2BG\5\36\20\2CG\5\32\16\2DG\5$\23\2"+
		"EG\5\b\5\2F;\3\2\2\2F<\3\2\2\2F=\3\2\2\2F>\3\2\2\2F?\3\2\2\2F@\3\2\2\2"+
		"FA\3\2\2\2FB\3\2\2\2FC\3\2\2\2FD\3\2\2\2FE\3\2\2\2G\5\3\2\2\2HI\7\23\2"+
		"\2IJ\7\6\2\2JK\5*\26\2KL\7\7\2\2LM\7\r\2\2M\7\3\2\2\2NO\5,\27\2OQ\7*\2"+
		"\2PR\7\r\2\2QP\3\2\2\2QR\3\2\2\2R\t\3\2\2\2SU\5,\27\2TS\3\2\2\2TU\3\2"+
		"\2\2UV\3\2\2\2VW\7*\2\2WX\7\32\2\2XY\5*\26\2YZ\7\r\2\2Z\13\3\2\2\2[\\"+
		"\7\17\2\2\\]\7\6\2\2]^\5*\26\2^_\7\7\2\2_c\5\22\n\2`b\5\16\b\2a`\3\2\2"+
		"\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2dg\3\2\2\2ec\3\2\2\2fh\5\20\t\2gf\3\2"+
		"\2\2gh\3\2\2\2h\r\3\2\2\2ij\7\20\2\2jk\7\6\2\2kl\5*\26\2lm\7\7\2\2mn\5"+
		"\22\n\2n\17\3\2\2\2op\7\21\2\2pq\5\22\n\2q\21\3\2\2\2rz\7\t\2\2su\5*\26"+
		"\2tv\7\r\2\2ut\3\2\2\2uv\3\2\2\2vy\3\2\2\2wy\5\4\3\2xs\3\2\2\2xw\3\2\2"+
		"\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{}\3\2\2\2|z\3\2\2\2}~\7\n\2\2~\23\3\2"+
		"\2\2\177\u0080\7\22\2\2\u0080\u0081\7\6\2\2\u0081\u0082\5*\26\2\u0082"+
		"\u0083\7\7\2\2\u0083\u0084\5\22\n\2\u0084\25\3\2\2\2\u0085\u0086\7\24"+
		"\2\2\u0086\u0087\5*\26\2\u0087\u0088\7\r\2\2\u0088\27\3\2\2\2\u0089\u008b"+
		"\7\t\2\2\u008a\u008c\5\26\f\2\u008b\u008a\3\2\2\2\u008b\u008c\3\2\2\2"+
		"\u008c\u0094\3\2\2\2\u008d\u008f\5*\26\2\u008e\u0090\7\r\2\2\u008f\u008e"+
		"\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u0093\5\4\3\2\u0092"+
		"\u008d\3\2\2\2\u0092\u0091\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2"+
		"\2\2\u0094\u0095\3\2\2\2\u0095\u0097\3\2\2\2\u0096\u0094\3\2\2\2\u0097"+
		"\u0098\7\n\2\2\u0098\31\3\2\2\2\u0099\u009a\7*\2\2\u009a\u009c\7\6\2\2"+
		"\u009b\u009d\5 \21\2\u009c\u009b\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e"+
		"\3\2\2\2\u009e\u009f\7\7\2\2\u009f\u00a0\7\r\2\2\u00a0\33\3\2\2\2\u00a1"+
		"\u00a6\5\b\5\2\u00a2\u00a3\7\b\2\2\u00a3\u00a5\5\b\5\2\u00a4\u00a2\3\2"+
		"\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7"+
		"\35\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00aa\7$\2\2\u00aa\u00ab\5,\27\2"+
		"\u00ab\u00ac\7*\2\2\u00ac\u00ae\7\6\2\2\u00ad\u00af\5\34\17\2\u00ae\u00ad"+
		"\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\7\7\2\2\u00b1"+
		"\u00b2\5\30\r\2\u00b2\37\3\2\2\2\u00b3\u00b8\5*\26\2\u00b4\u00b5\7\b\2"+
		"\2\u00b5\u00b7\5*\26\2\u00b6\u00b4\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6"+
		"\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9!\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb"+
		"\u00bd\5,\27\2\u00bc\u00bb\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\3\2"+
		"\2\2\u00be\u00bf\7*\2\2\u00bf\u00c0\7\32\2\2\u00c0\u00c1\7*\2\2\u00c1"+
		"\u00c2\7\3\2\2\u00c2\u00c3\7\r\2\2\u00c3#\3\2\2\2\u00c4\u00c5\7#\2\2\u00c5"+
		"\u00c6\7*\2\2\u00c6\u00c7\7\r\2\2\u00c7%\3\2\2\2\u00c8\u00c9\5,\27\2\u00c9"+
		"\u00ca\7\4\2\2\u00ca\u00cb\7*\2\2\u00cb\u00cc\7\32\2\2\u00cc\u00cd\7\5"+
		"\2\2\u00cd\u00ce\5,\27\2\u00ce\u00cf\7\13\2\2\u00cf\u00d0\5*\26\2\u00d0"+
		"\u00d1\7\f\2\2\u00d1\u00d2\7\r\2\2\u00d2\'\3\2\2\2\u00d3\u00d4\7*\2\2"+
		"\u00d4\u00d5\7\13\2\2\u00d5\u00d6\5*\26\2\u00d6\u00d7\7\f\2\2\u00d7\u00d8"+
		"\7\32\2\2\u00d8\u00d9\5*\26\2\u00d9\u00da\7\r\2\2\u00da)\3\2\2\2\u00db"+
		"\u00dc\b\26\1\2\u00dc\u00dd\7\6\2\2\u00dd\u00de\5*\26\2\u00de\u00df\7"+
		"\7\2\2\u00df\u00f3\3\2\2\2\u00e0\u00e1\7\16\2\2\u00e1\u00f3\5*\26\22\u00e2"+
		"\u00f3\5.\30\2\u00e3\u00f3\5\"\22\2\u00e4\u00f3\5\32\16\2\u00e5\u00e6"+
		"\7*\2\2\u00e6\u00e7\7\13\2\2\u00e7\u00e8\5*\26\2\u00e8\u00e9\7\f\2\2\u00e9"+
		"\u00f3\3\2\2\2\u00ea\u00eb\7*\2\2\u00eb\u00ec\5\60\31\2\u00ec\u00ed\7"+
		"\r\2\2\u00ed\u00f3\3\2\2\2\u00ee\u00f3\7*\2\2\u00ef\u00f3\7&\2\2\u00f0"+
		"\u00f3\7\'\2\2\u00f1\u00f3\7%\2\2\u00f2\u00db\3\2\2\2\u00f2\u00e0\3\2"+
		"\2\2\u00f2\u00e2\3\2\2\2\u00f2\u00e3\3\2\2\2\u00f2\u00e4\3\2\2\2\u00f2"+
		"\u00e5\3\2\2\2\u00f2\u00ea\3\2\2\2\u00f2\u00ee\3\2\2\2\u00f2\u00ef\3\2"+
		"\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f1\3\2\2\2\u00f3\u0108\3\2\2\2\u00f4"+
		"\u00f5\f\21\2\2\u00f5\u00f6\7\"\2\2\u00f6\u0107\5*\26\22\u00f7\u00f8\f"+
		"\20\2\2\u00f8\u00f9\7!\2\2\u00f9\u0107\5*\26\21\u00fa\u00fb\f\17\2\2\u00fb"+
		"\u00fc\7\33\2\2\u00fc\u0107\5*\26\20\u00fd\u00fe\f\16\2\2\u00fe\u00ff"+
		"\7\34\2\2\u00ff\u0107\5*\26\17\u0100\u0101\f\r\2\2\u0101\u0102\7\35\2"+
		"\2\u0102\u0107\5*\26\16\u0103\u0104\f\f\2\2\u0104\u0105\7\36\2\2\u0105"+
		"\u0107\5*\26\r\u0106\u00f4\3\2\2\2\u0106\u00f7\3\2\2\2\u0106\u00fa\3\2"+
		"\2\2\u0106\u00fd\3\2\2\2\u0106\u0100\3\2\2\2\u0106\u0103\3\2\2\2\u0107"+
		"\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109+\3\2\2\2"+
		"\u010a\u0108\3\2\2\2\u010b\u010c\t\2\2\2\u010c-\3\2\2\2\u010d\u010e\t"+
		"\3\2\2\u010e/\3\2\2\2\u010f\u0110\t\4\2\2\u0110\61\3\2\2\2\30\64\66FQ"+
		"Tcguxz\u008b\u008f\u0092\u0094\u009c\u00a6\u00ae\u00b8\u00bc\u00f2\u0106"+
		"\u0108";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}