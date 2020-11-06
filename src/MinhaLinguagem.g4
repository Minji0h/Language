grammar MinhaLinguagem;
// Regras

expr: expr op expr | Numero | '(' expr ')';
op: soma | multi | div | sub;

//Tokens
Boleano: 'true' | 'false';
Numero: '0' | '-'? [1-9] [0-9]* ('.' [0-9]+)?;
Texto: '"' ~('\r' | '\n' | '"' | '\u0100' .. '\u017E')* '"';
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
imprime:
	(
		'imprime ' Texto ';' {
      System.out.println($Texto.text);}
		| 'imprime ' Numero ';' {
      System.out.println($Numero.text);}
		| 'imprime ' Boleano ';' {
      System.out.println($Boleano.text);}
	)+;

// Just ignore WhiteSpaces
WS: [ \t\r\n]+ -> skip;
