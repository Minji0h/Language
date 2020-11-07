// Generated from MinhaLinguagem.g4 by ANTLR 4.8
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, BOLEANO=22, NUMERO=23, TEXTO=24, 
		ID=25, TIPO=26, MAIOR=27, IGUAL=28, MENOR=29, WS=30;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "BOLEANO", "NUMERO", "TEXTO", "ID", 
			"TIPO", "MAIOR", "IGUAL", "MENOR", "WS"
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
			"NUMERO", "TEXTO", "ID", "TIPO", "MAIOR", "IGUAL", "MENOR", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2 \u0121\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00d9"+
		"\n\27\3\30\3\30\5\30\u00dd\n\30\3\30\3\30\7\30\u00e1\n\30\f\30\16\30\u00e4"+
		"\13\30\3\30\3\30\6\30\u00e8\n\30\r\30\16\30\u00e9\5\30\u00ec\n\30\5\30"+
		"\u00ee\n\30\3\31\3\31\7\31\u00f2\n\31\f\31\16\31\u00f5\13\31\3\31\3\31"+
		"\3\32\3\32\7\32\u00fb\n\32\f\32\16\32\u00fe\13\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\5\33\u0113\n\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\6\37\u011c\n"+
		"\37\r\37\16\37\u011d\3\37\3\37\2\2 \3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= \3\2\b\3\2\63;\3\2\62;\6\2\f\f\17"+
		"\17$$\u0102\u0180\4\2C\\c|\7\2/\60\62;C\\aac|\5\2\13\f\17\17\"\"\2\u012b"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\3?\3\2\2\2\5A\3\2\2\2\7C\3\2\2\2\tE\3\2\2\2\13G\3\2"+
		"\2\2\rI\3\2\2\2\17K\3\2\2\2\21\\\3\2\2\2\23a\3\2\2\2\25h\3\2\2\2\27q\3"+
		"\2\2\2\31z\3\2\2\2\33\u0087\3\2\2\2\35\u008e\3\2\2\2\37\u0098\3\2\2\2"+
		"!\u009b\3\2\2\2#\u00a2\3\2\2\2%\u00b0\3\2\2\2\'\u00bb\3\2\2\2)\u00c2\3"+
		"\2\2\2+\u00c6\3\2\2\2-\u00d8\3\2\2\2/\u00ed\3\2\2\2\61\u00ef\3\2\2\2\63"+
		"\u00f8\3\2\2\2\65\u0112\3\2\2\2\67\u0114\3\2\2\29\u0116\3\2\2\2;\u0118"+
		"\3\2\2\2=\u011b\3\2\2\2?@\7,\2\2@\4\3\2\2\2AB\7\61\2\2B\6\3\2\2\2CD\7"+
		"-\2\2D\b\3\2\2\2EF\7/\2\2F\n\3\2\2\2GH\7*\2\2H\f\3\2\2\2IJ\7+\2\2J\16"+
		"\3\2\2\2KL\7g\2\2LM\7u\2\2MN\7v\2\2NO\7k\2\2OP\7x\2\2PQ\7g\2\2QR\7t\2"+
		"\2RS\7\"\2\2ST\7p\2\2TU\7q\2\2UV\7\"\2\2VW\7t\2\2WX\7c\2\2XY\7p\2\2YZ"+
		"\7i\2\2Z[\7g\2\2[\20\3\2\2\2\\]\7R\2\2]^\7c\2\2^_\7t\2\2_`\7c\2\2`\22"+
		"\3\2\2\2ab\7h\2\2bc\7c\2\2cd\7\u00c5\2\2de\7\u00a9\2\2ef\7c\2\2fg\7<\2"+
		"\2g\24\3\2\2\2hi\7H\2\2ij\7k\2\2jk\7o\2\2kl\7\"\2\2lm\7r\2\2mn\7c\2\2"+
		"no\7t\2\2op\7c\2\2p\26\3\2\2\2qr\7G\2\2rs\7p\2\2st\7s\2\2tu\7w\2\2uv\7"+
		"c\2\2vw\7p\2\2wx\7v\2\2xy\7q\2\2y\30\3\2\2\2z{\7H\2\2{|\7k\2\2|}\7o\2"+
		"\2}~\7\"\2\2~\177\7g\2\2\177\u0080\7p\2\2\u0080\u0081\7s\2\2\u0081\u0082"+
		"\7w\2\2\u0082\u0083\7c\2\2\u0083\u0084\7p\2\2\u0084\u0085\7v\2\2\u0085"+
		"\u0086\7q\2\2\u0086\32\3\2\2\2\u0087\u0088\7H\2\2\u0088\u0089\7c\2\2\u0089"+
		"\u008a\7\u00c5\2\2\u008a\u008b\7\u00a9\2\2\u008b\u008c\7c\2\2\u008c\u008d"+
		"\7<\2\2\u008d\34\3\2\2\2\u008e\u008f\7H\2\2\u008f\u0090\7k\2\2\u0090\u0091"+
		"\7o\2\2\u0091\u0092\7\"\2\2\u0092\u0093\7h\2\2\u0093\u0094\7c\2\2\u0094"+
		"\u0095\7\u00c5\2\2\u0095\u0096\7\u00a9\2\2\u0096\u0097\7c\2\2\u0097\36"+
		"\3\2\2\2\u0098\u0099\7U\2\2\u0099\u009a\7g\2\2\u009a \3\2\2\2\u009b\u009c"+
		"\7H\2\2\u009c\u009d\7k\2\2\u009d\u009e\7o\2\2\u009e\u009f\7\"\2\2\u009f"+
		"\u00a0\7u\2\2\u00a0\u00a1\7g\2\2\u00a1\"\3\2\2\2\u00a2\u00a3\7U\2\2\u00a3"+
		"\u00a4\7g\2\2\u00a4\u00a5\7p\2\2\u00a5\u00a6\7\u00c5\2\2\u00a6\u00a7\7"+
		"\u00a5\2\2\u00a7\u00a8\7q\2\2\u00a8\u00a9\7\"\2\2\u00a9\u00aa\7h\2\2\u00aa"+
		"\u00ab\7c\2\2\u00ab\u00ac\7\u00c5\2\2\u00ac\u00ad\7\u00a9\2\2\u00ad\u00ae"+
		"\7c\2\2\u00ae\u00af\7<\2\2\u00af$\3\2\2\2\u00b0\u00b1\7H\2\2\u00b1\u00b2"+
		"\7k\2\2\u00b2\u00b3\7o\2\2\u00b3\u00b4\7\"\2\2\u00b4\u00b5\7u\2\2\u00b5"+
		"\u00b6\7g\2\2\u00b6\u00b7\7p\2\2\u00b7\u00b8\7\u00c5\2\2\u00b8\u00b9\7"+
		"\u00a5\2\2\u00b9\u00ba\7q\2\2\u00ba&\3\2\2\2\u00bb\u00bc\7K\2\2\u00bc"+
		"\u00bd\7p\2\2\u00bd\u00be\7k\2\2\u00be\u00bf\7e\2\2\u00bf\u00c0\7k\2\2"+
		"\u00c0\u00c1\7q\2\2\u00c1(\3\2\2\2\u00c2\u00c3\7H\2\2\u00c3\u00c4\7k\2"+
		"\2\u00c4\u00c5\7o\2\2\u00c5*\3\2\2\2\u00c6\u00c7\7k\2\2\u00c7\u00c8\7"+
		"o\2\2\u00c8\u00c9\7r\2\2\u00c9\u00ca\7t\2\2\u00ca\u00cb\7k\2\2\u00cb\u00cc"+
		"\7o\2\2\u00cc\u00cd\7g\2\2\u00cd\u00ce\7\"\2\2\u00ce,\3\2\2\2\u00cf\u00d0"+
		"\7v\2\2\u00d0\u00d1\7t\2\2\u00d1\u00d2\7w\2\2\u00d2\u00d9\7g\2\2\u00d3"+
		"\u00d4\7h\2\2\u00d4\u00d5\7c\2\2\u00d5\u00d6\7n\2\2\u00d6\u00d7\7u\2\2"+
		"\u00d7\u00d9\7g\2\2\u00d8\u00cf\3\2\2\2\u00d8\u00d3\3\2\2\2\u00d9.\3\2"+
		"\2\2\u00da\u00ee\7\62\2\2\u00db\u00dd\7/\2\2\u00dc\u00db\3\2\2\2\u00dc"+
		"\u00dd\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00e2\t\2\2\2\u00df\u00e1\t\3"+
		"\2\2\u00e0\u00df\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2"+
		"\u00e3\3\2\2\2\u00e3\u00eb\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e7\7\60"+
		"\2\2\u00e6\u00e8\t\3\2\2\u00e7\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9"+
		"\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ec\3\2\2\2\u00eb\u00e5\3\2"+
		"\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ee\3\2\2\2\u00ed\u00da\3\2\2\2\u00ed"+
		"\u00dc\3\2\2\2\u00ee\60\3\2\2\2\u00ef\u00f3\7$\2\2\u00f0\u00f2\n\4\2\2"+
		"\u00f1\u00f0\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4"+
		"\3\2\2\2\u00f4\u00f6\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f7\7$\2\2\u00f7"+
		"\62\3\2\2\2\u00f8\u00fc\t\5\2\2\u00f9\u00fb\t\6\2\2\u00fa\u00f9\3\2\2"+
		"\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\64"+
		"\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff\u0100\7V\2\2\u0100\u0101\7g\2\2\u0101"+
		"\u0102\7z\2\2\u0102\u0103\7v\2\2\u0103\u0113\7q\2\2\u0104\u0105\7K\2\2"+
		"\u0105\u0106\7p\2\2\u0106\u0107\7v\2\2\u0107\u0108\7g\2\2\u0108\u0109"+
		"\7k\2\2\u0109\u010a\7t\2\2\u010a\u0113\7q\2\2\u010b\u010c\7F\2\2\u010c"+
		"\u010d\7g\2\2\u010d\u010e\7e\2\2\u010e\u010f\7k\2\2\u010f\u0110\7o\2\2"+
		"\u0110\u0111\7c\2\2\u0111\u0113\7n\2\2\u0112\u00ff\3\2\2\2\u0112\u0104"+
		"\3\2\2\2\u0112\u010b\3\2\2\2\u0113\66\3\2\2\2\u0114\u0115\7@\2\2\u0115"+
		"8\3\2\2\2\u0116\u0117\7?\2\2\u0117:\3\2\2\2\u0118\u0119\7>\2\2\u0119<"+
		"\3\2\2\2\u011a\u011c\t\7\2\2\u011b\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d"+
		"\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0120\b\37"+
		"\2\2\u0120>\3\2\2\2\r\2\u00d8\u00dc\u00e2\u00e9\u00eb\u00ed\u00f3\u00fc"+
		"\u0112\u011d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}