package calculator;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.lang.Math;
import java.util.Scanner;

public class EvalVisitor extends CalculatorBaseVisitor<Double> {

    List<Double> prints = new List<Double>();
    Scanner scan = new Scanner(System.in);

    // Create a new global scope, of which new sub-scopes will be created from.
    Scope global_scope = new Scope(null, true);
    Scope current_scope = global_scope;
    
    @Override
    public Double visitExprListTag(CalculatorParser.ExprListTagContext ctx){
        List<CalculatorParser.TopExprContext> topExpressions = ctx.topExpr();
        Value temp;
        for(Calculator.TopExprContext topExpression : topExpressions){
            this.visit(ctx.topExpression());
        }
        // TODO: This return statement needs review.
        return 1.0;
    }

    // The ID referenced below may need to be passed in as a obj of String
    @Override
    public Double visitVarDefTag(CalculatorParser.VarDefTagContext ctx){
        this.current_scope.put(ctx.ID.getText(), this.visit(ctx.expr()));
        return this.visit(ctx.expr());
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
        if(this.visit(ctx.expr()) != 0){
            return 1.0;
        }else{
            return 0.0;
        }
    }

    @Override
    public Double visitNotBoolTag(CalculatorParser.NotBoolTagContext ctx){
        if(this.visit(ctx.expr()) != 0){
            return 0.0;
        }else{
            return 1.0;
        }
    }

    @Override
    public Double visitGtBoolTag(CalculatorParser.GtBoolTagContext ctx){
        if(this.visit(ctx.expr(0)) > this.visit(ctx.expr(1))){
            return 1.0;
        }else{
            return 0.0;
        }
    }

    @Override
    public Double visitGteBoolTag(CalculatorParser.GteBoolTagContext ctx){
        if(this.visit(ctx.expr(0)) >= this.visit(ctx.expr(1))){
            return 1.0;
        }else{
            return 0.0;
        }
    }

    @Override
    public Double visitLtBoolTag(CalculatorParser.LtBoolTagContext ctx){
        if(this.visit(ctx.expr(0)) < this.visit(ctx.expr(1))){
            return 1.0;
        }else{
            return 0.0;
        }
    }

    @Override
    public Double visitLteBoolTag(CalculatorParser.LteBoolTagContext ctx){
        if(this.visit(ctx.expr(0)) >= this.visit(ctx.expr(1))){
            return 1.0;
        }else{
            return 0.0;
        }
    }

    @Override
    public Double visitEqBoolTag(CalculatorParser.EqBoolTagContext ctx){
        if(this.visit(ctx.expr(0)) == this.visit(ctx.expr(1))){
            return 1.0;
        }else{
            return 0.0;
        }
    }
    
    @Override 
    public Double visitNeqBoolTag(CalculatorParser.NeqBoolTagContext ctx){
        if(this.visit(ctx.expr(0)) != this.visit(ctx.expr(1))){
            return 1.0;
        }else{
            return 0.0;
        }
    }

    // @Override
    // public Double visitEqqBoolTag(CalculatorParser.EqqBoolTagContext ctx){
    //     if(this.visit(ctx.expr(0)) === this.visit(ctx.expr(1))){
    //         return 1.0;
    //     }else{
    //         return 0.0;
    //     }
    // }

    @Override
    public Double visitAndBoolTag(CalculatorParser.AndBoolTagContext ctx){
        if(this.visit(ctx.expr(0)) && this.visit(ctx.expr(1))){
            return 1.0;
        }else{
            return 0.0;
        }
    }

    @Override
    public Double visitOrBoolTag(CalculatorParser.OrBoolTagContext ctx){
        if(this.visit(ctx.expr(0)) || this.visit(ctx.expr(1))){
            return 1.0;
        }else{
            return 0.0;
        }
    }


    /* ====================== SPECIAL EXPR ====================== */ 
    @Override
    public Double visitSqrtExprTag(CalculatorParser.SqrtExprTagContext ctx){
        if(ctx.value < 0){
            System.out.println("Error: expression within Sqrt() must be positive.");
            System.exit(0);
            return -1.0;
        }else{
            return Math.sqrt(this.visit(ctx.expr()));
        }
    }

    @Override
    public Double visitReadExprTag(CalculatorParser.ReadExprTagContext ctx){
        return scan.nextDouble();
    }

    /* ====================== LIBRARY FUNC ====================== */
    @Override
    public Double visitSinFuncTag(CalculatorParser.SinFuncTagContext ctx){
        return Math.sin(this.visit(ctx.expr()));
    }

    @Override
    public Double visitCosFuncTag(CalculatorParser.CosFuncTagContext ctx){
        return Math.cos(this.visit(ctx.expr()));
    }

    @Override
    public Double visitLogFuncTag(CalculatorParser.LogFuncTagContext ctx){
        if(this.visit(ctx.expr()) > 0){
            return Math.log(this.visit(ctx.expr()));
        }else{
            System.out.println("Error: expression with log() must be greater than 0.");
            System.exit(0);
            return -1.0;
        }
    }

    @Override
    public Double visitExpFuncTag(CalculatorParser.ExpFuncTagContext ctx){
        return Math.exp(this.visit(ctx.expr()));
    }

    /* ====================== PRINT FUNC ====================== */
    @Override
    public Double visitPrintFuncTag(CalculatorParser.PrintFuncTagContext ctx){
        List<CalculatorParser.ExprTagContext> statements = ctx.expr();
        for(CalculatorParser.ExprTagContext statement : statements){
            prints.add(this.visit(ctx.statement()));
        }
        // TODO: This return statement needs review.
        return 1.0;
    }

    /* ====================== EXPR ====================== */
    @Override
    public Double visitParenExprTag(CalculatorParser.ParenExprTagContext ctx){
        return this.visit(ctx.expr());
    }

    @Override
    public Double visitMulExprTag(CalculatorParser.MulExprTagContext ctx){
        return this.visit(ctx.expr(0)) * this.visit(ctx.expr(1));
    }

    @Override
    public Double visitDivExprTag(CalculatorParser.DivExprTagContext ctx){
        return this.visit(ctx.expr(0)) / this.visit(ctx.expr(1));
    }

    @Override
    public Double visitAddExprTag(CalculatorParser.AddExprTagContext ctx){
        return this.visit(ctx.expr(0)) + this.visit(ctx.expr(1));
    }

    @Override
    public Double visitSubExprTag(CalculatorParser.SubExprTagContext ctx){
        return this.visit(ctx.expr(0)) - this.visit(ctx.expr(1));
    }

    @Override
    public Double visitPosNumTag(CalculatorParser.PosNumTagContext ctx){
        return Double.valueOf(ctx.getText());
    }

    @Override
    public Double visitNegNumTag(CalculatorParser.NegNumTagContext ctx){
        return -1.0 * Double.valueOf(ctx.getText());
    }

    @Override
    public Double visitIdTag(CalculatorParser.IdTagContext ctx){
        Double value = current_scope.getVariable(this.visit(ctx.expr()));
        if(value == null){
            System.out.println("Uninitialized variable: " + this.visit(ctx.expr()));
            System.exit(0);
        }
        return value;
    }
}