grammar MinhaLinguagem;

//Expressões Matematicas
@header {
import java.util.Map;
import java.util.HashMap;
}

@members {
Map<String, Object> memory = new HashMap<String, Object>();
}
conta:
	conta ('*' | '/') conta
	| conta ( '+' | '-') conta
	| (
		NUMERO
		| exprId {if(memory.get($exprId.text) == null){System.err.println("Essa variavel nao existe!");} else if(!(memory.get($exprId.text) instanceof Number)){System.err.println("Essa variavel nao e um numero!");}
			}
	)
	| '(' conta ')';

//Laço de repetiçao For

exprId: ID;
exprFor:
	'(' exprId 'estiver no range' (
		NUMERO
		| exprId {if(memory.get($exprId.text) == null){System.err.println("Essa variavel nao existe!");} else if(!(memory.get($exprId.text) instanceof Number)){System.err.println("Essa variavel nao e um numero!");}
			}
	) ')';
para: 'Para' exprFor 'realize:' comandos 'Fim para';

//Simbolos de comparaçao
simbolos: MAIOR IGUAL? | IGUAL IGUAL | MENOR IGUAL?;

//Laço de repetiçào While
exprEnq: exprId simbolos (NUMERO | exprId);
enquanto: 'Enquanto' exprEnq 'realize:' comandos 'Fim enquanto';

//Laço de repetiçao Do While
faca: 'Realize:' comandos 'Enquanto' exprEnq 'Fim realize';

//Condiçao 
se:
	'Se' (variavel | valor) simbolos (variavel | valor) 'realize:' comandos 'Fim se' senao?;
senao: 'Senao realize:' comandos 'Fim senao';

//Programaa
programa: 'Inicio' declaracoes? comandos 'Fim';
declaracoes:
	variavel ('=' (valor | conta))? ID? TIPO {
		if ( $valor.text !=null ) {
			if($TIPO.text == "NUMERO" && memory.get($valor.text) != null){
				System.err.println("Variavel declarada incorretamente. "+$ID.text);
			}else if($TIPO.text == "TEXTO" && ($valor.text instanceof String)){
				System.err.println("Variavel declarada incorretamente. "+$ID.text);
			}else if($TIPO.text == "BOLEANO" && ($valor.text instanceof String)){
				System.err.println("Variavel declarada incorretamente. "+$ID.text);
			}
		}
};
atribuicao: exprId '=' valor ';' | variavel '=' valor ';';

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

//Definiçao das Variaveis 
BOLEANO: 'true' | 'false';
NUMERO: '0' | '-'? [1-9] [0-9]*;
TEXTO: '"' ~('\r' | '\n' | '"' | '\u0100' .. '\u017E')* '"';

//Declaraçào de Variavel e Atribuiçao

TIPO: 'texto' | 'inteiro' | 'decimal' | 'boleano';
valor: NUMERO | BOLEANO | TEXTO;
variavel:
	TIPO ID {if(memory.containsKey($ID.text)){System.err.println("A variavel já foi definida. "+$ID);}
		};
ID: [A-Za-z] [._\-A-Za-z0-9]*;
//Simbolos de comparaçao
MAIOR: '>';
IGUAL: '=';
MENOR: '<';
// Just ignore WhiteSpaces
WS: [ \t\r\n]+ -> skip;
