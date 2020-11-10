// Generated from MinhaLinguagem.g4 by ANTLR 4.8

	import java.util.Map;
import java.util.HashMap;

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
		T__17=18, T__18=19, T__19=20, T__20=21, BOLEANO=22, NUMERO=23, TEXTO=24, 
		TIPO=25, ID=26, MAIOR=27, IGUAL=28, MENOR=29, WS=30;
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
			null, null, null, "'>'", "'='", "'<'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "BOLEANO", 
			"NUMERO", "TEXTO", "TIPO", "ID", "MAIOR", "IGUAL", "MENOR", "WS"
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


	Map<String, T> memory = new HashMap();

	public MinhaLinguagemParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ContaContext extends ParserRuleContext {
		public ExprIdContext exprId;
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaLinguagemListener ) ((MinhaLinguagemListener)listener).enterConta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaLinguagemListener ) ((MinhaLinguagemListener)listener).exitConta(this);
		}
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
			setState(45);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERO:
			case ID:
				{
				setState(39);
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
					((ContaContext)_localctx).exprId = exprId();
					if(memory.get((((ContaContext)_localctx).exprId!=null?_input.getText(((ContaContext)_localctx).exprId.start,((ContaContext)_localctx).exprId.stop):null)) == NULL){System.err.println("Essa variavel não existe!");} else if(memory.get((((ContaContext)_localctx).exprId!=null?_input.getText(((ContaContext)_localctx).exprId.start,((ContaContext)_localctx).exprId.stop):null)) != type.isInstance("NUMERO")){System.err.println("Essa variavel não é um numero!");}
								
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case T__4:
				{
				setState(41);
				match(T__4);
				setState(42);
				conta(0);
				setState(43);
				match(T__5);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(55);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(53);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new ContaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_conta);
						setState(47);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(48);
						_la = _input.LA(1);
						if ( !(_la==T__0 || _la==T__1) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(49);
						conta(5);
						}
						break;
					case 2:
						{
						_localctx = new ContaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_conta);
						setState(50);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(51);
						_la = _input.LA(1);
						if ( !(_la==T__2 || _la==T__3) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(52);
						conta(4);
						}
						break;
					}
					} 
				}
				setState(57);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaLinguagemListener ) ((MinhaLinguagemListener)listener).enterExprId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaLinguagemListener ) ((MinhaLinguagemListener)listener).exitExprId(this);
		}
	}

	public final ExprIdContext exprId() throws RecognitionException {
		ExprIdContext _localctx = new ExprIdContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_exprId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
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
		public ExprIdContext exprId;
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaLinguagemListener ) ((MinhaLinguagemListener)listener).enterExprFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaLinguagemListener ) ((MinhaLinguagemListener)listener).exitExprFor(this);
		}
	}

	public final ExprForContext exprFor() throws RecognitionException {
		ExprForContext _localctx = new ExprForContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_exprFor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(T__4);
			setState(61);
			((ExprForContext)_localctx).exprId = exprId();
			setState(62);
			match(T__6);
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERO:
				{
				setState(63);
				match(NUMERO);
				}
				break;
			case ID:
				{
				setState(64);
				((ExprForContext)_localctx).exprId = exprId();
				if(memory.get((((ExprForContext)_localctx).exprId!=null?_input.getText(((ExprForContext)_localctx).exprId.start,((ExprForContext)_localctx).exprId.stop):null)) == NULL){System.err.println("Essa variavel não existe!");} else if(memory.get((((ExprForContext)_localctx).exprId!=null?_input.getText(((ExprForContext)_localctx).exprId.start,((ExprForContext)_localctx).exprId.stop):null)) != type.isInstance("NUMERO")){System.err.println("Essa variavel não é um numero!");}
							
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(69);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaLinguagemListener ) ((MinhaLinguagemListener)listener).enterPara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaLinguagemListener ) ((MinhaLinguagemListener)listener).exitPara(this);
		}
	}

	public final ParaContext para() throws RecognitionException {
		ParaContext _localctx = new ParaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_para);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(T__7);
			setState(72);
			exprFor();
			setState(73);
			match(T__8);
			setState(74);
			comandos();
			setState(75);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaLinguagemListener ) ((MinhaLinguagemListener)listener).enterSimbolos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaLinguagemListener ) ((MinhaLinguagemListener)listener).exitSimbolos(this);
		}
	}

	public final SimbolosContext simbolos() throws RecognitionException {
		SimbolosContext _localctx = new SimbolosContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_simbolos);
		int _la;
		try {
			setState(87);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAIOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				match(MAIOR);
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGUAL) {
					{
					setState(78);
					match(IGUAL);
					}
				}

				}
				break;
			case IGUAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				match(IGUAL);
				setState(82);
				match(IGUAL);
				}
				break;
			case MENOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(83);
				match(MENOR);
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGUAL) {
					{
					setState(84);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaLinguagemListener ) ((MinhaLinguagemListener)listener).enterExprEnq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaLinguagemListener ) ((MinhaLinguagemListener)listener).exitExprEnq(this);
		}
	}

	public final ExprEnqContext exprEnq() throws RecognitionException {
		ExprEnqContext _localctx = new ExprEnqContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_exprEnq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			exprId();
			setState(90);
			simbolos();
			setState(93);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERO:
				{
				setState(91);
				match(NUMERO);
				}
				break;
			case ID:
				{
				setState(92);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaLinguagemListener ) ((MinhaLinguagemListener)listener).enterEnquanto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaLinguagemListener ) ((MinhaLinguagemListener)listener).exitEnquanto(this);
		}
	}

	public final EnquantoContext enquanto() throws RecognitionException {
		EnquantoContext _localctx = new EnquantoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_enquanto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(T__10);
			setState(96);
			exprEnq();
			setState(97);
			match(T__8);
			setState(98);
			comandos();
			setState(99);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaLinguagemListener ) ((MinhaLinguagemListener)listener).enterFaca(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaLinguagemListener ) ((MinhaLinguagemListener)listener).exitFaca(this);
		}
	}

	public final FacaContext faca() throws RecognitionException {
		FacaContext _localctx = new FacaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_faca);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(T__12);
			setState(102);
			comandos();
			setState(103);
			match(T__10);
			setState(104);
			exprEnq();
			setState(105);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaLinguagemListener ) ((MinhaLinguagemListener)listener).enterSe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaLinguagemListener ) ((MinhaLinguagemListener)listener).exitSe(this);
		}
	}

	public final SeContext se() throws RecognitionException {
		SeContext _localctx = new SeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_se);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(T__14);
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TIPO:
				{
				setState(108);
				variavel();
				}
				break;
			case BOLEANO:
			case NUMERO:
			case TEXTO:
				{
				setState(109);
				valor();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(112);
			simbolos();
			setState(115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TIPO:
				{
				setState(113);
				variavel();
				}
				break;
			case BOLEANO:
			case NUMERO:
			case TEXTO:
				{
				setState(114);
				valor();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(117);
			match(T__8);
			setState(118);
			comandos();
			setState(119);
			match(T__15);
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(120);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaLinguagemListener ) ((MinhaLinguagemListener)listener).enterSenao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaLinguagemListener ) ((MinhaLinguagemListener)listener).exitSenao(this);
		}
	}

	public final SenaoContext senao() throws RecognitionException {
		SenaoContext _localctx = new SenaoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_senao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(T__16);
			setState(124);
			comandos();
			setState(125);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaLinguagemListener ) ((MinhaLinguagemListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaLinguagemListener ) ((MinhaLinguagemListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(T__18);
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TIPO) {
				{
				setState(128);
				declaracoes();
				}
			}

			setState(131);
			comandos();
			setState(132);
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
		public ValorContext valor;
		public Token ID;
		public Token TIPO;
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public TerminalNode TIPO() { return getToken(MinhaLinguagemParser.TIPO, 0); }
		public TerminalNode IGUAL() { return getToken(MinhaLinguagemParser.IGUAL, 0); }
		public TerminalNode ID() { return getToken(MinhaLinguagemParser.ID, 0); }
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public ContaContext conta() {
			return getRuleContext(ContaContext.class,0);
		}
		public DeclaracoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaLinguagemListener ) ((MinhaLinguagemListener)listener).enterDeclaracoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaLinguagemListener ) ((MinhaLinguagemListener)listener).exitDeclaracoes(this);
		}
	}

	public final DeclaracoesContext declaracoes() throws RecognitionException {
		DeclaracoesContext _localctx = new DeclaracoesContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_declaracoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			variavel();
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IGUAL) {
				{
				setState(135);
				match(IGUAL);
				setState(138);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(136);
					((DeclaracoesContext)_localctx).valor = valor();
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

			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(142);
				((DeclaracoesContext)_localctx).ID = match(ID);
				}
			}

			setState(145);
			((DeclaracoesContext)_localctx).TIPO = match(TIPO);

					if ( (((DeclaracoesContext)_localctx).valor!=null?_input.getText(((DeclaracoesContext)_localctx).valor.start,((DeclaracoesContext)_localctx).valor.stop):null) !=null ) {
						if(((DeclaracoesContext)_localctx).TIPO == Integer && (memory.get((((DeclaracoesContext)_localctx).valor!=null?_input.getText(((DeclaracoesContext)_localctx).valor.start,((DeclaracoesContext)_localctx).valor.stop):null)))){
							System.err.println("Variavel declarada incorretamente. "+(((DeclaracoesContext)_localctx).ID!=null?((DeclaracoesContext)_localctx).ID.getText():null));
						}else if(((DeclaracoesContext)_localctx).TIPO == String && ((((DeclaracoesContext)_localctx).valor!=null?_input.getText(((DeclaracoesContext)_localctx).valor.start,((DeclaracoesContext)_localctx).valor.stop):null) == "String")){
							System.err.println("Variavel declarada incorretamente. "+(((DeclaracoesContext)_localctx).ID!=null?((DeclaracoesContext)_localctx).ID.getText():null));
						}else if(((DeclaracoesContext)_localctx).TIPO == Bolean && ((((DeclaracoesContext)_localctx).valor!=null?_input.getText(((DeclaracoesContext)_localctx).valor.start,((DeclaracoesContext)_localctx).valor.stop):null) == "String")){
							System.err.println("Variavel declarada incorretamente. "+(((DeclaracoesContext)_localctx).ID!=null?((DeclaracoesContext)_localctx).ID.getText():null));
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaLinguagemListener ) ((MinhaLinguagemListener)listener).enterAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaLinguagemListener ) ((MinhaLinguagemListener)listener).exitAtribuicao(this);
		}
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_atribuicao);
		try {
			setState(153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				exprId();
				setState(149);
				match(IGUAL);
				setState(150);
				valor();
				}
				break;
			case TIPO:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaLinguagemListener ) ((MinhaLinguagemListener)listener).enterComandos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaLinguagemListener ) ((MinhaLinguagemListener)listener).exitComandos(this);
		}
	}

	public final ComandosContext comandos() throws RecognitionException {
		ComandosContext _localctx = new ComandosContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_comandos);
		try {
			setState(159);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				enquanto();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				se();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 3);
				{
				setState(157);
				faca();
				}
				break;
			case T__4:
			case NUMERO:
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(158);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaLinguagemListener ) ((MinhaLinguagemListener)listener).enterImprime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaLinguagemListener ) ((MinhaLinguagemListener)listener).exitImprime(this);
		}
	}

	public final ImprimeContext imprime() throws RecognitionException {
		ImprimeContext _localctx = new ImprimeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_imprime);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(170);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(161);
					match(T__20);
					setState(162);
					((ImprimeContext)_localctx).TEXTO = match(TEXTO);

					      System.out.println((((ImprimeContext)_localctx).TEXTO!=null?((ImprimeContext)_localctx).TEXTO.getText():null));
					}
					break;
				case 2:
					{
					setState(164);
					match(T__20);
					setState(165);
					((ImprimeContext)_localctx).NUMERO = match(NUMERO);

					      System.out.println((((ImprimeContext)_localctx).NUMERO!=null?((ImprimeContext)_localctx).NUMERO.getText():null));
					}
					break;
				case 3:
					{
					setState(167);
					match(T__20);
					setState(168);
					((ImprimeContext)_localctx).BOLEANO = match(BOLEANO);

					      System.out.println((((ImprimeContext)_localctx).BOLEANO!=null?((ImprimeContext)_localctx).BOLEANO.getText():null));
					}
					break;
				}
				}
				setState(172); 
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaLinguagemListener ) ((MinhaLinguagemListener)listener).enterValor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaLinguagemListener ) ((MinhaLinguagemListener)listener).exitValor(this);
		}
	}

	public final ValorContext valor() throws RecognitionException {
		ValorContext _localctx = new ValorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_valor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
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
		public Token ID;
		public TerminalNode TIPO() { return getToken(MinhaLinguagemParser.TIPO, 0); }
		public TerminalNode ID() { return getToken(MinhaLinguagemParser.ID, 0); }
		public VariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variavel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaLinguagemListener ) ((MinhaLinguagemListener)listener).enterVariavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaLinguagemListener ) ((MinhaLinguagemListener)listener).exitVariavel(this);
		}
	}

	public final VariavelContext variavel() throws RecognitionException {
		VariavelContext _localctx = new VariavelContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_variavel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(TIPO);
			setState(177);
			((VariavelContext)_localctx).ID = match(ID);
			if(memory.containsKey((((VariavelContext)_localctx).ID!=null?((VariavelContext)_localctx).ID.getText():null))){System.err.println("A variavel já foi definida. "+((VariavelContext)_localctx).ID);}
					
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3 \u00b7\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\2\3\2\5\2*\n\2\3\2\3\2\3\2\3\2\5\2\60\n\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\7\28\n\2\f\2\16\2;\13\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\5\4F\n\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\5\6R\n\6\3\6\3\6\3\6"+
		"\3\6\5\6X\n\6\5\6Z\n\6\3\7\3\7\3\7\3\7\5\7`\n\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\5\nq\n\n\3\n\3\n\3\n\5\nv\n\n\3"+
		"\n\3\n\3\n\3\n\5\n|\n\n\3\13\3\13\3\13\3\13\3\f\3\f\5\f\u0084\n\f\3\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\5\r\u008d\n\r\5\r\u008f\n\r\3\r\5\r\u0092\n\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\5\16\u009c\n\16\3\17\3\17\3\17\3"+
		"\17\5\17\u00a2\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\6\20"+
		"\u00ad\n\20\r\20\16\20\u00ae\3\21\3\21\3\22\3\22\3\22\3\22\3\22\2\3\2"+
		"\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\5\3\2\3\4\3\2\5\6\3\2"+
		"\30\32\2\u00bd\2/\3\2\2\2\4<\3\2\2\2\6>\3\2\2\2\bI\3\2\2\2\nY\3\2\2\2"+
		"\f[\3\2\2\2\16a\3\2\2\2\20g\3\2\2\2\22m\3\2\2\2\24}\3\2\2\2\26\u0081\3"+
		"\2\2\2\30\u0088\3\2\2\2\32\u009b\3\2\2\2\34\u00a1\3\2\2\2\36\u00ac\3\2"+
		"\2\2 \u00b0\3\2\2\2\"\u00b2\3\2\2\2$)\b\2\1\2%*\7\31\2\2&\'\5\4\3\2\'"+
		"(\b\2\1\2(*\3\2\2\2)%\3\2\2\2)&\3\2\2\2*\60\3\2\2\2+,\7\7\2\2,-\5\2\2"+
		"\2-.\7\b\2\2.\60\3\2\2\2/$\3\2\2\2/+\3\2\2\2\609\3\2\2\2\61\62\f\6\2\2"+
		"\62\63\t\2\2\2\638\5\2\2\7\64\65\f\5\2\2\65\66\t\3\2\2\668\5\2\2\6\67"+
		"\61\3\2\2\2\67\64\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:\3\3\2\2\2;"+
		"9\3\2\2\2<=\7\34\2\2=\5\3\2\2\2>?\7\7\2\2?@\5\4\3\2@E\7\t\2\2AF\7\31\2"+
		"\2BC\5\4\3\2CD\b\4\1\2DF\3\2\2\2EA\3\2\2\2EB\3\2\2\2FG\3\2\2\2GH\7\b\2"+
		"\2H\7\3\2\2\2IJ\7\n\2\2JK\5\6\4\2KL\7\13\2\2LM\5\34\17\2MN\7\f\2\2N\t"+
		"\3\2\2\2OQ\7\35\2\2PR\7\36\2\2QP\3\2\2\2QR\3\2\2\2RZ\3\2\2\2ST\7\36\2"+
		"\2TZ\7\36\2\2UW\7\37\2\2VX\7\36\2\2WV\3\2\2\2WX\3\2\2\2XZ\3\2\2\2YO\3"+
		"\2\2\2YS\3\2\2\2YU\3\2\2\2Z\13\3\2\2\2[\\\5\4\3\2\\_\5\n\6\2]`\7\31\2"+
		"\2^`\5\4\3\2_]\3\2\2\2_^\3\2\2\2`\r\3\2\2\2ab\7\r\2\2bc\5\f\7\2cd\7\13"+
		"\2\2de\5\34\17\2ef\7\16\2\2f\17\3\2\2\2gh\7\17\2\2hi\5\34\17\2ij\7\r\2"+
		"\2jk\5\f\7\2kl\7\20\2\2l\21\3\2\2\2mp\7\21\2\2nq\5\"\22\2oq\5 \21\2pn"+
		"\3\2\2\2po\3\2\2\2qr\3\2\2\2ru\5\n\6\2sv\5\"\22\2tv\5 \21\2us\3\2\2\2"+
		"ut\3\2\2\2vw\3\2\2\2wx\7\13\2\2xy\5\34\17\2y{\7\22\2\2z|\5\24\13\2{z\3"+
		"\2\2\2{|\3\2\2\2|\23\3\2\2\2}~\7\23\2\2~\177\5\34\17\2\177\u0080\7\24"+
		"\2\2\u0080\25\3\2\2\2\u0081\u0083\7\25\2\2\u0082\u0084\5\30\r\2\u0083"+
		"\u0082\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\5\34"+
		"\17\2\u0086\u0087\7\26\2\2\u0087\27\3\2\2\2\u0088\u008e\5\"\22\2\u0089"+
		"\u008c\7\36\2\2\u008a\u008d\5 \21\2\u008b\u008d\5\2\2\2\u008c\u008a\3"+
		"\2\2\2\u008c\u008b\3\2\2\2\u008d\u008f\3\2\2\2\u008e\u0089\3\2\2\2\u008e"+
		"\u008f\3\2\2\2\u008f\u0091\3\2\2\2\u0090\u0092\7\34\2\2\u0091\u0090\3"+
		"\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\7\33\2\2\u0094"+
		"\u0095\b\r\1\2\u0095\31\3\2\2\2\u0096\u0097\5\4\3\2\u0097\u0098\7\36\2"+
		"\2\u0098\u0099\5 \21\2\u0099\u009c\3\2\2\2\u009a\u009c\5\30\r\2\u009b"+
		"\u0096\3\2\2\2\u009b\u009a\3\2\2\2\u009c\33\3\2\2\2\u009d\u00a2\5\16\b"+
		"\2\u009e\u00a2\5\22\n\2\u009f\u00a2\5\20\t\2\u00a0\u00a2\5\2\2\2\u00a1"+
		"\u009d\3\2\2\2\u00a1\u009e\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a0\3\2"+
		"\2\2\u00a2\35\3\2\2\2\u00a3\u00a4\7\27\2\2\u00a4\u00a5\7\32\2\2\u00a5"+
		"\u00ad\b\20\1\2\u00a6\u00a7\7\27\2\2\u00a7\u00a8\7\31\2\2\u00a8\u00ad"+
		"\b\20\1\2\u00a9\u00aa\7\27\2\2\u00aa\u00ab\7\30\2\2\u00ab\u00ad\b\20\1"+
		"\2\u00ac\u00a3\3\2\2\2\u00ac\u00a6\3\2\2\2\u00ac\u00a9\3\2\2\2\u00ad\u00ae"+
		"\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\37\3\2\2\2\u00b0"+
		"\u00b1\t\4\2\2\u00b1!\3\2\2\2\u00b2\u00b3\7\33\2\2\u00b3\u00b4\7\34\2"+
		"\2\u00b4\u00b5\b\22\1\2\u00b5#\3\2\2\2\26)/\679EQWY_pu{\u0083\u008c\u008e"+
		"\u0091\u009b\u00a1\u00ac\u00ae";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}