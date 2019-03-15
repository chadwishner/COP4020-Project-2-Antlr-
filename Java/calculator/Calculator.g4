grammar Calculator;

@parser::header {
    package calculator;
}

@lexer::header {
    package calculator;                 
}

// Top-Most Expression Tree Nodes
exprList
    : topExpr ( SEMICOLON topExpr)* SEMICOLON? EOF #exprListTag
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

ifDef
    : IF OPAR cond=boolExpr CPAR expr1=topExpr (ELSE expr2=topExpr)? #ifDefTag
    ;

whileDef
    : WHILE OPAR cond=boolExpr CPAR exec=topExpr #whileDefTag
    ;

forDef
    : FOR OPAR expr1=topExpr SEMICOLON cond=boolExpr SEMICOLON expr2=topExpr CPAR #forDefTag
    ;

// Variable Definitions
varDef
    : ID ASSIGN expr #varDefTag
    ;

// Print function
printFunc
    : PRINT expr (COMMA expr)* #printFuncTag
    ;

// Supported Boolean Expressions
boolExpr
    : expr              #exprBoolTag
    | op=NOT expr       #notBoolTag
    | expr op=GRE expr  #gtBoolTag
    | expr op=GREQ expr #gteBoolTag
    | expr op=LT expr  #ltBoolTag
    | expr op=LTEQ expr #lteBoolTag
    | expr op=EQ expr #eqBoolTag
    | expr op=NEQ expr #neqBoolTag
    // | expr op='===' expr#eqqBoolTag
    | expr op=AND expr #andBoolTag
    | expr op=OR expr #orBoolTag
    ;

// Special Expressions
specialExpr
    : SQRT OPAR value=expr CPAR  #sqrtExprTag
    | READ OPAR CPAR              #readExprTag
    ;

// Supported Library Functions
libraryFunc
    : S OPAR var=expr CPAR #sinFuncTag
    | C OPAR var=expr CPAR #cosFuncTag
    | L OPAR var=expr CPAR #logFuncTag
    | E OPAR var=expr CPAR #expFuncTag
    ;

// Basic arithmetic, variable, and number operations and expressions
expr
    : OPAR expr CPAR  #parenExprTag
    | expr MUL expr #mulExprTag
    | expr DIV expr #divExprTag
    | expr ADD expr #addExprTag
    | expr SUB expr #subExprTag
    | NUM           #numExprTag
    | ID            #idTag
    ;

WS : [ \t\r\n] -> skip ; // Skip White Space
OPAR: '(';
CPAR: ')';
S: 's';
C: 'c';
L: 'l';
E: 'e';
COMMA: ',';
SEMICOLON: ';';
SQRT: 'sqrt';
READ: 'read';
PRINT:'print';
IF: 'if';
ELSE: 'else';
WHILE: 'while'; 
FOR: 'for';
NUM: [-]?[0-9]+('.'[0-9]*)? ; // Recognize Doubles
COM : '/*' (.)*? '*/' -> skip ; // Skip Comments
SUB: '-';
ADD: '+';
DIV: '/';
MUL: '*';
EQ: '==';
ASSIGN: '=';
NEQ: '!=';
GRE: '>';
GREQ: '>=';
LT: '<';
LTEQ: '<=';
AND: '&&';
OR: '||';
NOT: '!';
ID: [_A-Za-z][_A-Za-z0-9]*;