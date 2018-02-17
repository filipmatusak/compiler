// Generated from LexikalnePravidla.g4 by ANTLR 4.7
package compiler.generated;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LexikalnePravidla extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, RETURN=2, NUM=3, FLOAT=4, TRUE=5, FALSE=6, IF=7, ELSE=8, NOT=9, 
		BIT_AND=10, BIT_OR=11, BIT_XOR=12, EQ=13, NE=14, LT=15, GT=16, LE=17, 
		GE=18, FOR=19, DO=20, VAR=21, DEF=22, ARROW=23, LEFT_ARROW=24, TO=25, 
		BY=26, INT_TYPE=27, BOOL_TYPE=28, CHAR_TYPE=29, STRING_TYPE=30, UNIT_TYPE=31, 
		FLOAT_TYPE=32, TYPE_ASSING=33, DELIM=34, ID=35, ASSIGN=36, END_C=37, ADD=38, 
		SUB=39, MUL=40, DIV=41, POW=42, LEFT=43, RIGHT=44, NEWLINE=45, LEFT_BR=46, 
		RIGHT_BR=47, AND=48, OR=49, CHAR=50, STRING=51;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"WS", "RETURN", "NUM", "FLOAT", "TRUE", "FALSE", "IF", "ELSE", "NOT", 
		"BIT_AND", "BIT_OR", "BIT_XOR", "EQ", "NE", "LT", "GT", "LE", "GE", "FOR", 
		"DO", "VAR", "DEF", "ARROW", "LEFT_ARROW", "TO", "BY", "INT_TYPE", "BOOL_TYPE", 
		"CHAR_TYPE", "STRING_TYPE", "UNIT_TYPE", "FLOAT_TYPE", "TYPE_ASSING", 
		"DELIM", "ID", "DIGIT", "LETTER", "ASSIGN", "END_C", "ADD", "SUB", "MUL", 
		"DIV", "POW", "LEFT", "RIGHT", "NEWLINE", "LEFT_BR", "RIGHT_BR", "AND", 
		"OR", "STRING_CHAR", "CHAR", "ANY_CHAR", "STRING"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'return'", null, null, "'true'", "'false'", "'if'", "'else'", 
		"'!'", "'&'", "'|'", null, "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", 
		"'for'", "'do'", "'var'", "'def'", "'->'", "'<-'", "'to'", "'by'", "'Int'", 
		"'Bool'", "'Char'", "'String'", "'Unit'", "'Float'", "':'", "','", null, 
		"'='", "';'", "'+'", "'-'", "'*'", "'/'", null, "'('", "')'", null, "'{'", 
		"'}'", "'&&'", "'||'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WS", "RETURN", "NUM", "FLOAT", "TRUE", "FALSE", "IF", "ELSE", "NOT", 
		"BIT_AND", "BIT_OR", "BIT_XOR", "EQ", "NE", "LT", "GT", "LE", "GE", "FOR", 
		"DO", "VAR", "DEF", "ARROW", "LEFT_ARROW", "TO", "BY", "INT_TYPE", "BOOL_TYPE", 
		"CHAR_TYPE", "STRING_TYPE", "UNIT_TYPE", "FLOAT_TYPE", "TYPE_ASSING", 
		"DELIM", "ID", "ASSIGN", "END_C", "ADD", "SUB", "MUL", "DIV", "POW", "LEFT", 
		"RIGHT", "NEWLINE", "LEFT_BR", "RIGHT_BR", "AND", "OR", "CHAR", "STRING"
	};
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


	public LexikalnePravidla(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LexikalnePravidla.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\65\u013c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\6\2s\n\2\r\2\16\2t\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\6\4\u0081\n\4\r\4\16\4\u0082\3\5\6"+
		"\5\u0086\n\5\r\5\16\5\u0087\3\5\3\5\6\5\u008c\n\5\r\5\16\5\u008d\3\6\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3#\3#\3$\3$\3$\7$\u00fd"+
		"\n$\f$\16$\u0100\13$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3"+
		",\3-\3-\3.\3.\3/\3/\3\60\3\60\3\60\5\60\u011b\n\60\3\61\3\61\3\62\3\62"+
		"\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\5\65\u012a\n\65\3\66\3\66"+
		"\3\66\3\66\3\67\3\67\38\38\38\38\78\u0136\n8\f8\168\u0139\138\38\38\3"+
		"\u0137\29\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I\2K\2M&O\'Q(S)U*W+Y,[-]._/a\60c\61e\62g\63i\2"+
		"k\64m\2o\65\3\2\7\5\2\13\f\17\17\"\"\3\2\62;\4\2C\\c|\4\2\f\f\17\17\3"+
		"\2$$\2\u0141\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2"+
		"\2\2G\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2"+
		"W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3"+
		"\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2k\3\2\2\2\2o\3\2\2\2\3r\3\2\2\2\5x\3\2\2"+
		"\2\7\u0080\3\2\2\2\t\u0085\3\2\2\2\13\u008f\3\2\2\2\r\u0094\3\2\2\2\17"+
		"\u009a\3\2\2\2\21\u009d\3\2\2\2\23\u00a2\3\2\2\2\25\u00a4\3\2\2\2\27\u00a6"+
		"\3\2\2\2\31\u00a8\3\2\2\2\33\u00aa\3\2\2\2\35\u00ad\3\2\2\2\37\u00b0\3"+
		"\2\2\2!\u00b2\3\2\2\2#\u00b4\3\2\2\2%\u00b7\3\2\2\2\'\u00ba\3\2\2\2)\u00be"+
		"\3\2\2\2+\u00c1\3\2\2\2-\u00c5\3\2\2\2/\u00c9\3\2\2\2\61\u00cc\3\2\2\2"+
		"\63\u00cf\3\2\2\2\65\u00d2\3\2\2\2\67\u00d5\3\2\2\29\u00d9\3\2\2\2;\u00de"+
		"\3\2\2\2=\u00e3\3\2\2\2?\u00ea\3\2\2\2A\u00ef\3\2\2\2C\u00f5\3\2\2\2E"+
		"\u00f7\3\2\2\2G\u00f9\3\2\2\2I\u0101\3\2\2\2K\u0103\3\2\2\2M\u0105\3\2"+
		"\2\2O\u0107\3\2\2\2Q\u0109\3\2\2\2S\u010b\3\2\2\2U\u010d\3\2\2\2W\u010f"+
		"\3\2\2\2Y\u0111\3\2\2\2[\u0113\3\2\2\2]\u0115\3\2\2\2_\u011a\3\2\2\2a"+
		"\u011c\3\2\2\2c\u011e\3\2\2\2e\u0120\3\2\2\2g\u0123\3\2\2\2i\u0129\3\2"+
		"\2\2k\u012b\3\2\2\2m\u012f\3\2\2\2o\u0131\3\2\2\2qs\t\2\2\2rq\3\2\2\2"+
		"st\3\2\2\2tr\3\2\2\2tu\3\2\2\2uv\3\2\2\2vw\b\2\2\2w\4\3\2\2\2xy\7t\2\2"+
		"yz\7g\2\2z{\7v\2\2{|\7w\2\2|}\7t\2\2}~\7p\2\2~\6\3\2\2\2\177\u0081\5I"+
		"%\2\u0080\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083"+
		"\3\2\2\2\u0083\b\3\2\2\2\u0084\u0086\5I%\2\u0085\u0084\3\2\2\2\u0086\u0087"+
		"\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\3\2\2\2\u0089"+
		"\u008b\7\60\2\2\u008a\u008c\5I%\2\u008b\u008a\3\2\2\2\u008c\u008d\3\2"+
		"\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\n\3\2\2\2\u008f\u0090"+
		"\7v\2\2\u0090\u0091\7t\2\2\u0091\u0092\7w\2\2\u0092\u0093\7g\2\2\u0093"+
		"\f\3\2\2\2\u0094\u0095\7h\2\2\u0095\u0096\7c\2\2\u0096\u0097\7n\2\2\u0097"+
		"\u0098\7u\2\2\u0098\u0099\7g\2\2\u0099\16\3\2\2\2\u009a\u009b\7k\2\2\u009b"+
		"\u009c\7h\2\2\u009c\20\3\2\2\2\u009d\u009e\7g\2\2\u009e\u009f\7n\2\2\u009f"+
		"\u00a0\7u\2\2\u00a0\u00a1\7g\2\2\u00a1\22\3\2\2\2\u00a2\u00a3\7#\2\2\u00a3"+
		"\24\3\2\2\2\u00a4\u00a5\7(\2\2\u00a5\26\3\2\2\2\u00a6\u00a7\7~\2\2\u00a7"+
		"\30\3\2\2\2\u00a8\u00a9\7`\2\2\u00a9\32\3\2\2\2\u00aa\u00ab\7?\2\2\u00ab"+
		"\u00ac\7?\2\2\u00ac\34\3\2\2\2\u00ad\u00ae\7#\2\2\u00ae\u00af\7?\2\2\u00af"+
		"\36\3\2\2\2\u00b0\u00b1\7>\2\2\u00b1 \3\2\2\2\u00b2\u00b3\7@\2\2\u00b3"+
		"\"\3\2\2\2\u00b4\u00b5\7>\2\2\u00b5\u00b6\7?\2\2\u00b6$\3\2\2\2\u00b7"+
		"\u00b8\7@\2\2\u00b8\u00b9\7?\2\2\u00b9&\3\2\2\2\u00ba\u00bb\7h\2\2\u00bb"+
		"\u00bc\7q\2\2\u00bc\u00bd\7t\2\2\u00bd(\3\2\2\2\u00be\u00bf\7f\2\2\u00bf"+
		"\u00c0\7q\2\2\u00c0*\3\2\2\2\u00c1\u00c2\7x\2\2\u00c2\u00c3\7c\2\2\u00c3"+
		"\u00c4\7t\2\2\u00c4,\3\2\2\2\u00c5\u00c6\7f\2\2\u00c6\u00c7\7g\2\2\u00c7"+
		"\u00c8\7h\2\2\u00c8.\3\2\2\2\u00c9\u00ca\7/\2\2\u00ca\u00cb\7@\2\2\u00cb"+
		"\60\3\2\2\2\u00cc\u00cd\7>\2\2\u00cd\u00ce\7/\2\2\u00ce\62\3\2\2\2\u00cf"+
		"\u00d0\7v\2\2\u00d0\u00d1\7q\2\2\u00d1\64\3\2\2\2\u00d2\u00d3\7d\2\2\u00d3"+
		"\u00d4\7{\2\2\u00d4\66\3\2\2\2\u00d5\u00d6\7K\2\2\u00d6\u00d7\7p\2\2\u00d7"+
		"\u00d8\7v\2\2\u00d88\3\2\2\2\u00d9\u00da\7D\2\2\u00da\u00db\7q\2\2\u00db"+
		"\u00dc\7q\2\2\u00dc\u00dd\7n\2\2\u00dd:\3\2\2\2\u00de\u00df\7E\2\2\u00df"+
		"\u00e0\7j\2\2\u00e0\u00e1\7c\2\2\u00e1\u00e2\7t\2\2\u00e2<\3\2\2\2\u00e3"+
		"\u00e4\7U\2\2\u00e4\u00e5\7v\2\2\u00e5\u00e6\7t\2\2\u00e6\u00e7\7k\2\2"+
		"\u00e7\u00e8\7p\2\2\u00e8\u00e9\7i\2\2\u00e9>\3\2\2\2\u00ea\u00eb\7W\2"+
		"\2\u00eb\u00ec\7p\2\2\u00ec\u00ed\7k\2\2\u00ed\u00ee\7v\2\2\u00ee@\3\2"+
		"\2\2\u00ef\u00f0\7H\2\2\u00f0\u00f1\7n\2\2\u00f1\u00f2\7q\2\2\u00f2\u00f3"+
		"\7c\2\2\u00f3\u00f4\7v\2\2\u00f4B\3\2\2\2\u00f5\u00f6\7<\2\2\u00f6D\3"+
		"\2\2\2\u00f7\u00f8\7.\2\2\u00f8F\3\2\2\2\u00f9\u00fe\5K&\2\u00fa\u00fd"+
		"\5K&\2\u00fb\u00fd\5I%\2\u00fc\u00fa\3\2\2\2\u00fc\u00fb\3\2\2\2\u00fd"+
		"\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ffH\3\2\2\2"+
		"\u0100\u00fe\3\2\2\2\u0101\u0102\t\3\2\2\u0102J\3\2\2\2\u0103\u0104\t"+
		"\4\2\2\u0104L\3\2\2\2\u0105\u0106\7?\2\2\u0106N\3\2\2\2\u0107\u0108\7"+
		"=\2\2\u0108P\3\2\2\2\u0109\u010a\7-\2\2\u010aR\3\2\2\2\u010b\u010c\7/"+
		"\2\2\u010cT\3\2\2\2\u010d\u010e\7,\2\2\u010eV\3\2\2\2\u010f\u0110\7\61"+
		"\2\2\u0110X\3\2\2\2\u0111\u0112\7`\2\2\u0112Z\3\2\2\2\u0113\u0114\7*\2"+
		"\2\u0114\\\3\2\2\2\u0115\u0116\7+\2\2\u0116^\3\2\2\2\u0117\u0118\7\17"+
		"\2\2\u0118\u011b\7\f\2\2\u0119\u011b\t\5\2\2\u011a\u0117\3\2\2\2\u011a"+
		"\u0119\3\2\2\2\u011b`\3\2\2\2\u011c\u011d\7}\2\2\u011db\3\2\2\2\u011e"+
		"\u011f\7\177\2\2\u011fd\3\2\2\2\u0120\u0121\7(\2\2\u0121\u0122\7(\2\2"+
		"\u0122f\3\2\2\2\u0123\u0124\7~\2\2\u0124\u0125\7~\2\2\u0125h\3\2\2\2\u0126"+
		"\u012a\n\6\2\2\u0127\u0128\7^\2\2\u0128\u012a\7$\2\2\u0129\u0126\3\2\2"+
		"\2\u0129\u0127\3\2\2\2\u012aj\3\2\2\2\u012b\u012c\7)\2\2\u012c\u012d\5"+
		"m\67\2\u012d\u012e\7)\2\2\u012el\3\2\2\2\u012f\u0130\13\2\2\2\u0130n\3"+
		"\2\2\2\u0131\u0137\7$\2\2\u0132\u0133\7^\2\2\u0133\u0136\7$\2\2\u0134"+
		"\u0136\13\2\2\2\u0135\u0132\3\2\2\2\u0135\u0134\3\2\2\2\u0136\u0139\3"+
		"\2\2\2\u0137\u0138\3\2\2\2\u0137\u0135\3\2\2\2\u0138\u013a\3\2\2\2\u0139"+
		"\u0137\3\2\2\2\u013a\u013b\7$\2\2\u013bp\3\2\2\2\r\2t\u0082\u0087\u008d"+
		"\u00fc\u00fe\u011a\u0129\u0135\u0137\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}