// Generated from c:\Users\Spectre\Documents\COP4020\Project2\COP4020-Project-2-Antlr-\Java\calculator\Calculator.g4 by ANTLR 4.7.1

    package calculator;                 

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalculatorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, IF=2, ELSE=3, OPAR=4, CPAR=5, OBRC=6, CBRC=7, S=8, C=9, L=10, E=11, 
		COMMA=12, SEMICOLON=13, DEFINE=14, AUTO=15, RETURN=16, SQRT=17, READ=18, 
		PRINT=19, WHILE=20, FOR=21, NUM=22, COM=23, SUB=24, ADD=25, DIV=26, MUL=27, 
		EQ=28, ASSIGN=29, NEQ=30, GRE=31, GREQ=32, LT=33, LTEQ=34, AND=35, OR=36, 
		NOT=37, ID=38;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"WS", "IF", "ELSE", "OPAR", "CPAR", "OBRC", "CBRC", "S", "C", "L", "E", 
		"COMMA", "SEMICOLON", "DEFINE", "AUTO", "RETURN", "SQRT", "READ", "PRINT", 
		"WHILE", "FOR", "NUM", "COM", "SUB", "ADD", "DIV", "MUL", "EQ", "ASSIGN", 
		"NEQ", "GRE", "GREQ", "LT", "LTEQ", "AND", "OR", "NOT", "ID"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'if'", "'else'", "'('", "')'", "'{'", "'}'", "'s'", "'c'", 
		"'l'", "'e'", "','", "';'", "'define'", "'auto'", "'return'", "'sqrt'", 
		"'read'", "'print'", "'while'", "'for'", null, null, "'-'", "'+'", "'/'", 
		"'*'", "'=='", "'='", "'!='", "'>'", "'>='", "'<'", "'<='", "'&&'", "'||'", 
		"'!'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WS", "IF", "ELSE", "OPAR", "CPAR", "OBRC", "CBRC", "S", "C", "L", 
		"E", "COMMA", "SEMICOLON", "DEFINE", "AUTO", "RETURN", "SQRT", "READ", 
		"PRINT", "WHILE", "FOR", "NUM", "COM", "SUB", "ADD", "DIV", "MUL", "EQ", 
		"ASSIGN", "NEQ", "GRE", "GREQ", "LT", "LTEQ", "AND", "OR", "NOT", "ID"
	};
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


	public CalculatorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Calculator.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2(\u00e4\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n"+
		"\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\5\27\u009e\n\27"+
		"\3\27\6\27\u00a1\n\27\r\27\16\27\u00a2\3\27\3\27\7\27\u00a7\n\27\f\27"+
		"\16\27\u00aa\13\27\5\27\u00ac\n\27\3\30\3\30\3\30\3\30\7\30\u00b2\n\30"+
		"\f\30\16\30\u00b5\13\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3"+
		"\33\3\33\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3 \3 \3!\3"+
		"!\3!\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3\'\3\'\7\'\u00e0\n\'\f"+
		"\'\16\'\u00e3\13\'\3\u00b3\2(\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(\3\2\7\5\2\13\f\17\17"+
		"\"\"\3\2//\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\2\u00e9\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2"+
		"?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3"+
		"\2\2\2\2M\3\2\2\2\3O\3\2\2\2\5S\3\2\2\2\7V\3\2\2\2\t[\3\2\2\2\13]\3\2"+
		"\2\2\r_\3\2\2\2\17a\3\2\2\2\21c\3\2\2\2\23e\3\2\2\2\25g\3\2\2\2\27i\3"+
		"\2\2\2\31k\3\2\2\2\33m\3\2\2\2\35o\3\2\2\2\37v\3\2\2\2!{\3\2\2\2#\u0082"+
		"\3\2\2\2%\u0087\3\2\2\2\'\u008c\3\2\2\2)\u0092\3\2\2\2+\u0098\3\2\2\2"+
		"-\u009d\3\2\2\2/\u00ad\3\2\2\2\61\u00bb\3\2\2\2\63\u00bd\3\2\2\2\65\u00bf"+
		"\3\2\2\2\67\u00c1\3\2\2\29\u00c3\3\2\2\2;\u00c6\3\2\2\2=\u00c8\3\2\2\2"+
		"?\u00cb\3\2\2\2A\u00cd\3\2\2\2C\u00d0\3\2\2\2E\u00d2\3\2\2\2G\u00d5\3"+
		"\2\2\2I\u00d8\3\2\2\2K\u00db\3\2\2\2M\u00dd\3\2\2\2OP\t\2\2\2PQ\3\2\2"+
		"\2QR\b\2\2\2R\4\3\2\2\2ST\7k\2\2TU\7h\2\2U\6\3\2\2\2VW\7g\2\2WX\7n\2\2"+
		"XY\7u\2\2YZ\7g\2\2Z\b\3\2\2\2[\\\7*\2\2\\\n\3\2\2\2]^\7+\2\2^\f\3\2\2"+
		"\2_`\7}\2\2`\16\3\2\2\2ab\7\177\2\2b\20\3\2\2\2cd\7u\2\2d\22\3\2\2\2e"+
		"f\7e\2\2f\24\3\2\2\2gh\7n\2\2h\26\3\2\2\2ij\7g\2\2j\30\3\2\2\2kl\7.\2"+
		"\2l\32\3\2\2\2mn\7=\2\2n\34\3\2\2\2op\7f\2\2pq\7g\2\2qr\7h\2\2rs\7k\2"+
		"\2st\7p\2\2tu\7g\2\2u\36\3\2\2\2vw\7c\2\2wx\7w\2\2xy\7v\2\2yz\7q\2\2z"+
		" \3\2\2\2{|\7t\2\2|}\7g\2\2}~\7v\2\2~\177\7w\2\2\177\u0080\7t\2\2\u0080"+
		"\u0081\7p\2\2\u0081\"\3\2\2\2\u0082\u0083\7u\2\2\u0083\u0084\7s\2\2\u0084"+
		"\u0085\7t\2\2\u0085\u0086\7v\2\2\u0086$\3\2\2\2\u0087\u0088\7t\2\2\u0088"+
		"\u0089\7g\2\2\u0089\u008a\7c\2\2\u008a\u008b\7f\2\2\u008b&\3\2\2\2\u008c"+
		"\u008d\7r\2\2\u008d\u008e\7t\2\2\u008e\u008f\7k\2\2\u008f\u0090\7p\2\2"+
		"\u0090\u0091\7v\2\2\u0091(\3\2\2\2\u0092\u0093\7y\2\2\u0093\u0094\7j\2"+
		"\2\u0094\u0095\7k\2\2\u0095\u0096\7n\2\2\u0096\u0097\7g\2\2\u0097*\3\2"+
		"\2\2\u0098\u0099\7h\2\2\u0099\u009a\7q\2\2\u009a\u009b\7t\2\2\u009b,\3"+
		"\2\2\2\u009c\u009e\t\3\2\2\u009d\u009c\3\2\2\2\u009d\u009e\3\2\2\2\u009e"+
		"\u00a0\3\2\2\2\u009f\u00a1\t\4\2\2\u00a0\u009f\3\2\2\2\u00a1\u00a2\3\2"+
		"\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00ab\3\2\2\2\u00a4"+
		"\u00a8\7\60\2\2\u00a5\u00a7\t\4\2\2\u00a6\u00a5\3\2\2\2\u00a7\u00aa\3"+
		"\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa"+
		"\u00a8\3\2\2\2\u00ab\u00a4\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac.\3\2\2\2"+
		"\u00ad\u00ae\7\61\2\2\u00ae\u00af\7,\2\2\u00af\u00b3\3\2\2\2\u00b0\u00b2"+
		"\13\2\2\2\u00b1\u00b0\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b4\3\2\2\2"+
		"\u00b3\u00b1\3\2\2\2\u00b4\u00b6\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b7"+
		"\7,\2\2\u00b7\u00b8\7\61\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\b\30\2\2"+
		"\u00ba\60\3\2\2\2\u00bb\u00bc\7/\2\2\u00bc\62\3\2\2\2\u00bd\u00be\7-\2"+
		"\2\u00be\64\3\2\2\2\u00bf\u00c0\7\61\2\2\u00c0\66\3\2\2\2\u00c1\u00c2"+
		"\7,\2\2\u00c28\3\2\2\2\u00c3\u00c4\7?\2\2\u00c4\u00c5\7?\2\2\u00c5:\3"+
		"\2\2\2\u00c6\u00c7\7?\2\2\u00c7<\3\2\2\2\u00c8\u00c9\7#\2\2\u00c9\u00ca"+
		"\7?\2\2\u00ca>\3\2\2\2\u00cb\u00cc\7@\2\2\u00cc@\3\2\2\2\u00cd\u00ce\7"+
		"@\2\2\u00ce\u00cf\7?\2\2\u00cfB\3\2\2\2\u00d0\u00d1\7>\2\2\u00d1D\3\2"+
		"\2\2\u00d2\u00d3\7>\2\2\u00d3\u00d4\7?\2\2\u00d4F\3\2\2\2\u00d5\u00d6"+
		"\7(\2\2\u00d6\u00d7\7(\2\2\u00d7H\3\2\2\2\u00d8\u00d9\7~\2\2\u00d9\u00da"+
		"\7~\2\2\u00daJ\3\2\2\2\u00db\u00dc\7#\2\2\u00dcL\3\2\2\2\u00dd\u00e1\t"+
		"\5\2\2\u00de\u00e0\t\6\2\2\u00df\u00de\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1"+
		"\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2N\3\2\2\2\u00e3\u00e1\3\2\2\2"+
		"\t\2\u009d\u00a2\u00a8\u00ab\u00b3\u00e1\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}