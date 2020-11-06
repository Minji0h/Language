grammar MinhaLinguagem;
// Regras

expr: expr op expr | Numero | '(' expr ')';
op: soma | multi | div | sub;

//Tokens
fragment Boleano: 'true' | 'false';
Numero: '0' | '-'? [1-9] [0-9]* ('.' [0-9])*;
fragment Texto: '"' [.*] '"';
fragment Id: [A-Za-z] [._\-A-Za-z0-9]*;
Variavel: Tipo Id;
fragment Tipo: 'Texto' | 'Inteiro' | 'Decimal';
Valor: Numero | Boleano | Texto;
//Programa
Programa: 'Inicio'+ Declaracoes+ Comandos+ 'Fim';
Declaracoes: Variavel ('='+ Valor)?;
Atribuicao: Id '=' Valor | Variavel '=' Valor;
Comandos: Enquanto | Para | Se;
Se: 'Se' '(' ')';
Enquanto: 'Enquanto' '(' ')';
Para: 'Para' '(' ')';
soma: '+';
multi: '*';
div: '/';
sub: '-';

// Just ignore WhiteSpaces
WS: [ \t\r\n]+ -> skip;