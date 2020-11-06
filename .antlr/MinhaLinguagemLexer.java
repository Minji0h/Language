// Generated from c:\Users\marin\OneDrive\Documentos\GitHub\Language\MinhaLinguagem.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MinhaLinguagemLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Programa=1, Declaracoes=2, Atribuicao=3, Comandos=4, Se=5, Enquanto=6, 
		Para=7, WS=8;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Boleano", "Numero", "Texto", "Id", "Variavel", "Tipo", "Valor", "Programa", 
			"Declaracoes", "Atribuicao", "Comandos", "Se", "Enquanto", "Para", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Programa", "Declaracoes", "Atribuicao", "Comandos", "Se", "Enquanto", 
			"Para", "WS"
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


	public MinhaLinguagemLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MinhaLinguagem.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\n\u00a4\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\5\2+\n\2\3\3\3\3\5\3/\n\3\3\3\3\3\7\3\63\n\3\f\3\16"+
		"\3\66\13\3\3\3\3\3\7\3:\n\3\f\3\16\3=\13\3\5\3?\n\3\3\4\3\4\3\4\3\5\3"+
		"\5\7\5F\n\5\f\5\16\5I\13\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7a\n\7\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\6\tk\n\t\r\t\16\tl\3\t\6\tp\n\t\r\t\16\tq\3\t\6\tu\n"+
		"\t\r\t\16\tv\3\t\3\t\3\t\3\t\3\n\6\n~\n\n\r\n\16\n\177\3\n\6\n\u0083\n"+
		"\n\r\n\16\n\u0084\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\5\f\u0090\n"+
		"\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\6\20"+
		"\u009f\n\20\r\20\16\20\u00a0\3\20\3\20\2\2\21\3\2\5\2\7\2\t\2\13\2\r\2"+
		"\17\2\21\3\23\4\25\5\27\6\31\7\33\b\35\t\37\n\3\2\7\3\2\63;\3\2\62;\4"+
		"\2C\\c|\7\2/\60\62;C\\aac|\5\2\13\f\17\17\"\"\2\u00ac\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\3*\3\2\2\2\5>\3\2\2\2\7@\3\2\2\2\tC\3\2\2\2\13J\3\2"+
		"\2\2\r`\3\2\2\2\17b\3\2\2\2\21j\3\2\2\2\23}\3\2\2\2\25\u0088\3\2\2\2\27"+
		"\u008f\3\2\2\2\31\u0091\3\2\2\2\33\u0093\3\2\2\2\35\u0095\3\2\2\2\37\u009e"+
		"\3\2\2\2!\"\7v\2\2\"#\7t\2\2#$\7w\2\2$+\7g\2\2%&\7h\2\2&\'\7c\2\2\'(\7"+
		"n\2\2()\7u\2\2)+\7g\2\2*!\3\2\2\2*%\3\2\2\2+\4\3\2\2\2,?\7\62\2\2-/\7"+
		"/\2\2.-\3\2\2\2./\3\2\2\2/\60\3\2\2\2\60\64\t\2\2\2\61\63\t\3\2\2\62\61"+
		"\3\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65;\3\2\2\2\66\64\3"+
		"\2\2\2\678\7\60\2\28:\t\3\2\29\67\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2"+
		"\2<?\3\2\2\2=;\3\2\2\2>,\3\2\2\2>.\3\2\2\2?\6\3\2\2\2@A\7$\2\2AB\7$\2"+
		"\2B\b\3\2\2\2CG\t\4\2\2DF\t\5\2\2ED\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2"+
		"\2\2H\n\3\2\2\2IG\3\2\2\2JK\5\r\7\2KL\5\t\5\2L\f\3\2\2\2MN\7V\2\2NO\7"+
		"g\2\2OP\7z\2\2PQ\7v\2\2Qa\7q\2\2RS\7K\2\2ST\7p\2\2TU\7v\2\2UV\7g\2\2V"+
		"W\7k\2\2WX\7t\2\2Xa\7q\2\2YZ\7F\2\2Z[\7g\2\2[\\\7e\2\2\\]\7k\2\2]^\7o"+
		"\2\2^_\7c\2\2_a\7n\2\2`M\3\2\2\2`R\3\2\2\2`Y\3\2\2\2a\16\3\2\2\2bc\3\2"+
		"\2\2c\20\3\2\2\2de\7K\2\2ef\7p\2\2fg\7k\2\2gh\7e\2\2hi\7k\2\2ik\7q\2\2"+
		"jd\3\2\2\2kl\3\2\2\2lj\3\2\2\2lm\3\2\2\2mo\3\2\2\2np\5\23\n\2on\3\2\2"+
		"\2pq\3\2\2\2qo\3\2\2\2qr\3\2\2\2rt\3\2\2\2su\5\27\f\2ts\3\2\2\2uv\3\2"+
		"\2\2vt\3\2\2\2vw\3\2\2\2wx\3\2\2\2xy\7H\2\2yz\7k\2\2z{\7o\2\2{\22\3\2"+
		"\2\2|~\5\13\6\2}|\3\2\2\2~\177\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2"+
		"\u0080\u0082\3\2\2\2\u0081\u0083\7?\2\2\u0082\u0081\3\2\2\2\u0083\u0084"+
		"\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\3\2\2\2\u0086"+
		"\u0087\5\17\b\2\u0087\24\3\2\2\2\u0088\u0089\5\t\5\2\u0089\u008a\7?\2"+
		"\2\u008a\u008b\5\17\b\2\u008b\26\3\2\2\2\u008c\u0090\5\33\16\2\u008d\u0090"+
		"\5\35\17\2\u008e\u0090\5\31\r\2\u008f\u008c\3\2\2\2\u008f\u008d\3\2\2"+
		"\2\u008f\u008e\3\2\2\2\u0090\30\3\2\2\2\u0091\u0092\3\2\2\2\u0092\32\3"+
		"\2\2\2\u0093\u0094\3\2\2\2\u0094\34\3\2\2\2\u0095\u0096\7R\2\2\u0096\u0097"+
		"\7c\2\2\u0097\u0098\7t\2\2\u0098\u0099\7c\2\2\u0099\u009a\3\2\2\2\u009a"+
		"\u009b\7*\2\2\u009b\u009c\7+\2\2\u009c\36\3\2\2\2\u009d\u009f\t\6\2\2"+
		"\u009e\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1"+
		"\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\b\20\2\2\u00a3 \3\2\2\2\21\2"+
		"*.\64;>G`lqv\177\u0084\u008f\u00a0\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}