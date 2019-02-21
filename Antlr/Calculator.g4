grammar Calculator;

// Top-Most Expression Tree Nodes
exprList
    : topExpr ( ';' topExpr)* ';'?
    ; 

topExpr
    : varDef        #varDef
    | ifDef         #ifDef
    | forDef        #forDef
    | whileDef      #whileDef
    | boolExpr      #boolExpr
    | specialExpr   #spcExpr
    | libraryFunc   #libFunc
    | expr          #expr
    | printFunc     #printFunc
    ;

// TODO: Don't know how to actually evaluate the expr within the while/if/for statements.
ifDef
    : IF SPACE* '(' SPACE* cond=boolExpr SPACE* ')' SPACE* expr1=topExpr (ELSE expr2=topExpr)?
    ;

whileDef
    : WHILE SPACE* '(' SPACE* cond=boolExpr SPACE* ')' SPACE* exec=topExpr
    ;

forDef
    : FOR SPACE* '(' SPACE* expr1=topExpr SPACE* ';' SPACE* cond=boolExpr SPACE* ';' SPACE* expr2=topExpr SPACE* ')'
    ;

// Variable Definitions
varDef
    : ID '=' expr
    ;

// Print function
printFunc
    : PRINT SPACE* expr (SPACE*','SPACE* expr)*
    ;

// Supported Boolean Expressions
boolExpr
    : expr
    | op='!' expr       #notBool
    | expr op='>' expr  #gtBool
    | expr op='>=' expr #gteBool
    | expr op='<' expr  #ltBool
    | expr op='>=' expr #lteBool
    | expr op='==' expr #eqBool
    | expr op='!=' expr #neqBool
    | expr op='===' expr#eqqBool
    | expr op='&&' expr #andBool
    | expr op='||' expr #orBool
    ;

// Special Expressions
specialExpr
    : 'sqrt'SPACE*'(' value=expr SPACE*')'  #sqrtExpr
    | 'read'SPACE*'('SPACE*')'              #readExpr
    ;

// Supported Library Functions
libraryFunc
    : 's'SPACE*'(' var=expr SPACE*')' #sinFunc
    | 'c'SPACE*'(' var=expr SPACE*')' #cosFunc
    | 'l'SPACE*'(' var=expr SPACE*')' #logFunc
    | 'e'SPACE*'(' var=expr SPACE*')' #expFunc
    ;

atom
    : NUM       #posNumAtom
    | '-' NUM   #negNumAtom
    | ID        #idAtom
    ;

// Basic arithmetic, variable, and number operations and expressions
expr
    : '(' expr ')'  #parenExpr
    | expr MUL expr #mulExpr
    | expr DIV expr #divExpr
    | expr ADD expr #addExpr
    | expr SUB expr #subExpr
    | atom          #atomExpr
    ;

PRINT:'print';
IF: 'if';
ELSE: 'else';
WHILE: 'while'; 
FOR: 'for';
NUM: [0-9]+('.'[0-9]*)? ; // Recognize Doubles
WS : SPACE+ -> skip ; // Skip White Space
COM : '/*' (.)*? '*/' -> skip ; // Skip Comments
SUB: '-';
ADD: '+';
DIV: '/';
MUL: '*';
SPACE: [ \t\r\n];
ID: [_A-Za-z][_A-Za-z0-9]*;