grammar MinhaLinguagem;

//Definição das Variaveis 

Boleano: 'true' | 'false';
Numero: '0' | '-'? [1-9] [0-9]* ('.' [0-9]+)?;
Texto: '"' ~('\r' | '\n' | '"' | '\u0100' .. '\u017E')* '"';

//Declaraçào de Variavel e Atribuição
fragment Id: [A-Za-z] [._\-A-Za-z0-9]*;
fragment Tipo: 'Texto' | 'Inteiro' | 'Decimal';
Valor: Numero | Boleano | Texto;
Variavel: Tipo Id;

//Expressões Matematicas
fragment Soma: '+';
fragment Multi: '*';
fragment Div: '/';
fragment Sub: '-';

Expr: Expr Op Expr | Numero | '(' Expr ')';
Op: Soma | Multi | Div | Sub;

//Laço de repetição For
ExprId: Id;
ExprFor: '('ExprId 'estiver no range' (Numero|Id)')';
Para: 'Para' ExprFor 'faça:' Comandos 'Fim para' ;

//Laço de repetiçào While
Simbolos: Maior Igual? | Igual Igual | Menor Igual;
Maior: '>';
Igual: '=';
Menor: '<';
ExprEnq: ExprId Simbolos (Numero|ExprId);
Enquanto: 'Enquanto' ExprEnq 'faça:' Comandos 'Fim enquanto';

//Laço de repetição Do While
Faca: 'Faça:' Comandos 'Enquanto' ExprEnq 'Fim faça';

//Condição 
Se: 'Se' (Variavel|Valor) Simbolos (Variavel|Valor) 'faça:' Comandos 'Fim se' Senao?;
Senao: 'Senão faça:' Comandos 'Fim senão'; 

//Programaa
Programa: 'Inicio'+ Declaracoes+ Comandos+ 'Fim';
Declaracoes: Variavel ('='+ Valor)?;
Atribuicao: Id '=' Valor | Variavel '=' Valor;
Comandos: Enquanto | Para | Se | Expr;



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
