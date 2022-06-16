grammar AssignmentA3;

method: IDENTIFIER LPAREN NUMBER (',' NUMBER)* RPAREN ';';

LPAREN:         '(';
RPAREN:         ')';
IDENTIFIER:     [A-Za-z]+;
WS:             [ \r\n\t]+ -> skip;
NUMBER:         [0-9]+;