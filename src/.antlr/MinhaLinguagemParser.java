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
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, BOLEANO=23, NUMERO=24, 
		TEXTO=25, NOVALINHA=26, ID=27, TIPO=28, MAIOR=29, IGUAL=30, MENOR=31, 
		WS=32;
	public static final int
		RULE_valor = 0, RULE_variavel = 1, RULE_conta = 2, RULE_exprId = 3, RULE_exprFor = 4, 
		RULE_para = 5, RULE_simbolos = 6, RULE_exprEnq = 7, RULE_enquanto = 8, 
		RULE_faca = 9, RULE_se = 10, RULE_senao = 11, RULE_programa = 12, RULE_declaracoes = 13, 
		RULE_atribuicao = 14, RULE_comandos = 15, RULE_imprime = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"valor", "variavel", "conta", "exprId", "exprFor", "para", "simbolos", 
			"exprEnq", "enquanto", "faca", "se", "senao", "programa", "declaracoes", 
			"atribuicao", "comandos", "imprime"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'*'", "'/'", "'+'", "'-'", "'('", "')'", "'estiver no range'", 
			"'Para'", "'fa\u00C3\u00A7a:'", "'Fim para'", "'Enquanto'", "'Fim enquanto'", 
			"'Fa\u00C3\u00A7a:'", "'Fim fa\u00C3\u00A7a'", "'Se'", "'Fim se'", "'Sen\u00C3\u00A3o fa\u00C3\u00A7a:'", 
			"'Fim sen\u00C3\u00A3o'", "'Inicio'", "'Fim'", "'imprime '", "';'", null, 
			null, null, null, null, null, "'>'", "'='", "'<'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "BOLEANO", 
			"NUMERO", "TEXTO", "NOVALINHA", "ID", "TIPO", "MAIOR", "IGUAL", "MENOR", 
			"WS"
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

	public MinhaLinguagemParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
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
		enterRule(_localctx, 0, RULE_valor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
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
		enterRule(_localctx, 2, RULE_variavel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(TIPO);
			setState(37);
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
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_conta, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERO:
			case ID:
				{
				setState(42);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NUMERO:
					{
					setState(40);
					match(NUMERO);
					}
					break;
				case ID:
					{
					setState(41);
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
				setState(44);
				match(T__4);
				setState(45);
				conta(0);
				setState(46);
				match(T__5);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(58);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(56);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new ContaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_conta);
						setState(50);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(51);
						_la = _input.LA(1);
						if ( !(_la==T__0 || _la==T__1) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(52);
						conta(5);
						}
						break;
					case 2:
						{
						_localctx = new ContaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_conta);
						setState(53);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(54);
						_la = _input.LA(1);
						if ( !(_la==T__2 || _la==T__3) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(55);
						conta(4);
						}
						break;
					}
					} 
				}
				setState(60);
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
		enterRule(_localctx, 6, RULE_exprId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
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
		enterRule(_localctx, 8, RULE_exprFor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(T__4);
			setState(64);
			exprId();
			setState(65);
			match(T__6);
			setState(68);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERO:
				{
				setState(66);
				match(NUMERO);
				}
				break;
			case ID:
				{
				setState(67);
				exprId();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(70);
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
		enterRule(_localctx, 10, RULE_para);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(T__7);
			setState(73);
			exprFor();
			setState(74);
			match(T__8);
			setState(75);
			comandos();
			setState(76);
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
		enterRule(_localctx, 12, RULE_simbolos);
		int _la;
		try {
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAIOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				match(MAIOR);
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGUAL) {
					{
					setState(79);
					match(IGUAL);
					}
				}

				}
				break;
			case IGUAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				match(IGUAL);
				setState(83);
				match(IGUAL);
				}
				break;
			case MENOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(84);
				match(MENOR);
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGUAL) {
					{
					setState(85);
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
		enterRule(_localctx, 14, RULE_exprEnq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			exprId();
			setState(91);
			simbolos();
			setState(94);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERO:
				{
				setState(92);
				match(NUMERO);
				}
				break;
			case ID:
				{
				setState(93);
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
		public TerminalNode NOVALINHA() { return getToken(MinhaLinguagemParser.NOVALINHA, 0); }
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
		enterRule(_localctx, 16, RULE_enquanto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(T__10);
			setState(97);
			exprEnq();
			setState(98);
			match(T__8);
			setState(99);
			match(NOVALINHA);
			setState(100);
			comandos();
			setState(101);
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
		public TerminalNode NOVALINHA() { return getToken(MinhaLinguagemParser.NOVALINHA, 0); }
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
		enterRule(_localctx, 18, RULE_faca);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(T__12);
			setState(104);
			match(NOVALINHA);
			setState(105);
			comandos();
			setState(106);
			match(T__10);
			setState(107);
			exprEnq();
			setState(108);
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
		public TerminalNode NOVALINHA() { return getToken(MinhaLinguagemParser.NOVALINHA, 0); }
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
		enterRule(_localctx, 20, RULE_se);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(T__14);
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TIPO:
				{
				setState(111);
				variavel();
				}
				break;
			case BOLEANO:
			case NUMERO:
			case TEXTO:
				{
				setState(112);
				valor();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(115);
			simbolos();
			setState(118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TIPO:
				{
				setState(116);
				variavel();
				}
				break;
			case BOLEANO:
			case NUMERO:
			case TEXTO:
				{
				setState(117);
				valor();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(120);
			match(T__8);
			setState(121);
			match(NOVALINHA);
			setState(122);
			comandos();
			setState(123);
			match(T__15);
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(124);
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
		public TerminalNode NOVALINHA() { return getToken(MinhaLinguagemParser.NOVALINHA, 0); }
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
		enterRule(_localctx, 22, RULE_senao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(T__16);
			setState(128);
			match(NOVALINHA);
			setState(129);
			comandos();
			setState(130);
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
		public List<DeclaracoesContext> declaracoes() {
			return getRuleContexts(DeclaracoesContext.class);
		}
		public DeclaracoesContext declaracoes(int i) {
			return getRuleContext(DeclaracoesContext.class,i);
		}
		public List<ComandosContext> comandos() {
			return getRuleContexts(ComandosContext.class);
		}
		public ComandosContext comandos(int i) {
			return getRuleContext(ComandosContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(132);
				match(T__18);
				}
				}
				setState(135); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__18 );
			setState(138); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(137);
				declaracoes();
				}
				}
				setState(140); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TIPO );
			setState(143); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(142);
				comandos();
				}
				}
				setState(145); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__10) | (1L << T__12) | (1L << T__14) | (1L << NUMERO) | (1L << ID))) != 0) );
			setState(147);
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
		enterRule(_localctx, 26, RULE_declaracoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			variavel();
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IGUAL) {
				{
				setState(151); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(150);
					match(IGUAL);
					}
					}
					setState(153); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==IGUAL );
				setState(155);
				valor();
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
		public TerminalNode ID() { return getToken(MinhaLinguagemParser.ID, 0); }
		public TerminalNode IGUAL() { return getToken(MinhaLinguagemParser.IGUAL, 0); }
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_atribuicao);
		try {
			setState(165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				match(ID);
				setState(159);
				match(IGUAL);
				setState(160);
				valor();
				}
				break;
			case TIPO:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				variavel();
				setState(162);
				match(IGUAL);
				setState(163);
				valor();
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
		public TerminalNode NOVALINHA() { return getToken(MinhaLinguagemParser.NOVALINHA, 0); }
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
		enterRule(_localctx, 30, RULE_comandos);
		try {
			setState(179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				enquanto();
				setState(168);
				match(NOVALINHA);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				se();
				setState(171);
				match(NOVALINHA);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 3);
				{
				setState(173);
				faca();
				setState(174);
				match(NOVALINHA);
				}
				break;
			case T__4:
			case NUMERO:
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(176);
				conta(0);
				setState(177);
				match(NOVALINHA);
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
		enterRule(_localctx, 32, RULE_imprime);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(193);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(181);
					match(T__20);
					setState(182);
					((ImprimeContext)_localctx).TEXTO = match(TEXTO);
					setState(183);
					match(T__21);

					      System.out.println((((ImprimeContext)_localctx).TEXTO!=null?((ImprimeContext)_localctx).TEXTO.getText():null));
					}
					break;
				case 2:
					{
					setState(185);
					match(T__20);
					setState(186);
					((ImprimeContext)_localctx).NUMERO = match(NUMERO);
					setState(187);
					match(T__21);

					      System.out.println((((ImprimeContext)_localctx).NUMERO!=null?((ImprimeContext)_localctx).NUMERO.getText():null));
					}
					break;
				case 3:
					{
					setState(189);
					match(T__20);
					setState(190);
					((ImprimeContext)_localctx).BOLEANO = match(BOLEANO);
					setState(191);
					match(T__21);

					      System.out.println((((ImprimeContext)_localctx).BOLEANO!=null?((ImprimeContext)_localctx).BOLEANO.getText():null));
					}
					break;
				}
				}
				setState(195); 
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\"\u00c8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\5\4-\n\4\3\4\3\4\3\4\3\4\5\4\63\n\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\7\4;\n\4\f\4\16\4>\13\4\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\6\5\6G\n\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\5\bS\n\b\3\b\3\b"+
		"\3\b\3\b\5\bY\n\b\5\b[\n\b\3\t\3\t\3\t\3\t\5\ta\n\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\5\ft\n\f\3\f"+
		"\3\f\3\f\5\fy\n\f\3\f\3\f\3\f\3\f\3\f\5\f\u0080\n\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\16\6\16\u0088\n\16\r\16\16\16\u0089\3\16\6\16\u008d\n\16\r\16\16"+
		"\16\u008e\3\16\6\16\u0092\n\16\r\16\16\16\u0093\3\16\3\16\3\17\3\17\6"+
		"\17\u009a\n\17\r\17\16\17\u009b\3\17\5\17\u009f\n\17\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\5\20\u00a8\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\5\21\u00b6\n\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\6\22\u00c4\n\22\r\22\16\22\u00c5\3\22\2"+
		"\3\6\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\5\3\2\31\33\3\2\3"+
		"\4\3\2\5\6\2\u00cf\2$\3\2\2\2\4&\3\2\2\2\6\62\3\2\2\2\b?\3\2\2\2\nA\3"+
		"\2\2\2\fJ\3\2\2\2\16Z\3\2\2\2\20\\\3\2\2\2\22b\3\2\2\2\24i\3\2\2\2\26"+
		"p\3\2\2\2\30\u0081\3\2\2\2\32\u0087\3\2\2\2\34\u0097\3\2\2\2\36\u00a7"+
		"\3\2\2\2 \u00b5\3\2\2\2\"\u00c3\3\2\2\2$%\t\2\2\2%\3\3\2\2\2&\'\7\36\2"+
		"\2\'(\7\35\2\2(\5\3\2\2\2),\b\4\1\2*-\7\32\2\2+-\5\b\5\2,*\3\2\2\2,+\3"+
		"\2\2\2-\63\3\2\2\2./\7\7\2\2/\60\5\6\4\2\60\61\7\b\2\2\61\63\3\2\2\2\62"+
		")\3\2\2\2\62.\3\2\2\2\63<\3\2\2\2\64\65\f\6\2\2\65\66\t\3\2\2\66;\5\6"+
		"\4\7\678\f\5\2\289\t\4\2\29;\5\6\4\6:\64\3\2\2\2:\67\3\2\2\2;>\3\2\2\2"+
		"<:\3\2\2\2<=\3\2\2\2=\7\3\2\2\2><\3\2\2\2?@\7\35\2\2@\t\3\2\2\2AB\7\7"+
		"\2\2BC\5\b\5\2CF\7\t\2\2DG\7\32\2\2EG\5\b\5\2FD\3\2\2\2FE\3\2\2\2GH\3"+
		"\2\2\2HI\7\b\2\2I\13\3\2\2\2JK\7\n\2\2KL\5\n\6\2LM\7\13\2\2MN\5 \21\2"+
		"NO\7\f\2\2O\r\3\2\2\2PR\7\37\2\2QS\7 \2\2RQ\3\2\2\2RS\3\2\2\2S[\3\2\2"+
		"\2TU\7 \2\2U[\7 \2\2VX\7!\2\2WY\7 \2\2XW\3\2\2\2XY\3\2\2\2Y[\3\2\2\2Z"+
		"P\3\2\2\2ZT\3\2\2\2ZV\3\2\2\2[\17\3\2\2\2\\]\5\b\5\2]`\5\16\b\2^a\7\32"+
		"\2\2_a\5\b\5\2`^\3\2\2\2`_\3\2\2\2a\21\3\2\2\2bc\7\r\2\2cd\5\20\t\2de"+
		"\7\13\2\2ef\7\34\2\2fg\5 \21\2gh\7\16\2\2h\23\3\2\2\2ij\7\17\2\2jk\7\34"+
		"\2\2kl\5 \21\2lm\7\r\2\2mn\5\20\t\2no\7\20\2\2o\25\3\2\2\2ps\7\21\2\2"+
		"qt\5\4\3\2rt\5\2\2\2sq\3\2\2\2sr\3\2\2\2tu\3\2\2\2ux\5\16\b\2vy\5\4\3"+
		"\2wy\5\2\2\2xv\3\2\2\2xw\3\2\2\2yz\3\2\2\2z{\7\13\2\2{|\7\34\2\2|}\5 "+
		"\21\2}\177\7\22\2\2~\u0080\5\30\r\2\177~\3\2\2\2\177\u0080\3\2\2\2\u0080"+
		"\27\3\2\2\2\u0081\u0082\7\23\2\2\u0082\u0083\7\34\2\2\u0083\u0084\5 \21"+
		"\2\u0084\u0085\7\24\2\2\u0085\31\3\2\2\2\u0086\u0088\7\25\2\2\u0087\u0086"+
		"\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a"+
		"\u008c\3\2\2\2\u008b\u008d\5\34\17\2\u008c\u008b\3\2\2\2\u008d\u008e\3"+
		"\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0091\3\2\2\2\u0090"+
		"\u0092\5 \21\2\u0091\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0091\3\2"+
		"\2\2\u0093\u0094\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\7\26\2\2\u0096"+
		"\33\3\2\2\2\u0097\u009e\5\4\3\2\u0098\u009a\7 \2\2\u0099\u0098\3\2\2\2"+
		"\u009a\u009b\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d"+
		"\3\2\2\2\u009d\u009f\5\2\2\2\u009e\u0099\3\2\2\2\u009e\u009f\3\2\2\2\u009f"+
		"\35\3\2\2\2\u00a0\u00a1\7\35\2\2\u00a1\u00a2\7 \2\2\u00a2\u00a8\5\2\2"+
		"\2\u00a3\u00a4\5\4\3\2\u00a4\u00a5\7 \2\2\u00a5\u00a6\5\2\2\2\u00a6\u00a8"+
		"\3\2\2\2\u00a7\u00a0\3\2\2\2\u00a7\u00a3\3\2\2\2\u00a8\37\3\2\2\2\u00a9"+
		"\u00aa\5\22\n\2\u00aa\u00ab\7\34\2\2\u00ab\u00b6\3\2\2\2\u00ac\u00ad\5"+
		"\26\f\2\u00ad\u00ae\7\34\2\2\u00ae\u00b6\3\2\2\2\u00af\u00b0\5\24\13\2"+
		"\u00b0\u00b1\7\34\2\2\u00b1\u00b6\3\2\2\2\u00b2\u00b3\5\6\4\2\u00b3\u00b4"+
		"\7\34\2\2\u00b4\u00b6\3\2\2\2\u00b5\u00a9\3\2\2\2\u00b5\u00ac\3\2\2\2"+
		"\u00b5\u00af\3\2\2\2\u00b5\u00b2\3\2\2\2\u00b6!\3\2\2\2\u00b7\u00b8\7"+
		"\27\2\2\u00b8\u00b9\7\33\2\2\u00b9\u00ba\7\30\2\2\u00ba\u00c4\b\22\1\2"+
		"\u00bb\u00bc\7\27\2\2\u00bc\u00bd\7\32\2\2\u00bd\u00be\7\30\2\2\u00be"+
		"\u00c4\b\22\1\2\u00bf\u00c0\7\27\2\2\u00c0\u00c1\7\31\2\2\u00c1\u00c2"+
		"\7\30\2\2\u00c2\u00c4\b\22\1\2\u00c3\u00b7\3\2\2\2\u00c3\u00bb\3\2\2\2"+
		"\u00c3\u00bf\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6"+
		"\3\2\2\2\u00c6#\3\2\2\2\27,\62:<FRXZ`sx\177\u0089\u008e\u0093\u009b\u009e"+
		"\u00a7\u00b5\u00c3\u00c5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}