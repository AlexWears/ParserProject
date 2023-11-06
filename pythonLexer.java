// Generated from /Users/alexwears/Desktop/ParserProject/ParserProject/python.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class pythonLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		S=1, LITERAL=2, VAR=3, ASSIGN=4, OPSYMBOL=5, OPERATION=6, INT=7, NUMBER=8, 
		LETTER=9, STRING=10, CHAR=11, LOWERCASE=12, UPPERCASE=13, WS=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"S", "LITERAL", "VAR", "ASSIGN", "OPSYMBOL", "OPERATION", "INT", "NUMBER", 
			"LETTER", "STRING", "CHAR", "LOWERCASE", "UPPERCASE", "WS"
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
			null, "S", "LITERAL", "VAR", "ASSIGN", "OPSYMBOL", "OPERATION", "INT", 
			"NUMBER", "LETTER", "STRING", "CHAR", "LOWERCASE", "UPPERCASE", "WS"
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


	public pythonLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "python.g4"; }

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
		"\u0004\u0000\u000e\u0090\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0003\u0000\"\b\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001\'\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0005\u0002-\b\u0002\n\u0002\f\u00020\t\u0002\u0001\u0002"+
		"\u0005\u00023\b\u0002\n\u0002\f\u00026\t\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002;\b\u0002\u0001\u0003\u0003\u0003>\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0005\u0003B\b\u0003\n\u0003\f\u0003E\t\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003J\b\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0003\u0005P\b\u0005\u0001\u0005\u0005"+
		"\u0005S\b\u0005\n\u0005\f\u0005V\t\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005Z\b\u0005\u0001\u0005\u0005\u0005]\b\u0005\n\u0005\f\u0005`\t\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005d\b\u0005\u0001\u0006\u0004\u0006"+
		"g\b\u0006\u000b\u0006\f\u0006h\u0001\u0007\u0001\u0007\u0003\u0007m\b"+
		"\u0007\u0001\u0007\u0005\u0007p\b\u0007\n\u0007\f\u0007s\t\u0007\u0001"+
		"\b\u0001\b\u0003\bw\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t}\b\t\n"+
		"\t\f\t\u0080\t\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0004\r\u008d\b\r\u000b\r\f"+
		"\r\u008e\u0000\u0000\u000e\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017"+
		"\f\u0019\r\u001b\u000e\u0001\u0000\u0003\u0001\u0001\n\n\u0004\u0000%"+
		"%*+--//\u0002\u0000\t\t  \u00a9\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0001!\u0001\u0000\u0000\u0000\u0003&\u0001\u0000\u0000"+
		"\u0000\u0005(\u0001\u0000\u0000\u0000\u0007=\u0001\u0000\u0000\u0000\t"+
		"K\u0001\u0000\u0000\u0000\u000bO\u0001\u0000\u0000\u0000\rf\u0001\u0000"+
		"\u0000\u0000\u000fj\u0001\u0000\u0000\u0000\u0011v\u0001\u0000\u0000\u0000"+
		"\u0013x\u0001\u0000\u0000\u0000\u0015\u0083\u0001\u0000\u0000\u0000\u0017"+
		"\u0087\u0001\u0000\u0000\u0000\u0019\u0089\u0001\u0000\u0000\u0000\u001b"+
		"\u008c\u0001\u0000\u0000\u0000\u001d\u001e\u0003\u0005\u0002\u0000\u001e"+
		"\u001f\u0003\u0001\u0000\u0000\u001f\"\u0001\u0000\u0000\u0000 \"\u0007"+
		"\u0000\u0000\u0000!\u001d\u0001\u0000\u0000\u0000! \u0001\u0000\u0000"+
		"\u0000\"\u0002\u0001\u0000\u0000\u0000#\'\u0003\u0013\t\u0000$\'\u0003"+
		"\u0015\n\u0000%\'\u0003\u000f\u0007\u0000&#\u0001\u0000\u0000\u0000&$"+
		"\u0001\u0000\u0000\u0000&%\u0001\u0000\u0000\u0000\'\u0004\u0001\u0000"+
		"\u0000\u0000(.\u0003\u0011\b\u0000)-\u0003\u0011\b\u0000*-\u0003\u000f"+
		"\u0007\u0000+-\u0005_\u0000\u0000,)\u0001\u0000\u0000\u0000,*\u0001\u0000"+
		"\u0000\u0000,+\u0001\u0000\u0000\u0000-0\u0001\u0000\u0000\u0000.,\u0001"+
		"\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/4\u0001\u0000\u0000\u0000"+
		"0.\u0001\u0000\u0000\u000013\u0003\u001b\r\u000021\u0001\u0000\u0000\u0000"+
		"36\u0001\u0000\u0000\u000042\u0001\u0000\u0000\u000045\u0001\u0000\u0000"+
		"\u00005:\u0001\u0000\u0000\u000064\u0001\u0000\u0000\u00007;\u0003\u0007"+
		"\u0003\u00008;\u0003\u000b\u0005\u00009;\u0005\n\u0000\u0000:7\u0001\u0000"+
		"\u0000\u0000:8\u0001\u0000\u0000\u0000:9\u0001\u0000\u0000\u0000;\u0006"+
		"\u0001\u0000\u0000\u0000<>\u0003\t\u0004\u0000=<\u0001\u0000\u0000\u0000"+
		"=>\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?C\u0005=\u0000\u0000"+
		"@B\u0003\u001b\r\u0000A@\u0001\u0000\u0000\u0000BE\u0001\u0000\u0000\u0000"+
		"CA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000DI\u0001\u0000\u0000"+
		"\u0000EC\u0001\u0000\u0000\u0000FJ\u0003\u0005\u0002\u0000GJ\u0003\u0003"+
		"\u0001\u0000HJ\u0003\u000b\u0005\u0000IF\u0001\u0000\u0000\u0000IG\u0001"+
		"\u0000\u0000\u0000IH\u0001\u0000\u0000\u0000J\b\u0001\u0000\u0000\u0000"+
		"KL\u0007\u0001\u0000\u0000L\n\u0001\u0000\u0000\u0000MP\u0003\u0003\u0001"+
		"\u0000NP\u0003\u0005\u0002\u0000OM\u0001\u0000\u0000\u0000ON\u0001\u0000"+
		"\u0000\u0000PT\u0001\u0000\u0000\u0000QS\u0003\u001b\r\u0000RQ\u0001\u0000"+
		"\u0000\u0000SV\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000TU\u0001"+
		"\u0000\u0000\u0000UW\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000"+
		"WY\u0003\t\u0004\u0000XZ\u0005=\u0000\u0000YX\u0001\u0000\u0000\u0000"+
		"YZ\u0001\u0000\u0000\u0000Z^\u0001\u0000\u0000\u0000[]\u0003\u001b\r\u0000"+
		"\\[\u0001\u0000\u0000\u0000]`\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000"+
		"\u0000^_\u0001\u0000\u0000\u0000_c\u0001\u0000\u0000\u0000`^\u0001\u0000"+
		"\u0000\u0000ad\u0003\u0003\u0001\u0000bd\u0003\u0005\u0002\u0000ca\u0001"+
		"\u0000\u0000\u0000cb\u0001\u0000\u0000\u0000d\f\u0001\u0000\u0000\u0000"+
		"eg\u000209\u0000fe\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000h"+
		"f\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000i\u000e\u0001\u0000"+
		"\u0000\u0000jl\u0003\r\u0006\u0000km\u0005.\u0000\u0000lk\u0001\u0000"+
		"\u0000\u0000lm\u0001\u0000\u0000\u0000mq\u0001\u0000\u0000\u0000np\u0003"+
		"\r\u0006\u0000on\u0001\u0000\u0000\u0000ps\u0001\u0000\u0000\u0000qo\u0001"+
		"\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000r\u0010\u0001\u0000\u0000"+
		"\u0000sq\u0001\u0000\u0000\u0000tw\u0003\u0017\u000b\u0000uw\u0003\u0019"+
		"\f\u0000vt\u0001\u0000\u0000\u0000vu\u0001\u0000\u0000\u0000w\u0012\u0001"+
		"\u0000\u0000\u0000x~\u0005\"\u0000\u0000y}\u0003\u0011\b\u0000z}\u0003"+
		"\u000f\u0007\u0000{}\u0003\u001b\r\u0000|y\u0001\u0000\u0000\u0000|z\u0001"+
		"\u0000\u0000\u0000|{\u0001\u0000\u0000\u0000}\u0080\u0001\u0000\u0000"+
		"\u0000~|\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f"+
		"\u0081\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000\u0081\u0082"+
		"\u0005\"\u0000\u0000\u0082\u0014\u0001\u0000\u0000\u0000\u0083\u0084\u0005"+
		"\'\u0000\u0000\u0084\u0085\u0003\u0011\b\u0000\u0085\u0086\u0005\'\u0000"+
		"\u0000\u0086\u0016\u0001\u0000\u0000\u0000\u0087\u0088\u0002az\u0000\u0088"+
		"\u0018\u0001\u0000\u0000\u0000\u0089\u008a\u0002AZ\u0000\u008a\u001a\u0001"+
		"\u0000\u0000\u0000\u008b\u008d\u0007\u0002\u0000\u0000\u008c\u008b\u0001"+
		"\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u008c\u0001"+
		"\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u001c\u0001"+
		"\u0000\u0000\u0000\u0016\u0000!&,.4:=CIOTY^chlqv|~\u008e\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}