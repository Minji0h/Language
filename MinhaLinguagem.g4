grammar MinhaLinguagem;

Programa: 'Inicio' + commands + 'Fim';

Comandos: Variavel || Code;

Variavel : Indetificação + ('=' + Value)*;

Indetificação: [A-Za-z] [._\-A-Za-z0-9]*;

Value: Inteiro || Texto || Decimal;

Texto: Aspas (ESC | ~["\\])* Aspas;

Decimal: '-'? Inteiro '.' Inteiro;

fragment Aspas: '"';

fragment Inteiro: '0' | [1-9] [0-9]*;

// Just ignore WhiteSpaces
WS: [ \t\r\n]+ -> skip;