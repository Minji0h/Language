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
		Referencia=1, Variavel=2, Valor=3, Programa=4, Declaracoes=5, Atribuicao=6, 
		Comandos=7, Se=8, Enquanto=9, Para=10, CondicaoPara=11, WS=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Boleano", "Numero", "Texto", "Id", "Tipo", "Referencia", "Variavel", 
			"Valor", "Programa", "Declaracoes", "Atribuicao", "Comandos", "Se", "Enquanto", 
			"Para", "CondicaoPara", "WS"
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
			null, "Referencia", "Variavel", "Valor", "Programa", "Declaracoes", "Atribuicao", 
			"Comandos", "Se", "Enquanto", "Para", "CondicaoPara", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\16\u00c2\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2/\n\2\3\3\3\3\5\3\63\n\3"+
		"\3\3\3\3\7\3\67\n\3\f\3\16\3:\13\3\3\3\3\3\6\3>\n\3\r\3\16\3?\5\3B\n\3"+
		"\5\3D\n\3\3\4\3\4\7\4H\n\4\f\4\16\4K\13\4\3\4\3\4\3\5\3\5\7\5Q\n\5\f\5"+
		"\16\5T\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\5\6i\n\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\5\ts\n\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\6\n{\n\n\r\n\16\n|\3\n\6\n\u0080\n\n\r\n\16\n\u0081"+
		"\3\n\6\n\u0085\n\n\r\n\16\n\u0086\3\n\3\n\3\n\3\n\3\13\3\13\6\13\u008f"+
		"\n\13\r\13\16\13\u0090\3\13\5\13\u0094\n\13\3\f\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\5\r\u009d\n\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\6\20\u00aa\n\20\r\20\16\20\u00ab\3\20\6\20\u00af\n\20\r\20\16\20\u00b0"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22\6\22\u00bd\n\22\r\22"+
		"\16\22\u00be\3\22\3\22\2\2\23\3\2\5\2\7\2\t\2\13\2\r\3\17\4\21\5\23\6"+
		"\25\7\27\b\31\t\33\n\35\13\37\f!\r#\16\3\2\b\3\2\63;\3\2\62;\5\2\f\f\17"+
		"\17$$\4\2C\\c|\7\2/\60\62;C\\aac|\5\2\13\f\17\17\"\"\2\u00d2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\3.\3\2\2\2\5C\3\2\2\2\7E\3\2\2\2\tN\3\2\2\2\13h\3\2\2\2\rj\3\2\2\2"+
		"\17l\3\2\2\2\21r\3\2\2\2\23z\3\2\2\2\25\u008c\3\2\2\2\27\u0095\3\2\2\2"+
		"\31\u009c\3\2\2\2\33\u009e\3\2\2\2\35\u00a0\3\2\2\2\37\u00a2\3\2\2\2!"+
		"\u00b9\3\2\2\2#\u00bc\3\2\2\2%&\7v\2\2&\'\7t\2\2\'(\7w\2\2(/\7g\2\2)*"+
		"\7h\2\2*+\7c\2\2+,\7n\2\2,-\7u\2\2-/\7g\2\2.%\3\2\2\2.)\3\2\2\2/\4\3\2"+
		"\2\2\60D\7\62\2\2\61\63\7/\2\2\62\61\3\2\2\2\62\63\3\2\2\2\63\64\3\2\2"+
		"\2\648\t\2\2\2\65\67\t\3\2\2\66\65\3\2\2\2\67:\3\2\2\28\66\3\2\2\289\3"+
		"\2\2\29A\3\2\2\2:8\3\2\2\2;=\7\60\2\2<>\t\3\2\2=<\3\2\2\2>?\3\2\2\2?="+
		"\3\2\2\2?@\3\2\2\2@B\3\2\2\2A;\3\2\2\2AB\3\2\2\2BD\3\2\2\2C\60\3\2\2\2"+
		"C\62\3\2\2\2D\6\3\2\2\2EI\7$\2\2FH\n\4\2\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2"+
		"\2IJ\3\2\2\2JL\3\2\2\2KI\3\2\2\2LM\7$\2\2M\b\3\2\2\2NR\t\5\2\2OQ\t\6\2"+
		"\2PO\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2S\n\3\2\2\2TR\3\2\2\2UV\7V\2"+
		"\2VW\7g\2\2WX\7z\2\2XY\7v\2\2Yi\7q\2\2Z[\7K\2\2[\\\7p\2\2\\]\7v\2\2]^"+
		"\7g\2\2^_\7k\2\2_`\7t\2\2`i\7q\2\2ab\7F\2\2bc\7g\2\2cd\7e\2\2de\7k\2\2"+
		"ef\7o\2\2fg\7c\2\2gi\7n\2\2hU\3\2\2\2hZ\3\2\2\2ha\3\2\2\2i\f\3\2\2\2j"+
		"k\5\t\5\2k\16\3\2\2\2lm\5\13\6\2mn\5\t\5\2n\20\3\2\2\2os\5\3\2\2ps\5\5"+
		"\3\2qs\5\7\4\2ro\3\2\2\2rp\3\2\2\2rq\3\2\2\2s\22\3\2\2\2tu\7K\2\2uv\7"+
		"p\2\2vw\7k\2\2wx\7e\2\2xy\7k\2\2y{\7q\2\2zt\3\2\2\2{|\3\2\2\2|z\3\2\2"+
		"\2|}\3\2\2\2}\177\3\2\2\2~\u0080\5\25\13\2\177~\3\2\2\2\u0080\u0081\3"+
		"\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0084\3\2\2\2\u0083"+
		"\u0085\5\31\r\2\u0084\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0084\3"+
		"\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\7H\2\2\u0089"+
		"\u008a\7k\2\2\u008a\u008b\7o\2\2\u008b\24\3\2\2\2\u008c\u0093\5\17\b\2"+
		"\u008d\u008f\7?\2\2\u008e\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u008e"+
		"\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0094\5\21\t\2"+
		"\u0093\u008e\3\2\2\2\u0093\u0094\3\2\2\2\u0094\26\3\2\2\2\u0095\u0096"+
		"\5\t\5\2\u0096\u0097\7?\2\2\u0097\u0098\5\21\t\2\u0098\30\3\2\2\2\u0099"+
		"\u009d\5\35\17\2\u009a\u009d\5\37\20\2\u009b\u009d\5\33\16\2\u009c\u0099"+
		"\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009b\3\2\2\2\u009d\32\3\2\2\2\u009e"+
		"\u009f\3\2\2\2\u009f\34\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\36\3\2\2\2\u00a2"+
		"\u00a3\7R\2\2\u00a3\u00a4\7c\2\2\u00a4\u00a5\7t\2\2\u00a5\u00a6\7c\2\2"+
		"\u00a6\u00a7\3\2\2\2\u00a7\u00a9\7*\2\2\u00a8\u00aa\7+\2\2\u00a9\u00a8"+
		"\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac"+
		"\u00ae\3\2\2\2\u00ad\u00af\5!\21\2\u00ae\u00ad\3\2\2\2\u00af\u00b0\3\2"+
		"\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2"+
		"\u00b3\7h\2\2\u00b3\u00b4\7c\2\2\u00b4\u00b5\7\u00c5\2\2\u00b5\u00b6\7"+
		"\u00a9\2\2\u00b6\u00b7\7c\2\2\u00b7\u00b8\7<\2\2\u00b8 \3\2\2\2\u00b9"+
		"\u00ba\3\2\2\2\u00ba\"\3\2\2\2\u00bb\u00bd\t\7\2\2\u00bc\u00bb\3\2\2\2"+
		"\u00bd\u00be\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0"+
		"\3\2\2\2\u00c0\u00c1\b\22\2\2\u00c1$\3\2\2\2\26\2.\628?ACIRhr|\u0081\u0086"+
		"\u0090\u0093\u009c\u00ab\u00b0\u00be\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}