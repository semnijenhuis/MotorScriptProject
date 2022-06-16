grammar MotorScriptLang;

program         :  (expression | statement)* EOF;

statement       :  blockStmt
                |  varDecleration
                |  printStmt
                |  ifStmt
                |  whileLoop
                |  array
                |  arrayAssign
                |  functionDecl
                |  functionCall
//                |  returnStmt
                |  scannerDecl
                |  declaration
                ;


printStmt:      PRINT LPAREN expression RPAREN END;
declaration:    type IDENTIFIER (END)?;
// a variable declaration can be used as an expression but in our language we do not allow that, not because we are lazy but because we want less potential errors
varDecleration  : (type)? IDENTIFIER ASSIGNMENT_OP expression END;



ifStmt          : IF LPAREN condition=expression RPAREN blockStmt (elseIf)* (elseBlock)?;
elseIf          : ELSE_IF LPAREN condition=expression RPAREN blockStmt;
elseBlock       : ELSE blockStmt;
blockStmt       : OPEN_BRACK (expression (END)?| statement)* CLOSE_BRACK;
whileLoop       : WHILE LPAREN condition=expression RPAREN blockStmt ;
returnStmt      : RETURN expression END;



// function body is the same as a block statement but without opening a new scope. We want the function parameters to be in the same scope as the function body

functionBody    : OPEN_BRACK returnStmt? (expression(END)? | statement)*  CLOSE_BRACK;
functionCall    : IDENTIFIER LPAREN (parameters)? RPAREN END;
arguments       : declaration (COMMA declaration)*;
// maybe add a method keyword
functionDecl    : FUNC type IDENTIFIER LPAREN arguments? RPAREN functionBody;


parameters      : expression (COMMA expression)*;

scanner         : (scannertype=type)? int_id=IDENTIFIER 'is' scanner_id=IDENTIFIER '.scan' END;
scannerDecl     : SCANNER IDENTIFIER END;


array           : arrayType=type'[]' IDENTIFIER ASSIGNMENT_OP 'new' arraysizeType=type OPEN_BLOCK arraysize=expression CLOSE_BLOCK END;
arrayAssign     : IDENTIFIER '[' index=expression ']' ASSIGNMENT_OP data=expression END;
// something to get the value from arrays

expression      : LPAREN expression RPAREN                                    # ExprParenthesis
                | NEG expression                                              # ExprNegate
                | left=expression op=MULDIV_OPERATOR right=expression         # ExprMulDivOp
                | left=expression op=ADDSUB_OPERATOR right=expression         # ExprAddOp
                | left=expression op=COMPARE_OPERATOR right=expression        # ExprCompareOp
                | left=expression op=EQUALITY_OPERATOR right=expression       # ExprEqualityOp
                | left=expression op=AND_OPERATOR right=expression            # ExprAndOp
                | left=expression op=OR_OPERATOR right=expression             # ExprOrOp
                | booleanLiteral                                              # ExprBoolLiteral
                | scanner                                                     # ExprScanner
                | functionCall                                                # ExprFunctionCall
                | IDENTIFIER '[' expression ']'                               # ExprArray
                | IDENTIFIER incr_decr END                                    # ExprIncrement
                | IDENTIFIER                                                  # ExprIdentifier
                | STRING                                                      # ExprStringLiteral
                | INLINE4                                                     # ExprNumbLiteral
                | FLAT4                                                       # ExprFloatLiteral
                ;

type            : (INT_TYPE|STRING_TYPE|FLOAT_TYPE|BOOL_TYPE|VOID_TYPE);
booleanLiteral  : TRUE | FALSE;
incr_decr       : INCREMENT | DECREMENT;

LPAREN          : '(';
RPAREN          : ')';
COMMA           : ',';
OPEN_BRACK      : '{';
CLOSE_BRACK     : '}';
OPEN_BLOCK      : '[';
CLOSE_BLOCK     : ']';
END             : '#';
NEG             : '-';
IF              : 'if';
ELSE_IF         : 'elif';
ELSE            : 'else';
WHILE           : 'while';
PRINT           : 'burnout';
RETURN          : 'return';



INT_TYPE         : 'inline4';
FLOAT_TYPE       : 'flat4';
STRING_TYPE      : 'sentence';
BOOL_TYPE        : 'ev';
VOID_TYPE        : 'void';
ASSIGNMENT_OP    : 'is';
COMPARE_OPERATOR : '<' | '>';
EQUALITY_OPERATOR: '==' | '!=';
AND_OPERATOR     : 'AND';
OR_OPERATOR      : 'OR';
INCREMENT        : '^^';
DECREMENT        : '--';
ADDSUB_OPERATOR  : 'upshift' | 'downshift';
MULDIV_OPERATOR  : 'nitro' | 'divide';

SCANNER          : 'scanner';
FUNC            : 'funky';

FLAT4            : '0' '.' Digits | PosDigits '.' Digits | '.' Digits;
STRING           : '"' ~('\n'|'\r')* '"';
INLINE4          : '0' | [0-9][0-9]*;
TRUE             : 'true';
FALSE            : 'false';

IDENTIFIER       : Letter LetterOrDigit*;
WS               : [ \r\n\t]+ -> skip;

fragment Letter        : [A-Za-z] ;
fragment Letters       : [A-Za-z] ([A-Za-z]*);
fragment Digit         : [0-9];
fragment Digits        : [0-9] ([0-9_]* [0-9])?;
fragment PosDigits     : [1-9][0-9]*;
fragment LetterOrDigit : Letter | [0-9];


//TODO:
// - Functions
// - Functions calls
// - must file 5 needs functions





