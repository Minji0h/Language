grammar MinhaLinguagem;

//Definição das Variaveis 
BOLEANO: 'true' | 'false';
NUMERO: '0' | '-'? [1-9] [0-9]* ('.' [0-9]+)?;
TEXTO: '"' ~('\r' | '\n' | '"' | '\u0100' .. '\u017E')* '"';
NOVALINHA: '\r'? '\n';

//Declaraçào de Variavel e Atribuição
ID: [A-Za-z] [._\-A-Za-z0-9]*;
TIPO: 'Texto' | 'Inteiro' | 'Decimal';
valor: NUMERO | BOLEANO | TEXTO;
variavel: TIPO ID;

//Expressões Matematicas


conta:
    conta ('*'| '/') conta
	| conta ( '+' | '-') conta
	| (NUMERO|exprId)
	| '(' conta ')';

//Laço de repetição For
exprId: ID;
exprFor: '('exprId 'estiver no range' (NUMERO|exprId)')';
para: 'Para' exprFor 'faça:' comandos 'Fim para' ;


//Simbolos de comparação
simbolos: MAIOR IGUAL? | IGUAL IGUAL | MENOR IGUAL?;
MAIOR: '>';
IGUAL: '=';
MENOR: '<';

//Laço de repetiçào While
exprEnq: exprId simbolos (NUMERO|exprId);
enquanto: 'Enquanto' exprEnq 'faça:' NOVALINHA comandos 'Fim enquanto';

//Laço de repetição Do While
faca: 'Faça:' NOVALINHA comandos 'Enquanto' exprEnq 'Fim faça';

//Condição 
se: 'Se' (variavel|valor) simbolos (variavel|valor) 'faça:' NOVALINHA comandos 'Fim se' senao?;
senao: 'Senão faça:' NOVALINHA comandos 'Fim senão'; 

//Programaa
programa: 'Inicio'+ declaracoes+ comandos+ 'Fim';
declaracoes: variavel ('='+ valor)?;
atribuicao: ID '=' valor | variavel '=' valor;



comandos: enquanto NOVALINHA|
		se NOVALINHA|
		faca NOVALINHA|
		conta NOVALINHA;



imprime:
	(
		'imprime ' TEXTO ';' {
      System.out.println($TEXTO.text);}
		| 'imprime ' NUMERO ';' {
      System.out.println($NUMERO.text);}
		| 'imprime ' BOLEANO ';' {
      System.out.println($BOLEANO.text);}
	)+;

// Just ignore WhiteSpaces
WS: [ \t\r\n]+ -> skip;
