// Generated from /Users/semnijenhuis/Desktop/Gitlab/MotorScriptProject/src/MotorScriptLang.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MotorScriptLangLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "LPAREN", "RPAREN", "COMMA", "OPEN_BRACK", "CLOSE_BRACK", 
			"OPEN_BLOCK", "CLOSE_BLOCK", "END", "NEG", "IF", "ELSE_IF", "ELSE", "WHILE", 
			"PRINT", "RETURN", "INT_TYPE", "FLOAT_TYPE", "STRING_TYPE", "BOOL_TYPE", 
			"VOID_TYPE", "ASSIGNMENT_OP", "COMPARE_OPERATOR", "EQUALITY_OPERATOR", 
			"AND_OPERATOR", "OR_OPERATOR", "INCREMENT", "DECREMENT", "ADDSUB_OPERATOR", 
			"MULDIV_OPERATOR", "SCANNER", "FUNC", "FLAT4", "STRING", "INLINE4", "TRUE", 
			"FALSE", "IDENTIFIER", "WS", "Letter", "Letters", "Digit", "Digits", 
			"PosDigits", "LetterOrDigit"
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


	public MotorScriptLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MotorScriptLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2+\u015d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3"+
		"\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33\5\33\u00cb\n\33\3\34\3\34\3\34"+
		"\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u00ea\n \3!\3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"!\3!\5!\u00f7\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$"+
		"\3$\3$\3$\3$\3$\3$\3$\3$\5$\u0110\n$\3%\3%\7%\u0114\n%\f%\16%\u0117\13"+
		"%\3%\3%\3&\3&\3&\7&\u011e\n&\f&\16&\u0121\13&\5&\u0123\n&\3\'\3\'\3\'"+
		"\3\'\3\'\3(\3(\3(\3(\3(\3(\3)\3)\7)\u0132\n)\f)\16)\u0135\13)\3*\6*\u0138"+
		"\n*\r*\16*\u0139\3*\3*\3+\3+\3,\3,\7,\u0142\n,\f,\16,\u0145\13,\3-\3-"+
		"\3.\3.\7.\u014b\n.\f.\16.\u014e\13.\3.\5.\u0151\n.\3/\3/\7/\u0155\n/\f"+
		"/\16/\u0158\13/\3\60\3\60\5\60\u015c\n\60\2\2\61\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O"+
		")Q*S+U\2W\2Y\2[\2]\2_\2\3\2\t\4\2>>@@\4\2\f\f\17\17\3\2\62;\5\2\13\f\17"+
		"\17\"\"\4\2C\\c|\4\2\62;aa\3\2\63;\2\u0165\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2"+
		"\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2"+
		"\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M"+
		"\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\3a\3\2\2\2\5g\3\2\2\2\7j\3\2"+
		"\2\2\tn\3\2\2\2\13p\3\2\2\2\rr\3\2\2\2\17t\3\2\2\2\21v\3\2\2\2\23x\3\2"+
		"\2\2\25z\3\2\2\2\27|\3\2\2\2\31~\3\2\2\2\33\u0080\3\2\2\2\35\u0083\3\2"+
		"\2\2\37\u0088\3\2\2\2!\u008d\3\2\2\2#\u0093\3\2\2\2%\u009b\3\2\2\2\'\u00a2"+
		"\3\2\2\2)\u00aa\3\2\2\2+\u00b0\3\2\2\2-\u00b9\3\2\2\2/\u00bc\3\2\2\2\61"+
		"\u00c1\3\2\2\2\63\u00c4\3\2\2\2\65\u00ca\3\2\2\2\67\u00cc\3\2\2\29\u00d0"+
		"\3\2\2\2;\u00d3\3\2\2\2=\u00d6\3\2\2\2?\u00e9\3\2\2\2A\u00f6\3\2\2\2C"+
		"\u00f8\3\2\2\2E\u0100\3\2\2\2G\u010f\3\2\2\2I\u0111\3\2\2\2K\u0122\3\2"+
		"\2\2M\u0124\3\2\2\2O\u0129\3\2\2\2Q\u012f\3\2\2\2S\u0137\3\2\2\2U\u013d"+
		"\3\2\2\2W\u013f\3\2\2\2Y\u0146\3\2\2\2[\u0148\3\2\2\2]\u0152\3\2\2\2_"+
		"\u015b\3\2\2\2ab\7\60\2\2bc\7u\2\2cd\7e\2\2de\7c\2\2ef\7p\2\2f\4\3\2\2"+
		"\2gh\7]\2\2hi\7_\2\2i\6\3\2\2\2jk\7p\2\2kl\7g\2\2lm\7y\2\2m\b\3\2\2\2"+
		"no\7*\2\2o\n\3\2\2\2pq\7+\2\2q\f\3\2\2\2rs\7.\2\2s\16\3\2\2\2tu\7}\2\2"+
		"u\20\3\2\2\2vw\7\177\2\2w\22\3\2\2\2xy\7]\2\2y\24\3\2\2\2z{\7_\2\2{\26"+
		"\3\2\2\2|}\7%\2\2}\30\3\2\2\2~\177\7/\2\2\177\32\3\2\2\2\u0080\u0081\7"+
		"k\2\2\u0081\u0082\7h\2\2\u0082\34\3\2\2\2\u0083\u0084\7g\2\2\u0084\u0085"+
		"\7n\2\2\u0085\u0086\7k\2\2\u0086\u0087\7h\2\2\u0087\36\3\2\2\2\u0088\u0089"+
		"\7g\2\2\u0089\u008a\7n\2\2\u008a\u008b\7u\2\2\u008b\u008c\7g\2\2\u008c"+
		" \3\2\2\2\u008d\u008e\7y\2\2\u008e\u008f\7j\2\2\u008f\u0090\7k\2\2\u0090"+
		"\u0091\7n\2\2\u0091\u0092\7g\2\2\u0092\"\3\2\2\2\u0093\u0094\7d\2\2\u0094"+
		"\u0095\7w\2\2\u0095\u0096\7t\2\2\u0096\u0097\7p\2\2\u0097\u0098\7q\2\2"+
		"\u0098\u0099\7w\2\2\u0099\u009a\7v\2\2\u009a$\3\2\2\2\u009b\u009c\7t\2"+
		"\2\u009c\u009d\7g\2\2\u009d\u009e\7v\2\2\u009e\u009f\7w\2\2\u009f\u00a0"+
		"\7t\2\2\u00a0\u00a1\7p\2\2\u00a1&\3\2\2\2\u00a2\u00a3\7k\2\2\u00a3\u00a4"+
		"\7p\2\2\u00a4\u00a5\7n\2\2\u00a5\u00a6\7k\2\2\u00a6\u00a7\7p\2\2\u00a7"+
		"\u00a8\7g\2\2\u00a8\u00a9\7\66\2\2\u00a9(\3\2\2\2\u00aa\u00ab\7h\2\2\u00ab"+
		"\u00ac\7n\2\2\u00ac\u00ad\7c\2\2\u00ad\u00ae\7v\2\2\u00ae\u00af\7\66\2"+
		"\2\u00af*\3\2\2\2\u00b0\u00b1\7u\2\2\u00b1\u00b2\7g\2\2\u00b2\u00b3\7"+
		"p\2\2\u00b3\u00b4\7v\2\2\u00b4\u00b5\7g\2\2\u00b5\u00b6\7p\2\2\u00b6\u00b7"+
		"\7e\2\2\u00b7\u00b8\7g\2\2\u00b8,\3\2\2\2\u00b9\u00ba\7g\2\2\u00ba\u00bb"+
		"\7x\2\2\u00bb.\3\2\2\2\u00bc\u00bd\7x\2\2\u00bd\u00be\7q\2\2\u00be\u00bf"+
		"\7k\2\2\u00bf\u00c0\7f\2\2\u00c0\60\3\2\2\2\u00c1\u00c2\7k\2\2\u00c2\u00c3"+
		"\7u\2\2\u00c3\62\3\2\2\2\u00c4\u00c5\t\2\2\2\u00c5\64\3\2\2\2\u00c6\u00c7"+
		"\7?\2\2\u00c7\u00cb\7?\2\2\u00c8\u00c9\7#\2\2\u00c9\u00cb\7?\2\2\u00ca"+
		"\u00c6\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\66\3\2\2\2\u00cc\u00cd\7C\2\2"+
		"\u00cd\u00ce\7P\2\2\u00ce\u00cf\7F\2\2\u00cf8\3\2\2\2\u00d0\u00d1\7Q\2"+
		"\2\u00d1\u00d2\7T\2\2\u00d2:\3\2\2\2\u00d3\u00d4\7`\2\2\u00d4\u00d5\7"+
		"`\2\2\u00d5<\3\2\2\2\u00d6\u00d7\7/\2\2\u00d7\u00d8\7/\2\2\u00d8>\3\2"+
		"\2\2\u00d9\u00da\7w\2\2\u00da\u00db\7r\2\2\u00db\u00dc\7u\2\2\u00dc\u00dd"+
		"\7j\2\2\u00dd\u00de\7k\2\2\u00de\u00df\7h\2\2\u00df\u00ea\7v\2\2\u00e0"+
		"\u00e1\7f\2\2\u00e1\u00e2\7q\2\2\u00e2\u00e3\7y\2\2\u00e3\u00e4\7p\2\2"+
		"\u00e4\u00e5\7u\2\2\u00e5\u00e6\7j\2\2\u00e6\u00e7\7k\2\2\u00e7\u00e8"+
		"\7h\2\2\u00e8\u00ea\7v\2\2\u00e9\u00d9\3\2\2\2\u00e9\u00e0\3\2\2\2\u00ea"+
		"@\3\2\2\2\u00eb\u00ec\7p\2\2\u00ec\u00ed\7k\2\2\u00ed\u00ee\7v\2\2\u00ee"+
		"\u00ef\7t\2\2\u00ef\u00f7\7q\2\2\u00f0\u00f1\7f\2\2\u00f1\u00f2\7k\2\2"+
		"\u00f2\u00f3\7x\2\2\u00f3\u00f4\7k\2\2\u00f4\u00f5\7f\2\2\u00f5\u00f7"+
		"\7g\2\2\u00f6\u00eb\3\2\2\2\u00f6\u00f0\3\2\2\2\u00f7B\3\2\2\2\u00f8\u00f9"+
		"\7u\2\2\u00f9\u00fa\7e\2\2\u00fa\u00fb\7c\2\2\u00fb\u00fc\7p\2\2\u00fc"+
		"\u00fd\7p\2\2\u00fd\u00fe\7g\2\2\u00fe\u00ff\7t\2\2\u00ffD\3\2\2\2\u0100"+
		"\u0101\7h\2\2\u0101\u0102\7w\2\2\u0102\u0103\7p\2\2\u0103\u0104\7m\2\2"+
		"\u0104\u0105\7{\2\2\u0105F\3\2\2\2\u0106\u0107\7\62\2\2\u0107\u0108\7"+
		"\60\2\2\u0108\u0110\5[.\2\u0109\u010a\5]/\2\u010a\u010b\7\60\2\2\u010b"+
		"\u010c\5[.\2\u010c\u0110\3\2\2\2\u010d\u010e\7\60\2\2\u010e\u0110\5[."+
		"\2\u010f\u0106\3\2\2\2\u010f\u0109\3\2\2\2\u010f\u010d\3\2\2\2\u0110H"+
		"\3\2\2\2\u0111\u0115\7$\2\2\u0112\u0114\n\3\2\2\u0113\u0112\3\2\2\2\u0114"+
		"\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0118\3\2"+
		"\2\2\u0117\u0115\3\2\2\2\u0118\u0119\7$\2\2\u0119J\3\2\2\2\u011a\u0123"+
		"\7\62\2\2\u011b\u011f\t\4\2\2\u011c\u011e\t\4\2\2\u011d\u011c\3\2\2\2"+
		"\u011e\u0121\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0123"+
		"\3\2\2\2\u0121\u011f\3\2\2\2\u0122\u011a\3\2\2\2\u0122\u011b\3\2\2\2\u0123"+
		"L\3\2\2\2\u0124\u0125\7v\2\2\u0125\u0126\7t\2\2\u0126\u0127\7w\2\2\u0127"+
		"\u0128\7g\2\2\u0128N\3\2\2\2\u0129\u012a\7h\2\2\u012a\u012b\7c\2\2\u012b"+
		"\u012c\7n\2\2\u012c\u012d\7u\2\2\u012d\u012e\7g\2\2\u012eP\3\2\2\2\u012f"+
		"\u0133\5U+\2\u0130\u0132\5_\60\2\u0131\u0130\3\2\2\2\u0132\u0135\3\2\2"+
		"\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134R\3\2\2\2\u0135\u0133"+
		"\3\2\2\2\u0136\u0138\t\5\2\2\u0137\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139"+
		"\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013c\b*"+
		"\2\2\u013cT\3\2\2\2\u013d\u013e\t\6\2\2\u013eV\3\2\2\2\u013f\u0143\t\6"+
		"\2\2\u0140\u0142\t\6\2\2\u0141\u0140\3\2\2\2\u0142\u0145\3\2\2\2\u0143"+
		"\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144X\3\2\2\2\u0145\u0143\3\2\2\2"+
		"\u0146\u0147\t\4\2\2\u0147Z\3\2\2\2\u0148\u0150\t\4\2\2\u0149\u014b\t"+
		"\7\2\2\u014a\u0149\3\2\2\2\u014b\u014e\3\2\2\2\u014c\u014a\3\2\2\2\u014c"+
		"\u014d\3\2\2\2\u014d\u014f\3\2\2\2\u014e\u014c\3\2\2\2\u014f\u0151\t\4"+
		"\2\2\u0150\u014c\3\2\2\2\u0150\u0151\3\2\2\2\u0151\\\3\2\2\2\u0152\u0156"+
		"\t\b\2\2\u0153\u0155\t\4\2\2\u0154\u0153\3\2\2\2\u0155\u0158\3\2\2\2\u0156"+
		"\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157^\3\2\2\2\u0158\u0156\3\2\2\2"+
		"\u0159\u015c\5U+\2\u015a\u015c\t\4\2\2\u015b\u0159\3\2\2\2\u015b\u015a"+
		"\3\2\2\2\u015c`\3\2\2\2\21\2\u00ca\u00e9\u00f6\u010f\u0115\u011f\u0122"+
		"\u0133\u0139\u0143\u014c\u0150\u0156\u015b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}