// Generated from Calculator.g4 by ANTLR 4.7.2

    import java.util.HashMap;
    import java.util.ArrayList;
    import java.lang.Math;
    import java.util.Scanner;
    import java.util.Stack;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalculatorParser}.
 */
public interface CalculatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterExprList(CalculatorParser.ExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitExprList(CalculatorParser.ExprListContext ctx);
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
	 * Enter a parse tree produced by {@link CalculatorParser#ifDef}.
	 * @param ctx the parse tree
	 */
	void enterIfDef(CalculatorParser.IfDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#ifDef}.
	 * @param ctx the parse tree
	 */
	void exitIfDef(CalculatorParser.IfDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#whileDef}.
	 * @param ctx the parse tree
	 */
	void enterWhileDef(CalculatorParser.WhileDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#whileDef}.
	 * @param ctx the parse tree
	 */
	void exitWhileDef(CalculatorParser.WhileDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#forDef}.
	 * @param ctx the parse tree
	 */
	void enterForDef(CalculatorParser.ForDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#forDef}.
	 * @param ctx the parse tree
	 */
	void exitForDef(CalculatorParser.ForDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#varDef}.
	 * @param ctx the parse tree
	 */
	void enterVarDef(CalculatorParser.VarDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#varDef}.
	 * @param ctx the parse tree
	 */
	void exitVarDef(CalculatorParser.VarDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#printFunc}.
	 * @param ctx the parse tree
	 */
	void enterPrintFunc(CalculatorParser.PrintFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#printFunc}.
	 * @param ctx the parse tree
	 */
	void exitPrintFunc(CalculatorParser.PrintFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpr(CalculatorParser.BoolExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpr(CalculatorParser.BoolExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#specialExpr}.
	 * @param ctx the parse tree
	 */
	void enterSpecialExpr(CalculatorParser.SpecialExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#specialExpr}.
	 * @param ctx the parse tree
	 */
	void exitSpecialExpr(CalculatorParser.SpecialExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#libraryFunc}.
	 * @param ctx the parse tree
	 */
	void enterLibraryFunc(CalculatorParser.LibraryFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#libraryFunc}.
	 * @param ctx the parse tree
	 */
	void exitLibraryFunc(CalculatorParser.LibraryFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(CalculatorParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(CalculatorParser.ExprContext ctx);
}