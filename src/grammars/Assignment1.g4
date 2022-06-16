grammar Assignment1;

program: 'BEGIN' statement+ 'END';
statement: 'READ' ID
               | 'WRITE' expression
               | ID ':=' expression
               ;
expression: expression OP expression
                | ID
                | NUMBER
                ;

OP:         '+' | '-';
ID:         [A-Za-z]+;
NUMBER:     [0-9]+;
WS:         [ \r\n\t]+ -> skip;
