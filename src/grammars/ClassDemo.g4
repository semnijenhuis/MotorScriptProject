grammar ClassDemo;

program: (content | functionDecl)*;

expr: assignmentExpr | stringLiteral | numberLiteral | methodCall;
stmt:;
content: (expr | stmt) SEMICOLON;

blockStmt: ;
returnStmt: ;
functionDecl: ;


assignmentExpr: ;
methodCall: ;

params: ;

stringLiteral: ;
numberLiteral: ;

SEMICOLON: ';';