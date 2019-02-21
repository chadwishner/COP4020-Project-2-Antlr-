// Generated from c:\Users\Spectre\Documents\COP4020\Project2\COP4020-Project-2-Antlr-\Antlr\Calculator_old.g4 by ANTLR 4.7.1

    import java.util.HashMap;
    import java.util.ArrayList;
    import java.lang.Math;
    import java.util.Scanner;
    import java.util.Stack;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Calculator_oldLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, PRINT=21, IF=22, ELSE=23, WHILE=24, FOR=25, 
		NUM=26, WS=27, COM=28, SUBT=29, ADD=30, DIVD=31, MULT=32, SPACE=33, ID=34;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "PRINT", "IF", "ELSE", "WHILE", "FOR", "NUM", 
		"WS", "COM", "SUBT", "ADD", "DIVD", "MULT", "SPACE", "ID"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'('", "')'", "'='", "','", "'!'", "'>'", "'>='", "'<'", 
		"'=='", "'!='", "'==='", "'&&'", "'||'", "'sqrt'", "'read'", "'s'", "'c'", 
		"'l'", "'e'", "'print'", "'if'", "'else'", "'while'", "'for'", null, null, 
		null, "'-'", "'+'", "'/'", "'*'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "PRINT", "IF", "ELSE", 
		"WHILE", "FOR", "NUM", "WS", "COM", "SUBT", "ADD", "DIVD", "MULT", "SPACE", 
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


	    // Define custom Scope class to create a local scope hierarchy
	    class Scope {
	        Scope parent;
	        HashMap<String, Double> variables;
	        boolean isGlobalScope;

	        public Scope(Scope parent, boolean isGlobalScope){
	            this.parent = parent;
	            this.isGlobalScope = isGlobalScope;
	            this.variables = new HashMap<String, Double>();
	        }

	        public HashMap<String, Double> getVariables(){
	            return this.variables;
	        }

	        public Scope getParentScope(){
	            return this.parent;
	        }

	        public boolean isGlobal(){
	            return this.isGlobalScope;
	        }
	    }
	    
	    Scope current_scope = new Scope(null, true);
	    ArrayList<Double> prints = new ArrayList<Double>();
	    Scanner scan = new Scanner(System.in);

	    // This function will take care of checking the current scopes for a variable's value.
	    public Double getVariable(String varName){
	        Scope temp = current_scope;
	        
	        while(temp.getVariables().containsKey(varName) == false){
	            if(temp.isGlobal){
	                return null;
	            }
	            temp = current_scope.getParentScope();
	        }
	        return temp.getVariables().get(varName);
	    }

	    // Add a new scope when creating a function, conditional, or loop
	    public void createScope(){
	        new_scope = new Scope(current_scope, false);
	        current_scope = new_scope;
	    }


	public Calculator_oldLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Calculator_old.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2$\u00c6\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b"+
		"\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3"+
		"\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\32\3\32\3\32\3\32\3\33\6\33\u0096\n\33\r\33\16\33\u0097\3\33"+
		"\3\33\7\33\u009c\n\33\f\33\16\33\u009f\13\33\5\33\u00a1\n\33\3\34\6\34"+
		"\u00a4\n\34\r\34\16\34\u00a5\3\34\3\34\3\35\3\35\3\35\3\35\7\35\u00ae"+
		"\n\35\f\35\16\35\u00b1\13\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\37\3"+
		"\37\3 \3 \3!\3!\3\"\3\"\3#\6#\u00c3\n#\r#\16#\u00c4\3\u00af\2$\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$\3\2\5\3\2\62;\5\2\13\f\17\17\"\"\5\2C\\aac|\2\u00cb\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\3G\3\2\2\2\5I\3\2\2\2\7"+
		"K\3\2\2\2\tM\3\2\2\2\13O\3\2\2\2\rQ\3\2\2\2\17S\3\2\2\2\21U\3\2\2\2\23"+
		"X\3\2\2\2\25Z\3\2\2\2\27]\3\2\2\2\31`\3\2\2\2\33d\3\2\2\2\35g\3\2\2\2"+
		"\37j\3\2\2\2!o\3\2\2\2#t\3\2\2\2%v\3\2\2\2\'x\3\2\2\2)z\3\2\2\2+|\3\2"+
		"\2\2-\u0082\3\2\2\2/\u0085\3\2\2\2\61\u008a\3\2\2\2\63\u0090\3\2\2\2\65"+
		"\u0095\3\2\2\2\67\u00a3\3\2\2\29\u00a9\3\2\2\2;\u00b7\3\2\2\2=\u00b9\3"+
		"\2\2\2?\u00bb\3\2\2\2A\u00bd\3\2\2\2C\u00bf\3\2\2\2E\u00c2\3\2\2\2GH\7"+
		"=\2\2H\4\3\2\2\2IJ\7*\2\2J\6\3\2\2\2KL\7+\2\2L\b\3\2\2\2MN\7?\2\2N\n\3"+
		"\2\2\2OP\7.\2\2P\f\3\2\2\2QR\7#\2\2R\16\3\2\2\2ST\7@\2\2T\20\3\2\2\2U"+
		"V\7@\2\2VW\7?\2\2W\22\3\2\2\2XY\7>\2\2Y\24\3\2\2\2Z[\7?\2\2[\\\7?\2\2"+
		"\\\26\3\2\2\2]^\7#\2\2^_\7?\2\2_\30\3\2\2\2`a\7?\2\2ab\7?\2\2bc\7?\2\2"+
		"c\32\3\2\2\2de\7(\2\2ef\7(\2\2f\34\3\2\2\2gh\7~\2\2hi\7~\2\2i\36\3\2\2"+
		"\2jk\7u\2\2kl\7s\2\2lm\7t\2\2mn\7v\2\2n \3\2\2\2op\7t\2\2pq\7g\2\2qr\7"+
		"c\2\2rs\7f\2\2s\"\3\2\2\2tu\7u\2\2u$\3\2\2\2vw\7e\2\2w&\3\2\2\2xy\7n\2"+
		"\2y(\3\2\2\2z{\7g\2\2{*\3\2\2\2|}\7r\2\2}~\7t\2\2~\177\7k\2\2\177\u0080"+
		"\7p\2\2\u0080\u0081\7v\2\2\u0081,\3\2\2\2\u0082\u0083\7k\2\2\u0083\u0084"+
		"\7h\2\2\u0084.\3\2\2\2\u0085\u0086\7g\2\2\u0086\u0087\7n\2\2\u0087\u0088"+
		"\7u\2\2\u0088\u0089\7g\2\2\u0089\60\3\2\2\2\u008a\u008b\7y\2\2\u008b\u008c"+
		"\7j\2\2\u008c\u008d\7k\2\2\u008d\u008e\7n\2\2\u008e\u008f\7g\2\2\u008f"+
		"\62\3\2\2\2\u0090\u0091\7h\2\2\u0091\u0092\7q\2\2\u0092\u0093\7t\2\2\u0093"+
		"\64\3\2\2\2\u0094\u0096\t\2\2\2\u0095\u0094\3\2\2\2\u0096\u0097\3\2\2"+
		"\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u00a0\3\2\2\2\u0099\u009d"+
		"\7\60\2\2\u009a\u009c\t\2\2\2\u009b\u009a\3\2\2\2\u009c\u009f\3\2\2\2"+
		"\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d"+
		"\3\2\2\2\u00a0\u0099\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\66\3\2\2\2\u00a2"+
		"\u00a4\5C\"\2\u00a3\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a3\3\2"+
		"\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\b\34\2\2\u00a8"+
		"8\3\2\2\2\u00a9\u00aa\7\61\2\2\u00aa\u00ab\7,\2\2\u00ab\u00af\3\2\2\2"+
		"\u00ac\u00ae\13\2\2\2\u00ad\u00ac\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00b0"+
		"\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2"+
		"\u00b3\7,\2\2\u00b3\u00b4\7\61\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\b\35"+
		"\2\2\u00b6:\3\2\2\2\u00b7\u00b8\7/\2\2\u00b8<\3\2\2\2\u00b9\u00ba\7-\2"+
		"\2\u00ba>\3\2\2\2\u00bb\u00bc\7\61\2\2\u00bc@\3\2\2\2\u00bd\u00be\7,\2"+
		"\2\u00beB\3\2\2\2\u00bf\u00c0\t\3\2\2\u00c0D\3\2\2\2\u00c1\u00c3\t\4\2"+
		"\2\u00c2\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5"+
		"\3\2\2\2\u00c5F\3\2\2\2\t\2\u0097\u009d\u00a0\u00a5\u00af\u00c4\3\b\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}