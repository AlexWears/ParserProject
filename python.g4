grammar python;
s               : branch s
                | var s
                | EOF
                ;

IF              : 'if'
                ;

ELIF            : 'elif'
                ;

ELSE            : 'else'
                ;

NOT             : 'not'
                ;

AND             : 'and'
                ;

OR              : 'or'
                ;

BOOL            : 'True'
                | 'False'
                ;

ID              : (LETTER) (LETTER|NUMBER|US)*
                ;

LITERAL         : STRING
                | CHAR
                | NUMBER
                | BOOL
                ;

INT             : '0'..'9'+
                ;

NUMBER          : '-'? INT '.'? INT?
                ;

LETTER          : LOWERCASE
                | UPPERCASE
                ;

STRING          : '"' (LETTER|NUMBER|WS)* '"'
                ;

CHAR            : '\'' LETTER '\''
                ;

LOWERCASE       : 'a'..'z'
                ;

UPPERCASE       : 'A'..'Z'
                ;

ARRAY           : '[' WS* (LITERAL (WS* ',' WS* LITERAL)*) WS* ']'
                ;

OPSYMBOL        : ('*' | '/' | '+' | '-' | '%')
                ;

WS              : ('\t'|' ')+
                ;

NL              : '\r\n'
                ;

US              : ('_')
                ;

LPAREN          : '('
                ;

RPAREN          : ')'
                ;

COLON           : ':'
                ;

COMPAREOP       : '=='
                | '!='
                | '<'
                | '>'
                | '<='
                | '>='
                ;

branch          : (((IF|ELIF) WS* comparison) | ELSE) COLON NL branchstatement+ branch?
                ;

var             : ID WS* (assign | operation)? NL*
                ;

comparison      : ((LPAREN comparison RPAREN) | ('not'* WS* (var | LITERAL | BOOL))) WS* ((COMPAREOP comparison) | (AND|OR) WS* comparison WS*)?
                ;

branchstatement : '\t' (var | branch | NL*)
                ;

assign          : OPSYMBOL? '=' WS* (var | LITERAL | operation | ARRAY | BOOL) assign? NL*
                ;

operation       : (LITERAL | var) (WS* OPSYMBOL '='? WS* (LITERAL | var))*
                ;

