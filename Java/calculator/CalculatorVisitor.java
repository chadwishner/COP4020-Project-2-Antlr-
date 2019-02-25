// Generated from Calculator.g4 by ANTLR 4.7.2

    package calculator;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CalculatorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CalculatorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code exprListTag}
	 * labeled alternative in {@link CalculatorParser#exprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprListTag(CalculatorParser.ExprListTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#topExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopExpr(CalculatorParser.TopExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifDefTag}
	 * labeled alternative in {@link CalculatorParser#ifDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfDefTag(CalculatorParser.IfDefTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileDefTag}
	 * labeled alternative in {@link CalculatorParser#whileDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileDefTag(CalculatorParser.WhileDefTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forDefTag}
	 * labeled alternative in {@link CalculatorParser#forDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForDefTag(CalculatorParser.ForDefTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varDefTag}
	 * labeled alternative in {@link CalculatorParser#varDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDefTag(CalculatorParser.VarDefTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printFuncTag}
	 * labeled alternative in {@link CalculatorParser#printFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintFuncTag(CalculatorParser.PrintFuncTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprBoolTag}
	 * labeled alternative in {@link CalculatorParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBoolTag(CalculatorParser.ExprBoolTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notBoolTag}
	 * labeled alternative in {@link CalculatorParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotBoolTag(CalculatorParser.NotBoolTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code gtBoolTag}
	 * labeled alternative in {@link CalculatorParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGtBoolTag(CalculatorParser.GtBoolTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code gteBoolTag}
	 * labeled alternative in {@link CalculatorParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGteBoolTag(CalculatorParser.GteBoolTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ltBoolTag}
	 * labeled alternative in {@link CalculatorParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLtBoolTag(CalculatorParser.LtBoolTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lteBoolTag}
	 * labeled alternative in {@link CalculatorParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLteBoolTag(CalculatorParser.LteBoolTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eqBoolTag}
	 * labeled alternative in {@link CalculatorParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqBoolTag(CalculatorParser.EqBoolTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code neqBoolTag}
	 * labeled alternative in {@link CalculatorParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNeqBoolTag(CalculatorParser.NeqBoolTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andBoolTag}
	 * labeled alternative in {@link CalculatorParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndBoolTag(CalculatorParser.AndBoolTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orBoolTag}
	 * labeled alternative in {@link CalculatorParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrBoolTag(CalculatorParser.OrBoolTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sqrtExprTag}
	 * labeled alternative in {@link CalculatorParser#specialExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqrtExprTag(CalculatorParser.SqrtExprTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code readExprTag}
	 * labeled alternative in {@link CalculatorParser#specialExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadExprTag(CalculatorParser.ReadExprTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sinFuncTag}
	 * labeled alternative in {@link CalculatorParser#libraryFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSinFuncTag(CalculatorParser.SinFuncTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cosFuncTag}
	 * labeled alternative in {@link CalculatorParser#libraryFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCosFuncTag(CalculatorParser.CosFuncTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logFuncTag}
	 * labeled alternative in {@link CalculatorParser#libraryFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogFuncTag(CalculatorParser.LogFuncTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expFuncTag}
	 * labeled alternative in {@link CalculatorParser#libraryFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpFuncTag(CalculatorParser.ExpFuncTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenExprTag}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExprTag(CalculatorParser.ParenExprTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addExprTag}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExprTag(CalculatorParser.AddExprTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numExprTag}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumExprTag(CalculatorParser.NumExprTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idTag}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdTag(CalculatorParser.IdTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code divExprTag}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivExprTag(CalculatorParser.DivExprTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulExprTag}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulExprTag(CalculatorParser.MulExprTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subExprTag}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubExprTag(CalculatorParser.SubExprTagContext ctx);
}