grammar Gramatika;

import LexikalnePravidla;

init
    :   fs=func_declaration* EOF   # FunctionDefs
    ;

COMMENT : '/*' .*? '*/'  -> skip;

value_declaration
    :   VAR ID TYPE_ASSING value_type (ASSIGN expr)? END_C
    ;

value_type
    :   t=INT_TYPE array_sufix*
    |   t=BOOL_TYPE array_sufix*
    |   t=CHAR_TYPE array_sufix*
    |   t=STRING_TYPE array_sufix*
    |   t=FLOAT_TYPE array_sufix*
 //   |   t=UNIT_TYPE
    ;

array_sufix
    : '[' expr? ']'
    ;

func_declaration
    :   DEF name=ID (params=param_list)? ARROW resultType=value_type ASSIGN block
    ;

param_list
    :   param_group (DELIM param_group)*
    ;

param_group
    : ID (DELIM ID)* TYPE_ASSING value_type
    ;

block
    : LEFT_BR stat* RIGHT_BR
    ;

stat
    :   value_declaration                       # ValueDeclaration
    |   (ID|array_id) ASSIGN expr END_C         # Assignment
    |   FOR LEFT for_range_list RIGHT block     # For
    |   RETURN expr END_C                       # Return
    |   if_statement                            # IfStat
    |   expr END_C                              # ExprStat
    ;

if_statement
    :   IF expr ARROW block (ELSE ARROW block | ELSE if_statement)?
    ;

for_range_list
    :   for_range (DELIM for_range)*
    ;

for_range
    :   ID LEFT_ARROW from=expr TO to=expr (BY by=expr)?
    ;

func_call
    :   name=ID LEFT (expr| expr (DELIM expr)+)? RIGHT
    ;

bool_literal
    :   TRUE
    |   FALSE
    ;

string_literal
    :   STRING
    ;


char_literal
    :   CHAR
    ;

expr
    :   func_call                  # ExprFunCall
    |   NUM                        # ExprNum
    |   FLOAT                      # ExprFloat
    |   bool_literal               # ExprBool
    |   string_literal             # ExprString
    |   char_literal               # ExprChar
    |   ID                         # ExprId
    |   array_id                   # ExprArrayId
    |   NOT expr                   # ExprNot
    |   LEFT expr RIGHT            # ExprParenth
    |   SUB LEFT expr RIGHT        # ExprSubParenth
    |   expr op=(BIT_AND|BIT_OR|BIT_XOR) expr          # ExprBitOp
    |   expr op=(MUL|DIV) expr     # ExprMult
    |   expr op=(ADD|SUB) expr     # ExprAddSub
    |   SUB NUM                    # ExprSubNum
    |   SUB FLOAT                  # ExprSubFloat
    |   SUB ID                     # ExprSubId
    |   expr comp=(EQ|NE|LT|GT|LE|GE)  expr               # exprCompare
    |   expr AND expr              # ExprAnd
    |   expr OR expr               # ExprOr
    ;


array_id
    :   ID array_sufix*
    ;

