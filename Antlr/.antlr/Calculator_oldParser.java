// Generated from c:\Users\Spectre\Documents\COP4020\Project2\COP4020-Project-2-Antlr-\Antlr\Calculator_old.g4 by ANTLR 4.7.1

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
public class Calculator_oldParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, PRINT=21, IF=22, ELSE=23, WHILE=24, FOR=25, 
		NUM=26, WS=27, COM=28, SUBT=29, ADD=30, DIVD=31, MULT=32, SPACE=33, ID=34;
	public static final int
		RULE_exprList = 0, RULE_topExpr = 1, RULE_ifDef = 2, RULE_whileDef = 3, 
		RULE_forDef = 4, RULE_varDef = 5, RULE_printFunc = 6, RULE_boolExpr = 7, 
		RULE_specialExpr = 8, RULE_libraryFunc = 9, RULE_expr = 10;
	public static final String[] ruleNames = {
		"exprList", "topExpr", "ifDef", "whileDef", "forDef", "varDef", "printFunc", 
		"boolExpr", "specialExpr", "libraryFunc", "expr"
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

	@Override
	public String getGrammarFileName() { return "Calculator_old.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


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

	public Calculator_oldParser(TokenStream input) {
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
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_exprList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			topExpr();
			setState(27);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(23);
					match(T__0);
					setState(24);
					topExpr();
					}
					} 
				}
				setState(29);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(30);
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
		public IfDefContext ifDef() {
			return getRuleContext(IfDefContext.class,0);
		}
		public ForDefContext forDef() {
			return getRuleContext(ForDefContext.class,0);
		}
		public WhileDefContext whileDef() {
			return getRuleContext(WhileDefContext.class,0);
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
	}

	public final TopExprContext topExpr() throws RecognitionException {
		TopExprContext _localctx = new TopExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_topExpr);
		try {
			setState(52);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				varDef();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				ifDef();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(35);
				forDef();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(36);
				whileDef();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(37);
				((TopExprContext)_localctx).boolExpr = boolExpr();
				 System.out.println(Double.toString(((TopExprContext)_localctx).boolExpr.i)); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(40);
				((TopExprContext)_localctx).specialExpr = specialExpr();
				 System.out.println(Double.toString(((TopExprContext)_localctx).specialExpr.i)); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(43);
				((TopExprContext)_localctx).libraryFunc = libraryFunc();
				 System.out.println(Double.toString(((TopExprContext)_localctx).libraryFunc.i)); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(46);
				((TopExprContext)_localctx).expr = expr(0);
				 System.out.println(Double.toString(((TopExprContext)_localctx).expr.i)); 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(49);
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

	public static class IfDefContext extends ParserRuleContext {
		public BoolExprContext cond;
		public TopExprContext expr1;
		public TopExprContext expr2;
		public TerminalNode IF() { return getToken(Calculator_oldParser.IF, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public List<TopExprContext> topExpr() {
			return getRuleContexts(TopExprContext.class);
		}
		public TopExprContext topExpr(int i) {
			return getRuleContext(TopExprContext.class,i);
		}
		public List<TerminalNode> SPACE() { return getTokens(Calculator_oldParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(Calculator_oldParser.SPACE, i);
		}
		public TerminalNode ELSE() { return getToken(Calculator_oldParser.ELSE, 0); }
		public IfDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifDef; }
	}

	public final IfDefContext ifDef() throws RecognitionException {
		IfDefContext _localctx = new IfDefContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_ifDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(IF);
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(55);
				match(SPACE);
				}
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(61);
			match(T__1);
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(62);
				match(SPACE);
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(68);
			((IfDefContext)_localctx).cond = boolExpr();
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(69);
				match(SPACE);
				}
				}
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(75);
			match(T__2);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(76);
				match(SPACE);
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(82);
			((IfDefContext)_localctx).expr1 = topExpr();
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(83);
				match(ELSE);
				setState(84);
				((IfDefContext)_localctx).expr2 = topExpr();
				}
				break;
			}
			 createScope(); 
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

	public static class WhileDefContext extends ParserRuleContext {
		public BoolExprContext cond;
		public TopExprContext exec;
		public TerminalNode WHILE() { return getToken(Calculator_oldParser.WHILE, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public TopExprContext topExpr() {
			return getRuleContext(TopExprContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(Calculator_oldParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(Calculator_oldParser.SPACE, i);
		}
		public WhileDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileDef; }
	}

	public final WhileDefContext whileDef() throws RecognitionException {
		WhileDefContext _localctx = new WhileDefContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_whileDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(WHILE);
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(90);
				match(SPACE);
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(96);
			match(T__1);
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
			((WhileDefContext)_localctx).cond = boolExpr();
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(104);
				match(SPACE);
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(110);
			match(T__2);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(111);
				match(SPACE);
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(117);
			((WhileDefContext)_localctx).exec = topExpr();
			createScope();
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

	public static class ForDefContext extends ParserRuleContext {
		public TopExprContext expr1;
		public BoolExprContext cond;
		public TopExprContext expr2;
		public TerminalNode FOR() { return getToken(Calculator_oldParser.FOR, 0); }
		public List<TopExprContext> topExpr() {
			return getRuleContexts(TopExprContext.class);
		}
		public TopExprContext topExpr(int i) {
			return getRuleContext(TopExprContext.class,i);
		}
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(Calculator_oldParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(Calculator_oldParser.SPACE, i);
		}
		public ForDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forDef; }
	}

	public final ForDefContext forDef() throws RecognitionException {
		ForDefContext _localctx = new ForDefContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_forDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(FOR);
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(121);
				match(SPACE);
				}
				}
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(127);
			match(T__1);
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(128);
				match(SPACE);
				}
				}
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(134);
			((ForDefContext)_localctx).expr1 = topExpr();
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(135);
				match(SPACE);
				}
				}
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(141);
			match(T__0);
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(142);
				match(SPACE);
				}
				}
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(148);
			((ForDefContext)_localctx).cond = boolExpr();
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(149);
				match(SPACE);
				}
				}
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(155);
			match(T__0);
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(156);
				match(SPACE);
				}
				}
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(162);
			((ForDefContext)_localctx).expr2 = topExpr();
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(163);
				match(SPACE);
				}
				}
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(169);
			match(T__2);
			 createScope(); 
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
		public TerminalNode ID() { return getToken(Calculator_oldParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDef; }
	}

	public final VarDefContext varDef() throws RecognitionException {
		VarDefContext _localctx = new VarDefContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_varDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			((VarDefContext)_localctx).ID = match(ID);
			setState(173);
			match(T__3);
			setState(174);
			((VarDefContext)_localctx).val = expr(0);
			current_scope.getVariables().put((((VarDefContext)_localctx).ID!=null?((VarDefContext)_localctx).ID.getText():null), ((VarDefContext)_localctx).val.i);
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
		public TerminalNode PRINT() { return getToken(Calculator_oldParser.PRINT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> SPACE() { return getTokens(Calculator_oldParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(Calculator_oldParser.SPACE, i);
		}
		public PrintFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printFunc; }
	}

	public final PrintFuncContext printFunc() throws RecognitionException {
		PrintFuncContext _localctx = new PrintFuncContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_printFunc);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(PRINT);
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(178);
				match(SPACE);
				}
				}
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(184);
			((PrintFuncContext)_localctx).val = ((PrintFuncContext)_localctx).expr = expr(0);
			prints.add(((PrintFuncContext)_localctx).val.i);
			setState(204);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(189);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==SPACE) {
						{
						{
						setState(186);
						match(SPACE);
						}
						}
						setState(191);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(192);
					match(T__4);
					setState(196);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==SPACE) {
						{
						{
						setState(193);
						match(SPACE);
						}
						}
						setState(198);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(199);
					((PrintFuncContext)_localctx).expr = expr(0);
					prints.add(((PrintFuncContext)_localctx).expr.i);
					}
					} 
				}
				setState(206);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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
		public ExprContext er;
		public Token op;
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
	}

	public final BoolExprContext boolExpr() throws RecognitionException {
		BoolExprContext _localctx = new BoolExprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_boolExpr);
		try {
			setState(259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				((BoolExprContext)_localctx).expr = expr(0);
				 ((BoolExprContext)_localctx).i =  (((BoolExprContext)_localctx).expr.i >= 0.0 ? 1.0 : 0.0); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				match(T__5);
				setState(211);
				((BoolExprContext)_localctx).expr = expr(0);
				 ((BoolExprContext)_localctx).i =  ((BoolExprContext)_localctx).expr.i != 0 ? 0.0 : 1.0 ;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(214);
				((BoolExprContext)_localctx).el = ((BoolExprContext)_localctx).expr = expr(0);
				setState(215);
				match(T__6);
				setState(216);
				((BoolExprContext)_localctx).er = ((BoolExprContext)_localctx).expr = expr(0);
				 ((BoolExprContext)_localctx).i =  ((BoolExprContext)_localctx).expr.i > ((BoolExprContext)_localctx).expr.i ? 1.0 : 0.0 ;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(219);
				((BoolExprContext)_localctx).el = ((BoolExprContext)_localctx).expr = expr(0);
				setState(220);
				match(T__7);
				setState(221);
				((BoolExprContext)_localctx).er = ((BoolExprContext)_localctx).expr = expr(0);
				 ((BoolExprContext)_localctx).i =  ((BoolExprContext)_localctx).expr.i >= ((BoolExprContext)_localctx).expr.i ? 1.0 : 0.0 ;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(224);
				((BoolExprContext)_localctx).el = ((BoolExprContext)_localctx).expr = expr(0);
				setState(225);
				match(T__8);
				setState(226);
				((BoolExprContext)_localctx).er = ((BoolExprContext)_localctx).expr = expr(0);
				 ((BoolExprContext)_localctx).i =  ((BoolExprContext)_localctx).expr.i < ((BoolExprContext)_localctx).expr.i ? 1.0 : 0.0 ;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(229);
				((BoolExprContext)_localctx).el = ((BoolExprContext)_localctx).expr = expr(0);
				setState(230);
				match(T__7);
				setState(231);
				((BoolExprContext)_localctx).er = ((BoolExprContext)_localctx).expr = expr(0);
				 ((BoolExprContext)_localctx).i =  ((BoolExprContext)_localctx).expr.i >= ((BoolExprContext)_localctx).expr.i ? 1.0 : 0.0 ;
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(234);
				((BoolExprContext)_localctx).el = ((BoolExprContext)_localctx).expr = expr(0);
				setState(235);
				match(T__9);
				setState(236);
				((BoolExprContext)_localctx).er = ((BoolExprContext)_localctx).expr = expr(0);
				 ((BoolExprContext)_localctx).i =  ((BoolExprContext)_localctx).expr.i == ((BoolExprContext)_localctx).expr.i ? 1.0 : 0.0 ;
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(239);
				((BoolExprContext)_localctx).el = ((BoolExprContext)_localctx).expr = expr(0);
				setState(240);
				match(T__10);
				setState(241);
				((BoolExprContext)_localctx).er = ((BoolExprContext)_localctx).expr = expr(0);
				 ((BoolExprContext)_localctx).i =  ((BoolExprContext)_localctx).expr.i != ((BoolExprContext)_localctx).expr.i ? 1.0 : 0.0 ;
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(244);
				((BoolExprContext)_localctx).el = ((BoolExprContext)_localctx).expr = expr(0);
				setState(245);
				match(T__11);
				setState(246);
				((BoolExprContext)_localctx).er = ((BoolExprContext)_localctx).expr = expr(0);
				 ((BoolExprContext)_localctx).i =  ((BoolExprContext)_localctx).expr.i === ((BoolExprContext)_localctx).expr.i ? 1.0 : 0.0 ;
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(249);
				((BoolExprContext)_localctx).el = expr(0);
				setState(250);
				((BoolExprContext)_localctx).op = match(T__12);
				setState(251);
				((BoolExprContext)_localctx).er = expr(0);
				 ((BoolExprContext)_localctx).i =  (((BoolExprContext)_localctx).el.i != 0 && ((BoolExprContext)_localctx).er.i != 0) ? 1.0 : 0.0; 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(254);
				((BoolExprContext)_localctx).el = expr(0);
				setState(255);
				((BoolExprContext)_localctx).op = match(T__13);
				setState(256);
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
		public List<TerminalNode> SPACE() { return getTokens(Calculator_oldParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(Calculator_oldParser.SPACE, i);
		}
		public SpecialExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specialExpr; }
	}

	public final SpecialExprContext specialExpr() throws RecognitionException {
		SpecialExprContext _localctx = new SpecialExprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_specialExpr);
		int _la;
		try {
			setState(295);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				match(T__14);
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(262);
					match(SPACE);
					}
					}
					setState(267);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(268);
				match(T__1);
				setState(269);
				((SpecialExprContext)_localctx).value = expr(0);
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(270);
					match(SPACE);
					}
					}
					setState(275);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(276);
				match(T__2);
				 
				            if (((SpecialExprContext)_localctx).value.i < 0){
				                System.out.println("Error: expression must be positive");
				                System.exit(0);
				            }else{
				                ((SpecialExprContext)_localctx).i =  Math.sqrt(((SpecialExprContext)_localctx).value.i);
				            }
				        
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				match(T__15);
				setState(283);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(280);
					match(SPACE);
					}
					}
					setState(285);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(286);
				match(T__1);
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(287);
					match(SPACE);
					}
					}
					setState(292);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(293);
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
		public List<TerminalNode> SPACE() { return getTokens(Calculator_oldParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(Calculator_oldParser.SPACE, i);
		}
		public LibraryFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_libraryFunc; }
	}

	public final LibraryFuncContext libraryFunc() throws RecognitionException {
		LibraryFuncContext _localctx = new LibraryFuncContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_libraryFunc);
		int _la;
		try {
			setState(369);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(297);
				match(T__16);
				setState(301);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(298);
					match(SPACE);
					}
					}
					setState(303);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(304);
				match(T__1);
				setState(305);
				((LibraryFuncContext)_localctx).var = expr(0);
				setState(309);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(306);
					match(SPACE);
					}
					}
					setState(311);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(312);
				match(T__2);
				 ((LibraryFuncContext)_localctx).i =  Math.sin(((LibraryFuncContext)_localctx).var.i); 
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(315);
				match(T__17);
				setState(319);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(316);
					match(SPACE);
					}
					}
					setState(321);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(322);
				match(T__1);
				setState(323);
				((LibraryFuncContext)_localctx).var = expr(0);
				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(324);
					match(SPACE);
					}
					}
					setState(329);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(330);
				match(T__2);
				 ((LibraryFuncContext)_localctx).i =  Math.cos(((LibraryFuncContext)_localctx).var.i); 
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 3);
				{
				setState(333);
				match(T__18);
				setState(337);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(334);
					match(SPACE);
					}
					}
					setState(339);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(340);
				match(T__1);
				setState(341);
				((LibraryFuncContext)_localctx).var = expr(0);
				setState(345);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(342);
					match(SPACE);
					}
					}
					setState(347);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(348);
				match(T__2);
				 
				            if(((LibraryFuncContext)_localctx).var.i < 0){
				                System.out.println("Error: expression must be positive");
				                System.exit(0);
				            }else{
				                ((LibraryFuncContext)_localctx).i =  Math.log(((LibraryFuncContext)_localctx).var.i);
				            }
				        
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 4);
				{
				setState(351);
				match(T__19);
				setState(355);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(352);
					match(SPACE);
					}
					}
					setState(357);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(358);
				match(T__1);
				setState(359);
				((LibraryFuncContext)_localctx).var = expr(0);
				setState(363);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(360);
					match(SPACE);
					}
					}
					setState(365);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(366);
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
		public TerminalNode NUM() { return getToken(Calculator_oldParser.NUM, 0); }
		public TerminalNode ID() { return getToken(Calculator_oldParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MULT() { return getToken(Calculator_oldParser.MULT, 0); }
		public TerminalNode DIVD() { return getToken(Calculator_oldParser.DIVD, 0); }
		public TerminalNode ADD() { return getToken(Calculator_oldParser.ADD, 0); }
		public TerminalNode SUBT() { return getToken(Calculator_oldParser.SUBT, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				{
				setState(372);
				((ExprContext)_localctx).NUM = match(NUM);
				 ((ExprContext)_localctx).i = Double.parseDouble((((ExprContext)_localctx).NUM!=null?((ExprContext)_localctx).NUM.getText():null)); 
				}
				break;
			case SUBT:
				{
				setState(374);
				match(SUBT);
				setState(375);
				((ExprContext)_localctx).NUM = match(NUM);
				 ((ExprContext)_localctx).i =  -1.0 * Double.parseDouble((((ExprContext)_localctx).NUM!=null?((ExprContext)_localctx).NUM.getText():null)); 
				}
				break;
			case ID:
				{
				setState(377);
				((ExprContext)_localctx).ID = match(ID);

				            if(getVariable((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null)) != null)
				                ((ExprContext)_localctx).i =  getVariable((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null));
				            else
				                System.out.println("Undeclared variable: " + (((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null));
				        
				}
				break;
			case T__1:
				{
				setState(379);
				match(T__1);
				setState(380);
				((ExprContext)_localctx).e = ((ExprContext)_localctx).expr = expr(0);
				setState(381);
				match(T__2);
				((ExprContext)_localctx).i =  ((ExprContext)_localctx).expr.i;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(408);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(406);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(386);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(387);
						match(MULT);
						setState(388);
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
						setState(391);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(392);
						match(DIVD);
						setState(393);
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
						setState(396);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(397);
						match(ADD);
						setState(398);
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
						setState(401);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(402);
						match(SUBT);
						setState(403);
						((ExprContext)_localctx).er = ((ExprContext)_localctx).expr = expr(6);
						 ((ExprContext)_localctx).i = ((ExprContext)_localctx).el.i-((ExprContext)_localctx).er.i; 
						}
						break;
					}
					} 
				}
				setState(410);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
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
		case 10:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3$\u019e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\3\2\7\2\34\n\2\f\2\16\2\37\13\2\3\2\5\2\"\n\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\5\3\67\n\3\3\4\3\4\7\4;\n\4\f\4\16\4>\13\4\3\4\3\4\7\4B\n\4\f\4\16"+
		"\4E\13\4\3\4\3\4\7\4I\n\4\f\4\16\4L\13\4\3\4\3\4\7\4P\n\4\f\4\16\4S\13"+
		"\4\3\4\3\4\3\4\5\4X\n\4\3\4\3\4\3\5\3\5\7\5^\n\5\f\5\16\5a\13\5\3\5\3"+
		"\5\7\5e\n\5\f\5\16\5h\13\5\3\5\3\5\7\5l\n\5\f\5\16\5o\13\5\3\5\3\5\7\5"+
		"s\n\5\f\5\16\5v\13\5\3\5\3\5\3\5\3\6\3\6\7\6}\n\6\f\6\16\6\u0080\13\6"+
		"\3\6\3\6\7\6\u0084\n\6\f\6\16\6\u0087\13\6\3\6\3\6\7\6\u008b\n\6\f\6\16"+
		"\6\u008e\13\6\3\6\3\6\7\6\u0092\n\6\f\6\16\6\u0095\13\6\3\6\3\6\7\6\u0099"+
		"\n\6\f\6\16\6\u009c\13\6\3\6\3\6\7\6\u00a0\n\6\f\6\16\6\u00a3\13\6\3\6"+
		"\3\6\7\6\u00a7\n\6\f\6\16\6\u00aa\13\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\7\b\u00b6\n\b\f\b\16\b\u00b9\13\b\3\b\3\b\3\b\7\b\u00be\n\b\f"+
		"\b\16\b\u00c1\13\b\3\b\3\b\7\b\u00c5\n\b\f\b\16\b\u00c8\13\b\3\b\3\b\3"+
		"\b\7\b\u00cd\n\b\f\b\16\b\u00d0\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0106\n\t\3\n\3\n\7\n\u010a\n\n"+
		"\f\n\16\n\u010d\13\n\3\n\3\n\3\n\7\n\u0112\n\n\f\n\16\n\u0115\13\n\3\n"+
		"\3\n\3\n\3\n\3\n\7\n\u011c\n\n\f\n\16\n\u011f\13\n\3\n\3\n\7\n\u0123\n"+
		"\n\f\n\16\n\u0126\13\n\3\n\3\n\5\n\u012a\n\n\3\13\3\13\7\13\u012e\n\13"+
		"\f\13\16\13\u0131\13\13\3\13\3\13\3\13\7\13\u0136\n\13\f\13\16\13\u0139"+
		"\13\13\3\13\3\13\3\13\3\13\3\13\7\13\u0140\n\13\f\13\16\13\u0143\13\13"+
		"\3\13\3\13\3\13\7\13\u0148\n\13\f\13\16\13\u014b\13\13\3\13\3\13\3\13"+
		"\3\13\3\13\7\13\u0152\n\13\f\13\16\13\u0155\13\13\3\13\3\13\3\13\7\13"+
		"\u015a\n\13\f\13\16\13\u015d\13\13\3\13\3\13\3\13\3\13\3\13\7\13\u0164"+
		"\n\13\f\13\16\13\u0167\13\13\3\13\3\13\3\13\7\13\u016c\n\13\f\13\16\13"+
		"\u016f\13\13\3\13\3\13\3\13\5\13\u0174\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0183\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0199\n\f\f\f\16"+
		"\f\u019c\13\f\3\f\2\3\26\r\2\4\6\b\n\f\16\20\22\24\26\2\2\2\u01d1\2\30"+
		"\3\2\2\2\4\66\3\2\2\2\68\3\2\2\2\b[\3\2\2\2\nz\3\2\2\2\f\u00ae\3\2\2\2"+
		"\16\u00b3\3\2\2\2\20\u0105\3\2\2\2\22\u0129\3\2\2\2\24\u0173\3\2\2\2\26"+
		"\u0182\3\2\2\2\30\35\5\4\3\2\31\32\7\3\2\2\32\34\5\4\3\2\33\31\3\2\2\2"+
		"\34\37\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36!\3\2\2\2\37\35\3\2\2\2 "+
		"\"\7\3\2\2! \3\2\2\2!\"\3\2\2\2\"\3\3\2\2\2#\67\5\f\7\2$\67\5\6\4\2%\67"+
		"\5\n\6\2&\67\5\b\5\2\'(\5\20\t\2()\b\3\1\2)\67\3\2\2\2*+\5\22\n\2+,\b"+
		"\3\1\2,\67\3\2\2\2-.\5\24\13\2./\b\3\1\2/\67\3\2\2\2\60\61\5\26\f\2\61"+
		"\62\b\3\1\2\62\67\3\2\2\2\63\64\5\16\b\2\64\65\b\3\1\2\65\67\3\2\2\2\66"+
		"#\3\2\2\2\66$\3\2\2\2\66%\3\2\2\2\66&\3\2\2\2\66\'\3\2\2\2\66*\3\2\2\2"+
		"\66-\3\2\2\2\66\60\3\2\2\2\66\63\3\2\2\2\67\5\3\2\2\28<\7\30\2\29;\7#"+
		"\2\2:9\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=?\3\2\2\2><\3\2\2\2?C\7\4"+
		"\2\2@B\7#\2\2A@\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2DF\3\2\2\2EC\3\2"+
		"\2\2FJ\5\20\t\2GI\7#\2\2HG\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2KM\3\2"+
		"\2\2LJ\3\2\2\2MQ\7\5\2\2NP\7#\2\2ON\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2"+
		"\2\2RT\3\2\2\2SQ\3\2\2\2TW\5\4\3\2UV\7\31\2\2VX\5\4\3\2WU\3\2\2\2WX\3"+
		"\2\2\2XY\3\2\2\2YZ\b\4\1\2Z\7\3\2\2\2[_\7\32\2\2\\^\7#\2\2]\\\3\2\2\2"+
		"^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`b\3\2\2\2a_\3\2\2\2bf\7\4\2\2ce\7#\2\2"+
		"dc\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2gi\3\2\2\2hf\3\2\2\2im\5\20\t"+
		"\2jl\7#\2\2kj\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2np\3\2\2\2om\3\2\2"+
		"\2pt\7\5\2\2qs\7#\2\2rq\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2uw\3\2\2"+
		"\2vt\3\2\2\2wx\5\4\3\2xy\b\5\1\2y\t\3\2\2\2z~\7\33\2\2{}\7#\2\2|{\3\2"+
		"\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0081\3\2\2\2\u0080~\3"+
		"\2\2\2\u0081\u0085\7\4\2\2\u0082\u0084\7#\2\2\u0083\u0082\3\2\2\2\u0084"+
		"\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0088\3\2"+
		"\2\2\u0087\u0085\3\2\2\2\u0088\u008c\5\4\3\2\u0089\u008b\7#\2\2\u008a"+
		"\u0089\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2"+
		"\2\2\u008d\u008f\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0093\7\3\2\2\u0090"+
		"\u0092\7#\2\2\u0091\u0090\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2"+
		"\2\2\u0093\u0094\3\2\2\2\u0094\u0096\3\2\2\2\u0095\u0093\3\2\2\2\u0096"+
		"\u009a\5\20\t\2\u0097\u0099\7#\2\2\u0098\u0097\3\2\2\2\u0099\u009c\3\2"+
		"\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009d\3\2\2\2\u009c"+
		"\u009a\3\2\2\2\u009d\u00a1\7\3\2\2\u009e\u00a0\7#\2\2\u009f\u009e\3\2"+
		"\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2"+
		"\u00a4\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a8\5\4\3\2\u00a5\u00a7\7#"+
		"\2\2\u00a6\u00a5\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8"+
		"\u00a9\3\2\2\2\u00a9\u00ab\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ac\7\5"+
		"\2\2\u00ac\u00ad\b\6\1\2\u00ad\13\3\2\2\2\u00ae\u00af\7$\2\2\u00af\u00b0"+
		"\7\6\2\2\u00b0\u00b1\5\26\f\2\u00b1\u00b2\b\7\1\2\u00b2\r\3\2\2\2\u00b3"+
		"\u00b7\7\27\2\2\u00b4\u00b6\7#\2\2\u00b5\u00b4\3\2\2\2\u00b6\u00b9\3\2"+
		"\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00ba\3\2\2\2\u00b9"+
		"\u00b7\3\2\2\2\u00ba\u00bb\5\26\f\2\u00bb\u00ce\b\b\1\2\u00bc\u00be\7"+
		"#\2\2\u00bd\u00bc\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf"+
		"\u00c0\3\2\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c6\7\7"+
		"\2\2\u00c3\u00c5\7#\2\2\u00c4\u00c3\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6"+
		"\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c9\3\2\2\2\u00c8\u00c6\3\2"+
		"\2\2\u00c9\u00ca\5\26\f\2\u00ca\u00cb\b\b\1\2\u00cb\u00cd\3\2\2\2\u00cc"+
		"\u00bf\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2"+
		"\2\2\u00cf\17\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d2\5\26\f\2\u00d2\u00d3"+
		"\b\t\1\2\u00d3\u0106\3\2\2\2\u00d4\u00d5\7\b\2\2\u00d5\u00d6\5\26\f\2"+
		"\u00d6\u00d7\b\t\1\2\u00d7\u0106\3\2\2\2\u00d8\u00d9\5\26\f\2\u00d9\u00da"+
		"\7\t\2\2\u00da\u00db\5\26\f\2\u00db\u00dc\b\t\1\2\u00dc\u0106\3\2\2\2"+
		"\u00dd\u00de\5\26\f\2\u00de\u00df\7\n\2\2\u00df\u00e0\5\26\f\2\u00e0\u00e1"+
		"\b\t\1\2\u00e1\u0106\3\2\2\2\u00e2\u00e3\5\26\f\2\u00e3\u00e4\7\13\2\2"+
		"\u00e4\u00e5\5\26\f\2\u00e5\u00e6\b\t\1\2\u00e6\u0106\3\2\2\2\u00e7\u00e8"+
		"\5\26\f\2\u00e8\u00e9\7\n\2\2\u00e9\u00ea\5\26\f\2\u00ea\u00eb\b\t\1\2"+
		"\u00eb\u0106\3\2\2\2\u00ec\u00ed\5\26\f\2\u00ed\u00ee\7\f\2\2\u00ee\u00ef"+
		"\5\26\f\2\u00ef\u00f0\b\t\1\2\u00f0\u0106\3\2\2\2\u00f1\u00f2\5\26\f\2"+
		"\u00f2\u00f3\7\r\2\2\u00f3\u00f4\5\26\f\2\u00f4\u00f5\b\t\1\2\u00f5\u0106"+
		"\3\2\2\2\u00f6\u00f7\5\26\f\2\u00f7\u00f8\7\16\2\2\u00f8\u00f9\5\26\f"+
		"\2\u00f9\u00fa\b\t\1\2\u00fa\u0106\3\2\2\2\u00fb\u00fc\5\26\f\2\u00fc"+
		"\u00fd\7\17\2\2\u00fd\u00fe\5\26\f\2\u00fe\u00ff\b\t\1\2\u00ff\u0106\3"+
		"\2\2\2\u0100\u0101\5\26\f\2\u0101\u0102\7\20\2\2\u0102\u0103\5\26\f\2"+
		"\u0103\u0104\b\t\1\2\u0104\u0106\3\2\2\2\u0105\u00d1\3\2\2\2\u0105\u00d4"+
		"\3\2\2\2\u0105\u00d8\3\2\2\2\u0105\u00dd\3\2\2\2\u0105\u00e2\3\2\2\2\u0105"+
		"\u00e7\3\2\2\2\u0105\u00ec\3\2\2\2\u0105\u00f1\3\2\2\2\u0105\u00f6\3\2"+
		"\2\2\u0105\u00fb\3\2\2\2\u0105\u0100\3\2\2\2\u0106\21\3\2\2\2\u0107\u010b"+
		"\7\21\2\2\u0108\u010a\7#\2\2\u0109\u0108\3\2\2\2\u010a\u010d\3\2\2\2\u010b"+
		"\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010e\3\2\2\2\u010d\u010b\3\2"+
		"\2\2\u010e\u010f\7\4\2\2\u010f\u0113\5\26\f\2\u0110\u0112\7#\2\2\u0111"+
		"\u0110\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2"+
		"\2\2\u0114\u0116\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u0117\7\5\2\2\u0117"+
		"\u0118\b\n\1\2\u0118\u012a\3\2\2\2\u0119\u011d\7\22\2\2\u011a\u011c\7"+
		"#\2\2\u011b\u011a\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011b\3\2\2\2\u011d"+
		"\u011e\3\2\2\2\u011e\u0120\3\2\2\2\u011f\u011d\3\2\2\2\u0120\u0124\7\4"+
		"\2\2\u0121\u0123\7#\2\2\u0122\u0121\3\2\2\2\u0123\u0126\3\2\2\2\u0124"+
		"\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0127\3\2\2\2\u0126\u0124\3\2"+
		"\2\2\u0127\u0128\7\5\2\2\u0128\u012a\b\n\1\2\u0129\u0107\3\2\2\2\u0129"+
		"\u0119\3\2\2\2\u012a\23\3\2\2\2\u012b\u012f\7\23\2\2\u012c\u012e\7#\2"+
		"\2\u012d\u012c\3\2\2\2\u012e\u0131\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130"+
		"\3\2\2\2\u0130\u0132\3\2\2\2\u0131\u012f\3\2\2\2\u0132\u0133\7\4\2\2\u0133"+
		"\u0137\5\26\f\2\u0134\u0136\7#\2\2\u0135\u0134\3\2\2\2\u0136\u0139\3\2"+
		"\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u013a\3\2\2\2\u0139"+
		"\u0137\3\2\2\2\u013a\u013b\7\5\2\2\u013b\u013c\b\13\1\2\u013c\u0174\3"+
		"\2\2\2\u013d\u0141\7\24\2\2\u013e\u0140\7#\2\2\u013f\u013e\3\2\2\2\u0140"+
		"\u0143\3\2\2\2\u0141\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0144\3\2"+
		"\2\2\u0143\u0141\3\2\2\2\u0144\u0145\7\4\2\2\u0145\u0149\5\26\f\2\u0146"+
		"\u0148\7#\2\2\u0147\u0146\3\2\2\2\u0148\u014b\3\2\2\2\u0149\u0147\3\2"+
		"\2\2\u0149\u014a\3\2\2\2\u014a\u014c\3\2\2\2\u014b\u0149\3\2\2\2\u014c"+
		"\u014d\7\5\2\2\u014d\u014e\b\13\1\2\u014e\u0174\3\2\2\2\u014f\u0153\7"+
		"\25\2\2\u0150\u0152\7#\2\2\u0151\u0150\3\2\2\2\u0152\u0155\3\2\2\2\u0153"+
		"\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0156\3\2\2\2\u0155\u0153\3\2"+
		"\2\2\u0156\u0157\7\4\2\2\u0157\u015b\5\26\f\2\u0158\u015a\7#\2\2\u0159"+
		"\u0158\3\2\2\2\u015a\u015d\3\2\2\2\u015b\u0159\3\2\2\2\u015b\u015c\3\2"+
		"\2\2\u015c\u015e\3\2\2\2\u015d\u015b\3\2\2\2\u015e\u015f\7\5\2\2\u015f"+
		"\u0160\b\13\1\2\u0160\u0174\3\2\2\2\u0161\u0165\7\26\2\2\u0162\u0164\7"+
		"#\2\2\u0163\u0162\3\2\2\2\u0164\u0167\3\2\2\2\u0165\u0163\3\2\2\2\u0165"+
		"\u0166\3\2\2\2\u0166\u0168\3\2\2\2\u0167\u0165\3\2\2\2\u0168\u0169\7\4"+
		"\2\2\u0169\u016d\5\26\f\2\u016a\u016c\7#\2\2\u016b\u016a\3\2\2\2\u016c"+
		"\u016f\3\2\2\2\u016d\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u0170\3\2"+
		"\2\2\u016f\u016d\3\2\2\2\u0170\u0171\7\5\2\2\u0171\u0172\b\13\1\2\u0172"+
		"\u0174\3\2\2\2\u0173\u012b\3\2\2\2\u0173\u013d\3\2\2\2\u0173\u014f\3\2"+
		"\2\2\u0173\u0161\3\2\2\2\u0174\25\3\2\2\2\u0175\u0176\b\f\1\2\u0176\u0177"+
		"\7\34\2\2\u0177\u0183\b\f\1\2\u0178\u0179\7\37\2\2\u0179\u017a\7\34\2"+
		"\2\u017a\u0183\b\f\1\2\u017b\u017c\7$\2\2\u017c\u0183\b\f\1\2\u017d\u017e"+
		"\7\4\2\2\u017e\u017f\5\26\f\2\u017f\u0180\7\5\2\2\u0180\u0181\b\f\1\2"+
		"\u0181\u0183\3\2\2\2\u0182\u0175\3\2\2\2\u0182\u0178\3\2\2\2\u0182\u017b"+
		"\3\2\2\2\u0182\u017d\3\2\2\2\u0183\u019a\3\2\2\2\u0184\u0185\f\n\2\2\u0185"+
		"\u0186\7\"\2\2\u0186\u0187\5\26\f\13\u0187\u0188\b\f\1\2\u0188\u0199\3"+
		"\2\2\2\u0189\u018a\f\t\2\2\u018a\u018b\7!\2\2\u018b\u018c\5\26\f\n\u018c"+
		"\u018d\b\f\1\2\u018d\u0199\3\2\2\2\u018e\u018f\f\b\2\2\u018f\u0190\7 "+
		"\2\2\u0190\u0191\5\26\f\t\u0191\u0192\b\f\1\2\u0192\u0199\3\2\2\2\u0193"+
		"\u0194\f\7\2\2\u0194\u0195\7\37\2\2\u0195\u0196\5\26\f\b\u0196\u0197\b"+
		"\f\1\2\u0197\u0199\3\2\2\2\u0198\u0184\3\2\2\2\u0198\u0189\3\2\2\2\u0198"+
		"\u018e\3\2\2\2\u0198\u0193\3\2\2\2\u0199\u019c\3\2\2\2\u019a\u0198\3\2"+
		"\2\2\u019a\u019b\3\2\2\2\u019b\27\3\2\2\2\u019c\u019a\3\2\2\2+\35!\66"+
		"<CJQW_fmt~\u0085\u008c\u0093\u009a\u00a1\u00a8\u00b7\u00bf\u00c6\u00ce"+
		"\u0105\u010b\u0113\u011d\u0124\u0129\u012f\u0137\u0141\u0149\u0153\u015b"+
		"\u0165\u016d\u0173\u0182\u0198\u019a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}