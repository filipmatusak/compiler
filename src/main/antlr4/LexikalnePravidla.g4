lexer grammar LexikalnePravidla;


WS
    :    [ \n\r\t]+ -> skip
    ;

RETURN
    :   'return'
    ;

NUM
    :    DIGIT+
    ;

FLOAT
    :    DIGIT+ '.' DIGIT+
    ;

TRUE
    :   'true'
    ;

FALSE
    :   'false'
    ;

IF
    :   'if'
    ;

ELSE
    :   'else'
    ;

NOT
    :   '!'
    ;

BIT_AND
    :   '&'
    ;

BIT_OR
    :   '|'
    ;

BIT_XOR
    :   '^'
    ;

EQ
    :   '=='
    ;

NE
    :   '!='
    ;

LT
    :   '<'
    ;

GT
    :   '>'
    ;

LE
    :   '<='
    ;

GE
    :   '>='
    ;

FOR
    :    'for'
    ;
    
DO
    :    'do'
    ;

VAR
    :    'var'
    ;

DEF
    :   'def'
    ;

ARROW
    :   '->'
    ;

LEFT_ARROW
    :   '<-'
    ;

TO
    :   'to'
    ;

BY
    :   'by'
    ;

INT_TYPE
    :    'Int'
    ;

BOOL_TYPE
    :   'Bool'
    ;

CHAR_TYPE
    :   'Char'
    ;

STRING_TYPE
    :   'String'
    ;

UNIT_TYPE
    :   'Unit'
    ;

FLOAT_TYPE
    :   'Float'
    ;

TYPE_ASSING
    :    ':'
    ;

DELIM
    :   ','
    ;
    
ID
    :    LETTER (LETTER|DIGIT)*
    ;



fragment DIGIT
    :    [0-9]
    ;
    
fragment LETTER
    :    [a-zA-Z]
    ;


ASSIGN
    :    '='
    ;


END_C
    :   ';'
    ;



ADD
    :    '+'
    ;
    
SUB
    :    '-'
    ;
    
MUL
    :    '*'
    ;
    
DIV
    :    '/'
    ;
    
POW
    :    '^'
    ;
    
LEFT
    :    '('
    ;
    
RIGHT
    :    ')'
    ;
    
NEWLINE
    :    ('\r\n' | '\n' | '\r')
    ;

LEFT_BR
    :   '{'
    ;

RIGHT_BR
    :   '}'
    ;

AND
    :   '&&'
    ;

OR
    :   '||'
    ;



fragment STRING_CHAR
    :   ~('"')
    |   '\\"'
    ;

CHAR
    :   '\''ANY_CHAR'\''
    ;

fragment ANY_CHAR
    :   .
    ;

STRING
    :   '"' ( '\\"' | . )*? '"'
    ;

