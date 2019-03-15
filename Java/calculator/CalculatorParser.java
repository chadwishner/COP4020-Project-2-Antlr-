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
		WS=1, OPAR=2, CPAR=3, S=4, C=5, L=6, E=7, COMMA=8, SEMICOLON=9, SQRT=10, 
		READ=11, PRINT=12, IF=13, ELSE=14, WHILE=15, FOR=16, NUM=17, COM=18, SUB=19, 
		ADD=20, DIV=21, MUL=22, EQ=23, ASSIGN=24, NEQ=25, GRE=26, GREQ=27, LT=28, 
		LTEQ=29, AND=30, OR=31, NOT=32, ID=33;
	public static final int
		RULE_exprList = 0, RULE_topExpr = 1, RULE_ifDef = 2, RULE_whileDef = 3, 
		RULE_forDef = 4, RULE_varDef = 5, RULE_printFunc = 6, RULE_boolExpr = 7, 
		RULE_specialExpr = 8, RULE_libraryFunc = 9, RULE_expr = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"exprList", "topExpr", "ifDef", "whileDef", "forDef", "varDef", "printFunc", 
			"boolExpr", "specialExpr", "libraryFunc", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'('", "')'", "'s'", "'c'", "'l'", "'e'", "','", "';'", "'sqrt'", 
			"'read'", "'print'", "'if'", "'else'", "'while'", "'for'", null, null, 
			"'-'", "'+'", "'/'", "'*'", "'=='", "'='", "'!='", "'>'", "'>='", "'<'", 
			"'<='", "'&&'", "'||'", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "OPAR", "CPAR", "S", "C", "L", "E", "COMMA", "SEMICOLON", 
			"SQRT", "READ", "PRINT", "IF", "ELSE", "WHILE", "FOR", "NUM", "COM", 
			"SUB", "ADD", "DIV", "MUL", "EQ", "ASSIGN", "NEQ", "GRE", "GREQ", "LT", 
			"LTEQ", "AND", "OR", "NOT", "ID"
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
		public TerminalNode EOF() { return getToken(CalculatorParser.EOF, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(CalculatorParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(CalculatorParser.SEMICOLON, i);
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
		enterRule(_localctx, 0, RULE_exprList);
		int _la;
		try {
			int _alt;
			_localctx = new ExprListTagContext(_localctx);
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
					match(SEMICOLON);
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
			if (_la==SEMICOLON) {
				{
				setState(30);
				match(SEMICOLON);
				}
			}

			setState(33);
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
		enterRule(_localctx, 2, RULE_topExpr);
		try {
			setState(44);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				varDef();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				ifDef();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(37);
				forDef();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(38);
				whileDef();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(39);
				boolExpr();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(40);
				specialExpr();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(41);
				libraryFunc();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(42);
				expr(0);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(43);
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
		public TerminalNode OPAR() { return getToken(CalculatorParser.OPAR, 0); }
		public TerminalNode CPAR() { return getToken(CalculatorParser.CPAR, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public List<TopExprContext> topExpr() {
			return getRuleContexts(TopExprContext.class);
		}
		public TopExprContext topExpr(int i) {
			return getRuleContext(TopExprContext.class,i);
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
		enterRule(_localctx, 4, RULE_ifDef);
		try {
			_localctx = new IfDefTagContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(IF);
			setState(47);
			match(OPAR);
			setState(48);
			((IfDefTagContext)_localctx).cond = boolExpr();
			setState(49);
			match(CPAR);
			setState(50);
			((IfDefTagContext)_localctx).expr1 = topExpr();
			setState(53);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(51);
				match(ELSE);
				setState(52);
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
		public TerminalNode OPAR() { return getToken(CalculatorParser.OPAR, 0); }
		public TerminalNode CPAR() { return getToken(CalculatorParser.CPAR, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public TopExprContext topExpr() {
			return getRuleContext(TopExprContext.class,0);
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
		enterRule(_localctx, 6, RULE_whileDef);
		try {
			_localctx = new WhileDefTagContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(WHILE);
			setState(56);
			match(OPAR);
			setState(57);
			((WhileDefTagContext)_localctx).cond = boolExpr();
			setState(58);
			match(CPAR);
			setState(59);
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
		public TerminalNode OPAR() { return getToken(CalculatorParser.OPAR, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(CalculatorParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(CalculatorParser.SEMICOLON, i);
		}
		public TerminalNode CPAR() { return getToken(CalculatorParser.CPAR, 0); }
		public List<TopExprContext> topExpr() {
			return getRuleContexts(TopExprContext.class);
		}
		public TopExprContext topExpr(int i) {
			return getRuleContext(TopExprContext.class,i);
		}
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
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
		enterRule(_localctx, 8, RULE_forDef);
		try {
			_localctx = new ForDefTagContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(FOR);
			setState(62);
			match(OPAR);
			setState(63);
			((ForDefTagContext)_localctx).expr1 = topExpr();
			setState(64);
			match(SEMICOLON);
			setState(65);
			((ForDefTagContext)_localctx).cond = boolExpr();
			setState(66);
			match(SEMICOLON);
			setState(67);
			((ForDefTagContext)_localctx).expr2 = topExpr();
			setState(68);
			match(CPAR);
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
		public TerminalNode ASSIGN() { return getToken(CalculatorParser.ASSIGN, 0); }
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
		enterRule(_localctx, 10, RULE_varDef);
		try {
			_localctx = new VarDefTagContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(ID);
			setState(71);
			match(ASSIGN);
			setState(72);
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
		public List<TerminalNode> COMMA() { return getTokens(CalculatorParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CalculatorParser.COMMA, i);
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
		enterRule(_localctx, 12, RULE_printFunc);
		int _la;
		try {
			_localctx = new PrintFuncTagContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(PRINT);
			setState(75);
			expr(0);
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(76);
				match(COMMA);
				setState(77);
				expr(0);
				}
				}
				setState(82);
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
		public TerminalNode NEQ() { return getToken(CalculatorParser.NEQ, 0); }
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
		public TerminalNode GREQ() { return getToken(CalculatorParser.GREQ, 0); }
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
		public TerminalNode LT() { return getToken(CalculatorParser.LT, 0); }
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
		public TerminalNode GRE() { return getToken(CalculatorParser.GRE, 0); }
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
		public TerminalNode OR() { return getToken(CalculatorParser.OR, 0); }
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
		public TerminalNode NOT() { return getToken(CalculatorParser.NOT, 0); }
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
		public TerminalNode LTEQ() { return getToken(CalculatorParser.LTEQ, 0); }
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
		public TerminalNode EQ() { return getToken(CalculatorParser.EQ, 0); }
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
		public TerminalNode AND() { return getToken(CalculatorParser.AND, 0); }
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
		enterRule(_localctx, 14, RULE_boolExpr);
		try {
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new ExprBoolTagContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				expr(0);
				}
				break;
			case 2:
				_localctx = new NotBoolTagContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				((NotBoolTagContext)_localctx).op = match(NOT);
				setState(85);
				expr(0);
				}
				break;
			case 3:
				_localctx = new GtBoolTagContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(86);
				expr(0);
				setState(87);
				((GtBoolTagContext)_localctx).op = match(GRE);
				setState(88);
				expr(0);
				}
				break;
			case 4:
				_localctx = new GteBoolTagContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(90);
				expr(0);
				setState(91);
				((GteBoolTagContext)_localctx).op = match(GREQ);
				setState(92);
				expr(0);
				}
				break;
			case 5:
				_localctx = new LtBoolTagContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(94);
				expr(0);
				setState(95);
				((LtBoolTagContext)_localctx).op = match(LT);
				setState(96);
				expr(0);
				}
				break;
			case 6:
				_localctx = new LteBoolTagContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(98);
				expr(0);
				setState(99);
				((LteBoolTagContext)_localctx).op = match(LTEQ);
				setState(100);
				expr(0);
				}
				break;
			case 7:
				_localctx = new EqBoolTagContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(102);
				expr(0);
				setState(103);
				((EqBoolTagContext)_localctx).op = match(EQ);
				setState(104);
				expr(0);
				}
				break;
			case 8:
				_localctx = new NeqBoolTagContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(106);
				expr(0);
				setState(107);
				((NeqBoolTagContext)_localctx).op = match(NEQ);
				setState(108);
				expr(0);
				}
				break;
			case 9:
				_localctx = new AndBoolTagContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(110);
				expr(0);
				setState(111);
				((AndBoolTagContext)_localctx).op = match(AND);
				setState(112);
				expr(0);
				}
				break;
			case 10:
				_localctx = new OrBoolTagContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(114);
				expr(0);
				setState(115);
				((OrBoolTagContext)_localctx).op = match(OR);
				setState(116);
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
		public TerminalNode READ() { return getToken(CalculatorParser.READ, 0); }
		public TerminalNode OPAR() { return getToken(CalculatorParser.OPAR, 0); }
		public TerminalNode CPAR() { return getToken(CalculatorParser.CPAR, 0); }
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
		public TerminalNode SQRT() { return getToken(CalculatorParser.SQRT, 0); }
		public TerminalNode OPAR() { return getToken(CalculatorParser.OPAR, 0); }
		public TerminalNode CPAR() { return getToken(CalculatorParser.CPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
		enterRule(_localctx, 16, RULE_specialExpr);
		try {
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SQRT:
				_localctx = new SqrtExprTagContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				match(SQRT);
				setState(121);
				match(OPAR);
				setState(122);
				((SqrtExprTagContext)_localctx).value = expr(0);
				setState(123);
				match(CPAR);
				}
				break;
			case READ:
				_localctx = new ReadExprTagContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				match(READ);
				setState(126);
				match(OPAR);
				setState(127);
				match(CPAR);
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
		public TerminalNode E() { return getToken(CalculatorParser.E, 0); }
		public TerminalNode OPAR() { return getToken(CalculatorParser.OPAR, 0); }
		public TerminalNode CPAR() { return getToken(CalculatorParser.CPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
		public TerminalNode S() { return getToken(CalculatorParser.S, 0); }
		public TerminalNode OPAR() { return getToken(CalculatorParser.OPAR, 0); }
		public TerminalNode CPAR() { return getToken(CalculatorParser.CPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
		public TerminalNode L() { return getToken(CalculatorParser.L, 0); }
		public TerminalNode OPAR() { return getToken(CalculatorParser.OPAR, 0); }
		public TerminalNode CPAR() { return getToken(CalculatorParser.CPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
		public TerminalNode C() { return getToken(CalculatorParser.C, 0); }
		public TerminalNode OPAR() { return getToken(CalculatorParser.OPAR, 0); }
		public TerminalNode CPAR() { return getToken(CalculatorParser.CPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
		enterRule(_localctx, 18, RULE_libraryFunc);
		try {
			setState(150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case S:
				_localctx = new SinFuncTagContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				match(S);
				setState(131);
				match(OPAR);
				setState(132);
				((SinFuncTagContext)_localctx).var = expr(0);
				setState(133);
				match(CPAR);
				}
				break;
			case C:
				_localctx = new CosFuncTagContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				match(C);
				setState(136);
				match(OPAR);
				setState(137);
				((CosFuncTagContext)_localctx).var = expr(0);
				setState(138);
				match(CPAR);
				}
				break;
			case L:
				_localctx = new LogFuncTagContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(140);
				match(L);
				setState(141);
				match(OPAR);
				setState(142);
				((LogFuncTagContext)_localctx).var = expr(0);
				setState(143);
				match(CPAR);
				}
				break;
			case E:
				_localctx = new ExpFuncTagContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(145);
				match(E);
				setState(146);
				match(OPAR);
				setState(147);
				((ExpFuncTagContext)_localctx).var = expr(0);
				setState(148);
				match(CPAR);
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
		public TerminalNode OPAR() { return getToken(CalculatorParser.OPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(CalculatorParser.CPAR, 0); }
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPAR:
				{
				_localctx = new ParenExprTagContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(153);
				match(OPAR);
				setState(154);
				expr(0);
				setState(155);
				match(CPAR);
				}
				break;
			case NUM:
				{
				_localctx = new NumExprTagContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(157);
				match(NUM);
				}
				break;
			case ID:
				{
				_localctx = new IdTagContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(158);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(175);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(173);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new MulExprTagContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(161);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(162);
						match(MUL);
						setState(163);
						expr(7);
						}
						break;
					case 2:
						{
						_localctx = new DivExprTagContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(164);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(165);
						match(DIV);
						setState(166);
						expr(6);
						}
						break;
					case 3:
						{
						_localctx = new AddExprTagContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(167);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(168);
						match(ADD);
						setState(169);
						expr(5);
						}
						break;
					case 4:
						{
						_localctx = new SubExprTagContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(170);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(171);
						match(SUB);
						setState(172);
						expr(4);
						}
						break;
					}
					} 
				}
				setState(177);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u00b5\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\3\2\7\2\34\n\2\f\2\16\2\37\13\2\3\2\5\2\"\n\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3/\n\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\5\48\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\7\bQ\n\b\f\b\16\bT\13\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\ty"+
		"\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0083\n\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\5\13\u0099\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00a2\n\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00b0\n\f\f\f\16\f"+
		"\u00b3\13\f\3\f\2\3\26\r\2\4\6\b\n\f\16\20\22\24\26\2\2\2\u00c8\2\30\3"+
		"\2\2\2\4.\3\2\2\2\6\60\3\2\2\2\b9\3\2\2\2\n?\3\2\2\2\fH\3\2\2\2\16L\3"+
		"\2\2\2\20x\3\2\2\2\22\u0082\3\2\2\2\24\u0098\3\2\2\2\26\u00a1\3\2\2\2"+
		"\30\35\5\4\3\2\31\32\7\13\2\2\32\34\5\4\3\2\33\31\3\2\2\2\34\37\3\2\2"+
		"\2\35\33\3\2\2\2\35\36\3\2\2\2\36!\3\2\2\2\37\35\3\2\2\2 \"\7\13\2\2!"+
		" \3\2\2\2!\"\3\2\2\2\"#\3\2\2\2#$\7\2\2\3$\3\3\2\2\2%/\5\f\7\2&/\5\6\4"+
		"\2\'/\5\n\6\2(/\5\b\5\2)/\5\20\t\2*/\5\22\n\2+/\5\24\13\2,/\5\26\f\2-"+
		"/\5\16\b\2.%\3\2\2\2.&\3\2\2\2.\'\3\2\2\2.(\3\2\2\2.)\3\2\2\2.*\3\2\2"+
		"\2.+\3\2\2\2.,\3\2\2\2.-\3\2\2\2/\5\3\2\2\2\60\61\7\17\2\2\61\62\7\4\2"+
		"\2\62\63\5\20\t\2\63\64\7\5\2\2\64\67\5\4\3\2\65\66\7\20\2\2\668\5\4\3"+
		"\2\67\65\3\2\2\2\678\3\2\2\28\7\3\2\2\29:\7\21\2\2:;\7\4\2\2;<\5\20\t"+
		"\2<=\7\5\2\2=>\5\4\3\2>\t\3\2\2\2?@\7\22\2\2@A\7\4\2\2AB\5\4\3\2BC\7\13"+
		"\2\2CD\5\20\t\2DE\7\13\2\2EF\5\4\3\2FG\7\5\2\2G\13\3\2\2\2HI\7#\2\2IJ"+
		"\7\32\2\2JK\5\26\f\2K\r\3\2\2\2LM\7\16\2\2MR\5\26\f\2NO\7\n\2\2OQ\5\26"+
		"\f\2PN\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2S\17\3\2\2\2TR\3\2\2\2Uy\5"+
		"\26\f\2VW\7\"\2\2Wy\5\26\f\2XY\5\26\f\2YZ\7\34\2\2Z[\5\26\f\2[y\3\2\2"+
		"\2\\]\5\26\f\2]^\7\35\2\2^_\5\26\f\2_y\3\2\2\2`a\5\26\f\2ab\7\36\2\2b"+
		"c\5\26\f\2cy\3\2\2\2de\5\26\f\2ef\7\37\2\2fg\5\26\f\2gy\3\2\2\2hi\5\26"+
		"\f\2ij\7\31\2\2jk\5\26\f\2ky\3\2\2\2lm\5\26\f\2mn\7\33\2\2no\5\26\f\2"+
		"oy\3\2\2\2pq\5\26\f\2qr\7 \2\2rs\5\26\f\2sy\3\2\2\2tu\5\26\f\2uv\7!\2"+
		"\2vw\5\26\f\2wy\3\2\2\2xU\3\2\2\2xV\3\2\2\2xX\3\2\2\2x\\\3\2\2\2x`\3\2"+
		"\2\2xd\3\2\2\2xh\3\2\2\2xl\3\2\2\2xp\3\2\2\2xt\3\2\2\2y\21\3\2\2\2z{\7"+
		"\f\2\2{|\7\4\2\2|}\5\26\f\2}~\7\5\2\2~\u0083\3\2\2\2\177\u0080\7\r\2\2"+
		"\u0080\u0081\7\4\2\2\u0081\u0083\7\5\2\2\u0082z\3\2\2\2\u0082\177\3\2"+
		"\2\2\u0083\23\3\2\2\2\u0084\u0085\7\6\2\2\u0085\u0086\7\4\2\2\u0086\u0087"+
		"\5\26\f\2\u0087\u0088\7\5\2\2\u0088\u0099\3\2\2\2\u0089\u008a\7\7\2\2"+
		"\u008a\u008b\7\4\2\2\u008b\u008c\5\26\f\2\u008c\u008d\7\5\2\2\u008d\u0099"+
		"\3\2\2\2\u008e\u008f\7\b\2\2\u008f\u0090\7\4\2\2\u0090\u0091\5\26\f\2"+
		"\u0091\u0092\7\5\2\2\u0092\u0099\3\2\2\2\u0093\u0094\7\t\2\2\u0094\u0095"+
		"\7\4\2\2\u0095\u0096\5\26\f\2\u0096\u0097\7\5\2\2\u0097\u0099\3\2\2\2"+
		"\u0098\u0084\3\2\2\2\u0098\u0089\3\2\2\2\u0098\u008e\3\2\2\2\u0098\u0093"+
		"\3\2\2\2\u0099\25\3\2\2\2\u009a\u009b\b\f\1\2\u009b\u009c\7\4\2\2\u009c"+
		"\u009d\5\26\f\2\u009d\u009e\7\5\2\2\u009e\u00a2\3\2\2\2\u009f\u00a2\7"+
		"\23\2\2\u00a0\u00a2\7#\2\2\u00a1\u009a\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1"+
		"\u00a0\3\2\2\2\u00a2\u00b1\3\2\2\2\u00a3\u00a4\f\b\2\2\u00a4\u00a5\7\30"+
		"\2\2\u00a5\u00b0\5\26\f\t\u00a6\u00a7\f\7\2\2\u00a7\u00a8\7\27\2\2\u00a8"+
		"\u00b0\5\26\f\b\u00a9\u00aa\f\6\2\2\u00aa\u00ab\7\26\2\2\u00ab\u00b0\5"+
		"\26\f\7\u00ac\u00ad\f\5\2\2\u00ad\u00ae\7\25\2\2\u00ae\u00b0\5\26\f\6"+
		"\u00af\u00a3\3\2\2\2\u00af\u00a6\3\2\2\2\u00af\u00a9\3\2\2\2\u00af\u00ac"+
		"\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2"+
		"\27\3\2\2\2\u00b3\u00b1\3\2\2\2\r\35!.\67Rx\u0082\u0098\u00a1\u00af\u00b1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}