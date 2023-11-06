grammar python;
s   : VAR s EOF
    |
    ;

LITERAL : STRING
        | CHAR
        | NUMBER
        | BOOL
        ;

VAR : (LETTER) (LETTER|NUMBER|'_')* WS* (ASSIGN | OPERATION | '\n'*)
    ;

ASSIGN : OPSYMBOL? '=' ((WS* (VAR | LITERAL | OPERATION | ARRAY) ASSIGN?)) '\n'*
       ;

OPSYMBOL : ('*' | '/' | '+' | '-' | '%')
         ;

OPERATION: (LITERAL | VAR) WS* OPSYMBOL '='? WS* (LITERAL | VAR);

INT : '0'..'9'+
    ;

NUMBER : INT '.'? INT*
       ;

LETTER : LOWERCASE
       | UPPERCASE;

STRING : '"' (LETTER|NUMBER|WS)* '"';

CHAR : '\'' LETTER '\'';

BOOL : 'True'
     | 'False'
     ;

LOWERCASE : 'a'..'z';

UPPERCASE : 'A'..'Z';

ARRAY : '[' WS* (LITERAL (WS* ',' WS* LITERAL)*) WS* ']'
      ;

WS  : ('\t'|' ')+;

