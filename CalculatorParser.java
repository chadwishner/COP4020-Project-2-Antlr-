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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, PRINT=15, IF=16, ELSE=17, 
		NUM=18, WS=19, COM=20, SUBT=21, ADD=22, DIVD=23, MULT=24, SPACE=25, ID=26;
	public static final int
		RULE_exprList = 0, RULE_topExpr = 1, RULE_statement = 2, RULE_varDef = 3, 
		RULE_printFunc = 4, RULE_boolExpr = 5, RULE_specialExpr = 6, RULE_libraryFunc = 7, 
		RULE_expr = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"exprList", "topExpr", "statement", "varDef", "printFunc", "boolExpr", 
			"specialExpr", "libraryFunc", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'('", "')'", "'='", "','", "'!'", "'&&'", "'||'", "'sqrt'", 
			"'read'", "'s'", "'c'", "'l'", "'e'", "'print'", "'if'", "'else'", null, 
			null, null, "'-'", "'+'", "'/'", "'*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "PRINT", "IF", "ELSE", "NUM", "WS", "COM", "SUBT", 
			"ADD", "DIVD", "MULT", "SPACE", "ID"
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
			setState(18);
			topExpr();
			setState(23);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(19);
					match(T__0);
					setState(20);
					topExpr();
					}
					} 
				}
				setState(25);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(26);
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
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
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
			setState(46);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				varDef();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(31);
				((TopExprContext)_localctx).boolExpr = boolExpr();
				 System.out.println(Double.toString(((TopExprContext)_localctx).boolExpr.i)); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(34);
				((TopExprContext)_localctx).specialExpr = specialExpr();
				 System.out.println(Double.toString(((TopExprContext)_localctx).specialExpr.i)); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(37);
				((TopExprContext)_localctx).libraryFunc = libraryFunc();
				 System.out.println(Double.toString(((TopExprContext)_localctx).libraryFunc.i)); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(40);
				((TopExprContext)_localctx).expr = expr(0);
				 System.out.println(Double.toString(((TopExprContext)_localctx).expr.i)); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(43);
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

	public static class StatementContext extends ParserRuleContext {
		public BoolExprContext cond;
		public TopExprContext expr1;
		public ExprContext expr2;
		public TerminalNode IF() { return getToken(CalculatorParser.IF, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public TopExprContext topExpr() {
			return getRuleContext(TopExprContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(CalculatorParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(CalculatorParser.SPACE, i);
		}
		public TerminalNode ELSE() { return getToken(CalculatorParser.ELSE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(IF);
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(49);
				match(SPACE);
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(55);
			match(T__1);
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(56);
				match(SPACE);
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62);
			((StatementContext)_localctx).cond = boolExpr();
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(63);
				match(SPACE);
				}
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(69);
			match(T__2);
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(70);
				match(SPACE);
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(76);
			((StatementContext)_localctx).expr1 = topExpr();
			setState(79);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(77);
				match(ELSE);
				setState(78);
				((StatementContext)_localctx).expr2 = expr(0);
				}
				break;
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
		enterRule(_localctx, 6, RULE_varDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			((VarDefContext)_localctx).ID = match(ID);
			setState(82);
			match(T__3);
			setState(83);
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
		enterRule(_localctx, 8, RULE_printFunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(PRINT);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(87);
				match(SPACE);
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93);
			((PrintFuncContext)_localctx).val = ((PrintFuncContext)_localctx).expr = expr(0);
			prints.add(((PrintFuncContext)_localctx).val.i);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4 || _la==SPACE) {
				{
				{
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(95);
					match(SPACE);
					}
					}
					setState(100);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(101);
				match(T__4);
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(102);
					match(SPACE);
					}
					}
					setState(107);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(108);
				((PrintFuncContext)_localctx).expr = expr(0);
				prints.add(((PrintFuncContext)_localctx).expr.i);
				}
				}
				setState(115);
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
		enterRule(_localctx, 10, RULE_boolExpr);
		try {
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				((BoolExprContext)_localctx).expr = expr(0);
				 ((BoolExprContext)_localctx).i =  (((BoolExprContext)_localctx).expr.i >= 0.0 ? 1.0 : 0.0); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				match(T__5);
				setState(120);
				((BoolExprContext)_localctx).expr = expr(0);
				 ((BoolExprContext)_localctx).i =  ((BoolExprContext)_localctx).expr.i != 0 ? 0.0 : 1.0 ;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(123);
				((BoolExprContext)_localctx).el = expr(0);
				setState(124);
				((BoolExprContext)_localctx).op = match(T__6);
				setState(125);
				((BoolExprContext)_localctx).er = expr(0);
				 ((BoolExprContext)_localctx).i =  (((BoolExprContext)_localctx).el.i != 0 && ((BoolExprContext)_localctx).er.i != 0) ? 1.0 : 0.0; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(128);
				((BoolExprContext)_localctx).el = expr(0);
				setState(129);
				((BoolExprContext)_localctx).op = match(T__7);
				setState(130);
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
		enterRule(_localctx, 12, RULE_specialExpr);
		int _la;
		try {
			setState(169);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				match(T__8);
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(136);
					match(SPACE);
					}
					}
					setState(141);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(142);
				match(T__1);
				setState(143);
				((SpecialExprContext)_localctx).value = expr(0);
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(144);
					match(SPACE);
					}
					}
					setState(149);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(150);
				match(T__2);
				 
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
				setState(153);
				match(T__9);
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(154);
					match(SPACE);
					}
					}
					setState(159);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(160);
				match(T__1);
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(161);
					match(SPACE);
					}
					}
					setState(166);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(167);
				match(T__2);

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
		enterRule(_localctx, 14, RULE_libraryFunc);
		int _la;
		try {
			setState(243);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				match(T__10);
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(172);
					match(SPACE);
					}
					}
					setState(177);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(178);
				match(T__1);
				setState(179);
				((LibraryFuncContext)_localctx).var = expr(0);
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(180);
					match(SPACE);
					}
					}
					setState(185);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(186);
				match(T__2);
				 ((LibraryFuncContext)_localctx).i =  Math.sin(((LibraryFuncContext)_localctx).var.i); 
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				match(T__11);
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(190);
					match(SPACE);
					}
					}
					setState(195);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(196);
				match(T__1);
				setState(197);
				((LibraryFuncContext)_localctx).var = expr(0);
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(198);
					match(SPACE);
					}
					}
					setState(203);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(204);
				match(T__2);
				 ((LibraryFuncContext)_localctx).i =  Math.cos(((LibraryFuncContext)_localctx).var.i); 
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 3);
				{
				setState(207);
				match(T__12);
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(208);
					match(SPACE);
					}
					}
					setState(213);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(214);
				match(T__1);
				setState(215);
				((LibraryFuncContext)_localctx).var = expr(0);
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(216);
					match(SPACE);
					}
					}
					setState(221);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(222);
				match(T__2);
				 
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
				setState(225);
				match(T__13);
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(226);
					match(SPACE);
					}
					}
					setState(231);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(232);
				match(T__1);
				setState(233);
				((LibraryFuncContext)_localctx).var = expr(0);
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(234);
					match(SPACE);
					}
					}
					setState(239);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(240);
				match(T__2);
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
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				{
				setState(246);
				((ExprContext)_localctx).NUM = match(NUM);
				 ((ExprContext)_localctx).i = Double.parseDouble((((ExprContext)_localctx).NUM!=null?((ExprContext)_localctx).NUM.getText():null)); 
				}
				break;
			case SUBT:
				{
				setState(248);
				match(SUBT);
				setState(249);
				((ExprContext)_localctx).NUM = match(NUM);
				 ((ExprContext)_localctx).i =  -1.0 * Double.parseDouble((((ExprContext)_localctx).NUM!=null?((ExprContext)_localctx).NUM.getText():null)); 
				}
				break;
			case ID:
				{
				setState(251);
				((ExprContext)_localctx).ID = match(ID);

				            if(getVariable((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null)) != null)
				                ((ExprContext)_localctx).i =  getVariable((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null));
				            else
				                System.out.println("Undeclared variable: " + (((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null));
				        
				}
				break;
			case T__1:
				{
				setState(253);
				match(T__1);
				setState(254);
				((ExprContext)_localctx).e = ((ExprContext)_localctx).expr = expr(0);
				setState(255);
				match(T__2);
				((ExprContext)_localctx).i =  ((ExprContext)_localctx).expr.i;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(282);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(280);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(260);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(261);
						match(MULT);
						setState(262);
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
						setState(265);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(266);
						match(DIVD);
						setState(267);
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
						setState(270);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(271);
						match(ADD);
						setState(272);
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
						setState(275);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(276);
						match(SUBT);
						setState(277);
						((ExprContext)_localctx).er = ((ExprContext)_localctx).expr = expr(6);
						 ((ExprContext)_localctx).i = ((ExprContext)_localctx).el.i-((ExprContext)_localctx).er.i; 
						}
						break;
					}
					} 
				}
				setState(284);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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
		case 8:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\34\u0120\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3"+
		"\2\3\2\7\2\30\n\2\f\2\16\2\33\13\2\3\2\5\2\36\n\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\61\n\3\3\4\3\4\7"+
		"\4\65\n\4\f\4\16\48\13\4\3\4\3\4\7\4<\n\4\f\4\16\4?\13\4\3\4\3\4\7\4C"+
		"\n\4\f\4\16\4F\13\4\3\4\3\4\7\4J\n\4\f\4\16\4M\13\4\3\4\3\4\3\4\5\4R\n"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\7\6[\n\6\f\6\16\6^\13\6\3\6\3\6\3\6\7\6"+
		"c\n\6\f\6\16\6f\13\6\3\6\3\6\7\6j\n\6\f\6\16\6m\13\6\3\6\3\6\3\6\7\6r"+
		"\n\6\f\6\16\6u\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\5\7\u0088\n\7\3\b\3\b\7\b\u008c\n\b\f\b\16\b\u008f"+
		"\13\b\3\b\3\b\3\b\7\b\u0094\n\b\f\b\16\b\u0097\13\b\3\b\3\b\3\b\3\b\3"+
		"\b\7\b\u009e\n\b\f\b\16\b\u00a1\13\b\3\b\3\b\7\b\u00a5\n\b\f\b\16\b\u00a8"+
		"\13\b\3\b\3\b\5\b\u00ac\n\b\3\t\3\t\7\t\u00b0\n\t\f\t\16\t\u00b3\13\t"+
		"\3\t\3\t\3\t\7\t\u00b8\n\t\f\t\16\t\u00bb\13\t\3\t\3\t\3\t\3\t\3\t\7\t"+
		"\u00c2\n\t\f\t\16\t\u00c5\13\t\3\t\3\t\3\t\7\t\u00ca\n\t\f\t\16\t\u00cd"+
		"\13\t\3\t\3\t\3\t\3\t\3\t\7\t\u00d4\n\t\f\t\16\t\u00d7\13\t\3\t\3\t\3"+
		"\t\7\t\u00dc\n\t\f\t\16\t\u00df\13\t\3\t\3\t\3\t\3\t\3\t\7\t\u00e6\n\t"+
		"\f\t\16\t\u00e9\13\t\3\t\3\t\3\t\7\t\u00ee\n\t\f\t\16\t\u00f1\13\t\3\t"+
		"\3\t\3\t\5\t\u00f6\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\5\n\u0105\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u011b\n\n\f\n\16\n\u011e\13\n\3\n\2\3"+
		"\22\13\2\4\6\b\n\f\16\20\22\2\2\2\u0141\2\24\3\2\2\2\4\60\3\2\2\2\6\62"+
		"\3\2\2\2\bS\3\2\2\2\nX\3\2\2\2\f\u0087\3\2\2\2\16\u00ab\3\2\2\2\20\u00f5"+
		"\3\2\2\2\22\u0104\3\2\2\2\24\31\5\4\3\2\25\26\7\3\2\2\26\30\5\4\3\2\27"+
		"\25\3\2\2\2\30\33\3\2\2\2\31\27\3\2\2\2\31\32\3\2\2\2\32\35\3\2\2\2\33"+
		"\31\3\2\2\2\34\36\7\3\2\2\35\34\3\2\2\2\35\36\3\2\2\2\36\3\3\2\2\2\37"+
		"\61\5\b\5\2 \61\5\6\4\2!\"\5\f\7\2\"#\b\3\1\2#\61\3\2\2\2$%\5\16\b\2%"+
		"&\b\3\1\2&\61\3\2\2\2\'(\5\20\t\2()\b\3\1\2)\61\3\2\2\2*+\5\22\n\2+,\b"+
		"\3\1\2,\61\3\2\2\2-.\5\n\6\2./\b\3\1\2/\61\3\2\2\2\60\37\3\2\2\2\60 \3"+
		"\2\2\2\60!\3\2\2\2\60$\3\2\2\2\60\'\3\2\2\2\60*\3\2\2\2\60-\3\2\2\2\61"+
		"\5\3\2\2\2\62\66\7\22\2\2\63\65\7\33\2\2\64\63\3\2\2\2\658\3\2\2\2\66"+
		"\64\3\2\2\2\66\67\3\2\2\2\679\3\2\2\28\66\3\2\2\29=\7\4\2\2:<\7\33\2\2"+
		";:\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>@\3\2\2\2?=\3\2\2\2@D\5\f\7\2"+
		"AC\7\33\2\2BA\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2EG\3\2\2\2FD\3\2\2"+
		"\2GK\7\5\2\2HJ\7\33\2\2IH\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LN\3\2"+
		"\2\2MK\3\2\2\2NQ\5\4\3\2OP\7\23\2\2PR\5\22\n\2QO\3\2\2\2QR\3\2\2\2R\7"+
		"\3\2\2\2ST\7\34\2\2TU\7\6\2\2UV\5\22\n\2VW\b\5\1\2W\t\3\2\2\2X\\\7\21"+
		"\2\2Y[\7\33\2\2ZY\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]_\3\2\2\2^\\"+
		"\3\2\2\2_`\5\22\n\2`s\b\6\1\2ac\7\33\2\2ba\3\2\2\2cf\3\2\2\2db\3\2\2\2"+
		"de\3\2\2\2eg\3\2\2\2fd\3\2\2\2gk\7\7\2\2hj\7\33\2\2ih\3\2\2\2jm\3\2\2"+
		"\2ki\3\2\2\2kl\3\2\2\2ln\3\2\2\2mk\3\2\2\2no\5\22\n\2op\b\6\1\2pr\3\2"+
		"\2\2qd\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2t\13\3\2\2\2us\3\2\2\2vw\5"+
		"\22\n\2wx\b\7\1\2x\u0088\3\2\2\2yz\7\b\2\2z{\5\22\n\2{|\b\7\1\2|\u0088"+
		"\3\2\2\2}~\5\22\n\2~\177\7\t\2\2\177\u0080\5\22\n\2\u0080\u0081\b\7\1"+
		"\2\u0081\u0088\3\2\2\2\u0082\u0083\5\22\n\2\u0083\u0084\7\n\2\2\u0084"+
		"\u0085\5\22\n\2\u0085\u0086\b\7\1\2\u0086\u0088\3\2\2\2\u0087v\3\2\2\2"+
		"\u0087y\3\2\2\2\u0087}\3\2\2\2\u0087\u0082\3\2\2\2\u0088\r\3\2\2\2\u0089"+
		"\u008d\7\13\2\2\u008a\u008c\7\33\2\2\u008b\u008a\3\2\2\2\u008c\u008f\3"+
		"\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0090\3\2\2\2\u008f"+
		"\u008d\3\2\2\2\u0090\u0091\7\4\2\2\u0091\u0095\5\22\n\2\u0092\u0094\7"+
		"\33\2\2\u0093\u0092\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095"+
		"\u0096\3\2\2\2\u0096\u0098\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u0099\7\5"+
		"\2\2\u0099\u009a\b\b\1\2\u009a\u00ac\3\2\2\2\u009b\u009f\7\f\2\2\u009c"+
		"\u009e\7\33\2\2\u009d\u009c\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3"+
		"\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2"+
		"\u00a6\7\4\2\2\u00a3\u00a5\7\33\2\2\u00a4\u00a3\3\2\2\2\u00a5\u00a8\3"+
		"\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a9\3\2\2\2\u00a8"+
		"\u00a6\3\2\2\2\u00a9\u00aa\7\5\2\2\u00aa\u00ac\b\b\1\2\u00ab\u0089\3\2"+
		"\2\2\u00ab\u009b\3\2\2\2\u00ac\17\3\2\2\2\u00ad\u00b1\7\r\2\2\u00ae\u00b0"+
		"\7\33\2\2\u00af\u00ae\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2"+
		"\u00b1\u00b2\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b5"+
		"\7\4\2\2\u00b5\u00b9\5\22\n\2\u00b6\u00b8\7\33\2\2\u00b7\u00b6\3\2\2\2"+
		"\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bc"+
		"\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00bd\7\5\2\2\u00bd\u00be\b\t\1\2\u00be"+
		"\u00f6\3\2\2\2\u00bf\u00c3\7\16\2\2\u00c0\u00c2\7\33\2\2\u00c1\u00c0\3"+
		"\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4"+
		"\u00c6\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c7\7\4\2\2\u00c7\u00cb\5\22"+
		"\n\2\u00c8\u00ca\7\33\2\2\u00c9\u00c8\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb"+
		"\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00cb\3\2"+
		"\2\2\u00ce\u00cf\7\5\2\2\u00cf\u00d0\b\t\1\2\u00d0\u00f6\3\2\2\2\u00d1"+
		"\u00d5\7\17\2\2\u00d2\u00d4\7\33\2\2\u00d3\u00d2\3\2\2\2\u00d4\u00d7\3"+
		"\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d8\3\2\2\2\u00d7"+
		"\u00d5\3\2\2\2\u00d8\u00d9\7\4\2\2\u00d9\u00dd\5\22\n\2\u00da\u00dc\7"+
		"\33\2\2\u00db\u00da\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd"+
		"\u00de\3\2\2\2\u00de\u00e0\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00e1\7\5"+
		"\2\2\u00e1\u00e2\b\t\1\2\u00e2\u00f6\3\2\2\2\u00e3\u00e7\7\20\2\2\u00e4"+
		"\u00e6\7\33\2\2\u00e5\u00e4\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3"+
		"\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea"+
		"\u00eb\7\4\2\2\u00eb\u00ef\5\22\n\2\u00ec\u00ee\7\33\2\2\u00ed\u00ec\3"+
		"\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0"+
		"\u00f2\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00f3\7\5\2\2\u00f3\u00f4\b\t"+
		"\1\2\u00f4\u00f6\3\2\2\2\u00f5\u00ad\3\2\2\2\u00f5\u00bf\3\2\2\2\u00f5"+
		"\u00d1\3\2\2\2\u00f5\u00e3\3\2\2\2\u00f6\21\3\2\2\2\u00f7\u00f8\b\n\1"+
		"\2\u00f8\u00f9\7\24\2\2\u00f9\u0105\b\n\1\2\u00fa\u00fb\7\27\2\2\u00fb"+
		"\u00fc\7\24\2\2\u00fc\u0105\b\n\1\2\u00fd\u00fe\7\34\2\2\u00fe\u0105\b"+
		"\n\1\2\u00ff\u0100\7\4\2\2\u0100\u0101\5\22\n\2\u0101\u0102\7\5\2\2\u0102"+
		"\u0103\b\n\1\2\u0103\u0105\3\2\2\2\u0104\u00f7\3\2\2\2\u0104\u00fa\3\2"+
		"\2\2\u0104\u00fd\3\2\2\2\u0104\u00ff\3\2\2\2\u0105\u011c\3\2\2\2\u0106"+
		"\u0107\f\n\2\2\u0107\u0108\7\32\2\2\u0108\u0109\5\22\n\13\u0109\u010a"+
		"\b\n\1\2\u010a\u011b\3\2\2\2\u010b\u010c\f\t\2\2\u010c\u010d\7\31\2\2"+
		"\u010d\u010e\5\22\n\n\u010e\u010f\b\n\1\2\u010f\u011b\3\2\2\2\u0110\u0111"+
		"\f\b\2\2\u0111\u0112\7\30\2\2\u0112\u0113\5\22\n\t\u0113\u0114\b\n\1\2"+
		"\u0114\u011b\3\2\2\2\u0115\u0116\f\7\2\2\u0116\u0117\7\27\2\2\u0117\u0118"+
		"\5\22\n\b\u0118\u0119\b\n\1\2\u0119\u011b\3\2\2\2\u011a\u0106\3\2\2\2"+
		"\u011a\u010b\3\2\2\2\u011a\u0110\3\2\2\2\u011a\u0115\3\2\2\2\u011b\u011e"+
		"\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\23\3\2\2\2\u011e"+
		"\u011c\3\2\2\2 \31\35\60\66=DKQ\\dks\u0087\u008d\u0095\u009f\u00a6\u00ab"+
		"\u00b1\u00b9\u00c3\u00cb\u00d5\u00dd\u00e7\u00ef\u00f5\u0104\u011a\u011c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}