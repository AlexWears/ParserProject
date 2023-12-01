grammar python;

s               : (branch | var | COMMENT)* EOF
                ;

COMMENT         : '#' ~( '\r' | '\n' )* NL+
                | '\'\'\'' .*? '\'\'\'' NL+ 
                ;

IF              : 'if'
                ;

ELIF            : 'elif'
                ;

ELSE            : 'else'
                ;

WHILE           : 'while'
                ;

FOR             : 'for'
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

RANGEFUNC       : 'range' LPAREN WS* (ID | NUMBER) WS* ',' WS* (ID | INT) WS* RPAREN
                ;

ID              : (LETTER) (LETTER|NUMBER|US)*
                ;

LITERAL         : STRING
                | CHAR
                | NUMBER
                | BOOL
                ;

INT             : '-'? ('0'..'9')+
                ;

NUMBER          : '-'? INT '.'? INT?
                ;

LETTER          : LOWERCASE
                | UPPERCASE
                ;

STRING          : '"' ~( '\r' | '\n' )* '"'
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

TABS            : '\t'+
                ;

WS              : ('\t'|' ')+
                ;

NL              : '\r\n' | '\n'
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

branch          : (((IF|ELIF) WS* comparison) | ELSE | WHILE WS* comparison | FOR WS* ID WS* 'in' WS* (ID | RANGEFUNC)) COLON NL (TABS branchstatement | TABS branch)+
                ;

var             : ID WS* (assign | operation)? NL*
                ;

comparison      : ((LPAREN comparison RPAREN) | ('not'* WS* (var | LITERAL | BOOL))) WS* ((COMPAREOP comparison) | (AND|OR) WS* comparison WS*)?
                ;

branchstatement : (var | branch | NL*)
                ;

assign          : OPSYMBOL? '=' WS* (var | LITERAL | operation | ARRAY | BOOL) assign? NL*
                ;

operation       : (LITERAL | var) (WS* OPSYMBOL '='? WS* (LITERAL | var))*
                ;