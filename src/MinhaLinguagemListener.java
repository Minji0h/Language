// Generated from MinhaLinguagem.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MinhaLinguagemParser}.
 */
public interface MinhaLinguagemListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MinhaLinguagemParser#conta}.
	 * @param ctx the parse tree
	 */
	void enterConta(MinhaLinguagemParser.ContaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinhaLinguagemParser#conta}.
	 * @param ctx the parse tree
	 */
	void exitConta(MinhaLinguagemParser.ContaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinhaLinguagemParser#exprId}.
	 * @param ctx the parse tree
	 */
	void enterExprId(MinhaLinguagemParser.ExprIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinhaLinguagemParser#exprId}.
	 * @param ctx the parse tree
	 */
	void exitExprId(MinhaLinguagemParser.ExprIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinhaLinguagemParser#exprFor}.
	 * @param ctx the parse tree
	 */
	void enterExprFor(MinhaLinguagemParser.ExprForContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinhaLinguagemParser#exprFor}.
	 * @param ctx the parse tree
	 */
	void exitExprFor(MinhaLinguagemParser.ExprForContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinhaLinguagemParser#para}.
	 * @param ctx the parse tree
	 */
	void enterPara(MinhaLinguagemParser.ParaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinhaLinguagemParser#para}.
	 * @param ctx the parse tree
	 */
	void exitPara(MinhaLinguagemParser.ParaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinhaLinguagemParser#simbolos}.
	 * @param ctx the parse tree
	 */
	void enterSimbolos(MinhaLinguagemParser.SimbolosContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinhaLinguagemParser#simbolos}.
	 * @param ctx the parse tree
	 */
	void exitSimbolos(MinhaLinguagemParser.SimbolosContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinhaLinguagemParser#exprEnq}.
	 * @param ctx the parse tree
	 */
	void enterExprEnq(MinhaLinguagemParser.ExprEnqContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinhaLinguagemParser#exprEnq}.
	 * @param ctx the parse tree
	 */
	void exitExprEnq(MinhaLinguagemParser.ExprEnqContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinhaLinguagemParser#enquanto}.
	 * @param ctx the parse tree
	 */
	void enterEnquanto(MinhaLinguagemParser.EnquantoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinhaLinguagemParser#enquanto}.
	 * @param ctx the parse tree
	 */
	void exitEnquanto(MinhaLinguagemParser.EnquantoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinhaLinguagemParser#faca}.
	 * @param ctx the parse tree
	 */
	void enterFaca(MinhaLinguagemParser.FacaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinhaLinguagemParser#faca}.
	 * @param ctx the parse tree
	 */
	void exitFaca(MinhaLinguagemParser.FacaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinhaLinguagemParser#se}.
	 * @param ctx the parse tree
	 */
	void enterSe(MinhaLinguagemParser.SeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinhaLinguagemParser#se}.
	 * @param ctx the parse tree
	 */
	void exitSe(MinhaLinguagemParser.SeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinhaLinguagemParser#senao}.
	 * @param ctx the parse tree
	 */
	void enterSenao(MinhaLinguagemParser.SenaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinhaLinguagemParser#senao}.
	 * @param ctx the parse tree
	 */
	void exitSenao(MinhaLinguagemParser.SenaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinhaLinguagemParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(MinhaLinguagemParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinhaLinguagemParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(MinhaLinguagemParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinhaLinguagemParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracoes(MinhaLinguagemParser.DeclaracoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinhaLinguagemParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracoes(MinhaLinguagemParser.DeclaracoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinhaLinguagemParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao(MinhaLinguagemParser.AtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinhaLinguagemParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao(MinhaLinguagemParser.AtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinhaLinguagemParser#comandos}.
	 * @param ctx the parse tree
	 */
	void enterComandos(MinhaLinguagemParser.ComandosContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinhaLinguagemParser#comandos}.
	 * @param ctx the parse tree
	 */
	void exitComandos(MinhaLinguagemParser.ComandosContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinhaLinguagemParser#imprime}.
	 * @param ctx the parse tree
	 */
	void enterImprime(MinhaLinguagemParser.ImprimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinhaLinguagemParser#imprime}.
	 * @param ctx the parse tree
	 */
	void exitImprime(MinhaLinguagemParser.ImprimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinhaLinguagemParser#valor}.
	 * @param ctx the parse tree
	 */
	void enterValor(MinhaLinguagemParser.ValorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinhaLinguagemParser#valor}.
	 * @param ctx the parse tree
	 */
	void exitValor(MinhaLinguagemParser.ValorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinhaLinguagemParser#variavel}.
	 * @param ctx the parse tree
	 */
	void enterVariavel(MinhaLinguagemParser.VariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinhaLinguagemParser#variavel}.
	 * @param ctx the parse tree
	 */
	void exitVariavel(MinhaLinguagemParser.VariavelContext ctx);
}