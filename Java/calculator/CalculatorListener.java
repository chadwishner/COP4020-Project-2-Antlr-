// Generated from Calculator.g4 by ANTLR 4.7.2

    package calculator;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalculatorParser}.
 */
public interface CalculatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(CalculatorParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(CalculatorParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprListTag}
	 * labeled alternative in {@link CalculatorParser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterExprListTag(CalculatorParser.ExprListTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprListTag}
	 * labeled alternative in {@link CalculatorParser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitExprListTag(CalculatorParser.ExprListTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#topExpr}.
	 * @param ctx the parse tree
	 */
	void enterTopExpr(CalculatorParser.TopExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#topExpr}.
	 * @param ctx the parse tree
	 */
	void exitTopExpr(CalculatorParser.TopExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifDefTag}
	 * labeled alternative in {@link CalculatorParser#ifDef}.
	 * @param ctx the parse tree
	 */
	void enterIfDefTag(CalculatorParser.IfDefTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifDefTag}
	 * labeled alternative in {@link CalculatorParser#ifDef}.
	 * @param ctx the parse tree
	 */
	void exitIfDefTag(CalculatorParser.IfDefTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileDefTag}
	 * labeled alternative in {@link CalculatorParser#whileDef}.
	 * @param ctx the parse tree
	 */
	void enterWhileDefTag(CalculatorParser.WhileDefTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileDefTag}
	 * labeled alternative in {@link CalculatorParser#whileDef}.
	 * @param ctx the parse tree
	 */
	void exitWhileDefTag(CalculatorParser.WhileDefTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forDefTag}
	 * labeled alternative in {@link CalculatorParser#forDef}.
	 * @param ctx the parse tree
	 */
	void enterForDefTag(CalculatorParser.ForDefTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forDefTag}
	 * labeled alternative in {@link CalculatorParser#forDef}.
	 * @param ctx the parse tree
	 */
	void exitForDefTag(CalculatorParser.ForDefTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varDefTag}
	 * labeled alternative in {@link CalculatorParser#varDef}.
	 * @param ctx the parse tree
	 */
	void enterVarDefTag(CalculatorParser.VarDefTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varDefTag}
	 * labeled alternative in {@link CalculatorParser#varDef}.
	 * @param ctx the parse tree
	 */
	void exitVarDefTag(CalculatorParser.VarDefTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printFuncTag}
	 * labeled alternative in {@link CalculatorParser#printFunc}.
	 * @param ctx the parse tree
	 */
	void enterPrintFuncTag(CalculatorParser.PrintFuncTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printFuncTag}
	 * labeled alternative in {@link CalculatorParser#printFunc}.
	 * @param ctx the parse tree
	 */
	void exitPrintFuncTag(CalculatorParser.PrintFuncTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprBoolTag}
	 * labeled alternative in {@link CalculatorParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterExprBoolTag(CalculatorParser.ExprBoolTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprBoolTag}
	 * labeled alternative in {@link CalculatorParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitExprBoolTag(CalculatorParser.ExprBoolTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notBoolTag}
	 * labeled alternative in {@link CalculatorParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterNotBoolTag(CalculatorParser.NotBoolTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notBoolTag}
	 * labeled alternative in {@link CalculatorParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitNotBoolTag(CalculatorParser.NotBoolTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code gtBoolTag}
	 * labeled alternative in {@link CalculatorParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterGtBoolTag(CalculatorParser.GtBoolTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code gtBoolTag}
	 * labeled alternative in {@link CalculatorParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitGtBoolTag(CalculatorParser.GtBoolTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code gteBoolTag}
	 * labeled alternative in {@link CalculatorParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterGteBoolTag(CalculatorParser.GteBoolTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code gteBoolTag}
	 * labeled alternative in {@link CalculatorParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitGteBoolTag(CalculatorParser.GteBoolTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ltBoolTag}
	 * labeled alternative in {@link CalculatorParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterLtBoolTag(CalculatorParser.LtBoolTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ltBoolTag}
	 * labeled alternative in {@link CalculatorParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitLtBoolTag(CalculatorParser.LtBoolTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lteBoolTag}
	 * labeled alternative in {@link CalculatorParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterLteBoolTag(CalculatorParser.LteBoolTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lteBoolTag}
	 * labeled alternative in {@link CalculatorParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitLteBoolTag(CalculatorParser.LteBoolTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqBoolTag}
	 * labeled alternative in {@link CalculatorParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterEqBoolTag(CalculatorParser.EqBoolTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqBoolTag}
	 * labeled alternative in {@link CalculatorParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitEqBoolTag(CalculatorParser.EqBoolTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code neqBoolTag}
	 * labeled alternative in {@link CalculatorParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterNeqBoolTag(CalculatorParser.NeqBoolTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code neqBoolTag}
	 * labeled alternative in {@link CalculatorParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitNeqBoolTag(CalculatorParser.NeqBoolTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andBoolTag}
	 * labeled alternative in {@link CalculatorParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterAndBoolTag(CalculatorParser.AndBoolTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andBoolTag}
	 * labeled alternative in {@link CalculatorParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitAndBoolTag(CalculatorParser.AndBoolTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orBoolTag}
	 * labeled alternative in {@link CalculatorParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterOrBoolTag(CalculatorParser.OrBoolTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orBoolTag}
	 * labeled alternative in {@link CalculatorParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitOrBoolTag(CalculatorParser.OrBoolTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sqrtExprTag}
	 * labeled alternative in {@link CalculatorParser#specialExpr}.
	 * @param ctx the parse tree
	 */
	void enterSqrtExprTag(CalculatorParser.SqrtExprTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sqrtExprTag}
	 * labeled alternative in {@link CalculatorParser#specialExpr}.
	 * @param ctx the parse tree
	 */
	void exitSqrtExprTag(CalculatorParser.SqrtExprTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code readExprTag}
	 * labeled alternative in {@link CalculatorParser#specialExpr}.
	 * @param ctx the parse tree
	 */
	void enterReadExprTag(CalculatorParser.ReadExprTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code readExprTag}
	 * labeled alternative in {@link CalculatorParser#specialExpr}.
	 * @param ctx the parse tree
	 */
	void exitReadExprTag(CalculatorParser.ReadExprTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sinFuncTag}
	 * labeled alternative in {@link CalculatorParser#libraryFunc}.
	 * @param ctx the parse tree
	 */
	void enterSinFuncTag(CalculatorParser.SinFuncTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sinFuncTag}
	 * labeled alternative in {@link CalculatorParser#libraryFunc}.
	 * @param ctx the parse tree
	 */
	void exitSinFuncTag(CalculatorParser.SinFuncTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cosFuncTag}
	 * labeled alternative in {@link CalculatorParser#libraryFunc}.
	 * @param ctx the parse tree
	 */
	void enterCosFuncTag(CalculatorParser.CosFuncTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cosFuncTag}
	 * labeled alternative in {@link CalculatorParser#libraryFunc}.
	 * @param ctx the parse tree
	 */
	void exitCosFuncTag(CalculatorParser.CosFuncTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logFuncTag}
	 * labeled alternative in {@link CalculatorParser#libraryFunc}.
	 * @param ctx the parse tree
	 */
	void enterLogFuncTag(CalculatorParser.LogFuncTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logFuncTag}
	 * labeled alternative in {@link CalculatorParser#libraryFunc}.
	 * @param ctx the parse tree
	 */
	void exitLogFuncTag(CalculatorParser.LogFuncTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expFuncTag}
	 * labeled alternative in {@link CalculatorParser#libraryFunc}.
	 * @param ctx the parse tree
	 */
	void enterExpFuncTag(CalculatorParser.ExpFuncTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expFuncTag}
	 * labeled alternative in {@link CalculatorParser#libraryFunc}.
	 * @param ctx the parse tree
	 */
	void exitExpFuncTag(CalculatorParser.ExpFuncTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenExprTag}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenExprTag(CalculatorParser.ParenExprTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenExprTag}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenExprTag(CalculatorParser.ParenExprTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addExprTag}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddExprTag(CalculatorParser.AddExprTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addExprTag}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddExprTag(CalculatorParser.AddExprTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numExprTag}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNumExprTag(CalculatorParser.NumExprTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numExprTag}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNumExprTag(CalculatorParser.NumExprTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idTag}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIdTag(CalculatorParser.IdTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idTag}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIdTag(CalculatorParser.IdTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code divExprTag}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDivExprTag(CalculatorParser.DivExprTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code divExprTag}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDivExprTag(CalculatorParser.DivExprTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulExprTag}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulExprTag(CalculatorParser.MulExprTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulExprTag}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulExprTag(CalculatorParser.MulExprTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subExprTag}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSubExprTag(CalculatorParser.SubExprTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subExprTag}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSubExprTag(CalculatorParser.SubExprTagContext ctx);
}