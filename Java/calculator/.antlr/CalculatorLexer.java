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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, PRINT=20, IF=21, ELSE=22, WHILE=23, FOR=24, NUM=25, 
		WS=26, COM=27, SUB=28, ADD=29, DIV=30, MUL=31, SPACE=32, ID=33;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "PRINT", "IF", "ELSE", "WHILE", "FOR", "NUM", "WS", 
		"COM", "SUB", "ADD", "DIV", "MUL", "SPACE", "ID"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'('", "')'", "'='", "','", "'!'", "'>'", "'>='", "'<'", 
		"'=='", "'!='", "'&&'", "'||'", "'sqrt'", "'read'", "'s'", "'c'", "'l'", 
		"'e'", "'print'", "'if'", "'else'", "'while'", "'for'", null, null, null, 
		"'-'", "'+'", "'/'", "'*'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "PRINT", "IF", "ELSE", 
		"WHILE", "FOR", "NUM", "WS", "COM", "SUB", "ADD", "DIV", "MUL", "SPACE", 
		"ID"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2#\u00c2\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3"+
		"\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3"+
		"\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3"+
		"\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3"+
		"\31\3\32\6\32\u0090\n\32\r\32\16\32\u0091\3\32\3\32\7\32\u0096\n\32\f"+
		"\32\16\32\u0099\13\32\5\32\u009b\n\32\3\33\6\33\u009e\n\33\r\33\16\33"+
		"\u009f\3\33\3\33\3\34\3\34\3\34\3\34\7\34\u00a8\n\34\f\34\16\34\u00ab"+
		"\13\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3"+
		"!\3!\3\"\3\"\7\"\u00be\n\"\f\"\16\"\u00c1\13\"\3\u00a9\2#\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#\3\2"+
		"\6\3\2\62;\5\2\13\f\17\17\"\"\5\2C\\aac|\6\2\62;C\\aac|\2\u00c7\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2"+
		"\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\3E\3\2\2\2\5G\3\2\2\2\7I"+
		"\3\2\2\2\tK\3\2\2\2\13M\3\2\2\2\rO\3\2\2\2\17Q\3\2\2\2\21S\3\2\2\2\23"+
		"V\3\2\2\2\25X\3\2\2\2\27[\3\2\2\2\31^\3\2\2\2\33a\3\2\2\2\35d\3\2\2\2"+
		"\37i\3\2\2\2!n\3\2\2\2#p\3\2\2\2%r\3\2\2\2\'t\3\2\2\2)v\3\2\2\2+|\3\2"+
		"\2\2-\177\3\2\2\2/\u0084\3\2\2\2\61\u008a\3\2\2\2\63\u008f\3\2\2\2\65"+
		"\u009d\3\2\2\2\67\u00a3\3\2\2\29\u00b1\3\2\2\2;\u00b3\3\2\2\2=\u00b5\3"+
		"\2\2\2?\u00b7\3\2\2\2A\u00b9\3\2\2\2C\u00bb\3\2\2\2EF\7=\2\2F\4\3\2\2"+
		"\2GH\7*\2\2H\6\3\2\2\2IJ\7+\2\2J\b\3\2\2\2KL\7?\2\2L\n\3\2\2\2MN\7.\2"+
		"\2N\f\3\2\2\2OP\7#\2\2P\16\3\2\2\2QR\7@\2\2R\20\3\2\2\2ST\7@\2\2TU\7?"+
		"\2\2U\22\3\2\2\2VW\7>\2\2W\24\3\2\2\2XY\7?\2\2YZ\7?\2\2Z\26\3\2\2\2[\\"+
		"\7#\2\2\\]\7?\2\2]\30\3\2\2\2^_\7(\2\2_`\7(\2\2`\32\3\2\2\2ab\7~\2\2b"+
		"c\7~\2\2c\34\3\2\2\2de\7u\2\2ef\7s\2\2fg\7t\2\2gh\7v\2\2h\36\3\2\2\2i"+
		"j\7t\2\2jk\7g\2\2kl\7c\2\2lm\7f\2\2m \3\2\2\2no\7u\2\2o\"\3\2\2\2pq\7"+
		"e\2\2q$\3\2\2\2rs\7n\2\2s&\3\2\2\2tu\7g\2\2u(\3\2\2\2vw\7r\2\2wx\7t\2"+
		"\2xy\7k\2\2yz\7p\2\2z{\7v\2\2{*\3\2\2\2|}\7k\2\2}~\7h\2\2~,\3\2\2\2\177"+
		"\u0080\7g\2\2\u0080\u0081\7n\2\2\u0081\u0082\7u\2\2\u0082\u0083\7g\2\2"+
		"\u0083.\3\2\2\2\u0084\u0085\7y\2\2\u0085\u0086\7j\2\2\u0086\u0087\7k\2"+
		"\2\u0087\u0088\7n\2\2\u0088\u0089\7g\2\2\u0089\60\3\2\2\2\u008a\u008b"+
		"\7h\2\2\u008b\u008c\7q\2\2\u008c\u008d\7t\2\2\u008d\62\3\2\2\2\u008e\u0090"+
		"\t\2\2\2\u008f\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u008f\3\2\2\2\u0091"+
		"\u0092\3\2\2\2\u0092\u009a\3\2\2\2\u0093\u0097\7\60\2\2\u0094\u0096\t"+
		"\2\2\2\u0095\u0094\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097"+
		"\u0098\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u0093\3\2"+
		"\2\2\u009a\u009b\3\2\2\2\u009b\64\3\2\2\2\u009c\u009e\5A!\2\u009d\u009c"+
		"\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0"+
		"\u00a1\3\2\2\2\u00a1\u00a2\b\33\2\2\u00a2\66\3\2\2\2\u00a3\u00a4\7\61"+
		"\2\2\u00a4\u00a5\7,\2\2\u00a5\u00a9\3\2\2\2\u00a6\u00a8\13\2\2\2\u00a7"+
		"\u00a6\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00aa\3\2\2\2\u00a9\u00a7\3\2"+
		"\2\2\u00aa\u00ac\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00ad\7,\2\2\u00ad"+
		"\u00ae\7\61\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\b\34\2\2\u00b08\3\2\2"+
		"\2\u00b1\u00b2\7/\2\2\u00b2:\3\2\2\2\u00b3\u00b4\7-\2\2\u00b4<\3\2\2\2"+
		"\u00b5\u00b6\7\61\2\2\u00b6>\3\2\2\2\u00b7\u00b8\7,\2\2\u00b8@\3\2\2\2"+
		"\u00b9\u00ba\t\3\2\2\u00baB\3\2\2\2\u00bb\u00bf\t\4\2\2\u00bc\u00be\t"+
		"\5\2\2\u00bd\u00bc\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf"+
		"\u00c0\3\2\2\2\u00c0D\3\2\2\2\u00c1\u00bf\3\2\2\2\t\2\u0091\u0097\u009a"+
		"\u009f\u00a9\u00bf\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}