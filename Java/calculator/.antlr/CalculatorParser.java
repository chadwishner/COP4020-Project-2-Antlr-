// Generated from c:\Users\Spectre\Documents\COP4020\Project2\COP4020-Project-2-Antlr-\Java\calculator\Calculator.g4 by ANTLR 4.7.1

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
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

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
		RULE_whileDef = 4, RULE_forDef = 5, RULE_funcDef = 6, RULE_funcCall = 7, 
		RULE_params = 8, RULE_paramValues = 9, RULE_autoVars = 10, RULE_varDef = 11, 
		RULE_printFunc = 12, RULE_boolExpr = 13, RULE_specialExpr = 14, RULE_libraryFunc = 15, 
		RULE_expr = 16;
	public static final String[] ruleNames = {
		"exprList", "codeBlock", "topExpr", "ifDef", "whileDef", "forDef", "funcDef", 
		"funcCall", "params", "paramValues", "autoVars", "varDef", "printFunc", 
		"boolExpr", "specialExpr", "libraryFunc", "expr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'if'", "'else'", "'('", "')'", "'{'", "'}'", "'s'", "'c'", 
		"'l'", "'e'", "','", "';'", "'define'", "'auto'", "'return'", "'sqrt'", 
		"'read'", "'print'", "'while'", "'for'", null, null, "'-'", "'+'", "'/'", 
		"'*'", "'=='", "'='", "'!='", "'>'", "'>='", "'<'", "'<='", "'&&'", "'||'", 
		"'!'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WS", "IF", "ELSE", "OPAR", "CPAR", "OBRC", "CBRC", "S", "C", "L", 
		"E", "COMMA", "SEMICOLON", "DEFINE", "AUTO", "RETURN", "SQRT", "READ", 
		"PRINT", "WHILE", "FOR", "NUM", "COM", "SUB", "ADD", "DIV", "MUL", "EQ", 
		"ASSIGN", "NEQ", "GRE", "GREQ", "LT", "LTEQ", "AND", "OR", "NOT", "ID"
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
		public List<TopExprContext> topExpr() {
			return getRuleContexts(TopExprContext.class);
		}
		public TopExprContext topExpr(int i) {
			return getRuleContext(TopExprContext.class,i);
		}
		public CodeBlockTagContext(CodeBlockContext ctx) { copyFrom(ctx); }
	}

	public final CodeBlockContext codeBlock() throws RecognitionException {
		CodeBlockContext _localctx = new CodeBlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_codeBlock);
		int _la;
		try {
			_localctx = new CodeBlockTagContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << OPAR) | (1L << S) | (1L << C) | (1L << L) | (1L << E) | (1L << DEFINE) | (1L << SQRT) | (1L << READ) | (1L << PRINT) | (1L << WHILE) | (1L << FOR) | (1L << NUM) | (1L << NOT) | (1L << ID))) != 0)) {
				{
				{
				setState(41);
				topExpr();
				}
				}
				setState(46);
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
	}

	public final TopExprContext topExpr() throws RecognitionException {
		TopExprContext _localctx = new TopExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_topExpr);
		try {
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				ifDef();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(48);
				forDef();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(49);
				whileDef();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(50);
				funcDef();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(51);
				funcCall();
				setState(52);
				match(SEMICOLON);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(54);
				expr(0);
				setState(55);
				match(SEMICOLON);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(57);
				varDef();
				setState(58);
				match(SEMICOLON);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(60);
				boolExpr();
				setState(61);
				match(SEMICOLON);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(63);
				specialExpr();
				setState(64);
				match(SEMICOLON);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(66);
				libraryFunc();
				setState(67);
				match(SEMICOLON);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(69);
				printFunc();
				setState(70);
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
	}

	public final IfDefContext ifDef() throws RecognitionException {
		IfDefContext _localctx = new IfDefContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ifDef);
		try {
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new IfDefSingleTagContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				match(IF);
				setState(75);
				match(OPAR);
				setState(76);
				((IfDefSingleTagContext)_localctx).cond = boolExpr();
				setState(77);
				match(CPAR);
				setState(78);
				((IfDefSingleTagContext)_localctx).expr1 = topExpr();
				setState(81);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(79);
					match(ELSE);
					setState(80);
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
				setState(83);
				match(IF);
				setState(84);
				match(OPAR);
				setState(85);
				((IfDefMultipleTagContext)_localctx).cond = boolExpr();
				setState(86);
				match(CPAR);
				setState(87);
				match(OBRC);
				setState(88);
				((IfDefMultipleTagContext)_localctx).exprList1 = codeBlock();
				setState(89);
				match(CBRC);
				setState(95);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(90);
					match(ELSE);
					setState(91);
					match(OBRC);
					setState(92);
					((IfDefMultipleTagContext)_localctx).exprList2 = codeBlock();
					setState(93);
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
	}

	public final WhileDefContext whileDef() throws RecognitionException {
		WhileDefContext _localctx = new WhileDefContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_whileDef);
		try {
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new WhileDefSingleTagContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				match(WHILE);
				setState(100);
				match(OPAR);
				setState(101);
				((WhileDefSingleTagContext)_localctx).cond = boolExpr();
				setState(102);
				match(CPAR);
				setState(103);
				((WhileDefSingleTagContext)_localctx).exec = topExpr();
				}
				break;
			case 2:
				_localctx = new WhileDefMultipleTagContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				match(WHILE);
				setState(106);
				match(OPAR);
				setState(107);
				((WhileDefMultipleTagContext)_localctx).cond = boolExpr();
				setState(108);
				match(CPAR);
				setState(109);
				match(OBRC);
				setState(110);
				((WhileDefMultipleTagContext)_localctx).exec = codeBlock();
				setState(111);
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
	}

	public final ForDefContext forDef() throws RecognitionException {
		ForDefContext _localctx = new ForDefContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_forDef);
		try {
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new ForDefSingleTagContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				match(FOR);
				setState(116);
				match(OPAR);
				setState(117);
				((ForDefSingleTagContext)_localctx).expr1 = varDef();
				setState(118);
				match(SEMICOLON);
				setState(119);
				((ForDefSingleTagContext)_localctx).cond = boolExpr();
				setState(120);
				match(SEMICOLON);
				setState(121);
				((ForDefSingleTagContext)_localctx).expr2 = varDef();
				setState(122);
				match(CPAR);
				setState(123);
				((ForDefSingleTagContext)_localctx).exec = topExpr();
				}
				break;
			case 2:
				_localctx = new ForDefMultipleTagContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				match(FOR);
				setState(126);
				match(OPAR);
				setState(127);
				((ForDefMultipleTagContext)_localctx).expr1 = varDef();
				setState(128);
				match(SEMICOLON);
				setState(129);
				((ForDefMultipleTagContext)_localctx).cond = boolExpr();
				setState(130);
				match(SEMICOLON);
				setState(131);
				((ForDefMultipleTagContext)_localctx).expr2 = varDef();
				setState(132);
				match(CPAR);
				setState(133);
				match(OBRC);
				setState(134);
				((ForDefMultipleTagContext)_localctx).exec = codeBlock();
				setState(135);
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
		public ExprContext returnExpr;
		public CodeBlockContext ignored;
		public TerminalNode DEFINE() { return getToken(CalculatorParser.DEFINE, 0); }
		public TerminalNode OBRC() { return getToken(CalculatorParser.OBRC, 0); }
		public TerminalNode RETURN() { return getToken(CalculatorParser.RETURN, 0); }
		public TerminalNode SEMICOLON() { return getToken(CalculatorParser.SEMICOLON, 0); }
		public TerminalNode CBRC() { return getToken(CalculatorParser.CBRC, 0); }
		public TerminalNode ID() { return getToken(CalculatorParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
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
		public FuncDefTagContext(FuncDefContext ctx) { copyFrom(ctx); }
	}

	public final FuncDefContext funcDef() throws RecognitionException {
		FuncDefContext _localctx = new FuncDefContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_funcDef);
		int _la;
		try {
			_localctx = new FuncDefTagContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(DEFINE);
			setState(140);
			((FuncDefTagContext)_localctx).funcName = match(ID);
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPAR) {
				{
				setState(141);
				params();
				}
			}

			setState(144);
			match(OBRC);
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AUTO) {
				{
				setState(145);
				autoVars();
				}
			}

			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(148);
				((FuncDefTagContext)_localctx).exec = codeBlock();
				}
				break;
			}
			setState(151);
			match(RETURN);
			setState(152);
			((FuncDefTagContext)_localctx).returnExpr = expr(0);
			setState(153);
			match(SEMICOLON);
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(154);
				((FuncDefTagContext)_localctx).ignored = codeBlock();
				}
				break;
			}
			setState(157);
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
	}

	public final FuncCallContext funcCall() throws RecognitionException {
		FuncCallContext _localctx = new FuncCallContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_funcCall);
		int _la;
		try {
			_localctx = new FuncCallTagContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(ID);
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPAR) {
				{
				setState(160);
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
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(OPAR);
			setState(164);
			match(ID);
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(165);
				match(COMMA);
				setState(166);
				match(ID);
				}
				}
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(172);
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
	}

	public final ParamValuesContext paramValues() throws RecognitionException {
		ParamValuesContext _localctx = new ParamValuesContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_paramValues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(OPAR);
			setState(175);
			match(NUM);
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(176);
				match(COMMA);
				setState(177);
				match(NUM);
				}
				}
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(183);
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
	}

	public final AutoVarsContext autoVars() throws RecognitionException {
		AutoVarsContext _localctx = new AutoVarsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_autoVars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(AUTO);
			setState(186);
			match(ID);
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(187);
				match(COMMA);
				setState(188);
				match(ID);
				}
				}
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(194);
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
	}
	public static class VarDefFuncCallTagContext extends VarDefContext {
		public TerminalNode ID() { return getToken(CalculatorParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(CalculatorParser.ASSIGN, 0); }
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public VarDefFuncCallTagContext(VarDefContext ctx) { copyFrom(ctx); }
	}
	public static class VarDefSpecialExprTagContext extends VarDefContext {
		public TerminalNode ID() { return getToken(CalculatorParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(CalculatorParser.ASSIGN, 0); }
		public SpecialExprContext specialExpr() {
			return getRuleContext(SpecialExprContext.class,0);
		}
		public VarDefSpecialExprTagContext(VarDefContext ctx) { copyFrom(ctx); }
	}
	public static class VarDefBoolExprTagContext extends VarDefContext {
		public TerminalNode ID() { return getToken(CalculatorParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(CalculatorParser.ASSIGN, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public VarDefBoolExprTagContext(VarDefContext ctx) { copyFrom(ctx); }
	}
	public static class VarDefLibraryFuncTagContext extends VarDefContext {
		public TerminalNode ID() { return getToken(CalculatorParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(CalculatorParser.ASSIGN, 0); }
		public LibraryFuncContext libraryFunc() {
			return getRuleContext(LibraryFuncContext.class,0);
		}
		public VarDefLibraryFuncTagContext(VarDefContext ctx) { copyFrom(ctx); }
	}

	public final VarDefContext varDef() throws RecognitionException {
		VarDefContext _localctx = new VarDefContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_varDef);
		try {
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new VarDefTagContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				match(ID);
				setState(198);
				match(ASSIGN);
				setState(199);
				expr(0);
				}
				break;
			case 2:
				_localctx = new VarDefFuncCallTagContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				match(ID);
				setState(201);
				match(ASSIGN);
				setState(202);
				funcCall();
				}
				break;
			case 3:
				_localctx = new VarDefBoolExprTagContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(203);
				match(ID);
				setState(204);
				match(ASSIGN);
				setState(205);
				boolExpr();
				}
				break;
			case 4:
				_localctx = new VarDefSpecialExprTagContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(206);
				match(ID);
				setState(207);
				match(ASSIGN);
				setState(208);
				specialExpr();
				}
				break;
			case 5:
				_localctx = new VarDefLibraryFuncTagContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(209);
				match(ID);
				setState(210);
				match(ASSIGN);
				setState(211);
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
	}

	public final PrintFuncContext printFunc() throws RecognitionException {
		PrintFuncContext _localctx = new PrintFuncContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_printFunc);
		int _la;
		try {
			_localctx = new PrintFuncTagContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(PRINT);
			setState(215);
			expr(0);
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(216);
				match(COMMA);
				setState(217);
				expr(0);
				}
				}
				setState(222);
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
	}
	public static class ExprBoolTagContext extends BoolExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprBoolTagContext(BoolExprContext ctx) { copyFrom(ctx); }
	}
	public static class NotBoolTagContext extends BoolExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NOT() { return getToken(CalculatorParser.NOT, 0); }
		public NotBoolTagContext(BoolExprContext ctx) { copyFrom(ctx); }
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
	}

	public final BoolExprContext boolExpr() throws RecognitionException {
		BoolExprContext _localctx = new BoolExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_boolExpr);
		try {
			setState(258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new ExprBoolTagContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				expr(0);
				}
				break;
			case 2:
				_localctx = new NotBoolTagContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(224);
				((NotBoolTagContext)_localctx).op = match(NOT);
				setState(225);
				expr(0);
				}
				break;
			case 3:
				_localctx = new GtBoolTagContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(226);
				expr(0);
				setState(227);
				((GtBoolTagContext)_localctx).op = match(GRE);
				setState(228);
				expr(0);
				}
				break;
			case 4:
				_localctx = new GteBoolTagContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(230);
				expr(0);
				setState(231);
				((GteBoolTagContext)_localctx).op = match(GREQ);
				setState(232);
				expr(0);
				}
				break;
			case 5:
				_localctx = new LtBoolTagContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(234);
				expr(0);
				setState(235);
				((LtBoolTagContext)_localctx).op = match(LT);
				setState(236);
				expr(0);
				}
				break;
			case 6:
				_localctx = new LteBoolTagContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(238);
				expr(0);
				setState(239);
				((LteBoolTagContext)_localctx).op = match(LTEQ);
				setState(240);
				expr(0);
				}
				break;
			case 7:
				_localctx = new EqBoolTagContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(242);
				expr(0);
				setState(243);
				((EqBoolTagContext)_localctx).op = match(EQ);
				setState(244);
				expr(0);
				}
				break;
			case 8:
				_localctx = new NeqBoolTagContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(246);
				expr(0);
				setState(247);
				((NeqBoolTagContext)_localctx).op = match(NEQ);
				setState(248);
				expr(0);
				}
				break;
			case 9:
				_localctx = new AndBoolTagContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(250);
				expr(0);
				setState(251);
				((AndBoolTagContext)_localctx).op = match(AND);
				setState(252);
				expr(0);
				}
				break;
			case 10:
				_localctx = new OrBoolTagContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(254);
				expr(0);
				setState(255);
				((OrBoolTagContext)_localctx).op = match(OR);
				setState(256);
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
	}

	public final SpecialExprContext specialExpr() throws RecognitionException {
		SpecialExprContext _localctx = new SpecialExprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_specialExpr);
		try {
			setState(268);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SQRT:
				_localctx = new SqrtExprTagContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				match(SQRT);
				setState(261);
				match(OPAR);
				setState(262);
				((SqrtExprTagContext)_localctx).value = expr(0);
				setState(263);
				match(CPAR);
				}
				break;
			case READ:
				_localctx = new ReadExprTagContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(265);
				match(READ);
				setState(266);
				match(OPAR);
				setState(267);
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
	}

	public final LibraryFuncContext libraryFunc() throws RecognitionException {
		LibraryFuncContext _localctx = new LibraryFuncContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_libraryFunc);
		try {
			setState(290);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case S:
				_localctx = new SinFuncTagContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				match(S);
				setState(271);
				match(OPAR);
				setState(272);
				((SinFuncTagContext)_localctx).var = expr(0);
				setState(273);
				match(CPAR);
				}
				break;
			case C:
				_localctx = new CosFuncTagContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(275);
				match(C);
				setState(276);
				match(OPAR);
				setState(277);
				((CosFuncTagContext)_localctx).var = expr(0);
				setState(278);
				match(CPAR);
				}
				break;
			case L:
				_localctx = new LogFuncTagContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(280);
				match(L);
				setState(281);
				match(OPAR);
				setState(282);
				((LogFuncTagContext)_localctx).var = expr(0);
				setState(283);
				match(CPAR);
				}
				break;
			case E:
				_localctx = new ExpFuncTagContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(285);
				match(E);
				setState(286);
				match(OPAR);
				setState(287);
				((ExpFuncTagContext)_localctx).var = expr(0);
				setState(288);
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
	}
	public static class NumExprTagContext extends ExprContext {
		public TerminalNode NUM() { return getToken(CalculatorParser.NUM, 0); }
		public NumExprTagContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class IdTagContext extends ExprContext {
		public TerminalNode ID() { return getToken(CalculatorParser.ID, 0); }
		public IdTagContext(ExprContext ctx) { copyFrom(ctx); }
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
			setState(299);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPAR:
				{
				_localctx = new ParenExprTagContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(293);
				match(OPAR);
				setState(294);
				expr(0);
				setState(295);
				match(CPAR);
				}
				break;
			case NUM:
				{
				_localctx = new NumExprTagContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(297);
				match(NUM);
				}
				break;
			case ID:
				{
				_localctx = new IdTagContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(298);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(315);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(313);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new MulExprTagContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(301);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(302);
						match(MUL);
						setState(303);
						expr(7);
						}
						break;
					case 2:
						{
						_localctx = new DivExprTagContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(304);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(305);
						match(DIV);
						setState(306);
						expr(6);
						}
						break;
					case 3:
						{
						_localctx = new AddExprTagContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(307);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(308);
						match(ADD);
						setState(309);
						expr(5);
						}
						break;
					case 4:
						{
						_localctx = new SubExprTagContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(310);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(311);
						match(SUB);
						setState(312);
						expr(4);
						}
						break;
					}
					} 
				}
				setState(317);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u0141\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\6\2&\n\2\r\2\16\2\'\3\2\3\2\3\3\7\3-\n\3\f\3\16\3\60\13\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\5\4K\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5T\n\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5b\n\5\5\5d\n\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6t\n\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\5\7\u008c\n\7\3\b\3\b\3\b\5\b\u0091\n\b\3\b\3\b\5\b\u0095\n\b"+
		"\3\b\5\b\u0098\n\b\3\b\3\b\3\b\3\b\5\b\u009e\n\b\3\b\3\b\3\t\3\t\5\t\u00a4"+
		"\n\t\3\n\3\n\3\n\3\n\7\n\u00aa\n\n\f\n\16\n\u00ad\13\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\7\13\u00b5\n\13\f\13\16\13\u00b8\13\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\7\f\u00c0\n\f\f\f\16\f\u00c3\13\f\3\f\5\f\u00c6\n\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00d7\n\r\3\16"+
		"\3\16\3\16\3\16\7\16\u00dd\n\16\f\16\16\16\u00e0\13\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\5\17\u0105\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\5\20\u010f\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0125\n\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u012e\n\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u013c\n\22\f\22\16\22\u013f\13"+
		"\22\3\22\2\3\"\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\2\2\u0161"+
		"\2%\3\2\2\2\4.\3\2\2\2\6J\3\2\2\2\bc\3\2\2\2\ns\3\2\2\2\f\u008b\3\2\2"+
		"\2\16\u008d\3\2\2\2\20\u00a1\3\2\2\2\22\u00a5\3\2\2\2\24\u00b0\3\2\2\2"+
		"\26\u00bb\3\2\2\2\30\u00d6\3\2\2\2\32\u00d8\3\2\2\2\34\u0104\3\2\2\2\36"+
		"\u010e\3\2\2\2 \u0124\3\2\2\2\"\u012d\3\2\2\2$&\5\6\4\2%$\3\2\2\2&\'\3"+
		"\2\2\2\'%\3\2\2\2\'(\3\2\2\2()\3\2\2\2)*\7\2\2\3*\3\3\2\2\2+-\5\6\4\2"+
		",+\3\2\2\2-\60\3\2\2\2.,\3\2\2\2./\3\2\2\2/\5\3\2\2\2\60.\3\2\2\2\61K"+
		"\5\b\5\2\62K\5\f\7\2\63K\5\n\6\2\64K\5\16\b\2\65\66\5\20\t\2\66\67\7\17"+
		"\2\2\67K\3\2\2\289\5\"\22\29:\7\17\2\2:K\3\2\2\2;<\5\30\r\2<=\7\17\2\2"+
		"=K\3\2\2\2>?\5\34\17\2?@\7\17\2\2@K\3\2\2\2AB\5\36\20\2BC\7\17\2\2CK\3"+
		"\2\2\2DE\5 \21\2EF\7\17\2\2FK\3\2\2\2GH\5\32\16\2HI\7\17\2\2IK\3\2\2\2"+
		"J\61\3\2\2\2J\62\3\2\2\2J\63\3\2\2\2J\64\3\2\2\2J\65\3\2\2\2J8\3\2\2\2"+
		"J;\3\2\2\2J>\3\2\2\2JA\3\2\2\2JD\3\2\2\2JG\3\2\2\2K\7\3\2\2\2LM\7\4\2"+
		"\2MN\7\6\2\2NO\5\34\17\2OP\7\7\2\2PS\5\6\4\2QR\7\5\2\2RT\5\6\4\2SQ\3\2"+
		"\2\2ST\3\2\2\2Td\3\2\2\2UV\7\4\2\2VW\7\6\2\2WX\5\34\17\2XY\7\7\2\2YZ\7"+
		"\b\2\2Z[\5\4\3\2[a\7\t\2\2\\]\7\5\2\2]^\7\b\2\2^_\5\4\3\2_`\7\t\2\2`b"+
		"\3\2\2\2a\\\3\2\2\2ab\3\2\2\2bd\3\2\2\2cL\3\2\2\2cU\3\2\2\2d\t\3\2\2\2"+
		"ef\7\26\2\2fg\7\6\2\2gh\5\34\17\2hi\7\7\2\2ij\5\6\4\2jt\3\2\2\2kl\7\26"+
		"\2\2lm\7\6\2\2mn\5\34\17\2no\7\7\2\2op\7\b\2\2pq\5\4\3\2qr\7\t\2\2rt\3"+
		"\2\2\2se\3\2\2\2sk\3\2\2\2t\13\3\2\2\2uv\7\27\2\2vw\7\6\2\2wx\5\30\r\2"+
		"xy\7\17\2\2yz\5\34\17\2z{\7\17\2\2{|\5\30\r\2|}\7\7\2\2}~\5\6\4\2~\u008c"+
		"\3\2\2\2\177\u0080\7\27\2\2\u0080\u0081\7\6\2\2\u0081\u0082\5\30\r\2\u0082"+
		"\u0083\7\17\2\2\u0083\u0084\5\34\17\2\u0084\u0085\7\17\2\2\u0085\u0086"+
		"\5\30\r\2\u0086\u0087\7\7\2\2\u0087\u0088\7\b\2\2\u0088\u0089\5\4\3\2"+
		"\u0089\u008a\7\t\2\2\u008a\u008c\3\2\2\2\u008bu\3\2\2\2\u008b\177\3\2"+
		"\2\2\u008c\r\3\2\2\2\u008d\u008e\7\20\2\2\u008e\u0090\7(\2\2\u008f\u0091"+
		"\5\22\n\2\u0090\u008f\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\3\2\2\2"+
		"\u0092\u0094\7\b\2\2\u0093\u0095\5\26\f\2\u0094\u0093\3\2\2\2\u0094\u0095"+
		"\3\2\2\2\u0095\u0097\3\2\2\2\u0096\u0098\5\4\3\2\u0097\u0096\3\2\2\2\u0097"+
		"\u0098\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\7\22\2\2\u009a\u009b\5"+
		"\"\22\2\u009b\u009d\7\17\2\2\u009c\u009e\5\4\3\2\u009d\u009c\3\2\2\2\u009d"+
		"\u009e\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\7\t\2\2\u00a0\17\3\2\2"+
		"\2\u00a1\u00a3\7(\2\2\u00a2\u00a4\5\24\13\2\u00a3\u00a2\3\2\2\2\u00a3"+
		"\u00a4\3\2\2\2\u00a4\21\3\2\2\2\u00a5\u00a6\7\6\2\2\u00a6\u00ab\7(\2\2"+
		"\u00a7\u00a8\7\16\2\2\u00a8\u00aa\7(\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00ad"+
		"\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ae\3\2\2\2\u00ad"+
		"\u00ab\3\2\2\2\u00ae\u00af\7\7\2\2\u00af\23\3\2\2\2\u00b0\u00b1\7\6\2"+
		"\2\u00b1\u00b6\7\30\2\2\u00b2\u00b3\7\16\2\2\u00b3\u00b5\7\30\2\2\u00b4"+
		"\u00b2\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2"+
		"\2\2\u00b7\u00b9\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00ba\7\7\2\2\u00ba"+
		"\25\3\2\2\2\u00bb\u00bc\7\21\2\2\u00bc\u00c1\7(\2\2\u00bd\u00be\7\16\2"+
		"\2\u00be\u00c0\7(\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf"+
		"\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4"+
		"\u00c6\7\17\2\2\u00c5\u00c4\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\27\3\2\2"+
		"\2\u00c7\u00c8\7(\2\2\u00c8\u00c9\7\37\2\2\u00c9\u00d7\5\"\22\2\u00ca"+
		"\u00cb\7(\2\2\u00cb\u00cc\7\37\2\2\u00cc\u00d7\5\20\t\2\u00cd\u00ce\7"+
		"(\2\2\u00ce\u00cf\7\37\2\2\u00cf\u00d7\5\34\17\2\u00d0\u00d1\7(\2\2\u00d1"+
		"\u00d2\7\37\2\2\u00d2\u00d7\5\36\20\2\u00d3\u00d4\7(\2\2\u00d4\u00d5\7"+
		"\37\2\2\u00d5\u00d7\5 \21\2\u00d6\u00c7\3\2\2\2\u00d6\u00ca\3\2\2\2\u00d6"+
		"\u00cd\3\2\2\2\u00d6\u00d0\3\2\2\2\u00d6\u00d3\3\2\2\2\u00d7\31\3\2\2"+
		"\2\u00d8\u00d9\7\25\2\2\u00d9\u00de\5\"\22\2\u00da\u00db\7\16\2\2\u00db"+
		"\u00dd\5\"\22\2\u00dc\u00da\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3"+
		"\2\2\2\u00de\u00df\3\2\2\2\u00df\33\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1"+
		"\u0105\5\"\22\2\u00e2\u00e3\7\'\2\2\u00e3\u0105\5\"\22\2\u00e4\u00e5\5"+
		"\"\22\2\u00e5\u00e6\7!\2\2\u00e6\u00e7\5\"\22\2\u00e7\u0105\3\2\2\2\u00e8"+
		"\u00e9\5\"\22\2\u00e9\u00ea\7\"\2\2\u00ea\u00eb\5\"\22\2\u00eb\u0105\3"+
		"\2\2\2\u00ec\u00ed\5\"\22\2\u00ed\u00ee\7#\2\2\u00ee\u00ef\5\"\22\2\u00ef"+
		"\u0105\3\2\2\2\u00f0\u00f1\5\"\22\2\u00f1\u00f2\7$\2\2\u00f2\u00f3\5\""+
		"\22\2\u00f3\u0105\3\2\2\2\u00f4\u00f5\5\"\22\2\u00f5\u00f6\7\36\2\2\u00f6"+
		"\u00f7\5\"\22\2\u00f7\u0105\3\2\2\2\u00f8\u00f9\5\"\22\2\u00f9\u00fa\7"+
		" \2\2\u00fa\u00fb\5\"\22\2\u00fb\u0105\3\2\2\2\u00fc\u00fd\5\"\22\2\u00fd"+
		"\u00fe\7%\2\2\u00fe\u00ff\5\"\22\2\u00ff\u0105\3\2\2\2\u0100\u0101\5\""+
		"\22\2\u0101\u0102\7&\2\2\u0102\u0103\5\"\22\2\u0103\u0105\3\2\2\2\u0104"+
		"\u00e1\3\2\2\2\u0104\u00e2\3\2\2\2\u0104\u00e4\3\2\2\2\u0104\u00e8\3\2"+
		"\2\2\u0104\u00ec\3\2\2\2\u0104\u00f0\3\2\2\2\u0104\u00f4\3\2\2\2\u0104"+
		"\u00f8\3\2\2\2\u0104\u00fc\3\2\2\2\u0104\u0100\3\2\2\2\u0105\35\3\2\2"+
		"\2\u0106\u0107\7\23\2\2\u0107\u0108\7\6\2\2\u0108\u0109\5\"\22\2\u0109"+
		"\u010a\7\7\2\2\u010a\u010f\3\2\2\2\u010b\u010c\7\24\2\2\u010c\u010d\7"+
		"\6\2\2\u010d\u010f\7\7\2\2\u010e\u0106\3\2\2\2\u010e\u010b\3\2\2\2\u010f"+
		"\37\3\2\2\2\u0110\u0111\7\n\2\2\u0111\u0112\7\6\2\2\u0112\u0113\5\"\22"+
		"\2\u0113\u0114\7\7\2\2\u0114\u0125\3\2\2\2\u0115\u0116\7\13\2\2\u0116"+
		"\u0117\7\6\2\2\u0117\u0118\5\"\22\2\u0118\u0119\7\7\2\2\u0119\u0125\3"+
		"\2\2\2\u011a\u011b\7\f\2\2\u011b\u011c\7\6\2\2\u011c\u011d\5\"\22\2\u011d"+
		"\u011e\7\7\2\2\u011e\u0125\3\2\2\2\u011f\u0120\7\r\2\2\u0120\u0121\7\6"+
		"\2\2\u0121\u0122\5\"\22\2\u0122\u0123\7\7\2\2\u0123\u0125\3\2\2\2\u0124"+
		"\u0110\3\2\2\2\u0124\u0115\3\2\2\2\u0124\u011a\3\2\2\2\u0124\u011f\3\2"+
		"\2\2\u0125!\3\2\2\2\u0126\u0127\b\22\1\2\u0127\u0128\7\6\2\2\u0128\u0129"+
		"\5\"\22\2\u0129\u012a\7\7\2\2\u012a\u012e\3\2\2\2\u012b\u012e\7\30\2\2"+
		"\u012c\u012e\7(\2\2\u012d\u0126\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012c"+
		"\3\2\2\2\u012e\u013d\3\2\2\2\u012f\u0130\f\b\2\2\u0130\u0131\7\35\2\2"+
		"\u0131\u013c\5\"\22\t\u0132\u0133\f\7\2\2\u0133\u0134\7\34\2\2\u0134\u013c"+
		"\5\"\22\b\u0135\u0136\f\6\2\2\u0136\u0137\7\33\2\2\u0137\u013c\5\"\22"+
		"\7\u0138\u0139\f\5\2\2\u0139\u013a\7\32\2\2\u013a\u013c\5\"\22\6\u013b"+
		"\u012f\3\2\2\2\u013b\u0132\3\2\2\2\u013b\u0135\3\2\2\2\u013b\u0138\3\2"+
		"\2\2\u013c\u013f\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e"+
		"#\3\2\2\2\u013f\u013d\3\2\2\2\33\'.JSacs\u008b\u0090\u0094\u0097\u009d"+
		"\u00a3\u00ab\u00b6\u00c1\u00c5\u00d6\u00de\u0104\u010e\u0124\u012d\u013b"+
		"\u013d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}