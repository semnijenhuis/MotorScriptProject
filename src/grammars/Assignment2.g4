grammar Assignment2;

statement : ifStmt | ID;
ifStmt : 'if' ID statement ('else' statement)?;
      ID        : [a-zA-Z]+;
      WS        : [ \r\n\t]+ -> skip;

