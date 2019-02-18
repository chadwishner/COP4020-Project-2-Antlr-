grammar Calculator;

@header {
    import java.util.HashMap;
    import java.util.ArrayList;
    import java.lang.Math;
    import java.util.Scanner;
    import java.util.Stack;
}

@members {
    HashMap<String, Double> global_scope = new HashMap<String, Double>();
    ArrayList<Double> prints = new ArrayList<Double>();
    Scanner scan = new Scanner(System.in);
    Stack<HashMap<String, Double>> scopes = new Stack<HashMap<String, Double>>();

    // This function will take care of checking the current scopes for a variable's value
    // If the variable is found, it will be part of the top-most element of the scopes stack.
    public boolean findScope(String varName){
        if(scopes.empty()){
            scopes.push(global_scope);
        }
        while(scopes.peek() != global_scope){
            // Get the current scope and check if that variable is contained within it.
            HashMap<String, Double> current_scope = scopes.pop();
            if(current_scope.containsKey(varName)){
                scopes.push(current_scope);
                return true;
            }
        }
        
        // Check the global scope
        HashMap<String, Double> current_scope = scopes.peek();
        if(current_scope.containsKey(varName)){
                return true;
        }

        // We've checked every scope, including the global scope and did not find the variable
        return false;
    }

    // Return a variable's value from the top-most scope
    public Double getVariable(String varName){
        if(findScope(varName)){
            return scopes.peek().get(varName);
        }else{
            return null;
        }
    }

    // Add a new scope to the stack, when creating a function, conditional, or loop
    public void createScope(){
        HashMap<String, Double> new_scope = new HashMap<String, Double>();
        scopes.push(new_scope);
    }
}

// Top-Most Expression Tree Nodes
exprList: topExpr ( ';' topExpr)* ';'? ; 

topExpr:
    varDef
    | boolExpr { System.out.println(Double.toString($boolExpr.i)); }
    | specialExpr { System.out.println(Double.toString($specialExpr.i)); }
    | libraryFunc { System.out.println(Double.toString($libraryFunc.i)); }
    | expr{ System.out.println(Double.toString($expr.i)); }
    | printFunc { for(Double temp: prints){System.out.println(Double.toString(temp));} }
    ;

// Variable Definitions
varDef: ID '=' val=expr {scopes.peek().put($ID.text, $val.i);};

// Print function
printFunc:
    PRINT SPACE* val=expr {prints.add($val.i);} (SPACE*','SPACE* expr {prints.add($expr.i);})* ;

// Supported Boolean Expressions
boolExpr returns [Double i]:
      '!' expr { $i = $expr.i != 0 ? 0.0 : 1.0 ;}
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
                System.out.println("Undeclared variable.");
        }            
    | '(' e=expr ')' {$i = $expr.i;}
    ;

PRINT:'print';
NUM: [0-9]+('.'[0-9]*)? ; // Recognize Doubles
WS : SPACE+ -> skip ; // Skip White Space
COM : '/*' (.)*? '*/' -> skip ; // Skip Comments
SPACE: [ \t\r\n];
SUBT: '-';
ADD: '+';
DIVD: '/';
MULT: '*';
IF: 'if';
ELSE: 'else';
ID: [_A-Za-z]+;