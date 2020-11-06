//Cabeçalho
grammar MinhaLinguagem;
//Tokens
fragment Boleano: 'true' | 'false';
fragment Numero: '0'|'-'?[1-9] [0-9]* ('.' [0-9])*;
fragment Texto: '"' '"';
fragment Id: [A-Za-z] [._\-A-Za-z0-9]*;
fragment Variavel: Tipo Id;
fragment Tipo: 'Texto' | 'Inteiro' | 'Decimal';
fragment Valor: ;
//Programa
Programa: 'Inicio' + Declaracoes + Comandos + 'Fim';
Declaracoes: Variavel + '=' + Valor;
Atribuicao: Id '=' Valor;
Comandos: Enquanto | Para | Se;
Se:;
Enquanto: ;
Para: 'Para' '('')';

// Just ignore WhiteSpaces
WS: [ \t\r\n]+ -> skip;