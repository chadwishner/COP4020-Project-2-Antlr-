package calculator;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.lang.Math;
import java.util.Scanner;

public class EvalVisitor extends CalculatorBaseVisitor<Double> {

    List<Double> prints = new ArrayList<Double>();
    Scanner scan = new Scanner(System.in);

    // Create a new global scope, of which new sub-scopes will be created from.
    Scope global_scope = new Scope(null, true);
    Scope current_scope = global_scope;

   @Override public Double visitTopExpr(CalculatorParser.TopExprContext ctx) { return visitChildren(ctx); }

    @Override
    public Double visitExprListTag(CalculatorParser.ExprListTagContext ctx){
        List<CalculatorParser.TopExprContext> topExpressions = ctx.topExpr();
        for(CalculatorParser.TopExprContext topExpression : topExpressions){
            System.out.println(visit(topExpression));
        }
        return null;
    }

    // The ID referenced below may need to be passed in as a obj of String
    @Override
    public Double visitVarDefTag(CalculatorParser.VarDefTagContext ctx){
        this.current_scope.getVariables().put(ctx.ID().getText(), visit(ctx.expr()));
        return visit(ctx.expr());
    }

    //TODO:
    //@Override
    //public void visitIfDef(CalculatorParser.ifDefContext ctx){}

    //TODO:
    //@Override
    //public void visitForDef(CalculatorParser.forDefContext ctx){}

    //TODO:
    //@Override
    //public void visitWhileDef(CalculatorParser.whileDefContext ctx){}


    /* ====================== BOOLEAN EXPR ====================== */ 
    @Override
    public Double visitExprBoolTag(CalculatorParser.ExprBoolTagContext ctx){
        if(visit(ctx.expr()) != 0){
            return 1.0;
        }else{
            return 0.0;
        }
    }

    @Override
    public Double visitNotBoolTag(CalculatorParser.NotBoolTagContext ctx){
        if(visit(ctx.expr()) != 0){
            return 0.0;
        }else{
            return 1.0;
        }
    }

    @Override
    public Double visitGtBoolTag(CalculatorParser.GtBoolTagContext ctx){
        if(visit(ctx.expr(0)) > visit(ctx.expr(1))){
            return 1.0;
        }else{
            return 0.0;
        }
    }

    @Override
    public Double visitGteBoolTag(CalculatorParser.GteBoolTagContext ctx){
        if(visit(ctx.expr(0)) >= visit(ctx.expr(1))){
            return 1.0;
        }else{
            return 0.0;
        }
    }

    @Override
    public Double visitLtBoolTag(CalculatorParser.LtBoolTagContext ctx){
        if(visit(ctx.expr(0)) < visit(ctx.expr(1))){
            return 1.0;
        }else{
            return 0.0;
        }
    }

    @Override
    public Double visitLteBoolTag(CalculatorParser.LteBoolTagContext ctx){
        if(visit(ctx.expr(0)) >= visit(ctx.expr(1))){
            return 1.0;
        }else{
            return 0.0;
        }
    }

    @Override
    public Double visitEqBoolTag(CalculatorParser.EqBoolTagContext ctx){
        if(visit(ctx.expr(0)) == visit(ctx.expr(1))){
            return 1.0;
        }else{
            return 0.0;
        }
    }
    
    @Override 
    public Double visitNeqBoolTag(CalculatorParser.NeqBoolTagContext ctx){
        if(visit(ctx.expr(0)) != visit(ctx.expr(1))){
            return 1.0;
        }else{
            return 0.0;
        }
    }

    @Override
    public Double visitAndBoolTag(CalculatorParser.AndBoolTagContext ctx){
        if(visit(ctx.expr(0)) != 0.0 && visit(ctx.expr(1)) != 0.0){
            return 1.0;
        }else{
            return 0.0;
        }
    }

    @Override
    public Double visitOrBoolTag(CalculatorParser.OrBoolTagContext ctx){
        if(visit(ctx.expr(0)) != 0.0 || visit(ctx.expr(1)) != 0.0){
            return 1.0;
        }else{
            return 0.0;
        }
    }


    /* ====================== SPECIAL EXPR ====================== */ 
    @Override
    public Double visitSqrtExprTag(CalculatorParser.SqrtExprTagContext ctx){
        if(visit(ctx.value) < 0.0){
            System.out.println("Error: expression within Sqrt() must be positive.");
            System.exit(0);
            return null;
        }else{
            return Math.sqrt(visit(ctx.expr()));
        }
    }

    @Override
    public Double visitReadExprTag(CalculatorParser.ReadExprTagContext ctx){
        return scan.nextDouble();
    }

    /* ====================== LIBRARY FUNC ====================== */
    @Override
    public Double visitSinFuncTag(CalculatorParser.SinFuncTagContext ctx){
        return Math.sin(visit(ctx.expr()));
    }

    @Override
    public Double visitCosFuncTag(CalculatorParser.CosFuncTagContext ctx){
        return Math.cos(visit(ctx.expr()));
    }

    @Override
    public Double visitLogFuncTag(CalculatorParser.LogFuncTagContext ctx){
        if(visit(ctx.expr()) > 0){
            return Math.log(visit(ctx.expr()));
        }else{
            System.out.println("Error: expression with log() must be greater than 0.");
            System.exit(0);
            return null;
        }
    }

    @Override
    public Double visitExpFuncTag(CalculatorParser.ExpFuncTagContext ctx){
        return Math.exp(visit(ctx.expr()));
    }

    /* ====================== PRINT FUNC ====================== */
    @Override
    public Double visitPrintFuncTag(CalculatorParser.PrintFuncTagContext ctx){
        List<CalculatorParser.ExprContext> statements = ctx.expr();
        for(CalculatorParser.ExprContext statement : statements){
            prints.add(visit(statement));
        }
        return null;
    }

    /* ====================== EXPR ====================== */
    @Override
    public Double visitParenExprTag(CalculatorParser.ParenExprTagContext ctx){
        return visit(ctx.expr());
    }

    @Override
    public Double visitMulExprTag(CalculatorParser.MulExprTagContext ctx){
        return visit(ctx.expr(0)) * visit(ctx.expr(1));
    }

    @Override
    public Double visitDivExprTag(CalculatorParser.DivExprTagContext ctx){
        return visit(ctx.expr(0)) / visit(ctx.expr(1));
    }

    @Override
    public Double visitAddExprTag(CalculatorParser.AddExprTagContext ctx){
        return visit(ctx.expr(0)) + visit(ctx.expr(1));
    }

    @Override
    public Double visitSubExprTag(CalculatorParser.SubExprTagContext ctx){
        return visit(ctx.expr(0)) - visit(ctx.expr(1));
    }

    @Override
    public Double visitNumExprTag(CalculatorParser.NumExprTagContext ctx){
        return Double.valueOf(ctx.getText());
    }

    @Override
    public Double visitIdTag(CalculatorParser.IdTagContext ctx){
        String var = ctx.ID().getText();
        Double value = current_scope.getVariable(var);
        if(value == null){
            System.out.println("Uninitialized variable: " + var);
            System.exit(0);
        }
        return value;
    }
}