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
		COMMA=12, SEMICOLON=13, DEFINE=14, AUTO=15, SQRT=16, READ=17, PRINT=18, 
		WHILE=19, FOR=20, NUM=21, COM=22, SUB=23, ADD=24, DIV=25, MUL=26, EQ=27, 
		ASSIGN=28, NEQ=29, GRE=30, GREQ=31, LT=32, LTEQ=33, AND=34, OR=35, NOT=36, 
		ID=37;
	public static final int
		RULE_exprList = 0, RULE_codeBlock = 1, RULE_topExpr = 2, RULE_ifDef = 3, 
		RULE_whileDef = 4, RULE_forDef = 5, RULE_funcDef = 6, RULE_funcCall = 7, 
		RULE_params = 8, RULE_paramValues = 9, RULE_autoVars = 10, RULE_varDef = 11, 
		RULE_printFunc = 12, RULE_boolExpr = 13, RULE_specialExpr = 14, RULE_libraryFunc = 15, 
		RULE_expr = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"exprList", "codeBlock", "topExpr", "ifDef", "whileDef", "forDef", "funcDef", 
			"funcCall", "params", "paramValues", "autoVars", "varDef", "printFunc", 
			"boolExpr", "specialExpr", "libraryFunc", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'if'", "'else'", "'('", "')'", "'{'", "'}'", "'s'", "'c'", 
			"'l'", "'e'", "','", "';'", "'define'", "'auto'", "'sqrt'", "'read'", 
			"'print'", "'while'", "'for'", null, null, "'-'", "'+'", "'/'", "'*'", 
			"'=='", "'='", "'!='", "'>'", "'>='", "'<'", "'<='", "'&&'", "'||'", 
			"'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "IF", "ELSE", "OPAR", "CPAR", "OBRC", "CBRC", "S", "C", "L", 
			"E", "COMMA", "SEMICOLON", "DEFINE", "AUTO", "SQRT", "READ", "PRINT", 
			"WHILE", "FOR", "NUM", "COM", "SUB", "ADD", "DIV", "MUL", "EQ", "ASSIGN", 
			"NEQ", "GRE", "GREQ", "LT", "LTEQ", "AND", "OR", "NOT", "ID"
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
			setState(35); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(34);
				topExpr();
				}
				}
				setState(37); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << OPAR) | (1L << S) | (1L << C) | (1L << L) | (1L << E) | (1L << DEFINE) | (1L << SQRT) | (1L << READ) | (1L << PRINT) | (1L << WHILE) | (1L << FOR) | (1L << NUM) | (1L << NOT) | (1L << ID))) != 0) );
			setState(39);
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
		public TerminalNode OBRC() { return getToken(CalculatorParser.OBRC, 0); }
		public TerminalNode CBRC() { return getToken(CalculatorParser.CBRC, 0); }
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
			setState(41);
			match(OBRC);
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << OPAR) | (1L << S) | (1L << C) | (1L << L) | (1L << E) | (1L << DEFINE) | (1L << SQRT) | (1L << READ) | (1L << PRINT) | (1L << WHILE) | (1L << FOR) | (1L << NUM) | (1L << NOT) | (1L << ID))) != 0)) {
				{
				{
				setState(42);
				topExpr();
				}
				}
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(48);
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
		public FuncDefContext funcDef() {
			return getRuleContext(FuncDefContext.class,0);
		}
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CalculatorParser.SEMICOLON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
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
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				ifDef();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				forDef();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(52);
				whileDef();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(53);
				funcDef();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(54);
				funcCall();
				setState(55);
				match(SEMICOLON);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(57);
				expr(0);
				setState(58);
				match(SEMICOLON);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(60);
				varDef();
				setState(61);
				match(SEMICOLON);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(63);
				boolExpr();
				setState(64);
				match(SEMICOLON);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(66);
				specialExpr();
				setState(67);
				match(SEMICOLON);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(69);
				libraryFunc();
				setState(70);
				match(SEMICOLON);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(72);
				printFunc();
				setState(73);
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
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new IfDefSingleTagContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				match(IF);
				setState(78);
				match(OPAR);
				setState(79);
				((IfDefSingleTagContext)_localctx).cond = boolExpr();
				setState(80);
				match(CPAR);
				setState(81);
				((IfDefSingleTagContext)_localctx).expr1 = topExpr();
				setState(84);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(82);
					match(ELSE);
					setState(83);
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
				setState(86);
				match(IF);
				setState(87);
				match(OPAR);
				setState(88);
				((IfDefMultipleTagContext)_localctx).cond = boolExpr();
				setState(89);
				match(CPAR);
				setState(90);
				((IfDefMultipleTagContext)_localctx).exprList1 = codeBlock();
				setState(93);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(91);
					match(ELSE);
					setState(92);
					((IfDefMultipleTagContext)_localctx).exprList2 = codeBlock();
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
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new WhileDefSingleTagContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				match(WHILE);
				setState(98);
				match(OPAR);
				setState(99);
				((WhileDefSingleTagContext)_localctx).cond = boolExpr();
				setState(100);
				match(CPAR);
				setState(101);
				((WhileDefSingleTagContext)_localctx).exec = topExpr();
				}
				break;
			case 2:
				_localctx = new WhileDefMultipleTagContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				match(WHILE);
				setState(104);
				match(OPAR);
				setState(105);
				((WhileDefMultipleTagContext)_localctx).cond = boolExpr();
				setState(106);
				match(CPAR);
				setState(107);
				((WhileDefMultipleTagContext)_localctx).exec = codeBlock();
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
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new ForDefSingleTagContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				match(FOR);
				setState(112);
				match(OPAR);
				setState(113);
				((ForDefSingleTagContext)_localctx).expr1 = varDef();
				setState(114);
				match(SEMICOLON);
				setState(115);
				((ForDefSingleTagContext)_localctx).cond = boolExpr();
				setState(116);
				match(SEMICOLON);
				setState(117);
				((ForDefSingleTagContext)_localctx).expr2 = varDef();
				setState(118);
				match(CPAR);
				setState(119);
				((ForDefSingleTagContext)_localctx).exec = topExpr();
				}
				break;
			case 2:
				_localctx = new ForDefMultipleTagContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				match(FOR);
				setState(122);
				match(OPAR);
				setState(123);
				((ForDefMultipleTagContext)_localctx).expr1 = varDef();
				setState(124);
				match(SEMICOLON);
				setState(125);
				((ForDefMultipleTagContext)_localctx).cond = boolExpr();
				setState(126);
				match(SEMICOLON);
				setState(127);
				((ForDefMultipleTagContext)_localctx).expr2 = varDef();
				setState(128);
				match(CPAR);
				setState(129);
				((ForDefMultipleTagContext)_localctx).exec = codeBlock();
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
		public TopExprContext exec;
		public TerminalNode DEFINE() { return getToken(CalculatorParser.DEFINE, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode OBRC() { return getToken(CalculatorParser.OBRC, 0); }
		public AutoVarsContext autoVars() {
			return getRuleContext(AutoVarsContext.class,0);
		}
		public TerminalNode CBRC() { return getToken(CalculatorParser.CBRC, 0); }
		public TerminalNode ID() { return getToken(CalculatorParser.ID, 0); }
		public List<TopExprContext> topExpr() {
			return getRuleContexts(TopExprContext.class);
		}
		public TopExprContext topExpr(int i) {
			return getRuleContext(TopExprContext.class,i);
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
			setState(133);
			match(DEFINE);
			setState(134);
			((FuncDefTagContext)_localctx).funcName = match(ID);
			setState(135);
			params();
			setState(136);
			match(OBRC);
			setState(137);
			autoVars();
			setState(139); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(138);
				((FuncDefTagContext)_localctx).exec = topExpr();
				}
				}
				setState(141); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << OPAR) | (1L << S) | (1L << C) | (1L << L) | (1L << E) | (1L << DEFINE) | (1L << SQRT) | (1L << READ) | (1L << PRINT) | (1L << WHILE) | (1L << FOR) | (1L << NUM) | (1L << NOT) | (1L << ID))) != 0) );
			setState(143);
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
		enterRule(_localctx, 14, RULE_funcCall);
		try {
			_localctx = new FuncCallTagContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(ID);
			setState(146);
			paramValues();
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
		enterRule(_localctx, 16, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(OPAR);
			setState(149);
			match(ID);
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(150);
				match(COMMA);
				setState(151);
				match(ID);
				}
				}
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(157);
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
		public List<TerminalNode> NUM() { return getTokens(CalculatorParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(CalculatorParser.NUM, i);
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
		enterRule(_localctx, 18, RULE_paramValues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(OPAR);
			setState(160);
			match(NUM);
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(161);
				match(COMMA);
				setState(162);
				match(NUM);
				}
				}
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(168);
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
		enterRule(_localctx, 20, RULE_autoVars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(AUTO);
			setState(171);
			match(ID);
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(172);
				match(COMMA);
				setState(173);
				match(ID);
				}
				}
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(179);
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

	public final VarDefContext varDef() throws RecognitionException {
		VarDefContext _localctx = new VarDefContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_varDef);
		try {
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new VarDefTagContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				match(ID);
				setState(183);
				match(ASSIGN);
				setState(184);
				expr(0);
				}
				break;
			case 2:
				_localctx = new VarDefFuncCallTagContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				match(ID);
				setState(186);
				match(ASSIGN);
				setState(187);
				funcCall();
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
		enterRule(_localctx, 24, RULE_printFunc);
		int _la;
		try {
			_localctx = new PrintFuncTagContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(PRINT);
			setState(191);
			expr(0);
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(192);
				match(COMMA);
				setState(193);
				expr(0);
				}
				}
				setState(198);
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
		enterRule(_localctx, 26, RULE_boolExpr);
		try {
			setState(234);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new ExprBoolTagContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				expr(0);
				}
				break;
			case 2:
				_localctx = new NotBoolTagContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				((NotBoolTagContext)_localctx).op = match(NOT);
				setState(201);
				expr(0);
				}
				break;
			case 3:
				_localctx = new GtBoolTagContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(202);
				expr(0);
				setState(203);
				((GtBoolTagContext)_localctx).op = match(GRE);
				setState(204);
				expr(0);
				}
				break;
			case 4:
				_localctx = new GteBoolTagContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(206);
				expr(0);
				setState(207);
				((GteBoolTagContext)_localctx).op = match(GREQ);
				setState(208);
				expr(0);
				}
				break;
			case 5:
				_localctx = new LtBoolTagContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(210);
				expr(0);
				setState(211);
				((LtBoolTagContext)_localctx).op = match(LT);
				setState(212);
				expr(0);
				}
				break;
			case 6:
				_localctx = new LteBoolTagContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(214);
				expr(0);
				setState(215);
				((LteBoolTagContext)_localctx).op = match(LTEQ);
				setState(216);
				expr(0);
				}
				break;
			case 7:
				_localctx = new EqBoolTagContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(218);
				expr(0);
				setState(219);
				((EqBoolTagContext)_localctx).op = match(EQ);
				setState(220);
				expr(0);
				}
				break;
			case 8:
				_localctx = new NeqBoolTagContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(222);
				expr(0);
				setState(223);
				((NeqBoolTagContext)_localctx).op = match(NEQ);
				setState(224);
				expr(0);
				}
				break;
			case 9:
				_localctx = new AndBoolTagContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(226);
				expr(0);
				setState(227);
				((AndBoolTagContext)_localctx).op = match(AND);
				setState(228);
				expr(0);
				}
				break;
			case 10:
				_localctx = new OrBoolTagContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(230);
				expr(0);
				setState(231);
				((OrBoolTagContext)_localctx).op = match(OR);
				setState(232);
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
		enterRule(_localctx, 28, RULE_specialExpr);
		try {
			setState(244);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SQRT:
				_localctx = new SqrtExprTagContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				match(SQRT);
				setState(237);
				match(OPAR);
				setState(238);
				((SqrtExprTagContext)_localctx).value = expr(0);
				setState(239);
				match(CPAR);
				}
				break;
			case READ:
				_localctx = new ReadExprTagContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(241);
				match(READ);
				setState(242);
				match(OPAR);
				setState(243);
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
		enterRule(_localctx, 30, RULE_libraryFunc);
		try {
			setState(266);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case S:
				_localctx = new SinFuncTagContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				match(S);
				setState(247);
				match(OPAR);
				setState(248);
				((SinFuncTagContext)_localctx).var = expr(0);
				setState(249);
				match(CPAR);
				}
				break;
			case C:
				_localctx = new CosFuncTagContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				match(C);
				setState(252);
				match(OPAR);
				setState(253);
				((CosFuncTagContext)_localctx).var = expr(0);
				setState(254);
				match(CPAR);
				}
				break;
			case L:
				_localctx = new LogFuncTagContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(256);
				match(L);
				setState(257);
				match(OPAR);
				setState(258);
				((LogFuncTagContext)_localctx).var = expr(0);
				setState(259);
				match(CPAR);
				}
				break;
			case E:
				_localctx = new ExpFuncTagContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(261);
				match(E);
				setState(262);
				match(OPAR);
				setState(263);
				((ExpFuncTagContext)_localctx).var = expr(0);
				setState(264);
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
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPAR:
				{
				_localctx = new ParenExprTagContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(269);
				match(OPAR);
				setState(270);
				expr(0);
				setState(271);
				match(CPAR);
				}
				break;
			case NUM:
				{
				_localctx = new NumExprTagContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(273);
				match(NUM);
				}
				break;
			case ID:
				{
				_localctx = new IdTagContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(274);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(291);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(289);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new MulExprTagContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(277);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(278);
						match(MUL);
						setState(279);
						expr(7);
						}
						break;
					case 2:
						{
						_localctx = new DivExprTagContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(280);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(281);
						match(DIV);
						setState(282);
						expr(6);
						}
						break;
					case 3:
						{
						_localctx = new AddExprTagContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(283);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(284);
						match(ADD);
						setState(285);
						expr(5);
						}
						break;
					case 4:
						{
						_localctx = new SubExprTagContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(286);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(287);
						match(SUB);
						setState(288);
						expr(4);
						}
						break;
					}
					} 
				}
				setState(293);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
		case 16:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u0129\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\6\2&\n\2\r\2\16\2\'\3\2\3\2\3\3\3\3\7\3.\n\3\f\3\16\3\61\13\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4N\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\5\5W\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5`\n\5\5\5b\n\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6p\n\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0086\n\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\6\b\u008e\n\b\r\b\16\b\u008f\3\b\3\b\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\7\n\u009b\n\n\f\n\16\n\u009e\13\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\7\13\u00a6\n\13\f\13\16\13\u00a9\13\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\7\f\u00b1\n\f\f\f\16\f\u00b4\13\f\3\f\5\f\u00b7\n\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\5\r\u00bf\n\r\3\16\3\16\3\16\3\16\7\16\u00c5\n\16\f\16"+
		"\16\16\u00c8\13\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00ed\n\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00f7\n\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\5\21\u010d\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22"+
		"\u0116\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\7\22\u0124\n\22\f\22\16\22\u0127\13\22\3\22\2\3\"\23\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"\2\2\2\u0142\2%\3\2\2\2\4+\3\2\2\2\6M\3\2\2\2"+
		"\ba\3\2\2\2\no\3\2\2\2\f\u0085\3\2\2\2\16\u0087\3\2\2\2\20\u0093\3\2\2"+
		"\2\22\u0096\3\2\2\2\24\u00a1\3\2\2\2\26\u00ac\3\2\2\2\30\u00be\3\2\2\2"+
		"\32\u00c0\3\2\2\2\34\u00ec\3\2\2\2\36\u00f6\3\2\2\2 \u010c\3\2\2\2\"\u0115"+
		"\3\2\2\2$&\5\6\4\2%$\3\2\2\2&\'\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2()\3\2\2"+
		"\2)*\7\2\2\3*\3\3\2\2\2+/\7\b\2\2,.\5\6\4\2-,\3\2\2\2.\61\3\2\2\2/-\3"+
		"\2\2\2/\60\3\2\2\2\60\62\3\2\2\2\61/\3\2\2\2\62\63\7\t\2\2\63\5\3\2\2"+
		"\2\64N\5\b\5\2\65N\5\f\7\2\66N\5\n\6\2\67N\5\16\b\289\5\20\t\29:\7\17"+
		"\2\2:N\3\2\2\2;<\5\"\22\2<=\7\17\2\2=N\3\2\2\2>?\5\30\r\2?@\7\17\2\2@"+
		"N\3\2\2\2AB\5\34\17\2BC\7\17\2\2CN\3\2\2\2DE\5\36\20\2EF\7\17\2\2FN\3"+
		"\2\2\2GH\5 \21\2HI\7\17\2\2IN\3\2\2\2JK\5\32\16\2KL\7\17\2\2LN\3\2\2\2"+
		"M\64\3\2\2\2M\65\3\2\2\2M\66\3\2\2\2M\67\3\2\2\2M8\3\2\2\2M;\3\2\2\2M"+
		">\3\2\2\2MA\3\2\2\2MD\3\2\2\2MG\3\2\2\2MJ\3\2\2\2N\7\3\2\2\2OP\7\4\2\2"+
		"PQ\7\6\2\2QR\5\34\17\2RS\7\7\2\2SV\5\6\4\2TU\7\5\2\2UW\5\6\4\2VT\3\2\2"+
		"\2VW\3\2\2\2Wb\3\2\2\2XY\7\4\2\2YZ\7\6\2\2Z[\5\34\17\2[\\\7\7\2\2\\_\5"+
		"\4\3\2]^\7\5\2\2^`\5\4\3\2_]\3\2\2\2_`\3\2\2\2`b\3\2\2\2aO\3\2\2\2aX\3"+
		"\2\2\2b\t\3\2\2\2cd\7\25\2\2de\7\6\2\2ef\5\34\17\2fg\7\7\2\2gh\5\6\4\2"+
		"hp\3\2\2\2ij\7\25\2\2jk\7\6\2\2kl\5\34\17\2lm\7\7\2\2mn\5\4\3\2np\3\2"+
		"\2\2oc\3\2\2\2oi\3\2\2\2p\13\3\2\2\2qr\7\26\2\2rs\7\6\2\2st\5\30\r\2t"+
		"u\7\17\2\2uv\5\34\17\2vw\7\17\2\2wx\5\30\r\2xy\7\7\2\2yz\5\6\4\2z\u0086"+
		"\3\2\2\2{|\7\26\2\2|}\7\6\2\2}~\5\30\r\2~\177\7\17\2\2\177\u0080\5\34"+
		"\17\2\u0080\u0081\7\17\2\2\u0081\u0082\5\30\r\2\u0082\u0083\7\7\2\2\u0083"+
		"\u0084\5\4\3\2\u0084\u0086\3\2\2\2\u0085q\3\2\2\2\u0085{\3\2\2\2\u0086"+
		"\r\3\2\2\2\u0087\u0088\7\20\2\2\u0088\u0089\7\'\2\2\u0089\u008a\5\22\n"+
		"\2\u008a\u008b\7\b\2\2\u008b\u008d\5\26\f\2\u008c\u008e\5\6\4\2\u008d"+
		"\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2"+
		"\2\2\u0090\u0091\3\2\2\2\u0091\u0092\7\t\2\2\u0092\17\3\2\2\2\u0093\u0094"+
		"\7\'\2\2\u0094\u0095\5\24\13\2\u0095\21\3\2\2\2\u0096\u0097\7\6\2\2\u0097"+
		"\u009c\7\'\2\2\u0098\u0099\7\16\2\2\u0099\u009b\7\'\2\2\u009a\u0098\3"+
		"\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d"+
		"\u009f\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a0\7\7\2\2\u00a0\23\3\2\2"+
		"\2\u00a1\u00a2\7\6\2\2\u00a2\u00a7\7\27\2\2\u00a3\u00a4\7\16\2\2\u00a4"+
		"\u00a6\7\27\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3"+
		"\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00aa\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa"+
		"\u00ab\7\7\2\2\u00ab\25\3\2\2\2\u00ac\u00ad\7\21\2\2\u00ad\u00b2\7\'\2"+
		"\2\u00ae\u00af\7\16\2\2\u00af\u00b1\7\'\2\2\u00b0\u00ae\3\2\2\2\u00b1"+
		"\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b6\3\2"+
		"\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b7\7\17\2\2\u00b6\u00b5\3\2\2\2\u00b6"+
		"\u00b7\3\2\2\2\u00b7\27\3\2\2\2\u00b8\u00b9\7\'\2\2\u00b9\u00ba\7\36\2"+
		"\2\u00ba\u00bf\5\"\22\2\u00bb\u00bc\7\'\2\2\u00bc\u00bd\7\36\2\2\u00bd"+
		"\u00bf\5\20\t\2\u00be\u00b8\3\2\2\2\u00be\u00bb\3\2\2\2\u00bf\31\3\2\2"+
		"\2\u00c0\u00c1\7\24\2\2\u00c1\u00c6\5\"\22\2\u00c2\u00c3\7\16\2\2\u00c3"+
		"\u00c5\5\"\22\2\u00c4\u00c2\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3"+
		"\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\33\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9"+
		"\u00ed\5\"\22\2\u00ca\u00cb\7&\2\2\u00cb\u00ed\5\"\22\2\u00cc\u00cd\5"+
		"\"\22\2\u00cd\u00ce\7 \2\2\u00ce\u00cf\5\"\22\2\u00cf\u00ed\3\2\2\2\u00d0"+
		"\u00d1\5\"\22\2\u00d1\u00d2\7!\2\2\u00d2\u00d3\5\"\22\2\u00d3\u00ed\3"+
		"\2\2\2\u00d4\u00d5\5\"\22\2\u00d5\u00d6\7\"\2\2\u00d6\u00d7\5\"\22\2\u00d7"+
		"\u00ed\3\2\2\2\u00d8\u00d9\5\"\22\2\u00d9\u00da\7#\2\2\u00da\u00db\5\""+
		"\22\2\u00db\u00ed\3\2\2\2\u00dc\u00dd\5\"\22\2\u00dd\u00de\7\35\2\2\u00de"+
		"\u00df\5\"\22\2\u00df\u00ed\3\2\2\2\u00e0\u00e1\5\"\22\2\u00e1\u00e2\7"+
		"\37\2\2\u00e2\u00e3\5\"\22\2\u00e3\u00ed\3\2\2\2\u00e4\u00e5\5\"\22\2"+
		"\u00e5\u00e6\7$\2\2\u00e6\u00e7\5\"\22\2\u00e7\u00ed\3\2\2\2\u00e8\u00e9"+
		"\5\"\22\2\u00e9\u00ea\7%\2\2\u00ea\u00eb\5\"\22\2\u00eb\u00ed\3\2\2\2"+
		"\u00ec\u00c9\3\2\2\2\u00ec\u00ca\3\2\2\2\u00ec\u00cc\3\2\2\2\u00ec\u00d0"+
		"\3\2\2\2\u00ec\u00d4\3\2\2\2\u00ec\u00d8\3\2\2\2\u00ec\u00dc\3\2\2\2\u00ec"+
		"\u00e0\3\2\2\2\u00ec\u00e4\3\2\2\2\u00ec\u00e8\3\2\2\2\u00ed\35\3\2\2"+
		"\2\u00ee\u00ef\7\22\2\2\u00ef\u00f0\7\6\2\2\u00f0\u00f1\5\"\22\2\u00f1"+
		"\u00f2\7\7\2\2\u00f2\u00f7\3\2\2\2\u00f3\u00f4\7\23\2\2\u00f4\u00f5\7"+
		"\6\2\2\u00f5\u00f7\7\7\2\2\u00f6\u00ee\3\2\2\2\u00f6\u00f3\3\2\2\2\u00f7"+
		"\37\3\2\2\2\u00f8\u00f9\7\n\2\2\u00f9\u00fa\7\6\2\2\u00fa\u00fb\5\"\22"+
		"\2\u00fb\u00fc\7\7\2\2\u00fc\u010d\3\2\2\2\u00fd\u00fe\7\13\2\2\u00fe"+
		"\u00ff\7\6\2\2\u00ff\u0100\5\"\22\2\u0100\u0101\7\7\2\2\u0101\u010d\3"+
		"\2\2\2\u0102\u0103\7\f\2\2\u0103\u0104\7\6\2\2\u0104\u0105\5\"\22\2\u0105"+
		"\u0106\7\7\2\2\u0106\u010d\3\2\2\2\u0107\u0108\7\r\2\2\u0108\u0109\7\6"+
		"\2\2\u0109\u010a\5\"\22\2\u010a\u010b\7\7\2\2\u010b\u010d\3\2\2\2\u010c"+
		"\u00f8\3\2\2\2\u010c\u00fd\3\2\2\2\u010c\u0102\3\2\2\2\u010c\u0107\3\2"+
		"\2\2\u010d!\3\2\2\2\u010e\u010f\b\22\1\2\u010f\u0110\7\6\2\2\u0110\u0111"+
		"\5\"\22\2\u0111\u0112\7\7\2\2\u0112\u0116\3\2\2\2\u0113\u0116\7\27\2\2"+
		"\u0114\u0116\7\'\2\2\u0115\u010e\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0114"+
		"\3\2\2\2\u0116\u0125\3\2\2\2\u0117\u0118\f\b\2\2\u0118\u0119\7\34\2\2"+
		"\u0119\u0124\5\"\22\t\u011a\u011b\f\7\2\2\u011b\u011c\7\33\2\2\u011c\u0124"+
		"\5\"\22\b\u011d\u011e\f\6\2\2\u011e\u011f\7\32\2\2\u011f\u0124\5\"\22"+
		"\7\u0120\u0121\f\5\2\2\u0121\u0122\7\31\2\2\u0122\u0124\5\"\22\6\u0123"+
		"\u0117\3\2\2\2\u0123\u011a\3\2\2\2\u0123\u011d\3\2\2\2\u0123\u0120\3\2"+
		"\2\2\u0124\u0127\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126"+
		"#\3\2\2\2\u0127\u0125\3\2\2\2\27\'/MV_ao\u0085\u008f\u009c\u00a7\u00b2"+
		"\u00b6\u00be\u00c6\u00ec\u00f6\u010c\u0115\u0123\u0125";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}