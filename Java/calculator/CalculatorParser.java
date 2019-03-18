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
		WS=1, IF=2, ELSE=3, OPAR=4, CPAR=5, OBRC=6, CBRC=7, S=8, C=9, L=10, E=11, 
		COMMA=12, SEMICOLON=13, DEFINE=14, AUTO=15, RETURN=16, SQRT=17, READ=18, 
		PRINT=19, WHILE=20, FOR=21, NUM=22, COM=23, SUB=24, ADD=25, DIV=26, MUL=27, 
		EQ=28, ASSIGN=29, NEQ=30, GRE=31, GREQ=32, LT=33, LTEQ=34, AND=35, OR=36, 
		NOT=37, ID=38;
	public static final int
		RULE_exprList = 0, RULE_codeBlock = 1, RULE_topExpr = 2, RULE_ifDef = 3, 
		RULE_whileDef = 4, RULE_forDef = 5, RULE_funcDef = 6, RULE_returnType = 7, 
		RULE_funcCall = 8, RULE_params = 9, RULE_paramValues = 10, RULE_autoVars = 11, 
		RULE_varDef = 12, RULE_printFunc = 13, RULE_boolExpr = 14, RULE_specialExpr = 15, 
		RULE_libraryFunc = 16, RULE_expr = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"exprList", "codeBlock", "topExpr", "ifDef", "whileDef", "forDef", "funcDef", 
			"returnType", "funcCall", "params", "paramValues", "autoVars", "varDef", 
			"printFunc", "boolExpr", "specialExpr", "libraryFunc", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'if'", "'else'", "'('", "')'", "'{'", "'}'", "'s'", "'c'", 
			"'l'", "'e'", "','", "';'", "'define'", "'auto'", "'return'", "'sqrt'", 
			"'read'", "'print'", "'while'", "'for'", null, null, "'-'", "'+'", "'/'", 
			"'*'", "'=='", "'='", "'!='", "'>'", "'>='", "'<'", "'<='", "'&&'", "'||'", 
			"'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "IF", "ELSE", "OPAR", "CPAR", "OBRC", "CBRC", "S", "C", "L", 
			"E", "COMMA", "SEMICOLON", "DEFINE", "AUTO", "RETURN", "SQRT", "READ", 
			"PRINT", "WHILE", "FOR", "NUM", "COM", "SUB", "ADD", "DIV", "MUL", "EQ", 
			"ASSIGN", "NEQ", "GRE", "GREQ", "LT", "LTEQ", "AND", "OR", "NOT", "ID"
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
		public TerminalNode EOF() { return getToken(CalculatorParser.EOF, 0); }
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
		enterRule(_localctx, 0, RULE_exprList);
		int _la;
		try {
			_localctx = new ExprListTagContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(37); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(36);
				topExpr();
				}
				}
				setState(39); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << OPAR) | (1L << S) | (1L << C) | (1L << L) | (1L << E) | (1L << DEFINE) | (1L << SQRT) | (1L << READ) | (1L << PRINT) | (1L << WHILE) | (1L << FOR) | (1L << NUM) | (1L << SUB) | (1L << NOT) | (1L << ID))) != 0) );
			setState(41);
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

	public static class CodeBlockContext extends ParserRuleContext {
		public CodeBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeBlock; }
	 
		public CodeBlockContext() { }
		public void copyFrom(CodeBlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CodeBlockTagContext extends CodeBlockContext {
		public List<TopExprContext> topExpr() {
			return getRuleContexts(TopExprContext.class);
		}
		public TopExprContext topExpr(int i) {
			return getRuleContext(TopExprContext.class,i);
		}
		public CodeBlockTagContext(CodeBlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterCodeBlockTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitCodeBlockTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitCodeBlockTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeBlockContext codeBlock() throws RecognitionException {
		CodeBlockContext _localctx = new CodeBlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_codeBlock);
		int _la;
		try {
			_localctx = new CodeBlockTagContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << OPAR) | (1L << S) | (1L << C) | (1L << L) | (1L << E) | (1L << DEFINE) | (1L << SQRT) | (1L << READ) | (1L << PRINT) | (1L << WHILE) | (1L << FOR) | (1L << NUM) | (1L << SUB) | (1L << NOT) | (1L << ID))) != 0)) {
				{
				{
				setState(43);
				topExpr();
				}
				}
				setState(48);
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

	public static class TopExprContext extends ParserRuleContext {
		public IfDefContext ifDef() {
			return getRuleContext(IfDefContext.class,0);
		}
		public ForDefContext forDef() {
			return getRuleContext(ForDefContext.class,0);
		}
		public WhileDefContext whileDef() {
			return getRuleContext(WhileDefContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CalculatorParser.SEMICOLON, 0); }
		public SpecialExprContext specialExpr() {
			return getRuleContext(SpecialExprContext.class,0);
		}
		public LibraryFuncContext libraryFunc() {
			return getRuleContext(LibraryFuncContext.class,0);
		}
		public PrintFuncContext printFunc() {
			return getRuleContext(PrintFuncContext.class,0);
		}
		public FuncDefContext funcDef() {
			return getRuleContext(FuncDefContext.class,0);
		}
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public VarDefContext varDef() {
			return getRuleContext(VarDefContext.class,0);
		}
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
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
			setState(74);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				ifDef();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				forDef();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(51);
				whileDef();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(52);
				expr(0);
				setState(53);
				match(SEMICOLON);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(55);
				specialExpr();
				setState(56);
				match(SEMICOLON);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(58);
				libraryFunc();
				setState(59);
				match(SEMICOLON);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(61);
				printFunc();
				setState(62);
				match(SEMICOLON);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(64);
				funcDef();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(65);
				funcCall();
				setState(66);
				match(SEMICOLON);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(68);
				varDef();
				setState(69);
				match(SEMICOLON);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(71);
				boolExpr();
				setState(72);
				match(SEMICOLON);
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
	public static class IfDefMultipleTagContext extends IfDefContext {
		public BoolExprContext cond;
		public CodeBlockContext exprList1;
		public CodeBlockContext exprList2;
		public TerminalNode IF() { return getToken(CalculatorParser.IF, 0); }
		public TerminalNode OPAR() { return getToken(CalculatorParser.OPAR, 0); }
		public TerminalNode CPAR() { return getToken(CalculatorParser.CPAR, 0); }
		public List<TerminalNode> OBRC() { return getTokens(CalculatorParser.OBRC); }
		public TerminalNode OBRC(int i) {
			return getToken(CalculatorParser.OBRC, i);
		}
		public List<TerminalNode> CBRC() { return getTokens(CalculatorParser.CBRC); }
		public TerminalNode CBRC(int i) {
			return getToken(CalculatorParser.CBRC, i);
		}
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public List<CodeBlockContext> codeBlock() {
			return getRuleContexts(CodeBlockContext.class);
		}
		public CodeBlockContext codeBlock(int i) {
			return getRuleContext(CodeBlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(CalculatorParser.ELSE, 0); }
		public IfDefMultipleTagContext(IfDefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterIfDefMultipleTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitIfDefMultipleTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitIfDefMultipleTag(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfDefSingleTagContext extends IfDefContext {
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
		public IfDefSingleTagContext(IfDefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterIfDefSingleTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitIfDefSingleTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitIfDefSingleTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfDefContext ifDef() throws RecognitionException {
		IfDefContext _localctx = new IfDefContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ifDef);
		try {
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new IfDefSingleTagContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				match(IF);
				setState(77);
				match(OPAR);
				setState(78);
				((IfDefSingleTagContext)_localctx).cond = boolExpr();
				setState(79);
				match(CPAR);
				setState(80);
				((IfDefSingleTagContext)_localctx).expr1 = topExpr();
				setState(83);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(81);
					match(ELSE);
					setState(82);
					((IfDefSingleTagContext)_localctx).expr2 = topExpr();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new IfDefMultipleTagContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				match(IF);
				setState(86);
				match(OPAR);
				setState(87);
				((IfDefMultipleTagContext)_localctx).cond = boolExpr();
				setState(88);
				match(CPAR);
				setState(89);
				match(OBRC);
				setState(90);
				((IfDefMultipleTagContext)_localctx).exprList1 = codeBlock();
				setState(91);
				match(CBRC);
				setState(97);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(92);
					match(ELSE);
					setState(93);
					match(OBRC);
					setState(94);
					((IfDefMultipleTagContext)_localctx).exprList2 = codeBlock();
					setState(95);
					match(CBRC);
					}
					break;
				}
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
	public static class WhileDefMultipleTagContext extends WhileDefContext {
		public BoolExprContext cond;
		public CodeBlockContext exec;
		public TerminalNode WHILE() { return getToken(CalculatorParser.WHILE, 0); }
		public TerminalNode OPAR() { return getToken(CalculatorParser.OPAR, 0); }
		public TerminalNode CPAR() { return getToken(CalculatorParser.CPAR, 0); }
		public TerminalNode OBRC() { return getToken(CalculatorParser.OBRC, 0); }
		public TerminalNode CBRC() { return getToken(CalculatorParser.CBRC, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public WhileDefMultipleTagContext(WhileDefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterWhileDefMultipleTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitWhileDefMultipleTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitWhileDefMultipleTag(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileDefSingleTagContext extends WhileDefContext {
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
		public WhileDefSingleTagContext(WhileDefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterWhileDefSingleTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitWhileDefSingleTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitWhileDefSingleTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileDefContext whileDef() throws RecognitionException {
		WhileDefContext _localctx = new WhileDefContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_whileDef);
		try {
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new WhileDefSingleTagContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				match(WHILE);
				setState(102);
				match(OPAR);
				setState(103);
				((WhileDefSingleTagContext)_localctx).cond = boolExpr();
				setState(104);
				match(CPAR);
				setState(105);
				((WhileDefSingleTagContext)_localctx).exec = topExpr();
				}
				break;
			case 2:
				_localctx = new WhileDefMultipleTagContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				match(WHILE);
				setState(108);
				match(OPAR);
				setState(109);
				((WhileDefMultipleTagContext)_localctx).cond = boolExpr();
				setState(110);
				match(CPAR);
				setState(111);
				match(OBRC);
				setState(112);
				((WhileDefMultipleTagContext)_localctx).exec = codeBlock();
				setState(113);
				match(CBRC);
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
	public static class ForDefMultipleTagContext extends ForDefContext {
		public VarDefContext expr1;
		public BoolExprContext cond;
		public VarDefContext expr2;
		public CodeBlockContext exec;
		public TerminalNode FOR() { return getToken(CalculatorParser.FOR, 0); }
		public TerminalNode OPAR() { return getToken(CalculatorParser.OPAR, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(CalculatorParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(CalculatorParser.SEMICOLON, i);
		}
		public TerminalNode CPAR() { return getToken(CalculatorParser.CPAR, 0); }
		public TerminalNode OBRC() { return getToken(CalculatorParser.OBRC, 0); }
		public TerminalNode CBRC() { return getToken(CalculatorParser.CBRC, 0); }
		public List<VarDefContext> varDef() {
			return getRuleContexts(VarDefContext.class);
		}
		public VarDefContext varDef(int i) {
			return getRuleContext(VarDefContext.class,i);
		}
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public ForDefMultipleTagContext(ForDefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterForDefMultipleTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitForDefMultipleTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitForDefMultipleTag(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForDefSingleTagContext extends ForDefContext {
		public VarDefContext expr1;
		public BoolExprContext cond;
		public VarDefContext expr2;
		public TopExprContext exec;
		public TerminalNode FOR() { return getToken(CalculatorParser.FOR, 0); }
		public TerminalNode OPAR() { return getToken(CalculatorParser.OPAR, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(CalculatorParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(CalculatorParser.SEMICOLON, i);
		}
		public TerminalNode CPAR() { return getToken(CalculatorParser.CPAR, 0); }
		public List<VarDefContext> varDef() {
			return getRuleContexts(VarDefContext.class);
		}
		public VarDefContext varDef(int i) {
			return getRuleContext(VarDefContext.class,i);
		}
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public TopExprContext topExpr() {
			return getRuleContext(TopExprContext.class,0);
		}
		public ForDefSingleTagContext(ForDefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterForDefSingleTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitForDefSingleTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitForDefSingleTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForDefContext forDef() throws RecognitionException {
		ForDefContext _localctx = new ForDefContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_forDef);
		try {
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new ForDefSingleTagContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				match(FOR);
				setState(118);
				match(OPAR);
				setState(119);
				((ForDefSingleTagContext)_localctx).expr1 = varDef();
				setState(120);
				match(SEMICOLON);
				setState(121);
				((ForDefSingleTagContext)_localctx).cond = boolExpr();
				setState(122);
				match(SEMICOLON);
				setState(123);
				((ForDefSingleTagContext)_localctx).expr2 = varDef();
				setState(124);
				match(CPAR);
				setState(125);
				((ForDefSingleTagContext)_localctx).exec = topExpr();
				}
				break;
			case 2:
				_localctx = new ForDefMultipleTagContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				match(FOR);
				setState(128);
				match(OPAR);
				setState(129);
				((ForDefMultipleTagContext)_localctx).expr1 = varDef();
				setState(130);
				match(SEMICOLON);
				setState(131);
				((ForDefMultipleTagContext)_localctx).cond = boolExpr();
				setState(132);
				match(SEMICOLON);
				setState(133);
				((ForDefMultipleTagContext)_localctx).expr2 = varDef();
				setState(134);
				match(CPAR);
				setState(135);
				match(OBRC);
				setState(136);
				((ForDefMultipleTagContext)_localctx).exec = codeBlock();
				setState(137);
				match(CBRC);
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

	public static class FuncDefContext extends ParserRuleContext {
		public FuncDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDef; }
	 
		public FuncDefContext() { }
		public void copyFrom(FuncDefContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FuncDefTagContext extends FuncDefContext {
		public Token funcName;
		public CodeBlockContext exec;
		public ReturnTypeContext returnExpr;
		public CodeBlockContext ignored;
		public TerminalNode DEFINE() { return getToken(CalculatorParser.DEFINE, 0); }
		public TerminalNode OBRC() { return getToken(CalculatorParser.OBRC, 0); }
		public TerminalNode RETURN() { return getToken(CalculatorParser.RETURN, 0); }
		public TerminalNode SEMICOLON() { return getToken(CalculatorParser.SEMICOLON, 0); }
		public TerminalNode CBRC() { return getToken(CalculatorParser.CBRC, 0); }
		public TerminalNode ID() { return getToken(CalculatorParser.ID, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public AutoVarsContext autoVars() {
			return getRuleContext(AutoVarsContext.class,0);
		}
		public List<CodeBlockContext> codeBlock() {
			return getRuleContexts(CodeBlockContext.class);
		}
		public CodeBlockContext codeBlock(int i) {
			return getRuleContext(CodeBlockContext.class,i);
		}
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public FuncDefTagContext(FuncDefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterFuncDefTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitFuncDefTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitFuncDefTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncDefContext funcDef() throws RecognitionException {
		FuncDefContext _localctx = new FuncDefContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_funcDef);
		int _la;
		try {
			_localctx = new FuncDefTagContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(DEFINE);
			setState(142);
			((FuncDefTagContext)_localctx).funcName = match(ID);
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPAR) {
				{
				setState(143);
				params();
				}
			}

			setState(146);
			match(OBRC);
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AUTO) {
				{
				setState(147);
				autoVars();
				}
			}

			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(150);
				((FuncDefTagContext)_localctx).exec = codeBlock();
				}
				break;
			}
			setState(153);
			match(RETURN);
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPAR) | (1L << NUM) | (1L << SUB) | (1L << NOT) | (1L << ID))) != 0)) {
				{
				setState(154);
				((FuncDefTagContext)_localctx).returnExpr = returnType();
				}
			}

			setState(157);
			match(SEMICOLON);
			setState(159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(158);
				((FuncDefTagContext)_localctx).ignored = codeBlock();
				}
				break;
			}
			setState(161);
			match(CBRC);
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

	public static class ReturnTypeContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public ReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterReturnType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitReturnType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitReturnType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnTypeContext returnType() throws RecognitionException {
		ReturnTypeContext _localctx = new ReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_returnType);
		try {
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				funcCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(165);
				boolExpr();
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

	public static class FuncCallContext extends ParserRuleContext {
		public FuncCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcCall; }
	 
		public FuncCallContext() { }
		public void copyFrom(FuncCallContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FuncCallTagContext extends FuncCallContext {
		public TerminalNode ID() { return getToken(CalculatorParser.ID, 0); }
		public ParamValuesContext paramValues() {
			return getRuleContext(ParamValuesContext.class,0);
		}
		public FuncCallTagContext(FuncCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterFuncCallTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitFuncCallTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitFuncCallTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncCallContext funcCall() throws RecognitionException {
		FuncCallContext _localctx = new FuncCallContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_funcCall);
		int _la;
		try {
			_localctx = new FuncCallTagContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(ID);
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPAR) {
				{
				setState(169);
				paramValues();
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

	public static class ParamsContext extends ParserRuleContext {
		public TerminalNode OPAR() { return getToken(CalculatorParser.OPAR, 0); }
		public List<TerminalNode> ID() { return getTokens(CalculatorParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CalculatorParser.ID, i);
		}
		public TerminalNode CPAR() { return getToken(CalculatorParser.CPAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CalculatorParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CalculatorParser.COMMA, i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(OPAR);
			setState(173);
			match(ID);
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(174);
				match(COMMA);
				setState(175);
				match(ID);
				}
				}
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(181);
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

	public static class ParamValuesContext extends ParserRuleContext {
		public TerminalNode OPAR() { return getToken(CalculatorParser.OPAR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode CPAR() { return getToken(CalculatorParser.CPAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CalculatorParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CalculatorParser.COMMA, i);
		}
		public ParamValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramValues; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterParamValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitParamValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitParamValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamValuesContext paramValues() throws RecognitionException {
		ParamValuesContext _localctx = new ParamValuesContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_paramValues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(OPAR);
			setState(184);
			expr(0);
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(185);
				match(COMMA);
				setState(186);
				expr(0);
				}
				}
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(192);
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

	public static class AutoVarsContext extends ParserRuleContext {
		public TerminalNode AUTO() { return getToken(CalculatorParser.AUTO, 0); }
		public List<TerminalNode> ID() { return getTokens(CalculatorParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CalculatorParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CalculatorParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CalculatorParser.COMMA, i);
		}
		public TerminalNode SEMICOLON() { return getToken(CalculatorParser.SEMICOLON, 0); }
		public AutoVarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_autoVars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterAutoVars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitAutoVars(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitAutoVars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AutoVarsContext autoVars() throws RecognitionException {
		AutoVarsContext _localctx = new AutoVarsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_autoVars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(AUTO);
			setState(195);
			match(ID);
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(196);
				match(COMMA);
				setState(197);
				match(ID);
				}
				}
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(203);
				match(SEMICOLON);
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
	public static class VarDefFuncCallTagContext extends VarDefContext {
		public TerminalNode ID() { return getToken(CalculatorParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(CalculatorParser.ASSIGN, 0); }
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public VarDefFuncCallTagContext(VarDefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterVarDefFuncCallTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitVarDefFuncCallTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitVarDefFuncCallTag(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarDefSpecialExprTagContext extends VarDefContext {
		public TerminalNode ID() { return getToken(CalculatorParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(CalculatorParser.ASSIGN, 0); }
		public SpecialExprContext specialExpr() {
			return getRuleContext(SpecialExprContext.class,0);
		}
		public VarDefSpecialExprTagContext(VarDefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterVarDefSpecialExprTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitVarDefSpecialExprTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitVarDefSpecialExprTag(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarDefBoolExprTagContext extends VarDefContext {
		public TerminalNode ID() { return getToken(CalculatorParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(CalculatorParser.ASSIGN, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public VarDefBoolExprTagContext(VarDefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterVarDefBoolExprTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitVarDefBoolExprTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitVarDefBoolExprTag(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarDefLibraryFuncTagContext extends VarDefContext {
		public TerminalNode ID() { return getToken(CalculatorParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(CalculatorParser.ASSIGN, 0); }
		public LibraryFuncContext libraryFunc() {
			return getRuleContext(LibraryFuncContext.class,0);
		}
		public VarDefLibraryFuncTagContext(VarDefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterVarDefLibraryFuncTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitVarDefLibraryFuncTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitVarDefLibraryFuncTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDefContext varDef() throws RecognitionException {
		VarDefContext _localctx = new VarDefContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_varDef);
		try {
			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new VarDefTagContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				match(ID);
				setState(207);
				match(ASSIGN);
				setState(208);
				expr(0);
				}
				break;
			case 2:
				_localctx = new VarDefFuncCallTagContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				match(ID);
				setState(210);
				match(ASSIGN);
				setState(211);
				funcCall();
				}
				break;
			case 3:
				_localctx = new VarDefBoolExprTagContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(212);
				match(ID);
				setState(213);
				match(ASSIGN);
				setState(214);
				boolExpr();
				}
				break;
			case 4:
				_localctx = new VarDefSpecialExprTagContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(215);
				match(ID);
				setState(216);
				match(ASSIGN);
				setState(217);
				specialExpr();
				}
				break;
			case 5:
				_localctx = new VarDefLibraryFuncTagContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(218);
				match(ID);
				setState(219);
				match(ASSIGN);
				setState(220);
				libraryFunc();
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
		enterRule(_localctx, 26, RULE_printFunc);
		int _la;
		try {
			_localctx = new PrintFuncTagContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(PRINT);
			setState(224);
			expr(0);
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(225);
				match(COMMA);
				setState(226);
				expr(0);
				}
				}
				setState(231);
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
		enterRule(_localctx, 28, RULE_boolExpr);
		try {
			setState(267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				_localctx = new ExprBoolTagContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				expr(0);
				}
				break;
			case 2:
				_localctx = new NotBoolTagContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				((NotBoolTagContext)_localctx).op = match(NOT);
				setState(234);
				expr(0);
				}
				break;
			case 3:
				_localctx = new GtBoolTagContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(235);
				expr(0);
				setState(236);
				((GtBoolTagContext)_localctx).op = match(GRE);
				setState(237);
				expr(0);
				}
				break;
			case 4:
				_localctx = new GteBoolTagContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(239);
				expr(0);
				setState(240);
				((GteBoolTagContext)_localctx).op = match(GREQ);
				setState(241);
				expr(0);
				}
				break;
			case 5:
				_localctx = new LtBoolTagContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(243);
				expr(0);
				setState(244);
				((LtBoolTagContext)_localctx).op = match(LT);
				setState(245);
				expr(0);
				}
				break;
			case 6:
				_localctx = new LteBoolTagContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(247);
				expr(0);
				setState(248);
				((LteBoolTagContext)_localctx).op = match(LTEQ);
				setState(249);
				expr(0);
				}
				break;
			case 7:
				_localctx = new EqBoolTagContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(251);
				expr(0);
				setState(252);
				((EqBoolTagContext)_localctx).op = match(EQ);
				setState(253);
				expr(0);
				}
				break;
			case 8:
				_localctx = new NeqBoolTagContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(255);
				expr(0);
				setState(256);
				((NeqBoolTagContext)_localctx).op = match(NEQ);
				setState(257);
				expr(0);
				}
				break;
			case 9:
				_localctx = new AndBoolTagContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(259);
				expr(0);
				setState(260);
				((AndBoolTagContext)_localctx).op = match(AND);
				setState(261);
				expr(0);
				}
				break;
			case 10:
				_localctx = new OrBoolTagContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(263);
				expr(0);
				setState(264);
				((OrBoolTagContext)_localctx).op = match(OR);
				setState(265);
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
		enterRule(_localctx, 30, RULE_specialExpr);
		try {
			setState(277);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SQRT:
				_localctx = new SqrtExprTagContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(269);
				match(SQRT);
				setState(270);
				match(OPAR);
				setState(271);
				((SqrtExprTagContext)_localctx).value = expr(0);
				setState(272);
				match(CPAR);
				}
				break;
			case READ:
				_localctx = new ReadExprTagContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
				match(READ);
				setState(275);
				match(OPAR);
				setState(276);
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
		enterRule(_localctx, 32, RULE_libraryFunc);
		try {
			setState(299);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case S:
				_localctx = new SinFuncTagContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(279);
				match(S);
				setState(280);
				match(OPAR);
				setState(281);
				((SinFuncTagContext)_localctx).var = expr(0);
				setState(282);
				match(CPAR);
				}
				break;
			case C:
				_localctx = new CosFuncTagContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(284);
				match(C);
				setState(285);
				match(OPAR);
				setState(286);
				((CosFuncTagContext)_localctx).var = expr(0);
				setState(287);
				match(CPAR);
				}
				break;
			case L:
				_localctx = new LogFuncTagContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(289);
				match(L);
				setState(290);
				match(OPAR);
				setState(291);
				((LogFuncTagContext)_localctx).var = expr(0);
				setState(292);
				match(CPAR);
				}
				break;
			case E:
				_localctx = new ExpFuncTagContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(294);
				match(E);
				setState(295);
				match(OPAR);
				setState(296);
				((ExpFuncTagContext)_localctx).var = expr(0);
				setState(297);
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
	public static class NegativeNumExprTagContext extends ExprContext {
		public TerminalNode SUB() { return getToken(CalculatorParser.SUB, 0); }
		public TerminalNode NUM() { return getToken(CalculatorParser.NUM, 0); }
		public NegativeNumExprTagContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterNegativeNumExprTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitNegativeNumExprTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitNegativeNumExprTag(this);
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
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPAR:
				{
				_localctx = new ParenExprTagContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(302);
				match(OPAR);
				setState(303);
				expr(0);
				setState(304);
				match(CPAR);
				}
				break;
			case NUM:
				{
				_localctx = new NumExprTagContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(306);
				match(NUM);
				}
				break;
			case SUB:
				{
				_localctx = new NegativeNumExprTagContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(307);
				match(SUB);
				setState(308);
				match(NUM);
				}
				break;
			case ID:
				{
				_localctx = new IdTagContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(309);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(326);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(324);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						_localctx = new MulExprTagContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(312);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(313);
						match(MUL);
						setState(314);
						expr(8);
						}
						break;
					case 2:
						{
						_localctx = new DivExprTagContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(315);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(316);
						match(DIV);
						setState(317);
						expr(7);
						}
						break;
					case 3:
						{
						_localctx = new AddExprTagContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(318);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(319);
						match(ADD);
						setState(320);
						expr(6);
						}
						break;
					case 4:
						{
						_localctx = new SubExprTagContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(321);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(322);
						match(SUB);
						setState(323);
						expr(5);
						}
						break;
					}
					} 
				}
				setState(328);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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
		case 17:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u014c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\6\2(\n\2\r\2\16\2)\3\2\3\2\3\3\7\3/\n\3\f\3\16\3\62\13"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4M\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\5\5V\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5d\n\5\5\5"+
		"f\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6v\n\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\5\7\u008e\n\7\3\b\3\b\3\b\5\b\u0093\n\b\3\b\3\b\5\b"+
		"\u0097\n\b\3\b\5\b\u009a\n\b\3\b\3\b\5\b\u009e\n\b\3\b\3\b\5\b\u00a2\n"+
		"\b\3\b\3\b\3\t\3\t\3\t\5\t\u00a9\n\t\3\n\3\n\5\n\u00ad\n\n\3\13\3\13\3"+
		"\13\3\13\7\13\u00b3\n\13\f\13\16\13\u00b6\13\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\7\f\u00be\n\f\f\f\16\f\u00c1\13\f\3\f\3\f\3\r\3\r\3\r\3\r\7\r\u00c9"+
		"\n\r\f\r\16\r\u00cc\13\r\3\r\5\r\u00cf\n\r\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00e0\n\16\3\17"+
		"\3\17\3\17\3\17\7\17\u00e6\n\17\f\17\16\17\u00e9\13\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\5\20\u010e\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\5\21\u0118\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u012e\n\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0139\n\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u0147\n\23\f\23\16"+
		"\23\u014a\13\23\3\23\2\3$\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$\2\2\2\u016f\2\'\3\2\2\2\4\60\3\2\2\2\6L\3\2\2\2\be\3\2\2\2\nu\3\2\2"+
		"\2\f\u008d\3\2\2\2\16\u008f\3\2\2\2\20\u00a8\3\2\2\2\22\u00aa\3\2\2\2"+
		"\24\u00ae\3\2\2\2\26\u00b9\3\2\2\2\30\u00c4\3\2\2\2\32\u00df\3\2\2\2\34"+
		"\u00e1\3\2\2\2\36\u010d\3\2\2\2 \u0117\3\2\2\2\"\u012d\3\2\2\2$\u0138"+
		"\3\2\2\2&(\5\6\4\2\'&\3\2\2\2()\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*+\3\2\2\2"+
		"+,\7\2\2\3,\3\3\2\2\2-/\5\6\4\2.-\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61"+
		"\3\2\2\2\61\5\3\2\2\2\62\60\3\2\2\2\63M\5\b\5\2\64M\5\f\7\2\65M\5\n\6"+
		"\2\66\67\5$\23\2\678\7\17\2\28M\3\2\2\29:\5 \21\2:;\7\17\2\2;M\3\2\2\2"+
		"<=\5\"\22\2=>\7\17\2\2>M\3\2\2\2?@\5\34\17\2@A\7\17\2\2AM\3\2\2\2BM\5"+
		"\16\b\2CD\5\22\n\2DE\7\17\2\2EM\3\2\2\2FG\5\32\16\2GH\7\17\2\2HM\3\2\2"+
		"\2IJ\5\36\20\2JK\7\17\2\2KM\3\2\2\2L\63\3\2\2\2L\64\3\2\2\2L\65\3\2\2"+
		"\2L\66\3\2\2\2L9\3\2\2\2L<\3\2\2\2L?\3\2\2\2LB\3\2\2\2LC\3\2\2\2LF\3\2"+
		"\2\2LI\3\2\2\2M\7\3\2\2\2NO\7\4\2\2OP\7\6\2\2PQ\5\36\20\2QR\7\7\2\2RU"+
		"\5\6\4\2ST\7\5\2\2TV\5\6\4\2US\3\2\2\2UV\3\2\2\2Vf\3\2\2\2WX\7\4\2\2X"+
		"Y\7\6\2\2YZ\5\36\20\2Z[\7\7\2\2[\\\7\b\2\2\\]\5\4\3\2]c\7\t\2\2^_\7\5"+
		"\2\2_`\7\b\2\2`a\5\4\3\2ab\7\t\2\2bd\3\2\2\2c^\3\2\2\2cd\3\2\2\2df\3\2"+
		"\2\2eN\3\2\2\2eW\3\2\2\2f\t\3\2\2\2gh\7\26\2\2hi\7\6\2\2ij\5\36\20\2j"+
		"k\7\7\2\2kl\5\6\4\2lv\3\2\2\2mn\7\26\2\2no\7\6\2\2op\5\36\20\2pq\7\7\2"+
		"\2qr\7\b\2\2rs\5\4\3\2st\7\t\2\2tv\3\2\2\2ug\3\2\2\2um\3\2\2\2v\13\3\2"+
		"\2\2wx\7\27\2\2xy\7\6\2\2yz\5\32\16\2z{\7\17\2\2{|\5\36\20\2|}\7\17\2"+
		"\2}~\5\32\16\2~\177\7\7\2\2\177\u0080\5\6\4\2\u0080\u008e\3\2\2\2\u0081"+
		"\u0082\7\27\2\2\u0082\u0083\7\6\2\2\u0083\u0084\5\32\16\2\u0084\u0085"+
		"\7\17\2\2\u0085\u0086\5\36\20\2\u0086\u0087\7\17\2\2\u0087\u0088\5\32"+
		"\16\2\u0088\u0089\7\7\2\2\u0089\u008a\7\b\2\2\u008a\u008b\5\4\3\2\u008b"+
		"\u008c\7\t\2\2\u008c\u008e\3\2\2\2\u008dw\3\2\2\2\u008d\u0081\3\2\2\2"+
		"\u008e\r\3\2\2\2\u008f\u0090\7\20\2\2\u0090\u0092\7(\2\2\u0091\u0093\5"+
		"\24\13\2\u0092\u0091\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\3\2\2\2\u0094"+
		"\u0096\7\b\2\2\u0095\u0097\5\30\r\2\u0096\u0095\3\2\2\2\u0096\u0097\3"+
		"\2\2\2\u0097\u0099\3\2\2\2\u0098\u009a\5\4\3\2\u0099\u0098\3\2\2\2\u0099"+
		"\u009a\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009d\7\22\2\2\u009c\u009e\5"+
		"\20\t\2\u009d\u009c\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\3\2\2\2\u009f"+
		"\u00a1\7\17\2\2\u00a0\u00a2\5\4\3\2\u00a1\u00a0\3\2\2\2\u00a1\u00a2\3"+
		"\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\7\t\2\2\u00a4\17\3\2\2\2\u00a5"+
		"\u00a9\5$\23\2\u00a6\u00a9\5\22\n\2\u00a7\u00a9\5\36\20\2\u00a8\u00a5"+
		"\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a7\3\2\2\2\u00a9\21\3\2\2\2\u00aa"+
		"\u00ac\7(\2\2\u00ab\u00ad\5\26\f\2\u00ac\u00ab\3\2\2\2\u00ac\u00ad\3\2"+
		"\2\2\u00ad\23\3\2\2\2\u00ae\u00af\7\6\2\2\u00af\u00b4\7(\2\2\u00b0\u00b1"+
		"\7\16\2\2\u00b1\u00b3\7(\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4"+
		"\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00b4\3\2"+
		"\2\2\u00b7\u00b8\7\7\2\2\u00b8\25\3\2\2\2\u00b9\u00ba\7\6\2\2\u00ba\u00bf"+
		"\5$\23\2\u00bb\u00bc\7\16\2\2\u00bc\u00be\5$\23\2\u00bd\u00bb\3\2\2\2"+
		"\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c2"+
		"\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c3\7\7\2\2\u00c3\27\3\2\2\2\u00c4"+
		"\u00c5\7\21\2\2\u00c5\u00ca\7(\2\2\u00c6\u00c7\7\16\2\2\u00c7\u00c9\7"+
		"(\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca"+
		"\u00cb\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00cf\7\17"+
		"\2\2\u00ce\u00cd\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\31\3\2\2\2\u00d0\u00d1"+
		"\7(\2\2\u00d1\u00d2\7\37\2\2\u00d2\u00e0\5$\23\2\u00d3\u00d4\7(\2\2\u00d4"+
		"\u00d5\7\37\2\2\u00d5\u00e0\5\22\n\2\u00d6\u00d7\7(\2\2\u00d7\u00d8\7"+
		"\37\2\2\u00d8\u00e0\5\36\20\2\u00d9\u00da\7(\2\2\u00da\u00db\7\37\2\2"+
		"\u00db\u00e0\5 \21\2\u00dc\u00dd\7(\2\2\u00dd\u00de\7\37\2\2\u00de\u00e0"+
		"\5\"\22\2\u00df\u00d0\3\2\2\2\u00df\u00d3\3\2\2\2\u00df\u00d6\3\2\2\2"+
		"\u00df\u00d9\3\2\2\2\u00df\u00dc\3\2\2\2\u00e0\33\3\2\2\2\u00e1\u00e2"+
		"\7\25\2\2\u00e2\u00e7\5$\23\2\u00e3\u00e4\7\16\2\2\u00e4\u00e6\5$\23\2"+
		"\u00e5\u00e3\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8"+
		"\3\2\2\2\u00e8\35\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u010e\5$\23\2\u00eb"+
		"\u00ec\7\'\2\2\u00ec\u010e\5$\23\2\u00ed\u00ee\5$\23\2\u00ee\u00ef\7!"+
		"\2\2\u00ef\u00f0\5$\23\2\u00f0\u010e\3\2\2\2\u00f1\u00f2\5$\23\2\u00f2"+
		"\u00f3\7\"\2\2\u00f3\u00f4\5$\23\2\u00f4\u010e\3\2\2\2\u00f5\u00f6\5$"+
		"\23\2\u00f6\u00f7\7#\2\2\u00f7\u00f8\5$\23\2\u00f8\u010e\3\2\2\2\u00f9"+
		"\u00fa\5$\23\2\u00fa\u00fb\7$\2\2\u00fb\u00fc\5$\23\2\u00fc\u010e\3\2"+
		"\2\2\u00fd\u00fe\5$\23\2\u00fe\u00ff\7\36\2\2\u00ff\u0100\5$\23\2\u0100"+
		"\u010e\3\2\2\2\u0101\u0102\5$\23\2\u0102\u0103\7 \2\2\u0103\u0104\5$\23"+
		"\2\u0104\u010e\3\2\2\2\u0105\u0106\5$\23\2\u0106\u0107\7%\2\2\u0107\u0108"+
		"\5$\23\2\u0108\u010e\3\2\2\2\u0109\u010a\5$\23\2\u010a\u010b\7&\2\2\u010b"+
		"\u010c\5$\23\2\u010c\u010e\3\2\2\2\u010d\u00ea\3\2\2\2\u010d\u00eb\3\2"+
		"\2\2\u010d\u00ed\3\2\2\2\u010d\u00f1\3\2\2\2\u010d\u00f5\3\2\2\2\u010d"+
		"\u00f9\3\2\2\2\u010d\u00fd\3\2\2\2\u010d\u0101\3\2\2\2\u010d\u0105\3\2"+
		"\2\2\u010d\u0109\3\2\2\2\u010e\37\3\2\2\2\u010f\u0110\7\23\2\2\u0110\u0111"+
		"\7\6\2\2\u0111\u0112\5$\23\2\u0112\u0113\7\7\2\2\u0113\u0118\3\2\2\2\u0114"+
		"\u0115\7\24\2\2\u0115\u0116\7\6\2\2\u0116\u0118\7\7\2\2\u0117\u010f\3"+
		"\2\2\2\u0117\u0114\3\2\2\2\u0118!\3\2\2\2\u0119\u011a\7\n\2\2\u011a\u011b"+
		"\7\6\2\2\u011b\u011c\5$\23\2\u011c\u011d\7\7\2\2\u011d\u012e\3\2\2\2\u011e"+
		"\u011f\7\13\2\2\u011f\u0120\7\6\2\2\u0120\u0121\5$\23\2\u0121\u0122\7"+
		"\7\2\2\u0122\u012e\3\2\2\2\u0123\u0124\7\f\2\2\u0124\u0125\7\6\2\2\u0125"+
		"\u0126\5$\23\2\u0126\u0127\7\7\2\2\u0127\u012e\3\2\2\2\u0128\u0129\7\r"+
		"\2\2\u0129\u012a\7\6\2\2\u012a\u012b\5$\23\2\u012b\u012c\7\7\2\2\u012c"+
		"\u012e\3\2\2\2\u012d\u0119\3\2\2\2\u012d\u011e\3\2\2\2\u012d\u0123\3\2"+
		"\2\2\u012d\u0128\3\2\2\2\u012e#\3\2\2\2\u012f\u0130\b\23\1\2\u0130\u0131"+
		"\7\6\2\2\u0131\u0132\5$\23\2\u0132\u0133\7\7\2\2\u0133\u0139\3\2\2\2\u0134"+
		"\u0139\7\30\2\2\u0135\u0136\7\32\2\2\u0136\u0139\7\30\2\2\u0137\u0139"+
		"\7(\2\2\u0138\u012f\3\2\2\2\u0138\u0134\3\2\2\2\u0138\u0135\3\2\2\2\u0138"+
		"\u0137\3\2\2\2\u0139\u0148\3\2\2\2\u013a\u013b\f\t\2\2\u013b\u013c\7\35"+
		"\2\2\u013c\u0147\5$\23\n\u013d\u013e\f\b\2\2\u013e\u013f\7\34\2\2\u013f"+
		"\u0147\5$\23\t\u0140\u0141\f\7\2\2\u0141\u0142\7\33\2\2\u0142\u0147\5"+
		"$\23\b\u0143\u0144\f\6\2\2\u0144\u0145\7\32\2\2\u0145\u0147\5$\23\7\u0146"+
		"\u013a\3\2\2\2\u0146\u013d\3\2\2\2\u0146\u0140\3\2\2\2\u0146\u0143\3\2"+
		"\2\2\u0147\u014a\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149"+
		"%\3\2\2\2\u014a\u0148\3\2\2\2\35)\60LUceu\u008d\u0092\u0096\u0099\u009d"+
		"\u00a1\u00a8\u00ac\u00b4\u00bf\u00ca\u00ce\u00df\u00e7\u010d\u0117\u012d"+
		"\u0138\u0146\u0148";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}