grammar Calculator;

@header {
    import java.util.HashMap;
    import java.util.ArrayList;
    import java.lang.Math;
    import java.util.Scanner;
    import java.util.Stack;
}

@members {
    // Define custom Scope class to create a local scope hierarchy
    class Scope {
        Scope parent;
        HashMap<String, Double> variables;
        boolean isGlobalScope;

        public Scope(Scope parent, boolean isGlobalScope){
            this.parent = parent;
            this.isGlobalScope = isGlobalScope;
            this.variables = new HashMap<String, Double>();
        }

        public HashMap<String, Double> getVariables(){
            return this.variables;
        }

        public Scope getParentScope(){
            return this.parent;
        }

        public boolean isGlobal(){
            return this.isGlobalScope;
        }
    }
    
    Scope current_scope = new Scope(null, true);
    ArrayList<Double> prints = new ArrayList<Double>();
    Scanner scan = new Scanner(System.in);

    // This function will take care of checking the current scopes for a variable's value.
    public Double getVariable(String varName){
        Scope temp = current_scope;
        
        while(temp.getVariables().containsKey(varName) == false){
            if(temp.isGlobal){
                return null;
            }
            temp = current_scope.getParentScope();
        }
        return temp.getVariables().get(varName);
    }

    // Add a new scope when creating a function, conditional, or loop
    public void createScope(){
        new_scope = new Scope(current_scope, false);
        current_scope = new_scope;
    }
}

// Top-Most Expression Tree Nodes
exprList: topExpr ( ';' topExpr)* ';'? ; 

topExpr:
    varDef
    | ifDef
    | forDef
    | whileDef
    | boolExpr { System.out.println(Double.toString($boolExpr.i)); }
    | specialExpr { System.out.println(Double.toString($specialExpr.i)); }
    | libraryFunc { System.out.println(Double.toString($libraryFunc.i)); }
    | expr{ System.out.println(Double.toString($expr.i)); }
    | printFunc { for(Double temp: prints){System.out.println(Double.toString(temp));} }
    ;

// TODO: Don't know how to actually evaluate the expr within the while/if/for statements.
ifDef: IF SPACE* '(' SPACE* cond=boolExpr SPACE* ')' SPACE* expr1=topExpr (ELSE expr2=topExpr)? { createScope(); };
whileDef: WHILE SPACE* '(' SPACE* cond=boolExpr SPACE* ')' SPACE* exec=topExpr {createScope();};
forDef: FOR SPACE* '(' SPACE* expr1=topExpr SPACE* ';' SPACE* cond=boolExpr SPACE* ';' SPACE* expr2=topExpr SPACE* ')' { createScope(); };

// Variable Definitions
varDef: ID '=' val=expr {current_scope.getVariables().put($ID.text, $val.i);};

// Print function
printFunc:
    PRINT SPACE* val=expr {prints.add($val.i);} (SPACE*','SPACE* expr {prints.add($expr.i);})* ;

// Supported Boolean Expressions
boolExpr returns [Double i]:
      expr { $i = ($expr.i >= 0.0 ? 1.0 : 0.0); }
    | '!' expr { $i = $expr.i != 0 ? 0.0 : 1.0 ;}
    | el=expr '>' er=expr { $i = $expr.i > $expr.i ? 1.0 : 0.0 ;}
    | el=expr '>=' er=expr { $i = $expr.i >= $expr.i ? 1.0 : 0.0 ;}
    | el=expr '<' er=expr { $i = $expr.i < $expr.i ? 1.0 : 0.0 ;}
    | el=expr '>=' er=expr { $i = $expr.i >= $expr.i ? 1.0 : 0.0 ;}
    | el=expr '==' er=expr { $i = $expr.i == $expr.i ? 1.0 : 0.0 ;}
    | el=expr '!=' er=expr { $i = $expr.i != $expr.i ? 1.0 : 0.0 ;}
    | el=expr '===' er=expr { $i = $expr.i === $expr.i ? 1.0 : 0.0 ;}
    | el=expr op='&&' er=expr { $i = ($el.i != 0 && $er.i != 0) ? 1.0 : 0.0; }
    | el=expr op='||' er=expr {$i = ($el.i != 0 || $er.i != 0) ? 1.0 : 0.0; }
    ;

// Special Expressions
specialExpr returns [Double i]:
    'sqrt'SPACE*'(' value=expr SPACE*')'
        { 
            if ($value.i < 0){
                System.out.println("Error: expression must be positive");
                System.exit(0);
            }else{
                $i = Math.sqrt($value.i);
            }
        }
    | 'read'SPACE*'('SPACE*')' 
        {
            System.out.print("Enter Input: ");
            $i = scan.nextDouble();
            System.out.print("\n");
        }
    ;

// Supported Library Functions
libraryFunc returns [Double i]:
      's'SPACE*'(' var=expr SPACE*')' { $i= Math.sin($var.i); }
    | 'c'SPACE*'(' var=expr SPACE*')' { $i= Math.cos($var.i); }
    | 'l'SPACE*'(' var=expr SPACE*')' 
        { 
            if($var.i < 0){
                System.out.println("Error: expression must be positive");
                System.exit(0);
            }else{
                $i= Math.log($var.i);
            }
        }
    | 'e'SPACE*'(' var=expr SPACE*')' { $i= Math.exp($var.i); }
    ;

// Basic arithmetic, variable, and number operations and expressions
expr returns [Double i]:
     el=expr MULT er=expr { $i=$el.i*$er.i; }
    | el=expr DIVD er=expr { $i=$el.i/$er.i; }
    | el=expr ADD er=expr { $i=$el.i+$er.i; }
    | el=expr SUBT er=expr { $i=$el.i-$er.i; }
    | NUM { $i=Double.parseDouble($NUM.text); }
    | '-' NUM { $i= -1.0 * Double.parseDouble($NUM.text); } // Negative number support.
    | ID {
            if(getVariable($ID.text) != null)
                $i = getVariable($ID.text);
            else
                System.out.println("Undeclared variable: " + $ID.text);
        }            
    | '(' e=expr ')' {$i = $expr.i;}
    ;


PRINT:'print';
IF: 'if';
ELSE: 'else';
WHILE: 'while';
FOR: 'for';
NUM: [0-9]+('.'[0-9]*)? ; // Recognize Doubles
WS : SPACE+ -> skip ; // Skip White Space
COM : '/*' (.)*? '*/' -> skip ; // Skip Comments
SUBT: '-';
ADD: '+';
DIVD: '/';
MULT: '*';
SPACE: [ \t\r\n];
ID: [_A-Za-z]+;