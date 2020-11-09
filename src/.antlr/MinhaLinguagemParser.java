// Generated from c:\Users\marin\OneDrive\Documentos\GitHub\Language\src\MinhaLinguagem.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MinhaLinguagemParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, WS=22, BOLEANO=23, NUMERO=24, 
		TEXTO=25, ID=26, TIPO=27, MAIOR=28, IGUAL=29, MENOR=30;
	public static final int
		RULE_conta = 0, RULE_exprId = 1, RULE_exprFor = 2, RULE_para = 3, RULE_simbolos = 4, 
		RULE_exprEnq = 5, RULE_enquanto = 6, RULE_faca = 7, RULE_se = 8, RULE_senao = 9, 
		RULE_programa = 10, RULE_declaracoes = 11, RULE_atribuicao = 12, RULE_comandos = 13, 
		RULE_imprime = 14, RULE_valor = 15, RULE_variavel = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"conta", "exprId", "exprFor", "para", "simbolos", "exprEnq", "enquanto", 
			"faca", "se", "senao", "programa", "declaracoes", "atribuicao", "comandos", 
			"imprime", "valor", "variavel"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'*'", "'/'", "'+'", "'-'", "'('", "')'", "'estiver no range'", 
			"'Para'", "'fa\u00C3\u00A7a:'", "'Fim para'", "'Enquanto'", "'Fim enquanto'", 
			"'Fa\u00C3\u00A7a:'", "'Fim fa\u00C3\u00A7a'", "'Se'", "'Fim se'", "'Sen\u00C3\u00A3o fa\u00C3\u00A7a:'", 
			"'Fim sen\u00C3\u00A3o'", "'Inicio'", "'Fim'", "'imprime '", null, null, 
			null, null, null, null, "'>'", "'='", "'<'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "WS", "BOLEANO", 
			"NUMERO", "TEXTO", "ID", "TIPO", "MAIOR", "IGUAL", "MENOR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "MinhaLinguagem.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	HashMap memory = new HashMap();

	public MinhaLinguagemParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ContaContext extends ParserRuleContext {
		public TerminalNode NUMERO() { return getToken(MinhaLinguagemParser.NUMERO, 0); }
		public ExprIdContext exprId() {
			return getRuleContext(ExprIdContext.class,0);
		}
		public List<ContaContext> conta() {
			return getRuleContexts(ContaContext.class);
		}
		public ContaContext conta(int i) {
			return getRuleContext(ContaContext.class,i);
		}
		public ContaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conta; }
	}

	public final ContaContext conta() throws RecognitionException {
		return conta(0);
	}

	private ContaContext conta(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ContaContext _localctx = new ContaContext(_ctx, _parentState);
		ContaContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_conta, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERO:
			case ID:
				{
				setState(37);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NUMERO:
					{
					setState(35);
					match(NUMERO);
					}
					break;
				case ID:
					{
					setState(36);
					exprId();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case T__4:
				{
				setState(39);
				match(T__4);
				setState(40);
				conta(0);
				setState(41);
				match(T__5);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(53);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(51);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new ContaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_conta);
						setState(45);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(46);
						_la = _input.LA(1);
						if ( !(_la==T__0 || _la==T__1) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(47);
						conta(5);
						}
						break;
					case 2:
						{
						_localctx = new ContaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_conta);
						setState(48);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(49);
						_la = _input.LA(1);
						if ( !(_la==T__2 || _la==T__3) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(50);
						conta(4);
						}
						break;
					}
					} 
				}
				setState(55);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExprIdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MinhaLinguagemParser.ID, 0); }
		public ExprIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprId; }
	}

	public final ExprIdContext exprId() throws RecognitionException {
		ExprIdContext _localctx = new ExprIdContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_exprId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprForContext extends ParserRuleContext {
		public List<ExprIdContext> exprId() {
			return getRuleContexts(ExprIdContext.class);
		}
		public ExprIdContext exprId(int i) {
			return getRuleContext(ExprIdContext.class,i);
		}
		public TerminalNode NUMERO() { return getToken(MinhaLinguagemParser.NUMERO, 0); }
		public ExprForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprFor; }
	}

	public final ExprForContext exprFor() throws RecognitionException {
		ExprForContext _localctx = new ExprForContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_exprFor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(T__4);
			setState(59);
			exprId();
			setState(60);
			match(T__6);
			setState(63);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERO:
				{
				setState(61);
				match(NUMERO);
				}
				break;
			case ID:
				{
				setState(62);
				exprId();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(65);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParaContext extends ParserRuleContext {
		public ExprForContext exprFor() {
			return getRuleContext(ExprForContext.class,0);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public ParaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_para; }
	}

	public final ParaContext para() throws RecognitionException {
		ParaContext _localctx = new ParaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_para);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(T__7);
			setState(68);
			exprFor();
			setState(69);
			match(T__8);
			setState(70);
			comandos();
			setState(71);
			match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimbolosContext extends ParserRuleContext {
		public TerminalNode MAIOR() { return getToken(MinhaLinguagemParser.MAIOR, 0); }
		public List<TerminalNode> IGUAL() { return getTokens(MinhaLinguagemParser.IGUAL); }
		public TerminalNode IGUAL(int i) {
			return getToken(MinhaLinguagemParser.IGUAL, i);
		}
		public TerminalNode MENOR() { return getToken(MinhaLinguagemParser.MENOR, 0); }
		public SimbolosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simbolos; }
	}

	public final SimbolosContext simbolos() throws RecognitionException {
		SimbolosContext _localctx = new SimbolosContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_simbolos);
		int _la;
		try {
			setState(83);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAIOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				match(MAIOR);
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGUAL) {
					{
					setState(74);
					match(IGUAL);
					}
				}

				}
				break;
			case IGUAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				match(IGUAL);
				setState(78);
				match(IGUAL);
				}
				break;
			case MENOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(79);
				match(MENOR);
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGUAL) {
					{
					setState(80);
					match(IGUAL);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprEnqContext extends ParserRuleContext {
		public List<ExprIdContext> exprId() {
			return getRuleContexts(ExprIdContext.class);
		}
		public ExprIdContext exprId(int i) {
			return getRuleContext(ExprIdContext.class,i);
		}
		public SimbolosContext simbolos() {
			return getRuleContext(SimbolosContext.class,0);
		}
		public TerminalNode NUMERO() { return getToken(MinhaLinguagemParser.NUMERO, 0); }
		public ExprEnqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprEnq; }
	}

	public final ExprEnqContext exprEnq() throws RecognitionException {
		ExprEnqContext _localctx = new ExprEnqContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_exprEnq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			exprId();
			setState(86);
			simbolos();
			setState(89);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERO:
				{
				setState(87);
				match(NUMERO);
				}
				break;
			case ID:
				{
				setState(88);
				exprId();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnquantoContext extends ParserRuleContext {
		public ExprEnqContext exprEnq() {
			return getRuleContext(ExprEnqContext.class,0);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public EnquantoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enquanto; }
	}

	public final EnquantoContext enquanto() throws RecognitionException {
		EnquantoContext _localctx = new EnquantoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_enquanto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(T__10);
			setState(92);
			exprEnq();
			setState(93);
			match(T__8);
			setState(94);
			comandos();
			setState(95);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FacaContext extends ParserRuleContext {
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public ExprEnqContext exprEnq() {
			return getRuleContext(ExprEnqContext.class,0);
		}
		public FacaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_faca; }
	}

	public final FacaContext faca() throws RecognitionException {
		FacaContext _localctx = new FacaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_faca);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(T__12);
			setState(98);
			comandos();
			setState(99);
			match(T__10);
			setState(100);
			exprEnq();
			setState(101);
			match(T__13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SeContext extends ParserRuleContext {
		public SimbolosContext simbolos() {
			return getRuleContext(SimbolosContext.class,0);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public List<VariavelContext> variavel() {
			return getRuleContexts(VariavelContext.class);
		}
		public VariavelContext variavel(int i) {
			return getRuleContext(VariavelContext.class,i);
		}
		public List<ValorContext> valor() {
			return getRuleContexts(ValorContext.class);
		}
		public ValorContext valor(int i) {
			return getRuleContext(ValorContext.class,i);
		}
		public SenaoContext senao() {
			return getRuleContext(SenaoContext.class,0);
		}
		public SeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_se; }
	}

	public final SeContext se() throws RecognitionException {
		SeContext _localctx = new SeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_se);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(T__14);
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TIPO:
				{
				setState(104);
				variavel();
				}
				break;
			case BOLEANO:
			case NUMERO:
			case TEXTO:
				{
				setState(105);
				valor();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(108);
			simbolos();
			setState(111);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TIPO:
				{
				setState(109);
				variavel();
				}
				break;
			case BOLEANO:
			case NUMERO:
			case TEXTO:
				{
				setState(110);
				valor();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(113);
			match(T__8);
			setState(114);
			comandos();
			setState(115);
			match(T__15);
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(116);
				senao();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SenaoContext extends ParserRuleContext {
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public SenaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_senao; }
	}

	public final SenaoContext senao() throws RecognitionException {
		SenaoContext _localctx = new SenaoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_senao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(T__16);
			setState(120);
			comandos();
			setState(121);
			match(T__17);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramaContext extends ParserRuleContext {
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public DeclaracoesContext declaracoes() {
			return getRuleContext(DeclaracoesContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(T__18);
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TIPO) {
				{
				setState(124);
				declaracoes();
				}
			}

			setState(127);
			comandos();
			setState(128);
			match(T__19);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaracoesContext extends ParserRuleContext {
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public ContaContext conta() {
			return getRuleContext(ContaContext.class,0);
		}
		public List<TerminalNode> IGUAL() { return getTokens(MinhaLinguagemParser.IGUAL); }
		public TerminalNode IGUAL(int i) {
			return getToken(MinhaLinguagemParser.IGUAL, i);
		}
		public DeclaracoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracoes; }
	}

	public final DeclaracoesContext declaracoes() throws RecognitionException {
		DeclaracoesContext _localctx = new DeclaracoesContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_declaracoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			variavel();
			{
			setState(132); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(131);
				match(IGUAL);
				}
				}
				setState(134); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IGUAL );
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(136);
				valor();
				}
				break;
			case 2:
				{
				setState(137);
				conta(0);
				}
				break;
			}
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtribuicaoContext extends ParserRuleContext {
		public ExprIdContext exprId() {
			return getRuleContext(ExprIdContext.class,0);
		}
		public TerminalNode IGUAL() { return getToken(MinhaLinguagemParser.IGUAL, 0); }
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public DeclaracoesContext declaracoes() {
			return getRuleContext(DeclaracoesContext.class,0);
		}
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_atribuicao);
		try {
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				exprId();
				setState(141);
				match(IGUAL);
				setState(142);
				valor();
				}
				break;
			case TIPO:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				declaracoes();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComandosContext extends ParserRuleContext {
		public EnquantoContext enquanto() {
			return getRuleContext(EnquantoContext.class,0);
		}
		public SeContext se() {
			return getRuleContext(SeContext.class,0);
		}
		public FacaContext faca() {
			return getRuleContext(FacaContext.class,0);
		}
		public ContaContext conta() {
			return getRuleContext(ContaContext.class,0);
		}
		public ComandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandos; }
	}

	public final ComandosContext comandos() throws RecognitionException {
		ComandosContext _localctx = new ComandosContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_comandos);
		try {
			setState(151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				enquanto();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				se();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 3);
				{
				setState(149);
				faca();
				}
				break;
			case T__4:
			case NUMERO:
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(150);
				conta(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImprimeContext extends ParserRuleContext {
		public Token TEXTO;
		public Token NUMERO;
		public Token BOLEANO;
		public List<TerminalNode> TEXTO() { return getTokens(MinhaLinguagemParser.TEXTO); }
		public TerminalNode TEXTO(int i) {
			return getToken(MinhaLinguagemParser.TEXTO, i);
		}
		public List<TerminalNode> NUMERO() { return getTokens(MinhaLinguagemParser.NUMERO); }
		public TerminalNode NUMERO(int i) {
			return getToken(MinhaLinguagemParser.NUMERO, i);
		}
		public List<TerminalNode> BOLEANO() { return getTokens(MinhaLinguagemParser.BOLEANO); }
		public TerminalNode BOLEANO(int i) {
			return getToken(MinhaLinguagemParser.BOLEANO, i);
		}
		public ImprimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imprime; }
	}

	public final ImprimeContext imprime() throws RecognitionException {
		ImprimeContext _localctx = new ImprimeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_imprime);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(162);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(153);
					match(T__20);
					setState(154);
					((ImprimeContext)_localctx).TEXTO = match(TEXTO);

					      System.out.println((((ImprimeContext)_localctx).TEXTO!=null?((ImprimeContext)_localctx).TEXTO.getText():null));
					}
					break;
				case 2:
					{
					setState(156);
					match(T__20);
					setState(157);
					((ImprimeContext)_localctx).NUMERO = match(NUMERO);

					      System.out.println((((ImprimeContext)_localctx).NUMERO!=null?((ImprimeContext)_localctx).NUMERO.getText():null));
					}
					break;
				case 3:
					{
					setState(159);
					match(T__20);
					setState(160);
					((ImprimeContext)_localctx).BOLEANO = match(BOLEANO);

					      System.out.println((((ImprimeContext)_localctx).BOLEANO!=null?((ImprimeContext)_localctx).BOLEANO.getText():null));
					}
					break;
				}
				}
				setState(164); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__20 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValorContext extends ParserRuleContext {
		public TerminalNode NUMERO() { return getToken(MinhaLinguagemParser.NUMERO, 0); }
		public TerminalNode BOLEANO() { return getToken(MinhaLinguagemParser.BOLEANO, 0); }
		public TerminalNode TEXTO() { return getToken(MinhaLinguagemParser.TEXTO, 0); }
		public ValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor; }
	}

	public final ValorContext valor() throws RecognitionException {
		ValorContext _localctx = new ValorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_valor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOLEANO) | (1L << NUMERO) | (1L << TEXTO))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariavelContext extends ParserRuleContext {
		public TerminalNode TIPO() { return getToken(MinhaLinguagemParser.TIPO, 0); }
		public TerminalNode ID() { return getToken(MinhaLinguagemParser.ID, 0); }
		public VariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variavel; }
	}

	public final VariavelContext variavel() throws RecognitionException {
		VariavelContext _localctx = new VariavelContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_variavel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(TIPO);
			setState(169);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0:
			return conta_sempred((ContaContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean conta_sempred(ContaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3 \u00ae\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\5\2(\n\2\3\2\3\2\3\2\3\2\5\2.\n\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\7\2\66\n\2\f\2\16\29\13\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\5\4B\n\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\5\6N\n\6\3\6\3\6\3\6\3\6\5\6T\n\6\5"+
		"\6V\n\6\3\7\3\7\3\7\3\7\5\7\\\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\5\nm\n\n\3\n\3\n\3\n\5\nr\n\n\3\n\3\n\3\n\3\n"+
		"\5\nx\n\n\3\13\3\13\3\13\3\13\3\f\3\f\5\f\u0080\n\f\3\f\3\f\3\f\3\r\3"+
		"\r\6\r\u0087\n\r\r\r\16\r\u0088\3\r\3\r\5\r\u008d\n\r\3\16\3\16\3\16\3"+
		"\16\3\16\5\16\u0094\n\16\3\17\3\17\3\17\3\17\5\17\u009a\n\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\6\20\u00a5\n\20\r\20\16\20\u00a6\3"+
		"\21\3\21\3\22\3\22\3\22\3\22\2\3\2\23\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"\2\5\3\2\3\4\3\2\5\6\3\2\31\33\2\u00b3\2-\3\2\2\2\4:\3\2\2\2"+
		"\6<\3\2\2\2\bE\3\2\2\2\nU\3\2\2\2\fW\3\2\2\2\16]\3\2\2\2\20c\3\2\2\2\22"+
		"i\3\2\2\2\24y\3\2\2\2\26}\3\2\2\2\30\u0084\3\2\2\2\32\u0093\3\2\2\2\34"+
		"\u0099\3\2\2\2\36\u00a4\3\2\2\2 \u00a8\3\2\2\2\"\u00aa\3\2\2\2$\'\b\2"+
		"\1\2%(\7\32\2\2&(\5\4\3\2\'%\3\2\2\2\'&\3\2\2\2(.\3\2\2\2)*\7\7\2\2*+"+
		"\5\2\2\2+,\7\b\2\2,.\3\2\2\2-$\3\2\2\2-)\3\2\2\2.\67\3\2\2\2/\60\f\6\2"+
		"\2\60\61\t\2\2\2\61\66\5\2\2\7\62\63\f\5\2\2\63\64\t\3\2\2\64\66\5\2\2"+
		"\6\65/\3\2\2\2\65\62\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28\3"+
		"\3\2\2\29\67\3\2\2\2:;\7\34\2\2;\5\3\2\2\2<=\7\7\2\2=>\5\4\3\2>A\7\t\2"+
		"\2?B\7\32\2\2@B\5\4\3\2A?\3\2\2\2A@\3\2\2\2BC\3\2\2\2CD\7\b\2\2D\7\3\2"+
		"\2\2EF\7\n\2\2FG\5\6\4\2GH\7\13\2\2HI\5\34\17\2IJ\7\f\2\2J\t\3\2\2\2K"+
		"M\7\36\2\2LN\7\37\2\2ML\3\2\2\2MN\3\2\2\2NV\3\2\2\2OP\7\37\2\2PV\7\37"+
		"\2\2QS\7 \2\2RT\7\37\2\2SR\3\2\2\2ST\3\2\2\2TV\3\2\2\2UK\3\2\2\2UO\3\2"+
		"\2\2UQ\3\2\2\2V\13\3\2\2\2WX\5\4\3\2X[\5\n\6\2Y\\\7\32\2\2Z\\\5\4\3\2"+
		"[Y\3\2\2\2[Z\3\2\2\2\\\r\3\2\2\2]^\7\r\2\2^_\5\f\7\2_`\7\13\2\2`a\5\34"+
		"\17\2ab\7\16\2\2b\17\3\2\2\2cd\7\17\2\2de\5\34\17\2ef\7\r\2\2fg\5\f\7"+
		"\2gh\7\20\2\2h\21\3\2\2\2il\7\21\2\2jm\5\"\22\2km\5 \21\2lj\3\2\2\2lk"+
		"\3\2\2\2mn\3\2\2\2nq\5\n\6\2or\5\"\22\2pr\5 \21\2qo\3\2\2\2qp\3\2\2\2"+
		"rs\3\2\2\2st\7\13\2\2tu\5\34\17\2uw\7\22\2\2vx\5\24\13\2wv\3\2\2\2wx\3"+
		"\2\2\2x\23\3\2\2\2yz\7\23\2\2z{\5\34\17\2{|\7\24\2\2|\25\3\2\2\2}\177"+
		"\7\25\2\2~\u0080\5\30\r\2\177~\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\3"+
		"\2\2\2\u0081\u0082\5\34\17\2\u0082\u0083\7\26\2\2\u0083\27\3\2\2\2\u0084"+
		"\u0086\5\"\22\2\u0085\u0087\7\37\2\2\u0086\u0085\3\2\2\2\u0087\u0088\3"+
		"\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008c\3\2\2\2\u008a"+
		"\u008d\5 \21\2\u008b\u008d\5\2\2\2\u008c\u008a\3\2\2\2\u008c\u008b\3\2"+
		"\2\2\u008d\31\3\2\2\2\u008e\u008f\5\4\3\2\u008f\u0090\7\37\2\2\u0090\u0091"+
		"\5 \21\2\u0091\u0094\3\2\2\2\u0092\u0094\5\30\r\2\u0093\u008e\3\2\2\2"+
		"\u0093\u0092\3\2\2\2\u0094\33\3\2\2\2\u0095\u009a\5\16\b\2\u0096\u009a"+
		"\5\22\n\2\u0097\u009a\5\20\t\2\u0098\u009a\5\2\2\2\u0099\u0095\3\2\2\2"+
		"\u0099\u0096\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u0098\3\2\2\2\u009a\35"+
		"\3\2\2\2\u009b\u009c\7\27\2\2\u009c\u009d\7\33\2\2\u009d\u00a5\b\20\1"+
		"\2\u009e\u009f\7\27\2\2\u009f\u00a0\7\32\2\2\u00a0\u00a5\b\20\1\2\u00a1"+
		"\u00a2\7\27\2\2\u00a2\u00a3\7\31\2\2\u00a3\u00a5\b\20\1\2\u00a4\u009b"+
		"\3\2\2\2\u00a4\u009e\3\2\2\2\u00a4\u00a1\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6"+
		"\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\37\3\2\2\2\u00a8\u00a9\t\4\2"+
		"\2\u00a9!\3\2\2\2\u00aa\u00ab\7\35\2\2\u00ab\u00ac\7\34\2\2\u00ac#\3\2"+
		"\2\2\25\'-\65\67AMSU[lqw\177\u0088\u008c\u0093\u0099\u00a4\u00a6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}