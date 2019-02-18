// Generated from Calculator.g4 by ANTLR 4.7.2

    import java.util.HashMap;
    import java.util.ArrayList;
    import java.lang.Math;
    import java.util.Scanner;
    import java.util.Stack;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalculatorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, PRINT=15, NUM=16, WS=17, 
		COM=18, SPACE=19, SUBT=20, ADD=21, DIVD=22, MULT=23, IF=24, ELSE=25, ID=26;
	public static final int
		RULE_exprList = 0, RULE_topExpr = 1, RULE_varDef = 2, RULE_printFunc = 3, 
		RULE_boolExpr = 4, RULE_specialExpr = 5, RULE_libraryFunc = 6, RULE_expr = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"exprList", "topExpr", "varDef", "printFunc", "boolExpr", "specialExpr", 
			"libraryFunc", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'='", "','", "'!'", "'&&'", "'||'", "'sqrt'", "'('", "')'", 
			"'read'", "'s'", "'c'", "'l'", "'e'", "'print'", null, null, null, null, 
			"'-'", "'+'", "'/'", "'*'", "'if'", "'else'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "PRINT", "NUM", "WS", "COM", "SPACE", "SUBT", "ADD", 
			"DIVD", "MULT", "IF", "ELSE", "ID"
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
	public String getGrammarFileName() { return "Calculator.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


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

	public CalculatorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ExprListContext extends ParserRuleContext {
		public List<TopExprContext> topExpr() {
			return getRuleContexts(TopExprContext.class);
		}
		public TopExprContext topExpr(int i) {
			return getRuleContext(TopExprContext.class,i);
		}
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterExprList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitExprList(this);
		}
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_exprList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			topExpr();
			setState(21);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(17);
					match(T__0);
					setState(18);
					topExpr();
					}
					} 
				}
				setState(23);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(24);
				match(T__0);
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

	public static class TopExprContext extends ParserRuleContext {
		public BoolExprContext boolExpr;
		public SpecialExprContext specialExpr;
		public LibraryFuncContext libraryFunc;
		public ExprContext expr;
		public VarDefContext varDef() {
			return getRuleContext(VarDefContext.class,0);
		}
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public SpecialExprContext specialExpr() {
			return getRuleContext(SpecialExprContext.class,0);
		}
		public LibraryFuncContext libraryFunc() {
			return getRuleContext(LibraryFuncContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintFuncContext printFunc() {
			return getRuleContext(PrintFuncContext.class,0);
		}
		public TopExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterTopExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitTopExpr(this);
		}
	}

	public final TopExprContext topExpr() throws RecognitionException {
		TopExprContext _localctx = new TopExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_topExpr);
		try {
			setState(43);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(27);
				varDef();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(28);
				((TopExprContext)_localctx).boolExpr = boolExpr();
				 System.out.println(Double.toString(((TopExprContext)_localctx).boolExpr.i)); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(31);
				((TopExprContext)_localctx).specialExpr = specialExpr();
				 System.out.println(Double.toString(((TopExprContext)_localctx).specialExpr.i)); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(34);
				((TopExprContext)_localctx).libraryFunc = libraryFunc();
				 System.out.println(Double.toString(((TopExprContext)_localctx).libraryFunc.i)); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(37);
				((TopExprContext)_localctx).expr = expr(0);
				 System.out.println(Double.toString(((TopExprContext)_localctx).expr.i)); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(40);
				printFunc();
				 for(Double temp: prints){System.out.println(Double.toString(temp));} 
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

	public static class VarDefContext extends ParserRuleContext {
		public Token ID;
		public ExprContext val;
		public TerminalNode ID() { return getToken(CalculatorParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterVarDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitVarDef(this);
		}
	}

	public final VarDefContext varDef() throws RecognitionException {
		VarDefContext _localctx = new VarDefContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_varDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			((VarDefContext)_localctx).ID = match(ID);
			setState(46);
			match(T__1);
			setState(47);
			((VarDefContext)_localctx).val = expr(0);
			scopes.peek().put((((VarDefContext)_localctx).ID!=null?((VarDefContext)_localctx).ID.getText():null), ((VarDefContext)_localctx).val.i);
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

	public static class PrintFuncContext extends ParserRuleContext {
		public ExprContext val;
		public ExprContext expr;
		public TerminalNode PRINT() { return getToken(CalculatorParser.PRINT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> SPACE() { return getTokens(CalculatorParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(CalculatorParser.SPACE, i);
		}
		public PrintFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterPrintFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitPrintFunc(this);
		}
	}

	public final PrintFuncContext printFunc() throws RecognitionException {
		PrintFuncContext _localctx = new PrintFuncContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_printFunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(PRINT);
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(51);
				match(SPACE);
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(57);
			((PrintFuncContext)_localctx).val = ((PrintFuncContext)_localctx).expr = expr(0);
			prints.add(((PrintFuncContext)_localctx).val.i);
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2 || _la==SPACE) {
				{
				{
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(59);
					match(SPACE);
					}
					}
					setState(64);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(65);
				match(T__2);
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(66);
					match(SPACE);
					}
					}
					setState(71);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(72);
				((PrintFuncContext)_localctx).expr = expr(0);
				prints.add(((PrintFuncContext)_localctx).expr.i);
				}
				}
				setState(79);
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

	public static class BoolExprContext extends ParserRuleContext {
		public Double i;
		public ExprContext expr;
		public ExprContext el;
		public Token op;
		public ExprContext er;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BoolExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterBoolExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitBoolExpr(this);
		}
	}

	public final BoolExprContext boolExpr() throws RecognitionException {
		BoolExprContext _localctx = new BoolExprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_boolExpr);
		try {
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				match(T__3);
				setState(81);
				((BoolExprContext)_localctx).expr = expr(0);
				 ((BoolExprContext)_localctx).i =  ((BoolExprContext)_localctx).expr.i != 0 ? 0.0 : 1.0 ;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				((BoolExprContext)_localctx).el = expr(0);
				setState(85);
				((BoolExprContext)_localctx).op = match(T__4);
				setState(86);
				((BoolExprContext)_localctx).er = expr(0);
				 ((BoolExprContext)_localctx).i =  (((BoolExprContext)_localctx).el.i != 0 && ((BoolExprContext)_localctx).er.i != 0) ? 1.0 : 0.0; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(89);
				((BoolExprContext)_localctx).el = expr(0);
				setState(90);
				((BoolExprContext)_localctx).op = match(T__5);
				setState(91);
				((BoolExprContext)_localctx).er = expr(0);
				((BoolExprContext)_localctx).i =  (((BoolExprContext)_localctx).el.i != 0 || ((BoolExprContext)_localctx).er.i != 0) ? 1.0 : 0.0; 
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

	public static class SpecialExprContext extends ParserRuleContext {
		public Double i;
		public ExprContext value;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(CalculatorParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(CalculatorParser.SPACE, i);
		}
		public SpecialExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specialExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterSpecialExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitSpecialExpr(this);
		}
	}

	public final SpecialExprContext specialExpr() throws RecognitionException {
		SpecialExprContext _localctx = new SpecialExprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_specialExpr);
		int _la;
		try {
			setState(130);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				match(T__6);
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(97);
					match(SPACE);
					}
					}
					setState(102);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(103);
				match(T__7);
				setState(104);
				((SpecialExprContext)_localctx).value = expr(0);
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(105);
					match(SPACE);
					}
					}
					setState(110);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(111);
				match(T__8);
				 
				            if (((SpecialExprContext)_localctx).value.i < 0){
				                System.out.println("Error: expression must be positive");
				                System.exit(0);
				            }else{
				                ((SpecialExprContext)_localctx).i =  Math.sqrt(((SpecialExprContext)_localctx).value.i);
				            }
				        
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				match(T__9);
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(115);
					match(SPACE);
					}
					}
					setState(120);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(121);
				match(T__7);
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(122);
					match(SPACE);
					}
					}
					setState(127);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(128);
				match(T__8);

				            System.out.print("Enter Input: ");
				            ((SpecialExprContext)_localctx).i =  scan.nextDouble();
				            System.out.print("\n");
				        
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class LibraryFuncContext extends ParserRuleContext {
		public Double i;
		public ExprContext var;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(CalculatorParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(CalculatorParser.SPACE, i);
		}
		public LibraryFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_libraryFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterLibraryFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitLibraryFunc(this);
		}
	}

	public final LibraryFuncContext libraryFunc() throws RecognitionException {
		LibraryFuncContext _localctx = new LibraryFuncContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_libraryFunc);
		int _la;
		try {
			setState(204);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				match(T__10);
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(133);
					match(SPACE);
					}
					}
					setState(138);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(139);
				match(T__7);
				setState(140);
				((LibraryFuncContext)_localctx).var = expr(0);
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(141);
					match(SPACE);
					}
					}
					setState(146);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(147);
				match(T__8);
				 ((LibraryFuncContext)_localctx).i =  Math.sin(((LibraryFuncContext)_localctx).var.i); 
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				match(T__11);
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(151);
					match(SPACE);
					}
					}
					setState(156);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(157);
				match(T__7);
				setState(158);
				((LibraryFuncContext)_localctx).var = expr(0);
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(159);
					match(SPACE);
					}
					}
					setState(164);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(165);
				match(T__8);
				 ((LibraryFuncContext)_localctx).i =  Math.cos(((LibraryFuncContext)_localctx).var.i); 
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 3);
				{
				setState(168);
				match(T__12);
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(169);
					match(SPACE);
					}
					}
					setState(174);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(175);
				match(T__7);
				setState(176);
				((LibraryFuncContext)_localctx).var = expr(0);
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(177);
					match(SPACE);
					}
					}
					setState(182);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(183);
				match(T__8);
				 
				            if(((LibraryFuncContext)_localctx).var.i < 0){
				                System.out.println("Error: expression must be positive");
				                System.exit(0);
				            }else{
				                ((LibraryFuncContext)_localctx).i =  Math.log(((LibraryFuncContext)_localctx).var.i);
				            }
				        
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 4);
				{
				setState(186);
				match(T__13);
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(187);
					match(SPACE);
					}
					}
					setState(192);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(193);
				match(T__7);
				setState(194);
				((LibraryFuncContext)_localctx).var = expr(0);
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(195);
					match(SPACE);
					}
					}
					setState(200);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(201);
				match(T__8);
				 ((LibraryFuncContext)_localctx).i =  Math.exp(((LibraryFuncContext)_localctx).var.i); 
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ExprContext extends ParserRuleContext {
		public Double i;
		public ExprContext el;
		public Token NUM;
		public Token ID;
		public ExprContext e;
		public ExprContext expr;
		public ExprContext er;
		public TerminalNode NUM() { return getToken(CalculatorParser.NUM, 0); }
		public TerminalNode SUBT() { return getToken(CalculatorParser.SUBT, 0); }
		public TerminalNode ID() { return getToken(CalculatorParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MULT() { return getToken(CalculatorParser.MULT, 0); }
		public TerminalNode DIVD() { return getToken(CalculatorParser.DIVD, 0); }
		public TerminalNode ADD() { return getToken(CalculatorParser.ADD, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				{
				setState(207);
				((ExprContext)_localctx).NUM = match(NUM);
				 ((ExprContext)_localctx).i = Double.parseDouble((((ExprContext)_localctx).NUM!=null?((ExprContext)_localctx).NUM.getText():null)); 
				}
				break;
			case SUBT:
				{
				setState(209);
				match(SUBT);
				setState(210);
				((ExprContext)_localctx).NUM = match(NUM);
				 ((ExprContext)_localctx).i =  -1.0 * Double.parseDouble((((ExprContext)_localctx).NUM!=null?((ExprContext)_localctx).NUM.getText():null)); 
				}
				break;
			case ID:
				{
				setState(212);
				((ExprContext)_localctx).ID = match(ID);

				            if(getVariable((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null)) != null)
				                ((ExprContext)_localctx).i =  getVariable((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null));
				            else
				                System.out.println("Undeclared variable.");
				        
				}
				break;
			case T__7:
				{
				setState(214);
				match(T__7);
				setState(215);
				((ExprContext)_localctx).e = ((ExprContext)_localctx).expr = expr(0);
				setState(216);
				match(T__8);
				((ExprContext)_localctx).i =  ((ExprContext)_localctx).expr.i;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(243);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(241);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(221);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(222);
						match(MULT);
						setState(223);
						((ExprContext)_localctx).er = ((ExprContext)_localctx).expr = expr(9);
						 ((ExprContext)_localctx).i = ((ExprContext)_localctx).el.i*((ExprContext)_localctx).er.i; 
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(226);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(227);
						match(DIVD);
						setState(228);
						((ExprContext)_localctx).er = ((ExprContext)_localctx).expr = expr(8);
						 ((ExprContext)_localctx).i = ((ExprContext)_localctx).el.i/((ExprContext)_localctx).er.i; 
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(231);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(232);
						match(ADD);
						setState(233);
						((ExprContext)_localctx).er = ((ExprContext)_localctx).expr = expr(7);
						 ((ExprContext)_localctx).i = ((ExprContext)_localctx).el.i+((ExprContext)_localctx).er.i; 
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(236);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(237);
						match(SUBT);
						setState(238);
						((ExprContext)_localctx).er = ((ExprContext)_localctx).expr = expr(6);
						 ((ExprContext)_localctx).i = ((ExprContext)_localctx).el.i-((ExprContext)_localctx).er.i; 
						}
						break;
					}
					} 
				}
				setState(245);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\34\u00f9\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\7"+
		"\2\26\n\2\f\2\16\2\31\13\2\3\2\5\2\34\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3.\n\3\3\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\7\5\67\n\5\f\5\16\5:\13\5\3\5\3\5\3\5\7\5?\n\5\f\5\16\5B\13\5\3\5"+
		"\3\5\7\5F\n\5\f\5\16\5I\13\5\3\5\3\5\3\5\7\5N\n\5\f\5\16\5Q\13\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6a\n\6\3\7\3\7\7"+
		"\7e\n\7\f\7\16\7h\13\7\3\7\3\7\3\7\7\7m\n\7\f\7\16\7p\13\7\3\7\3\7\3\7"+
		"\3\7\3\7\7\7w\n\7\f\7\16\7z\13\7\3\7\3\7\7\7~\n\7\f\7\16\7\u0081\13\7"+
		"\3\7\3\7\5\7\u0085\n\7\3\b\3\b\7\b\u0089\n\b\f\b\16\b\u008c\13\b\3\b\3"+
		"\b\3\b\7\b\u0091\n\b\f\b\16\b\u0094\13\b\3\b\3\b\3\b\3\b\3\b\7\b\u009b"+
		"\n\b\f\b\16\b\u009e\13\b\3\b\3\b\3\b\7\b\u00a3\n\b\f\b\16\b\u00a6\13\b"+
		"\3\b\3\b\3\b\3\b\3\b\7\b\u00ad\n\b\f\b\16\b\u00b0\13\b\3\b\3\b\3\b\7\b"+
		"\u00b5\n\b\f\b\16\b\u00b8\13\b\3\b\3\b\3\b\3\b\3\b\7\b\u00bf\n\b\f\b\16"+
		"\b\u00c2\13\b\3\b\3\b\3\b\7\b\u00c7\n\b\f\b\16\b\u00ca\13\b\3\b\3\b\3"+
		"\b\5\b\u00cf\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5"+
		"\t\u00de\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\7\t\u00f4\n\t\f\t\16\t\u00f7\13\t\3\t\2\3\20\n"+
		"\2\4\6\b\n\f\16\20\2\2\2\u0114\2\22\3\2\2\2\4-\3\2\2\2\6/\3\2\2\2\b\64"+
		"\3\2\2\2\n`\3\2\2\2\f\u0084\3\2\2\2\16\u00ce\3\2\2\2\20\u00dd\3\2\2\2"+
		"\22\27\5\4\3\2\23\24\7\3\2\2\24\26\5\4\3\2\25\23\3\2\2\2\26\31\3\2\2\2"+
		"\27\25\3\2\2\2\27\30\3\2\2\2\30\33\3\2\2\2\31\27\3\2\2\2\32\34\7\3\2\2"+
		"\33\32\3\2\2\2\33\34\3\2\2\2\34\3\3\2\2\2\35.\5\6\4\2\36\37\5\n\6\2\37"+
		" \b\3\1\2 .\3\2\2\2!\"\5\f\7\2\"#\b\3\1\2#.\3\2\2\2$%\5\16\b\2%&\b\3\1"+
		"\2&.\3\2\2\2\'(\5\20\t\2()\b\3\1\2).\3\2\2\2*+\5\b\5\2+,\b\3\1\2,.\3\2"+
		"\2\2-\35\3\2\2\2-\36\3\2\2\2-!\3\2\2\2-$\3\2\2\2-\'\3\2\2\2-*\3\2\2\2"+
		".\5\3\2\2\2/\60\7\34\2\2\60\61\7\4\2\2\61\62\5\20\t\2\62\63\b\4\1\2\63"+
		"\7\3\2\2\2\648\7\21\2\2\65\67\7\25\2\2\66\65\3\2\2\2\67:\3\2\2\28\66\3"+
		"\2\2\289\3\2\2\29;\3\2\2\2:8\3\2\2\2;<\5\20\t\2<O\b\5\1\2=?\7\25\2\2>"+
		"=\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2AC\3\2\2\2B@\3\2\2\2CG\7\5\2\2"+
		"DF\7\25\2\2ED\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HJ\3\2\2\2IG\3\2\2"+
		"\2JK\5\20\t\2KL\b\5\1\2LN\3\2\2\2M@\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2"+
		"\2\2P\t\3\2\2\2QO\3\2\2\2RS\7\6\2\2ST\5\20\t\2TU\b\6\1\2Ua\3\2\2\2VW\5"+
		"\20\t\2WX\7\7\2\2XY\5\20\t\2YZ\b\6\1\2Za\3\2\2\2[\\\5\20\t\2\\]\7\b\2"+
		"\2]^\5\20\t\2^_\b\6\1\2_a\3\2\2\2`R\3\2\2\2`V\3\2\2\2`[\3\2\2\2a\13\3"+
		"\2\2\2bf\7\t\2\2ce\7\25\2\2dc\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2gi"+
		"\3\2\2\2hf\3\2\2\2ij\7\n\2\2jn\5\20\t\2km\7\25\2\2lk\3\2\2\2mp\3\2\2\2"+
		"nl\3\2\2\2no\3\2\2\2oq\3\2\2\2pn\3\2\2\2qr\7\13\2\2rs\b\7\1\2s\u0085\3"+
		"\2\2\2tx\7\f\2\2uw\7\25\2\2vu\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y{"+
		"\3\2\2\2zx\3\2\2\2{\177\7\n\2\2|~\7\25\2\2}|\3\2\2\2~\u0081\3\2\2\2\177"+
		"}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0082\3\2\2\2\u0081\177\3\2\2\2\u0082"+
		"\u0083\7\13\2\2\u0083\u0085\b\7\1\2\u0084b\3\2\2\2\u0084t\3\2\2\2\u0085"+
		"\r\3\2\2\2\u0086\u008a\7\r\2\2\u0087\u0089\7\25\2\2\u0088\u0087\3\2\2"+
		"\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008d"+
		"\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u008e\7\n\2\2\u008e\u0092\5\20\t\2"+
		"\u008f\u0091\7\25\2\2\u0090\u008f\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090"+
		"\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0095\3\2\2\2\u0094\u0092\3\2\2\2\u0095"+
		"\u0096\7\13\2\2\u0096\u0097\b\b\1\2\u0097\u00cf\3\2\2\2\u0098\u009c\7"+
		"\16\2\2\u0099\u009b\7\25\2\2\u009a\u0099\3\2\2\2\u009b\u009e\3\2\2\2\u009c"+
		"\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009f\3\2\2\2\u009e\u009c\3\2"+
		"\2\2\u009f\u00a0\7\n\2\2\u00a0\u00a4\5\20\t\2\u00a1\u00a3\7\25\2\2\u00a2"+
		"\u00a1\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2"+
		"\2\2\u00a5\u00a7\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00a8\7\13\2\2\u00a8"+
		"\u00a9\b\b\1\2\u00a9\u00cf\3\2\2\2\u00aa\u00ae\7\17\2\2\u00ab\u00ad\7"+
		"\25\2\2\u00ac\u00ab\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae"+
		"\u00af\3\2\2\2\u00af\u00b1\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b2\7\n"+
		"\2\2\u00b2\u00b6\5\20\t\2\u00b3\u00b5\7\25\2\2\u00b4\u00b3\3\2\2\2\u00b5"+
		"\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b9\3\2"+
		"\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00ba\7\13\2\2\u00ba\u00bb\b\b\1\2\u00bb"+
		"\u00cf\3\2\2\2\u00bc\u00c0\7\20\2\2\u00bd\u00bf\7\25\2\2\u00be\u00bd\3"+
		"\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1"+
		"\u00c3\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c4\7\n\2\2\u00c4\u00c8\5\20"+
		"\t\2\u00c5\u00c7\7\25\2\2\u00c6\u00c5\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8"+
		"\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00cb\3\2\2\2\u00ca\u00c8\3\2"+
		"\2\2\u00cb\u00cc\7\13\2\2\u00cc\u00cd\b\b\1\2\u00cd\u00cf\3\2\2\2\u00ce"+
		"\u0086\3\2\2\2\u00ce\u0098\3\2\2\2\u00ce\u00aa\3\2\2\2\u00ce\u00bc\3\2"+
		"\2\2\u00cf\17\3\2\2\2\u00d0\u00d1\b\t\1\2\u00d1\u00d2\7\22\2\2\u00d2\u00de"+
		"\b\t\1\2\u00d3\u00d4\7\26\2\2\u00d4\u00d5\7\22\2\2\u00d5\u00de\b\t\1\2"+
		"\u00d6\u00d7\7\34\2\2\u00d7\u00de\b\t\1\2\u00d8\u00d9\7\n\2\2\u00d9\u00da"+
		"\5\20\t\2\u00da\u00db\7\13\2\2\u00db\u00dc\b\t\1\2\u00dc\u00de\3\2\2\2"+
		"\u00dd\u00d0\3\2\2\2\u00dd\u00d3\3\2\2\2\u00dd\u00d6\3\2\2\2\u00dd\u00d8"+
		"\3\2\2\2\u00de\u00f5\3\2\2\2\u00df\u00e0\f\n\2\2\u00e0\u00e1\7\31\2\2"+
		"\u00e1\u00e2\5\20\t\13\u00e2\u00e3\b\t\1\2\u00e3\u00f4\3\2\2\2\u00e4\u00e5"+
		"\f\t\2\2\u00e5\u00e6\7\30\2\2\u00e6\u00e7\5\20\t\n\u00e7\u00e8\b\t\1\2"+
		"\u00e8\u00f4\3\2\2\2\u00e9\u00ea\f\b\2\2\u00ea\u00eb\7\27\2\2\u00eb\u00ec"+
		"\5\20\t\t\u00ec\u00ed\b\t\1\2\u00ed\u00f4\3\2\2\2\u00ee\u00ef\f\7\2\2"+
		"\u00ef\u00f0\7\26\2\2\u00f0\u00f1\5\20\t\b\u00f1\u00f2\b\t\1\2\u00f2\u00f4"+
		"\3\2\2\2\u00f3\u00df\3\2\2\2\u00f3\u00e4\3\2\2\2\u00f3\u00e9\3\2\2\2\u00f3"+
		"\u00ee\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2"+
		"\2\2\u00f6\21\3\2\2\2\u00f7\u00f5\3\2\2\2\33\27\33-8@GO`fnx\177\u0084"+
		"\u008a\u0092\u009c\u00a4\u00ae\u00b6\u00c0\u00c8\u00ce\u00dd\u00f3\u00f5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}