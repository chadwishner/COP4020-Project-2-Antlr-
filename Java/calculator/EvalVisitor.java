package calculator;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.lang.Math;
import java.util.Scanner;

import calculator.CalculatorParser.TopExprContext;

public class EvalVisitor extends CalculatorBaseVisitor<Double> {

    List<Double> prints = new ArrayList<Double>();
    HashMap<String, CalculatorParser.ParamsContext> functions_params = new HashMap<String, >();
    HashMap<String, CalculatorParser.AutoVarsContext> functions_auto_variables = new HashMap<String, >();
    HashMap<String, List<CalculatorParser.TopExprContext>> functions_exec = new HashMap<String, >();
    Scanner scan = new Scanner(System.in);

    // Create a new global scope, of which new sub-scopes will be created from.
    Scope global_scope = new Scope(null, true);
    Scope current_scope = global_scope;

    @Override
    public Double visitExprListTag(CalculatorParser.ExprListTagContext ctx){
        List<CalculatorParser.TopExprContext> topExpressions = ctx.topExpr();
        for(CalculatorParser.TopExprContext topExpression : topExpressions){
            Double val = visit(topExpression);
            if(val != null){
                System.out.println(val);
            }
        }
        return null;
    }

    @Override public Double visitTopExpr(CalculatorParser.TopExprContext ctx) {
        return visit(ctx.children.get(0)); 
    }

    /* ====================== VARIABLE DEFINITIONS ====================== */
    @Override
    public Double visitVarDefTag(CalculatorParser.VarDefTagContext ctx){
        this.current_scope.getVariables().put(ctx.ID().getText(), visit(ctx.expr()));
        return null;
    }

    @Override
    public Double visitVarDefFuncCallTag(CalculatorParser.VarDefFuncCallTagContext ctx){
        this.current_scope.getVariables().put(ctx.ID().getText(), visit(ctx.funcCall()));
        return null;
    }

    /* ====================== IF STATEMENTS ====================== */ 
    @Override
    public Double visitIfDefSingleTag(CalculatorParser.IfDefSingleTagContext ctx){
        if(visit(ctx.cond) != 0.0){
            return visit(ctx.expr1);
        }else{
            if(ctx.expr2 != null){
                return visit(ctx.expr2);
            }
        }
        return null;
    }

    @Override
    public Double visitIfDefMultipleTag(CalculatorParser.IfDefMultipleTagContext ctx){
        if(visit(ctx.cond) != 0.0){
            return visit(ctx.exprList1);
        }else{
            if(ctx.exprList2 != null){
                return visit(ctx.exprList2);
            }
        }
        return null;
    }

    /* ====================== CODE BLOCK ====================== */
    @Override
    public Double visitCodeBlockTag(CalculatorParser.CodeBlockTagContext ctx) {
        List<CalculatorParser.TopExprContext> topExpressions = ctx.topExpr();
        for(CalculatorParser.TopExprContext topExpression : topExpressions){
            Double val = visit(topExpression);
            if(val != null){
                System.out.println(val);
            }
        }
        return null;
    }

    /* ====================== FOR LOOPS ====================== */ 
    @Override 
    public Double visitForDefSingleTag(CalculatorParser.ForDefSingleTagContext ctx) {
        visit(ctx.expr1);
        while(visit(ctx.cond) != 0.0){
            visit(ctx.exec);
            visit(ctx.expr2);
        }
        return null;
    }

    @Override 
    public Double visitForDefMultipleTag(CalculatorParser.ForDefMultipleTagContext ctx) {
        System.out.println("Visting FOR-def");
        visit(ctx.expr1);
        while(visit(ctx.cond) != 0.0){
            visit(ctx.exec);
            visit(ctx.expr2);
        }
        return null;
    }

    /* ====================== WHILE LOOP ====================== */ 
    @Override 
    public Double visitWhileDefSingleTag(CalculatorParser.WhileDefSingleTagContext ctx) {
        while(visit(ctx.cond) != 0.0){
            visit(ctx.exec);
        }
        return null;
    }

    @Override 
    public Double visitWhileDefMultipleTag(CalculatorParser.WhileDefMultipleTagContext ctx) {
        while(visit(ctx.cond) != 0.0){
            visit(ctx.exec);
        }
        return null;
    }

    /* ====================== FUNCTIONS ====================== */
    @Override 
    public Double visitFuncDefTag(CalculatorParser.FuncDefTagContext ctx) { 
        // Add the function and its params, variables, and codeSegment to a series of global functions hashmaps.
        String func_name = ctx.funcName.getText();
        this.functions_auto_variables.put(func_name, ctx.autoVars());
        this.functions_params.put(func_name, ctx.params());
        this.functions_exec.put(func_name, ctx.exec);
        return null;
    }

    @Override
    public Double visitFuncCallTag(CalculatorParser.FuncCallTagContext ctx){
        String func_name = ctx.ID().getText();
        if(this.functions.containsKey(func_name)){
            // Create a new scope for the function
            Scope func_scope = new Scope(this.current_scope, false);
            this.current_scope = func_scope;
            CalculatorParser.ParamValuesContext param_values = ctx.paramValues();
            
            
            // Remove the scope from the function
            this.current_scope = this.current_scope.getParentScope();
            return null;
        }else{
            System.out.println("Invalid function call/That function does not exist.");
            return null;
        }
        
    }

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
        for(Double item : prints){
            System.out.println(item);
        }
        prints.clear();

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