// Generated from c:\Users\Spectre\Documents\COP4020\Project2\COP4020-Project-2-Antlr-\Calculator.g4 by ANTLR 4.7.1

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
public class CalculatorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, PRINT=15, NUM=16, WS=17, 
		COM=18, SPACE=19, SUBT=20, ADD=21, DIVD=22, MULT=23, IF=24, ELSE=25, ID=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "PRINT", "NUM", "WS", "COM", 
		"SPACE", "SUBT", "ADD", "DIVD", "MULT", "IF", "ELSE", "ID"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'='", "','", "'!'", "'&&'", "'||'", "'sqrt'", "'('", "')'", 
		"'read'", "'s'", "'c'", "'l'", "'e'", "'print'", null, null, null, null, 
		"'-'", "'+'", "'/'", "'*'", "'if'", "'else'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "PRINT", "NUM", "WS", "COM", "SPACE", "SUBT", "ADD", 
		"DIVD", "MULT", "IF", "ELSE", "ID"
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


	    HashMap<String, Double> global_scope = new HashMap<String, Double>();
	    ArrayList<Double> prints = new ArrayList<Double>();
	    Scanner scan = new Scanner(System.in);
	    Stack<HashMap<String, Double>> scopes = new Stack<HashMap<String, Double>>();

	    // This function will take care of checking the current scopes for a variable's value
	    // If the variable is found, it will be part of the top-most element of the scopes stack.
	    public boolean findScope(String varName){
	        if(scopes.empty()){
	            scopes.push(global_scope);
	        }
	        while(scopes.peek() != global_scope){
	            // Get the current scope and check if that variable is contained within it.
	            HashMap<String, Double> current_scope = scopes.pop();
	            if(current_scope.containsKey(varName)){
	                scopes.push(current_scope);
	                return true;
	            }
	        }
	        
	        // Check the global scope
	        HashMap<String, Double> current_scope = scopes.peek();
	        if(current_scope.containsKey(varName)){
	                return true;
	        }

	        // We've checked every scope, including the global scope and did not find the variable
	        return false;
	    }

	    // Return a variable's value from the top-most scope
	    public Double getVariable(String varName){
	        if(findScope(varName)){
	            return scopes.peek().get(varName);
	        }else{
	            return null;
	        }
	    }

	    // Add a new scope to the stack, when creating a function, conditional, or loop
	    public void createScope(){
	        HashMap<String, Double> new_scope = new HashMap<String, Double>();
	        scopes.push(new_scope);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\34\u009b\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\21\6\21c\n\21\r\21\16\21d\3\21\3\21\7\21i\n\21\f\21\16\21l\13\21\5"+
		"\21n\n\21\3\22\6\22q\n\22\r\22\16\22r\3\22\3\22\3\23\3\23\3\23\3\23\7"+
		"\23{\n\23\f\23\16\23~\13\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3"+
		"\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3"+
		"\32\3\33\6\33\u0098\n\33\r\33\16\33\u0099\3|\2\34\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\3\2\5\3\2\62;\5\2\13\f\17\17\"\"\5"+
		"\2C\\aac|\2\u00a0\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\3\67\3\2\2\2"+
		"\59\3\2\2\2\7;\3\2\2\2\t=\3\2\2\2\13?\3\2\2\2\rB\3\2\2\2\17E\3\2\2\2\21"+
		"J\3\2\2\2\23L\3\2\2\2\25N\3\2\2\2\27S\3\2\2\2\31U\3\2\2\2\33W\3\2\2\2"+
		"\35Y\3\2\2\2\37[\3\2\2\2!b\3\2\2\2#p\3\2\2\2%v\3\2\2\2\'\u0084\3\2\2\2"+
		")\u0086\3\2\2\2+\u0088\3\2\2\2-\u008a\3\2\2\2/\u008c\3\2\2\2\61\u008e"+
		"\3\2\2\2\63\u0091\3\2\2\2\65\u0097\3\2\2\2\678\7=\2\28\4\3\2\2\29:\7?"+
		"\2\2:\6\3\2\2\2;<\7.\2\2<\b\3\2\2\2=>\7#\2\2>\n\3\2\2\2?@\7(\2\2@A\7("+
		"\2\2A\f\3\2\2\2BC\7~\2\2CD\7~\2\2D\16\3\2\2\2EF\7u\2\2FG\7s\2\2GH\7t\2"+
		"\2HI\7v\2\2I\20\3\2\2\2JK\7*\2\2K\22\3\2\2\2LM\7+\2\2M\24\3\2\2\2NO\7"+
		"t\2\2OP\7g\2\2PQ\7c\2\2QR\7f\2\2R\26\3\2\2\2ST\7u\2\2T\30\3\2\2\2UV\7"+
		"e\2\2V\32\3\2\2\2WX\7n\2\2X\34\3\2\2\2YZ\7g\2\2Z\36\3\2\2\2[\\\7r\2\2"+
		"\\]\7t\2\2]^\7k\2\2^_\7p\2\2_`\7v\2\2` \3\2\2\2ac\t\2\2\2ba\3\2\2\2cd"+
		"\3\2\2\2db\3\2\2\2de\3\2\2\2em\3\2\2\2fj\7\60\2\2gi\t\2\2\2hg\3\2\2\2"+
		"il\3\2\2\2jh\3\2\2\2jk\3\2\2\2kn\3\2\2\2lj\3\2\2\2mf\3\2\2\2mn\3\2\2\2"+
		"n\"\3\2\2\2oq\5\'\24\2po\3\2\2\2qr\3\2\2\2rp\3\2\2\2rs\3\2\2\2st\3\2\2"+
		"\2tu\b\22\2\2u$\3\2\2\2vw\7\61\2\2wx\7,\2\2x|\3\2\2\2y{\13\2\2\2zy\3\2"+
		"\2\2{~\3\2\2\2|}\3\2\2\2|z\3\2\2\2}\177\3\2\2\2~|\3\2\2\2\177\u0080\7"+
		",\2\2\u0080\u0081\7\61\2\2\u0081\u0082\3\2\2\2\u0082\u0083\b\23\2\2\u0083"+
		"&\3\2\2\2\u0084\u0085\t\3\2\2\u0085(\3\2\2\2\u0086\u0087\7/\2\2\u0087"+
		"*\3\2\2\2\u0088\u0089\7-\2\2\u0089,\3\2\2\2\u008a\u008b\7\61\2\2\u008b"+
		".\3\2\2\2\u008c\u008d\7,\2\2\u008d\60\3\2\2\2\u008e\u008f\7k\2\2\u008f"+
		"\u0090\7h\2\2\u0090\62\3\2\2\2\u0091\u0092\7g\2\2\u0092\u0093\7n\2\2\u0093"+
		"\u0094\7u\2\2\u0094\u0095\7g\2\2\u0095\64\3\2\2\2\u0096\u0098\t\4\2\2"+
		"\u0097\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a"+
		"\3\2\2\2\u009a\66\3\2\2\2\t\2djmr|\u0099\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}