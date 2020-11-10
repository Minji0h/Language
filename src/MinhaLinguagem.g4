grammar MinhaLinguagem;

//Expressões Matematicas
@header {
	import java.util.Map;
import java.util.HashMap;
}

@members {
Map<String, T> memory = new HashMap();
}
conta:
	conta ('*' | '/') conta
	| conta ( '+' | '-') conta
	| (
		NUMERO
		| exprId {if(memory.get($exprId.text) == NULL){System.err.println("Essa variavel não existe!");} else if(memory.get($exprId.text) != type.isInstance("NUMERO")){System.err.println("Essa variavel não é um numero!");}
			}
	)
	| '(' conta ')';

//Laço de repetição For

exprId: ID;
exprFor:
	'(' exprId 'estiver no range' (
		NUMERO
		| exprId {if(memory.get($exprId.text) == NULL){System.err.println("Essa variavel não existe!");} else if(memory.get($exprId.text) != type.isInstance("NUMERO")){System.err.println("Essa variavel não é um numero!");}
			}
	) ')';
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
declaracoes:
	variavel ('=' (valor | conta))? ID? TIPO {
		if ( $valor.text !=null ) {
			if($TIPO == Integer && (memory.get($valor.text))){
				System.err.println("Variavel declarada incorretamente. "+$ID.text);
			}else if($TIPO == String && ($valor.text == "String")){
				System.err.println("Variavel declarada incorretamente. "+$ID.text);
			}else if($TIPO == Bolean && ($valor.text == "String")){
				System.err.println("Variavel declarada incorretamente. "+$ID.text);
			}
		}
};
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

//Definição das Variaveis 
BOLEANO: 'true' | 'false';
NUMERO: '0' | '-'? [1-9] [0-9]*;
TEXTO: '"' ~('\r' | '\n' | '"' | '\u0100' .. '\u017E')* '"';

//Declaraçào de Variavel e Atribuição

TIPO: 'Texto' | 'Inteiro' | 'Decimal' | 'Boleano';
valor: NUMERO | BOLEANO | TEXTO;
variavel:
	TIPO ID {if(memory.containsKey($ID.text)){System.err.println("A variavel já foi definida. "+$ID);}
		};
ID: [A-Za-z] [._\-A-Za-z0-9]*;
//Simbolos de comparação
MAIOR: '>';
IGUAL: '=';
MENOR: '<';
// Just ignore WhiteSpaces
WS: [ \t\r\n]+ -> skip;
