grammar Calculator;

@header {
    package calculator;
}

parse
    : exprList EOF
    ;

// Top-Most Expression Tree Nodes
exprList
    : topExpr ( ';' topExpr)* ';'? #exprListTag
    ; 

topExpr
    : varDef
    | ifDef
    | forDef
    | whileDef
    | boolExpr      
    | specialExpr   
    | libraryFunc   
    | expr          
    | printFunc 
    ;

// TODO: Don't know how to actually evaluate the expr within the while/if/for statements.
ifDef
    : IF SPACE* '(' SPACE* cond=boolExpr SPACE* ')' SPACE* expr1=topExpr (ELSE expr2=topExpr)? #ifDefTag
    ;

whileDef
    : WHILE SPACE* '(' SPACE* cond=boolExpr SPACE* ')' SPACE* exec=topExpr #whileDefTag
    ;

forDef
    : FOR SPACE* '(' SPACE* expr1=topExpr SPACE* ';' SPACE* cond=boolExpr SPACE* ';' SPACE* expr2=topExpr SPACE* ')' #forDefTag
    ;

// Variable Definitions
varDef
    : ID '=' expr #varDefTag
    ;

// Print function
printFunc
    : PRINT SPACE* expr (SPACE*','SPACE* expr)* #printFuncTag
    ;

// Supported Boolean Expressions
boolExpr
    : expr              #exprBoolTag
    | op='!' expr       #notBoolTag
    | expr op='>' expr  #gtBoolTag
    | expr op='>=' expr #gteBoolTag
    | expr op='<' expr  #ltBoolTag
    | expr op='>=' expr #lteBoolTag
    | expr op='==' expr #eqBoolTag
    | expr op='!=' expr #neqBoolTag
    // | expr op='===' expr#eqqBoolTag
    | expr op='&&' expr #andBoolTag
    | expr op='||' expr #orBoolTag
    ;

// Special Expressions
specialExpr
    : 'sqrt'SPACE*'(' value=expr SPACE*')'  #sqrtExprTag
    | 'read'SPACE*'('SPACE*')'              #readExprTag
    ;

// Supported Library Functions
libraryFunc
    : 's'SPACE*'(' var=expr SPACE*')' #sinFuncTag
    | 'c'SPACE*'(' var=expr SPACE*')' #cosFuncTag
    | 'l'SPACE*'(' var=expr SPACE*')' #logFuncTag
    | 'e'SPACE*'(' var=expr SPACE*')' #expFuncTag
    ;

// Basic arithmetic, variable, and number operations and expressions
expr
    : '(' expr ')'  #parenExprTag
    | expr MUL expr #mulExprTag
    | expr DIV expr #divExprTag
    | expr ADD expr #addExprTag
    | expr SUB expr #subExprTag
    | NUM           #numExprTag
    | ID            #idTag
    ;

PRINT:'print';
IF: 'if';
ELSE: 'else';
WHILE: 'while'; 
FOR: 'for';
NUM: [-]?[0-9]+('.'[0-9]*)? ; // Recognize Doubles
WS : SPACE+ -> skip ; // Skip White Space
COM : '/*' (.)*? '*/' -> skip ; // Skip Comments
SUB: '-';
ADD: '+';
DIV: '/';
MUL: '*';
SPACE: [ \t\r\n];
ID: [_A-Za-z][_A-Za-z0-9]*;