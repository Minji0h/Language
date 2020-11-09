grammar MinhaLinguagem;

//Expressões Matematicas

@members {
HashMap memory = HashMap<String, VarDeclaration>();
}

conta:
	conta ('*' | '/') conta
	| conta ( '+' | '-') conta
	| (NUMERO | exprId {
		if (!memory.containsKey($exprId)) {
				System.err.println("Chave não existe");
				} else if(memory.get($exprId) != Numero){
					ystem.err.println("Essa variavel não é um numero!")
				}
	})
	| '(' conta ')';

//Laço de repetição For
exprId: ID;
exprFor: '(' exprId 'estiver no range' (NUMERO | exprId) ')';
para: 'Para' exprFor 'faça:' comandos 'Fim para';

//Simbolos de comparação
simbolos: MAIOR IGUAL? | IGUAL IGUAL | MENOR IGUAL?;

//Laço de repetiçào While
exprEnq: exprId simbolos (NUMERO | exprId);
enquanto: 'Enquanto' exprEnq 'faça:' comandos 'Fim enquanto';

//Laço de repetição Do While
faca: 'Faça:' comandos 'Enquanto' exprEnq 'Fim faça';

//Condição 
se:
	'Se' (variavel | valor) simbolos (variavel | valor) 'faça:' comandos 'Fim se' senao?;
senao: 'Senão faça:' comandos 'Fim senão';

//Programaa
programa: 'Inicio' declaracoes? comandos 'Fim';
declaracoes: variavel ('='(valor | conta))?{
		if ( $valor !=null ) {
			if($tipo == 'Inteiro' && ($valor = Inteiro or $conta = true)){
				System.err.println("Variavel declarada incorretamente. "+$ID.text);
			}else if($tipo == 'String' && ($valor = String)){
				System.err.println("Variavel declarada incorretamente. "+$ID.text);
			}else if($tipo == 'Bolean' && ($valor = String)){
				System.err.println("Variavel declarada incorretamente. "+$ID.text);
			}
		}
}
;
atribuicao: exprId '=' valor | declaracoes;

comandos: enquanto | se | faca | conta;

imprime:
	(
		'imprime ' TEXTO {
      System.out.println($TEXTO.text);}
		| 'imprime ' NUMERO {
      System.out.println($NUMERO.text);}
		| 'imprime ' BOLEANO {
      System.out.println($BOLEANO.text);}
	)+;

// Just ignore WhiteSpaces
WS: [ \t\r\n]+ -> skip;

//Definição das Variaveis 
BOLEANO: 'true' | 'false';
NUMERO: '0' | '-'? [1-9] [0-9]*;
TEXTO: '"' ~('\r' | '\n' | '"' | '\u0100' .. '\u017E')* '"';

//Declaraçào de Variavel e Atribuição
ID: [A-Za-z] [._\-A-Za-z0-9]*;
TIPO: 'Texto' | 'Inteiro' | 'Decimal';
valor: NUMERO | BOLEANO | TEXTO;
variavel: TIPO ID {if(varsByName.containsKey($ID.text)){System.err.println("A variavel já foi definida. "+$ID.text);}};
//Simbolos de comparação
MAIOR: '>';
IGUAL: '=';
MENOR: '<';