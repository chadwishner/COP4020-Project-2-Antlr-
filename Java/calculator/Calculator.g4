grammar Calculator;

@parser::header {
    package calculator;
}

@lexer::header {
    package calculator;                 
}

// Top-Level Expression + Parser Entry Point
exprList
    : topExpr+ EOF #exprListTag
    ;

// Code blocks for loops/functions
codeBlock
    : topExpr* #codeBlockTag
    ;

// Should cover all types of expressions
topExpr
    : ifDef
    | forDef
    | whileDef
    | expr SEMICOLON
    | specialExpr SEMICOLON
    | libraryFunc SEMICOLON
    | printFunc SEMICOLON
    | funcDef
    | funcCall SEMICOLON
    | varDef SEMICOLON
    | boolExpr SEMICOLON
    ;

// If Definitions
ifDef
    : IF OPAR cond=boolExpr CPAR expr1=topExpr ( ELSE expr2=topExpr )? #ifDefSingleTag
    | IF OPAR cond=boolExpr CPAR OBRC exprList1=codeBlock CBRC (ELSE OBRC exprList2=codeBlock CBRC)? #ifDefMultipleTag
    ;

// While Loops
whileDef
    : WHILE OPAR cond=boolExpr CPAR exec=topExpr #whileDefSingleTag
    | WHILE OPAR cond=boolExpr CPAR OBRC exec=codeBlock CBRC #whileDefMultipleTag
    ;

// For Loops
forDef
    : FOR OPAR expr1=varDef SEMICOLON cond=boolExpr SEMICOLON expr2=varDef CPAR exec=topExpr #forDefSingleTag
    | FOR OPAR expr1=varDef SEMICOLON cond=boolExpr SEMICOLON expr2=varDef CPAR OBRC exec=codeBlock CBRC #forDefMultipleTag
    ;

// Function Defintions
funcDef
    : DEFINE funcName=ID params? OBRC autoVars? exec=codeBlock? RETURN returnExpr=returnType? SEMICOLON ignored=codeBlock? CBRC #funcDefTag
    ;

returnType
    : expr
    | funcCall
    | boolExpr
    ;

// Function Calls
funcCall
    : ID paramValues? #funcCallTag
    ;

// Params for the function Def
params
    : OPAR ID (COMMA ID)* CPAR
    ;

paramValues
    : OPAR expr (COMMA expr)* CPAR
    ;

// Auto variables for the function Def
autoVars
    : AUTO ID (COMMA ID)* SEMICOLON?
    ;

// Variable Definitions
varDef
    : ID ASSIGN expr #varDefTag
    | ID ASSIGN funcCall #varDefFuncCallTag
    | ID ASSIGN boolExpr #varDefBoolExprTag
    | ID ASSIGN specialExpr #varDefSpecialExprTag
    | ID ASSIGN libraryFunc #varDefLibraryFuncTag
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
    | expr MUL expr   #mulExprTag
    | expr DIV expr   #divExprTag
    | expr ADD expr   #addExprTag
    | expr SUB expr   #subExprTag
    | NUM             #numExprTag
    | SUB NUM         #negativeNumExprTag 
    | ID              #idTag
    ;

WS : [ \t\r\n] -> skip ; // Skip White Space
IF: 'if';
ELSE: 'else';
OPAR: '(';
CPAR: ')';
OBRC: '{';
CBRC: '}';
S: 's';
C: 'c';
L: 'l';
E: 'e';
COMMA: ',';
SEMICOLON: ';';
DEFINE: 'define';
AUTO: 'auto';
RETURN: 'return';
SQRT: 'sqrt';
READ: 'read';
PRINT:'print';
WHILE: 'while'; 
FOR: 'for';
NUM: [0-9]+('.'[0-9]*)? ; // Recognize Doubles
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