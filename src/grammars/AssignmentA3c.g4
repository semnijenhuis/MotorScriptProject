grammar AssignmentA3c;

program: scheme userinfo? host (':' port)? ('/' path)?;

scheme: SCHEME;
userinfo: INFO;
host:   ID
        | NUMBER('.' NUMBER)*
        | ID OP ID;
port: PORT;
path: PATH (PATH)?;



OP: ':' | '@' | '/' | '//' | '.' | '-';
SCHEME: ID + OP + OP;
INFO: ID + ':' + ID + '@';
PORT: NUMBER;
PATH: OP + ID + OP + ID;
ID:         [A-Za-z]+;
NUMBER:         [0-9]+;
WS:             [ \r\n\t]+ -> skip;
