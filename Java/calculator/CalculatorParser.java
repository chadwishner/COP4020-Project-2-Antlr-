// Generated from Calculator.g4 by ANTLR 4.7.2

    package calculator;

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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, PRINT=20, IF=21, ELSE=22, WHILE=23, FOR=24, NUM=25, 
		WS=26, COM=27, SUB=28, ADD=29, DIV=30, MUL=31, SPACE=32, ID=33;
	public static final int
		RULE_parse = 0, RULE_exprList = 1, RULE_topExpr = 2, RULE_ifDef = 3, RULE_whileDef = 4, 
		RULE_forDef = 5, RULE_varDef = 6, RULE_printFunc = 7, RULE_boolExpr = 8, 
		RULE_specialExpr = 9, RULE_libraryFunc = 10, RULE_expr = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "exprList", "topExpr", "ifDef", "whileDef", "forDef", "varDef", 
			"printFunc", "boolExpr", "specialExpr", "libraryFunc", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'('", "')'", "'='", "','", "'!'", "'>'", "'>='", "'<'", 
			"'=='", "'!='", "'&&'", "'||'", "'sqrt'", "'read'", "'s'", "'c'", "'l'", 
			"'e'", "'print'", "'if'", "'else'", "'while'", "'for'", null, null, null, 
			"'-'", "'+'", "'/'", "'*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "PRINT", "IF", "ELSE", 
			"WHILE", "FOR", "NUM", "WS", "COM", "SUB", "ADD", "DIV", "MUL", "SPACE", 
			"ID"
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

	public CalculatorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ParseContext extends ParserRuleContext {
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CalculatorParser.EOF, 0); }
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			exprList();
			setState(25);
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

	public static class ExprListContext extends ParserRuleContext {
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
	 
		public ExprListContext() { }
		public void copyFrom(ExprListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprListTagContext extends ExprListContext {
		public List<TopExprContext> topExpr() {
			return getRuleContexts(TopExprContext.class);
		}
		public TopExprContext topExpr(int i) {
			return getRuleContext(TopExprContext.class,i);
		}
		public ExprListTagContext(ExprListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterExprListTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitExprListTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitExprListTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_exprList);
		int _la;
		try {
			int _alt;
			_localctx = new ExprListTagContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			topExpr();
			setState(32);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(28);
					match(T__0);
					setState(29);
					topExpr();
					}
					} 
				}
				setState(34);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(35);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterTopExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitTopExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitTopExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TopExprContext topExpr() throws RecognitionException {
		TopExprContext _localctx = new TopExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_topExpr);
		try {
			setState(47);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				varDef();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				ifDef();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(40);
				forDef();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(41);
				whileDef();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(42);
				boolExpr();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(43);
				specialExpr();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(44);
				libraryFunc();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(45);
				expr(0);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(46);
				printFunc();
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
		public IfDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifDef; }
	 
		public IfDefContext() { }
		public void copyFrom(IfDefContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfDefTagContext extends IfDefContext {
		public BoolExprContext cond;
		public TopExprContext expr1;
		public TopExprContext expr2;
		public TerminalNode IF() { return getToken(CalculatorParser.IF, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public List<TopExprContext> topExpr() {
			return getRuleContexts(TopExprContext.class);
		}
		public TopExprContext topExpr(int i) {
			return getRuleContext(TopExprContext.class,i);
		}
		public List<TerminalNode> SPACE() { return getTokens(CalculatorParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(CalculatorParser.SPACE, i);
		}
		public TerminalNode ELSE() { return getToken(CalculatorParser.ELSE, 0); }
		public IfDefTagContext(IfDefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterIfDefTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitIfDefTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitIfDefTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfDefContext ifDef() throws RecognitionException {
		IfDefContext _localctx = new IfDefContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ifDef);
		int _la;
		try {
			_localctx = new IfDefTagContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(IF);
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(50);
				match(SPACE);
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(56);
			match(T__1);
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(57);
				match(SPACE);
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63);
			((IfDefTagContext)_localctx).cond = boolExpr();
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(64);
				match(SPACE);
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(70);
			match(T__2);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(71);
				match(SPACE);
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(77);
			((IfDefTagContext)_localctx).expr1 = topExpr();
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(78);
				match(ELSE);
				setState(79);
				((IfDefTagContext)_localctx).expr2 = topExpr();
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

	public static class WhileDefContext extends ParserRuleContext {
		public WhileDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileDef; }
	 
		public WhileDefContext() { }
		public void copyFrom(WhileDefContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WhileDefTagContext extends WhileDefContext {
		public BoolExprContext cond;
		public TopExprContext exec;
		public TerminalNode WHILE() { return getToken(CalculatorParser.WHILE, 0); }
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
		public WhileDefTagContext(WhileDefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterWhileDefTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitWhileDefTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitWhileDefTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileDefContext whileDef() throws RecognitionException {
		WhileDefContext _localctx = new WhileDefContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_whileDef);
		int _la;
		try {
			_localctx = new WhileDefTagContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(WHILE);
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(83);
				match(SPACE);
				}
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(89);
			match(T__1);
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
			((WhileDefTagContext)_localctx).cond = boolExpr();
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
			match(T__2);
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
			((WhileDefTagContext)_localctx).exec = topExpr();
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
		public ForDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forDef; }
	 
		public ForDefContext() { }
		public void copyFrom(ForDefContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ForDefTagContext extends ForDefContext {
		public TopExprContext expr1;
		public BoolExprContext cond;
		public TopExprContext expr2;
		public TerminalNode FOR() { return getToken(CalculatorParser.FOR, 0); }
		public List<TopExprContext> topExpr() {
			return getRuleContexts(TopExprContext.class);
		}
		public TopExprContext topExpr(int i) {
			return getRuleContext(TopExprContext.class,i);
		}
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(CalculatorParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(CalculatorParser.SPACE, i);
		}
		public ForDefTagContext(ForDefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterForDefTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitForDefTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitForDefTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForDefContext forDef() throws RecognitionException {
		ForDefContext _localctx = new ForDefContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_forDef);
		int _la;
		try {
			_localctx = new ForDefTagContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(FOR);
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(113);
				match(SPACE);
				}
				}
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(119);
			match(T__1);
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(120);
				match(SPACE);
				}
				}
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(126);
			((ForDefTagContext)_localctx).expr1 = topExpr();
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(127);
				match(SPACE);
				}
				}
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(133);
			match(T__0);
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(134);
				match(SPACE);
				}
				}
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(140);
			((ForDefTagContext)_localctx).cond = boolExpr();
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
			match(T__0);
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(148);
				match(SPACE);
				}
				}
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(154);
			((ForDefTagContext)_localctx).expr2 = topExpr();
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(155);
				match(SPACE);
				}
				}
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(161);
			match(T__2);
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
		public VarDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDef; }
	 
		public VarDefContext() { }
		public void copyFrom(VarDefContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarDefTagContext extends VarDefContext {
		public TerminalNode ID() { return getToken(CalculatorParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarDefTagContext(VarDefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterVarDefTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitVarDefTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitVarDefTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDefContext varDef() throws RecognitionException {
		VarDefContext _localctx = new VarDefContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_varDef);
		try {
			_localctx = new VarDefTagContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(ID);
			setState(164);
			match(T__3);
			setState(165);
			expr(0);
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
		public PrintFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printFunc; }
	 
		public PrintFuncContext() { }
		public void copyFrom(PrintFuncContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrintFuncTagContext extends PrintFuncContext {
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
		public PrintFuncTagContext(PrintFuncContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterPrintFuncTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitPrintFuncTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitPrintFuncTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintFuncContext printFunc() throws RecognitionException {
		PrintFuncContext _localctx = new PrintFuncContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_printFunc);
		int _la;
		try {
			int _alt;
			_localctx = new PrintFuncTagContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(PRINT);
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(168);
				match(SPACE);
				}
				}
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(174);
			expr(0);
			setState(191);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(178);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==SPACE) {
						{
						{
						setState(175);
						match(SPACE);
						}
						}
						setState(180);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(181);
					match(T__4);
					setState(185);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==SPACE) {
						{
						{
						setState(182);
						match(SPACE);
						}
						}
						setState(187);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(188);
					expr(0);
					}
					} 
				}
				setState(193);
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
		public BoolExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolExpr; }
	 
		public BoolExprContext() { }
		public void copyFrom(BoolExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NeqBoolTagContext extends BoolExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public NeqBoolTagContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterNeqBoolTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitNeqBoolTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitNeqBoolTag(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GteBoolTagContext extends BoolExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public GteBoolTagContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterGteBoolTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitGteBoolTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitGteBoolTag(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LtBoolTagContext extends BoolExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LtBoolTagContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterLtBoolTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitLtBoolTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitLtBoolTag(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GtBoolTagContext extends BoolExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public GtBoolTagContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterGtBoolTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitGtBoolTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitGtBoolTag(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrBoolTagContext extends BoolExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OrBoolTagContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterOrBoolTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitOrBoolTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitOrBoolTag(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprBoolTagContext extends BoolExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprBoolTagContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterExprBoolTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitExprBoolTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitExprBoolTag(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotBoolTagContext extends BoolExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotBoolTagContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterNotBoolTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitNotBoolTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitNotBoolTag(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LteBoolTagContext extends BoolExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LteBoolTagContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterLteBoolTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitLteBoolTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitLteBoolTag(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqBoolTagContext extends BoolExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public EqBoolTagContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterEqBoolTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitEqBoolTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitEqBoolTag(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndBoolTagContext extends BoolExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AndBoolTagContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterAndBoolTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitAndBoolTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitAndBoolTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolExprContext boolExpr() throws RecognitionException {
		BoolExprContext _localctx = new BoolExprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_boolExpr);
		try {
			setState(229);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				_localctx = new ExprBoolTagContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				expr(0);
				}
				break;
			case 2:
				_localctx = new NotBoolTagContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				((NotBoolTagContext)_localctx).op = match(T__5);
				setState(196);
				expr(0);
				}
				break;
			case 3:
				_localctx = new GtBoolTagContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(197);
				expr(0);
				setState(198);
				((GtBoolTagContext)_localctx).op = match(T__6);
				setState(199);
				expr(0);
				}
				break;
			case 4:
				_localctx = new GteBoolTagContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(201);
				expr(0);
				setState(202);
				((GteBoolTagContext)_localctx).op = match(T__7);
				setState(203);
				expr(0);
				}
				break;
			case 5:
				_localctx = new LtBoolTagContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(205);
				expr(0);
				setState(206);
				((LtBoolTagContext)_localctx).op = match(T__8);
				setState(207);
				expr(0);
				}
				break;
			case 6:
				_localctx = new LteBoolTagContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(209);
				expr(0);
				setState(210);
				((LteBoolTagContext)_localctx).op = match(T__7);
				setState(211);
				expr(0);
				}
				break;
			case 7:
				_localctx = new EqBoolTagContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(213);
				expr(0);
				setState(214);
				((EqBoolTagContext)_localctx).op = match(T__9);
				setState(215);
				expr(0);
				}
				break;
			case 8:
				_localctx = new NeqBoolTagContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(217);
				expr(0);
				setState(218);
				((NeqBoolTagContext)_localctx).op = match(T__10);
				setState(219);
				expr(0);
				}
				break;
			case 9:
				_localctx = new AndBoolTagContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(221);
				expr(0);
				setState(222);
				((AndBoolTagContext)_localctx).op = match(T__11);
				setState(223);
				expr(0);
				}
				break;
			case 10:
				_localctx = new OrBoolTagContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(225);
				expr(0);
				setState(226);
				((OrBoolTagContext)_localctx).op = match(T__12);
				setState(227);
				expr(0);
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
		public SpecialExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specialExpr; }
	 
		public SpecialExprContext() { }
		public void copyFrom(SpecialExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReadExprTagContext extends SpecialExprContext {
		public List<TerminalNode> SPACE() { return getTokens(CalculatorParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(CalculatorParser.SPACE, i);
		}
		public ReadExprTagContext(SpecialExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterReadExprTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitReadExprTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitReadExprTag(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SqrtExprTagContext extends SpecialExprContext {
		public ExprContext value;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(CalculatorParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(CalculatorParser.SPACE, i);
		}
		public SqrtExprTagContext(SpecialExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterSqrtExprTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitSqrtExprTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitSqrtExprTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecialExprContext specialExpr() throws RecognitionException {
		SpecialExprContext _localctx = new SpecialExprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_specialExpr);
		int _la;
		try {
			setState(263);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				_localctx = new SqrtExprTagContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				match(T__13);
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(232);
					match(SPACE);
					}
					}
					setState(237);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(238);
				match(T__1);
				setState(239);
				((SqrtExprTagContext)_localctx).value = expr(0);
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(240);
					match(SPACE);
					}
					}
					setState(245);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(246);
				match(T__2);
				}
				break;
			case T__14:
				_localctx = new ReadExprTagContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				match(T__14);
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(249);
					match(SPACE);
					}
					}
					setState(254);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(255);
				match(T__1);
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(256);
					match(SPACE);
					}
					}
					setState(261);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(262);
				match(T__2);
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
		public LibraryFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_libraryFunc; }
	 
		public LibraryFuncContext() { }
		public void copyFrom(LibraryFuncContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExpFuncTagContext extends LibraryFuncContext {
		public ExprContext var;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(CalculatorParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(CalculatorParser.SPACE, i);
		}
		public ExpFuncTagContext(LibraryFuncContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterExpFuncTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitExpFuncTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitExpFuncTag(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SinFuncTagContext extends LibraryFuncContext {
		public ExprContext var;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(CalculatorParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(CalculatorParser.SPACE, i);
		}
		public SinFuncTagContext(LibraryFuncContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterSinFuncTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitSinFuncTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitSinFuncTag(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogFuncTagContext extends LibraryFuncContext {
		public ExprContext var;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(CalculatorParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(CalculatorParser.SPACE, i);
		}
		public LogFuncTagContext(LibraryFuncContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterLogFuncTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitLogFuncTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitLogFuncTag(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CosFuncTagContext extends LibraryFuncContext {
		public ExprContext var;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(CalculatorParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(CalculatorParser.SPACE, i);
		}
		public CosFuncTagContext(LibraryFuncContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterCosFuncTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitCosFuncTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitCosFuncTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LibraryFuncContext libraryFunc() throws RecognitionException {
		LibraryFuncContext _localctx = new LibraryFuncContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_libraryFunc);
		int _la;
		try {
			setState(333);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
				_localctx = new SinFuncTagContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(265);
				match(T__15);
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(266);
					match(SPACE);
					}
					}
					setState(271);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(272);
				match(T__1);
				setState(273);
				((SinFuncTagContext)_localctx).var = expr(0);
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(274);
					match(SPACE);
					}
					}
					setState(279);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(280);
				match(T__2);
				}
				break;
			case T__16:
				_localctx = new CosFuncTagContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
				match(T__16);
				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(283);
					match(SPACE);
					}
					}
					setState(288);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(289);
				match(T__1);
				setState(290);
				((CosFuncTagContext)_localctx).var = expr(0);
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(291);
					match(SPACE);
					}
					}
					setState(296);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(297);
				match(T__2);
				}
				break;
			case T__17:
				_localctx = new LogFuncTagContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(299);
				match(T__17);
				setState(303);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(300);
					match(SPACE);
					}
					}
					setState(305);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(306);
				match(T__1);
				setState(307);
				((LogFuncTagContext)_localctx).var = expr(0);
				setState(311);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(308);
					match(SPACE);
					}
					}
					setState(313);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(314);
				match(T__2);
				}
				break;
			case T__18:
				_localctx = new ExpFuncTagContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(316);
				match(T__18);
				setState(320);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(317);
					match(SPACE);
					}
					}
					setState(322);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(323);
				match(T__1);
				setState(324);
				((ExpFuncTagContext)_localctx).var = expr(0);
				setState(328);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(325);
					match(SPACE);
					}
					}
					setState(330);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(331);
				match(T__2);
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
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParenExprTagContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParenExprTagContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterParenExprTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitParenExprTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitParenExprTag(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddExprTagContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ADD() { return getToken(CalculatorParser.ADD, 0); }
		public AddExprTagContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterAddExprTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitAddExprTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitAddExprTag(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumExprTagContext extends ExprContext {
		public TerminalNode NUM() { return getToken(CalculatorParser.NUM, 0); }
		public NumExprTagContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterNumExprTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitNumExprTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitNumExprTag(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdTagContext extends ExprContext {
		public TerminalNode ID() { return getToken(CalculatorParser.ID, 0); }
		public IdTagContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterIdTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitIdTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitIdTag(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivExprTagContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode DIV() { return getToken(CalculatorParser.DIV, 0); }
		public DivExprTagContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterDivExprTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitDivExprTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitDivExprTag(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulExprTagContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MUL() { return getToken(CalculatorParser.MUL, 0); }
		public MulExprTagContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterMulExprTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitMulExprTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitMulExprTag(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubExprTagContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode SUB() { return getToken(CalculatorParser.SUB, 0); }
		public SubExprTagContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterSubExprTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitSubExprTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitSubExprTag(this);
			else return visitor.visitChildren(this);
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				_localctx = new ParenExprTagContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(336);
				match(T__1);
				setState(337);
				expr(0);
				setState(338);
				match(T__2);
				}
				break;
			case NUM:
				{
				_localctx = new NumExprTagContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(340);
				match(NUM);
				}
				break;
			case ID:
				{
				_localctx = new IdTagContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(341);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(358);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(356);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
					case 1:
						{
						_localctx = new MulExprTagContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(344);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(345);
						match(MUL);
						setState(346);
						expr(7);
						}
						break;
					case 2:
						{
						_localctx = new DivExprTagContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(347);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(348);
						match(DIV);
						setState(349);
						expr(6);
						}
						break;
					case 3:
						{
						_localctx = new AddExprTagContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(350);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(351);
						match(ADD);
						setState(352);
						expr(5);
						}
						break;
					case 4:
						{
						_localctx = new SubExprTagContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(353);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(354);
						match(SUB);
						setState(355);
						expr(4);
						}
						break;
					}
					} 
				}
				setState(360);
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
		case 11:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u016c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\3\3\3\3\3\7\3!\n\3\f\3\16\3$\13\3\3"+
		"\3\5\3\'\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\62\n\4\3\5\3\5\7"+
		"\5\66\n\5\f\5\16\59\13\5\3\5\3\5\7\5=\n\5\f\5\16\5@\13\5\3\5\3\5\7\5D"+
		"\n\5\f\5\16\5G\13\5\3\5\3\5\7\5K\n\5\f\5\16\5N\13\5\3\5\3\5\3\5\5\5S\n"+
		"\5\3\6\3\6\7\6W\n\6\f\6\16\6Z\13\6\3\6\3\6\7\6^\n\6\f\6\16\6a\13\6\3\6"+
		"\3\6\7\6e\n\6\f\6\16\6h\13\6\3\6\3\6\7\6l\n\6\f\6\16\6o\13\6\3\6\3\6\3"+
		"\7\3\7\7\7u\n\7\f\7\16\7x\13\7\3\7\3\7\7\7|\n\7\f\7\16\7\177\13\7\3\7"+
		"\3\7\7\7\u0083\n\7\f\7\16\7\u0086\13\7\3\7\3\7\7\7\u008a\n\7\f\7\16\7"+
		"\u008d\13\7\3\7\3\7\7\7\u0091\n\7\f\7\16\7\u0094\13\7\3\7\3\7\7\7\u0098"+
		"\n\7\f\7\16\7\u009b\13\7\3\7\3\7\7\7\u009f\n\7\f\7\16\7\u00a2\13\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\t\3\t\7\t\u00ac\n\t\f\t\16\t\u00af\13\t\3\t\3\t"+
		"\7\t\u00b3\n\t\f\t\16\t\u00b6\13\t\3\t\3\t\7\t\u00ba\n\t\f\t\16\t\u00bd"+
		"\13\t\3\t\7\t\u00c0\n\t\f\t\16\t\u00c3\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00e8\n\n\3\13\3\13\7"+
		"\13\u00ec\n\13\f\13\16\13\u00ef\13\13\3\13\3\13\3\13\7\13\u00f4\n\13\f"+
		"\13\16\13\u00f7\13\13\3\13\3\13\3\13\3\13\7\13\u00fd\n\13\f\13\16\13\u0100"+
		"\13\13\3\13\3\13\7\13\u0104\n\13\f\13\16\13\u0107\13\13\3\13\5\13\u010a"+
		"\n\13\3\f\3\f\7\f\u010e\n\f\f\f\16\f\u0111\13\f\3\f\3\f\3\f\7\f\u0116"+
		"\n\f\f\f\16\f\u0119\13\f\3\f\3\f\3\f\3\f\7\f\u011f\n\f\f\f\16\f\u0122"+
		"\13\f\3\f\3\f\3\f\7\f\u0127\n\f\f\f\16\f\u012a\13\f\3\f\3\f\3\f\3\f\7"+
		"\f\u0130\n\f\f\f\16\f\u0133\13\f\3\f\3\f\3\f\7\f\u0138\n\f\f\f\16\f\u013b"+
		"\13\f\3\f\3\f\3\f\3\f\7\f\u0141\n\f\f\f\16\f\u0144\13\f\3\f\3\f\3\f\7"+
		"\f\u0149\n\f\f\f\16\f\u014c\13\f\3\f\3\f\5\f\u0150\n\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\5\r\u0159\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\7\r\u0167\n\r\f\r\16\r\u016a\13\r\3\r\2\3\30\16\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\2\2\2\u019c\2\32\3\2\2\2\4\35\3\2\2\2\6\61\3\2\2\2\b\63\3"+
		"\2\2\2\nT\3\2\2\2\fr\3\2\2\2\16\u00a5\3\2\2\2\20\u00a9\3\2\2\2\22\u00e7"+
		"\3\2\2\2\24\u0109\3\2\2\2\26\u014f\3\2\2\2\30\u0158\3\2\2\2\32\33\5\4"+
		"\3\2\33\34\7\2\2\3\34\3\3\2\2\2\35\"\5\6\4\2\36\37\7\3\2\2\37!\5\6\4\2"+
		" \36\3\2\2\2!$\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#&\3\2\2\2$\"\3\2\2\2%\'\7"+
		"\3\2\2&%\3\2\2\2&\'\3\2\2\2\'\5\3\2\2\2(\62\5\16\b\2)\62\5\b\5\2*\62\5"+
		"\f\7\2+\62\5\n\6\2,\62\5\22\n\2-\62\5\24\13\2.\62\5\26\f\2/\62\5\30\r"+
		"\2\60\62\5\20\t\2\61(\3\2\2\2\61)\3\2\2\2\61*\3\2\2\2\61+\3\2\2\2\61,"+
		"\3\2\2\2\61-\3\2\2\2\61.\3\2\2\2\61/\3\2\2\2\61\60\3\2\2\2\62\7\3\2\2"+
		"\2\63\67\7\27\2\2\64\66\7\"\2\2\65\64\3\2\2\2\669\3\2\2\2\67\65\3\2\2"+
		"\2\678\3\2\2\28:\3\2\2\29\67\3\2\2\2:>\7\4\2\2;=\7\"\2\2<;\3\2\2\2=@\3"+
		"\2\2\2><\3\2\2\2>?\3\2\2\2?A\3\2\2\2@>\3\2\2\2AE\5\22\n\2BD\7\"\2\2CB"+
		"\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2FH\3\2\2\2GE\3\2\2\2HL\7\5\2\2I"+
		"K\7\"\2\2JI\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MO\3\2\2\2NL\3\2\2\2"+
		"OR\5\6\4\2PQ\7\30\2\2QS\5\6\4\2RP\3\2\2\2RS\3\2\2\2S\t\3\2\2\2TX\7\31"+
		"\2\2UW\7\"\2\2VU\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y[\3\2\2\2ZX\3\2"+
		"\2\2[_\7\4\2\2\\^\7\"\2\2]\\\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`b\3"+
		"\2\2\2a_\3\2\2\2bf\5\22\n\2ce\7\"\2\2dc\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg"+
		"\3\2\2\2gi\3\2\2\2hf\3\2\2\2im\7\5\2\2jl\7\"\2\2kj\3\2\2\2lo\3\2\2\2m"+
		"k\3\2\2\2mn\3\2\2\2np\3\2\2\2om\3\2\2\2pq\5\6\4\2q\13\3\2\2\2rv\7\32\2"+
		"\2su\7\"\2\2ts\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2wy\3\2\2\2xv\3\2\2"+
		"\2y}\7\4\2\2z|\7\"\2\2{z\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\u0080"+
		"\3\2\2\2\177}\3\2\2\2\u0080\u0084\5\6\4\2\u0081\u0083\7\"\2\2\u0082\u0081"+
		"\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085"+
		"\u0087\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u008b\7\3\2\2\u0088\u008a\7\""+
		"\2\2\u0089\u0088\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\u008e\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u0092\5\22"+
		"\n\2\u008f\u0091\7\"\2\2\u0090\u008f\3\2\2\2\u0091\u0094\3\2\2\2\u0092"+
		"\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0095\3\2\2\2\u0094\u0092\3\2"+
		"\2\2\u0095\u0099\7\3\2\2\u0096\u0098\7\"\2\2\u0097\u0096\3\2\2\2\u0098"+
		"\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009c\3\2"+
		"\2\2\u009b\u0099\3\2\2\2\u009c\u00a0\5\6\4\2\u009d\u009f\7\"\2\2\u009e"+
		"\u009d\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2"+
		"\2\2\u00a1\u00a3\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a4\7\5\2\2\u00a4"+
		"\r\3\2\2\2\u00a5\u00a6\7#\2\2\u00a6\u00a7\7\6\2\2\u00a7\u00a8\5\30\r\2"+
		"\u00a8\17\3\2\2\2\u00a9\u00ad\7\26\2\2\u00aa\u00ac\7\"\2\2\u00ab\u00aa"+
		"\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae"+
		"\u00b0\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00c1\5\30\r\2\u00b1\u00b3\7"+
		"\"\2\2\u00b2\u00b1\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4"+
		"\u00b5\3\2\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00bb\7\7"+
		"\2\2\u00b8\u00ba\7\"\2\2\u00b9\u00b8\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb"+
		"\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00be\3\2\2\2\u00bd\u00bb\3\2"+
		"\2\2\u00be\u00c0\5\30\r\2\u00bf\u00b4\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1"+
		"\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\21\3\2\2\2\u00c3\u00c1\3\2\2"+
		"\2\u00c4\u00e8\5\30\r\2\u00c5\u00c6\7\b\2\2\u00c6\u00e8\5\30\r\2\u00c7"+
		"\u00c8\5\30\r\2\u00c8\u00c9\7\t\2\2\u00c9\u00ca\5\30\r\2\u00ca\u00e8\3"+
		"\2\2\2\u00cb\u00cc\5\30\r\2\u00cc\u00cd\7\n\2\2\u00cd\u00ce\5\30\r\2\u00ce"+
		"\u00e8\3\2\2\2\u00cf\u00d0\5\30\r\2\u00d0\u00d1\7\13\2\2\u00d1\u00d2\5"+
		"\30\r\2\u00d2\u00e8\3\2\2\2\u00d3\u00d4\5\30\r\2\u00d4\u00d5\7\n\2\2\u00d5"+
		"\u00d6\5\30\r\2\u00d6\u00e8\3\2\2\2\u00d7\u00d8\5\30\r\2\u00d8\u00d9\7"+
		"\f\2\2\u00d9\u00da\5\30\r\2\u00da\u00e8\3\2\2\2\u00db\u00dc\5\30\r\2\u00dc"+
		"\u00dd\7\r\2\2\u00dd\u00de\5\30\r\2\u00de\u00e8\3\2\2\2\u00df\u00e0\5"+
		"\30\r\2\u00e0\u00e1\7\16\2\2\u00e1\u00e2\5\30\r\2\u00e2\u00e8\3\2\2\2"+
		"\u00e3\u00e4\5\30\r\2\u00e4\u00e5\7\17\2\2\u00e5\u00e6\5\30\r\2\u00e6"+
		"\u00e8\3\2\2\2\u00e7\u00c4\3\2\2\2\u00e7\u00c5\3\2\2\2\u00e7\u00c7\3\2"+
		"\2\2\u00e7\u00cb\3\2\2\2\u00e7\u00cf\3\2\2\2\u00e7\u00d3\3\2\2\2\u00e7"+
		"\u00d7\3\2\2\2\u00e7\u00db\3\2\2\2\u00e7\u00df\3\2\2\2\u00e7\u00e3\3\2"+
		"\2\2\u00e8\23\3\2\2\2\u00e9\u00ed\7\20\2\2\u00ea\u00ec\7\"\2\2\u00eb\u00ea"+
		"\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee"+
		"\u00f0\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00f1\7\4\2\2\u00f1\u00f5\5\30"+
		"\r\2\u00f2\u00f4\7\"\2\2\u00f3\u00f2\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5"+
		"\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f8\3\2\2\2\u00f7\u00f5\3\2"+
		"\2\2\u00f8\u00f9\7\5\2\2\u00f9\u010a\3\2\2\2\u00fa\u00fe\7\21\2\2\u00fb"+
		"\u00fd\7\"\2\2\u00fc\u00fb\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2"+
		"\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0101\3\2\2\2\u0100\u00fe\3\2\2\2\u0101"+
		"\u0105\7\4\2\2\u0102\u0104\7\"\2\2\u0103\u0102\3\2\2\2\u0104\u0107\3\2"+
		"\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0108\3\2\2\2\u0107"+
		"\u0105\3\2\2\2\u0108\u010a\7\5\2\2\u0109\u00e9\3\2\2\2\u0109\u00fa\3\2"+
		"\2\2\u010a\25\3\2\2\2\u010b\u010f\7\22\2\2\u010c\u010e\7\"\2\2\u010d\u010c"+
		"\3\2\2\2\u010e\u0111\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110"+
		"\u0112\3\2\2\2\u0111\u010f\3\2\2\2\u0112\u0113\7\4\2\2\u0113\u0117\5\30"+
		"\r\2\u0114\u0116\7\"\2\2\u0115\u0114\3\2\2\2\u0116\u0119\3\2\2\2\u0117"+
		"\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u011a\3\2\2\2\u0119\u0117\3\2"+
		"\2\2\u011a\u011b\7\5\2\2\u011b\u0150\3\2\2\2\u011c\u0120\7\23\2\2\u011d"+
		"\u011f\7\"\2\2\u011e\u011d\3\2\2\2\u011f\u0122\3\2\2\2\u0120\u011e\3\2"+
		"\2\2\u0120\u0121\3\2\2\2\u0121\u0123\3\2\2\2\u0122\u0120\3\2\2\2\u0123"+
		"\u0124\7\4\2\2\u0124\u0128\5\30\r\2\u0125\u0127\7\"\2\2\u0126\u0125\3"+
		"\2\2\2\u0127\u012a\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129"+
		"\u012b\3\2\2\2\u012a\u0128\3\2\2\2\u012b\u012c\7\5\2\2\u012c\u0150\3\2"+
		"\2\2\u012d\u0131\7\24\2\2\u012e\u0130\7\"\2\2\u012f\u012e\3\2\2\2\u0130"+
		"\u0133\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0134\3\2"+
		"\2\2\u0133\u0131\3\2\2\2\u0134\u0135\7\4\2\2\u0135\u0139\5\30\r\2\u0136"+
		"\u0138\7\"\2\2\u0137\u0136\3\2\2\2\u0138\u013b\3\2\2\2\u0139\u0137\3\2"+
		"\2\2\u0139\u013a\3\2\2\2\u013a\u013c\3\2\2\2\u013b\u0139\3\2\2\2\u013c"+
		"\u013d\7\5\2\2\u013d\u0150\3\2\2\2\u013e\u0142\7\25\2\2\u013f\u0141\7"+
		"\"\2\2\u0140\u013f\3\2\2\2\u0141\u0144\3\2\2\2\u0142\u0140\3\2\2\2\u0142"+
		"\u0143\3\2\2\2\u0143\u0145\3\2\2\2\u0144\u0142\3\2\2\2\u0145\u0146\7\4"+
		"\2\2\u0146\u014a\5\30\r\2\u0147\u0149\7\"\2\2\u0148\u0147\3\2\2\2\u0149"+
		"\u014c\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014d\3\2"+
		"\2\2\u014c\u014a\3\2\2\2\u014d\u014e\7\5\2\2\u014e\u0150\3\2\2\2\u014f"+
		"\u010b\3\2\2\2\u014f\u011c\3\2\2\2\u014f\u012d\3\2\2\2\u014f\u013e\3\2"+
		"\2\2\u0150\27\3\2\2\2\u0151\u0152\b\r\1\2\u0152\u0153\7\4\2\2\u0153\u0154"+
		"\5\30\r\2\u0154\u0155\7\5\2\2\u0155\u0159\3\2\2\2\u0156\u0159\7\33\2\2"+
		"\u0157\u0159\7#\2\2\u0158\u0151\3\2\2\2\u0158\u0156\3\2\2\2\u0158\u0157"+
		"\3\2\2\2\u0159\u0168\3\2\2\2\u015a\u015b\f\b\2\2\u015b\u015c\7!\2\2\u015c"+
		"\u0167\5\30\r\t\u015d\u015e\f\7\2\2\u015e\u015f\7 \2\2\u015f\u0167\5\30"+
		"\r\b\u0160\u0161\f\6\2\2\u0161\u0162\7\37\2\2\u0162\u0167\5\30\r\7\u0163"+
		"\u0164\f\5\2\2\u0164\u0165\7\36\2\2\u0165\u0167\5\30\r\6\u0166\u015a\3"+
		"\2\2\2\u0166\u015d\3\2\2\2\u0166\u0160\3\2\2\2\u0166\u0163\3\2\2\2\u0167"+
		"\u016a\3\2\2\2\u0168\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169\31\3\2\2"+
		"\2\u016a\u0168\3\2\2\2+\"&\61\67>ELRX_fmv}\u0084\u008b\u0092\u0099\u00a0"+
		"\u00ad\u00b4\u00bb\u00c1\u00e7\u00ed\u00f5\u00fe\u0105\u0109\u010f\u0117"+
		"\u0120\u0128\u0131\u0139\u0142\u014a\u014f\u0158\u0166\u0168";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}