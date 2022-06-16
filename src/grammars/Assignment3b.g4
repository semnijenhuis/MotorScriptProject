grammar Assignment3b;

program: expression;

expression:    LP expression RP
               |expression '*' expression
               |expression '/' expression
               |expression '+' expression
               |expression '-' expression
               | NUMBER
               | OP*
                ;

LP : '(' ;
RP : ')' ;
OP:         '*' | '–'|'+'| '/';
ID:         [A-Za-z]+;
NUMBER:     [0-9]+;
WS:         [ \r\n\t]+ -> skip;
