// Generated from Gramatika.g4 by ANTLR 4.7
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
public class GramatikaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, COMMENT=3, WS=4, RETURN=5, NUM=6, FLOAT=7, TRUE=8, FALSE=9, 
		IF=10, ELSE=11, NOT=12, BIT_AND=13, BIT_OR=14, BIT_XOR=15, EQ=16, NE=17, 
		LT=18, GT=19, LE=20, GE=21, FOR=22, DO=23, VAR=24, DEF=25, ARROW=26, LEFT_ARROW=27, 
		TO=28, BY=29, INT_TYPE=30, BOOL_TYPE=31, CHAR_TYPE=32, STRING_TYPE=33, 
		UNIT_TYPE=34, FLOAT_TYPE=35, TYPE_ASSING=36, DELIM=37, ID=38, ASSIGN=39, 
		END_C=40, ADD=41, SUB=42, MUL=43, DIV=44, POW=45, LEFT=46, RIGHT=47, NEWLINE=48, 
		LEFT_BR=49, RIGHT_BR=50, AND=51, OR=52, CHAR=53, STRING=54;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "COMMENT", "WS", "RETURN", "NUM", "FLOAT", "TRUE", "FALSE", 
		"IF", "ELSE", "NOT", "BIT_AND", "BIT_OR", "BIT_XOR", "EQ", "NE", "LT", 
		"GT", "LE", "GE", "FOR", "DO", "VAR", "DEF", "ARROW", "LEFT_ARROW", "TO", 
		"BY", "INT_TYPE", "BOOL_TYPE", "CHAR_TYPE", "STRING_TYPE", "UNIT_TYPE", 
		"FLOAT_TYPE", "TYPE_ASSING", "DELIM", "ID", "DIGIT", "LETTER", "ASSIGN", 
		"END_C", "ADD", "SUB", "MUL", "DIV", "POW", "LEFT", "RIGHT", "NEWLINE", 
		"LEFT_BR", "RIGHT_BR", "AND", "OR", "STRING_CHAR", "CHAR", "ANY_CHAR", 
		"STRING"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'['", "']'", null, null, "'return'", null, null, "'true'", "'false'", 
		"'if'", "'else'", "'!'", "'&'", "'|'", null, "'=='", "'!='", "'<'", "'>'", 
		"'<='", "'>='", "'for'", "'do'", "'var'", "'def'", "'->'", "'<-'", "'to'", 
		"'by'", "'Int'", "'Bool'", "'Char'", "'String'", "'Unit'", "'Float'", 
		"':'", "','", null, "'='", "';'", "'+'", "'-'", "'*'", "'/'", null, "'('", 
		"')'", null, "'{'", "'}'", "'&&'", "'||'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "COMMENT", "WS", "RETURN", "NUM", "FLOAT", "TRUE", "FALSE", 
		"IF", "ELSE", "NOT", "BIT_AND", "BIT_OR", "BIT_XOR", "EQ", "NE", "LT", 
		"GT", "LE", "GE", "FOR", "DO", "VAR", "DEF", "ARROW", "LEFT_ARROW", "TO", 
		"BY", "INT_TYPE", "BOOL_TYPE", "CHAR_TYPE", "STRING_TYPE", "UNIT_TYPE", 
		"FLOAT_TYPE", "TYPE_ASSING", "DELIM", "ID", "ASSIGN", "END_C", "ADD", 
		"SUB", "MUL", "DIV", "POW", "LEFT", "RIGHT", "NEWLINE", "LEFT_BR", "RIGHT_BR", 
		"AND", "OR", "CHAR", "STRING"
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


	public GramatikaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Gramatika.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\28\u0154\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\3\2\3\2\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\7\4\u0080\n\4\f\4\16\4\u0083\13\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\5\6\5\u008b\n\5\r\5\16\5\u008c\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\7\6\7\u0099\n\7\r\7\16\7\u009a\3\b\6\b\u009e\n\b\r\b\16\b\u009f"+
		"\3\b\3\b\6\b\u00a4\n\b\r\b\16\b\u00a5\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3"+
		"!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3"+
		"&\3&\3\'\3\'\3\'\7\'\u0115\n\'\f\'\16\'\u0118\13\'\3(\3(\3)\3)\3*\3*\3"+
		"+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3"+
		"\63\5\63\u0133\n\63\3\64\3\64\3\65\3\65\3\66\3\66\3\66\3\67\3\67\3\67"+
		"\38\38\38\58\u0142\n8\39\39\39\39\3:\3:\3;\3;\3;\3;\7;\u014e\n;\f;\16"+
		";\u0151\13;\3;\3;\4\u0081\u014f\2<\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O\2Q\2S)U*W+Y"+
		",[-]._/a\60c\61e\62g\63i\64k\65m\66o\2q\67s\2u8\3\2\7\5\2\13\f\17\17\""+
		"\"\3\2\62;\4\2C\\c|\4\2\f\f\17\17\3\2$$\2\u015a\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2"+
		"]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3"+
		"\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2q\3\2\2\2\2u\3\2\2\2\3w\3\2\2\2\5y\3\2\2"+
		"\2\7{\3\2\2\2\t\u008a\3\2\2\2\13\u0090\3\2\2\2\r\u0098\3\2\2\2\17\u009d"+
		"\3\2\2\2\21\u00a7\3\2\2\2\23\u00ac\3\2\2\2\25\u00b2\3\2\2\2\27\u00b5\3"+
		"\2\2\2\31\u00ba\3\2\2\2\33\u00bc\3\2\2\2\35\u00be\3\2\2\2\37\u00c0\3\2"+
		"\2\2!\u00c2\3\2\2\2#\u00c5\3\2\2\2%\u00c8\3\2\2\2\'\u00ca\3\2\2\2)\u00cc"+
		"\3\2\2\2+\u00cf\3\2\2\2-\u00d2\3\2\2\2/\u00d6\3\2\2\2\61\u00d9\3\2\2\2"+
		"\63\u00dd\3\2\2\2\65\u00e1\3\2\2\2\67\u00e4\3\2\2\29\u00e7\3\2\2\2;\u00ea"+
		"\3\2\2\2=\u00ed\3\2\2\2?\u00f1\3\2\2\2A\u00f6\3\2\2\2C\u00fb\3\2\2\2E"+
		"\u0102\3\2\2\2G\u0107\3\2\2\2I\u010d\3\2\2\2K\u010f\3\2\2\2M\u0111\3\2"+
		"\2\2O\u0119\3\2\2\2Q\u011b\3\2\2\2S\u011d\3\2\2\2U\u011f\3\2\2\2W\u0121"+
		"\3\2\2\2Y\u0123\3\2\2\2[\u0125\3\2\2\2]\u0127\3\2\2\2_\u0129\3\2\2\2a"+
		"\u012b\3\2\2\2c\u012d\3\2\2\2e\u0132\3\2\2\2g\u0134\3\2\2\2i\u0136\3\2"+
		"\2\2k\u0138\3\2\2\2m\u013b\3\2\2\2o\u0141\3\2\2\2q\u0143\3\2\2\2s\u0147"+
		"\3\2\2\2u\u0149\3\2\2\2wx\7]\2\2x\4\3\2\2\2yz\7_\2\2z\6\3\2\2\2{|\7\61"+
		"\2\2|}\7,\2\2}\u0081\3\2\2\2~\u0080\13\2\2\2\177~\3\2\2\2\u0080\u0083"+
		"\3\2\2\2\u0081\u0082\3\2\2\2\u0081\177\3\2\2\2\u0082\u0084\3\2\2\2\u0083"+
		"\u0081\3\2\2\2\u0084\u0085\7,\2\2\u0085\u0086\7\61\2\2\u0086\u0087\3\2"+
		"\2\2\u0087\u0088\b\4\2\2\u0088\b\3\2\2\2\u0089\u008b\t\2\2\2\u008a\u0089"+
		"\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\u008e\3\2\2\2\u008e\u008f\b\5\2\2\u008f\n\3\2\2\2\u0090\u0091\7t\2\2"+
		"\u0091\u0092\7g\2\2\u0092\u0093\7v\2\2\u0093\u0094\7w\2\2\u0094\u0095"+
		"\7t\2\2\u0095\u0096\7p\2\2\u0096\f\3\2\2\2\u0097\u0099\5O(\2\u0098\u0097"+
		"\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b"+
		"\16\3\2\2\2\u009c\u009e\5O(\2\u009d\u009c\3\2\2\2\u009e\u009f\3\2\2\2"+
		"\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a3"+
		"\7\60\2\2\u00a2\u00a4\5O(\2\u00a3\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5"+
		"\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\20\3\2\2\2\u00a7\u00a8\7v\2\2"+
		"\u00a8\u00a9\7t\2\2\u00a9\u00aa\7w\2\2\u00aa\u00ab\7g\2\2\u00ab\22\3\2"+
		"\2\2\u00ac\u00ad\7h\2\2\u00ad\u00ae\7c\2\2\u00ae\u00af\7n\2\2\u00af\u00b0"+
		"\7u\2\2\u00b0\u00b1\7g\2\2\u00b1\24\3\2\2\2\u00b2\u00b3\7k\2\2\u00b3\u00b4"+
		"\7h\2\2\u00b4\26\3\2\2\2\u00b5\u00b6\7g\2\2\u00b6\u00b7\7n\2\2\u00b7\u00b8"+
		"\7u\2\2\u00b8\u00b9\7g\2\2\u00b9\30\3\2\2\2\u00ba\u00bb\7#\2\2\u00bb\32"+
		"\3\2\2\2\u00bc\u00bd\7(\2\2\u00bd\34\3\2\2\2\u00be\u00bf\7~\2\2\u00bf"+
		"\36\3\2\2\2\u00c0\u00c1\7`\2\2\u00c1 \3\2\2\2\u00c2\u00c3\7?\2\2\u00c3"+
		"\u00c4\7?\2\2\u00c4\"\3\2\2\2\u00c5\u00c6\7#\2\2\u00c6\u00c7\7?\2\2\u00c7"+
		"$\3\2\2\2\u00c8\u00c9\7>\2\2\u00c9&\3\2\2\2\u00ca\u00cb\7@\2\2\u00cb("+
		"\3\2\2\2\u00cc\u00cd\7>\2\2\u00cd\u00ce\7?\2\2\u00ce*\3\2\2\2\u00cf\u00d0"+
		"\7@\2\2\u00d0\u00d1\7?\2\2\u00d1,\3\2\2\2\u00d2\u00d3\7h\2\2\u00d3\u00d4"+
		"\7q\2\2\u00d4\u00d5\7t\2\2\u00d5.\3\2\2\2\u00d6\u00d7\7f\2\2\u00d7\u00d8"+
		"\7q\2\2\u00d8\60\3\2\2\2\u00d9\u00da\7x\2\2\u00da\u00db\7c\2\2\u00db\u00dc"+
		"\7t\2\2\u00dc\62\3\2\2\2\u00dd\u00de\7f\2\2\u00de\u00df\7g\2\2\u00df\u00e0"+
		"\7h\2\2\u00e0\64\3\2\2\2\u00e1\u00e2\7/\2\2\u00e2\u00e3\7@\2\2\u00e3\66"+
		"\3\2\2\2\u00e4\u00e5\7>\2\2\u00e5\u00e6\7/\2\2\u00e68\3\2\2\2\u00e7\u00e8"+
		"\7v\2\2\u00e8\u00e9\7q\2\2\u00e9:\3\2\2\2\u00ea\u00eb\7d\2\2\u00eb\u00ec"+
		"\7{\2\2\u00ec<\3\2\2\2\u00ed\u00ee\7K\2\2\u00ee\u00ef\7p\2\2\u00ef\u00f0"+
		"\7v\2\2\u00f0>\3\2\2\2\u00f1\u00f2\7D\2\2\u00f2\u00f3\7q\2\2\u00f3\u00f4"+
		"\7q\2\2\u00f4\u00f5\7n\2\2\u00f5@\3\2\2\2\u00f6\u00f7\7E\2\2\u00f7\u00f8"+
		"\7j\2\2\u00f8\u00f9\7c\2\2\u00f9\u00fa\7t\2\2\u00faB\3\2\2\2\u00fb\u00fc"+
		"\7U\2\2\u00fc\u00fd\7v\2\2\u00fd\u00fe\7t\2\2\u00fe\u00ff\7k\2\2\u00ff"+
		"\u0100\7p\2\2\u0100\u0101\7i\2\2\u0101D\3\2\2\2\u0102\u0103\7W\2\2\u0103"+
		"\u0104\7p\2\2\u0104\u0105\7k\2\2\u0105\u0106\7v\2\2\u0106F\3\2\2\2\u0107"+
		"\u0108\7H\2\2\u0108\u0109\7n\2\2\u0109\u010a\7q\2\2\u010a\u010b\7c\2\2"+
		"\u010b\u010c\7v\2\2\u010cH\3\2\2\2\u010d\u010e\7<\2\2\u010eJ\3\2\2\2\u010f"+
		"\u0110\7.\2\2\u0110L\3\2\2\2\u0111\u0116\5Q)\2\u0112\u0115\5Q)\2\u0113"+
		"\u0115\5O(\2\u0114\u0112\3\2\2\2\u0114\u0113\3\2\2\2\u0115\u0118\3\2\2"+
		"\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117N\3\2\2\2\u0118\u0116"+
		"\3\2\2\2\u0119\u011a\t\3\2\2\u011aP\3\2\2\2\u011b\u011c\t\4\2\2\u011c"+
		"R\3\2\2\2\u011d\u011e\7?\2\2\u011eT\3\2\2\2\u011f\u0120\7=\2\2\u0120V"+
		"\3\2\2\2\u0121\u0122\7-\2\2\u0122X\3\2\2\2\u0123\u0124\7/\2\2\u0124Z\3"+
		"\2\2\2\u0125\u0126\7,\2\2\u0126\\\3\2\2\2\u0127\u0128\7\61\2\2\u0128^"+
		"\3\2\2\2\u0129\u012a\7`\2\2\u012a`\3\2\2\2\u012b\u012c\7*\2\2\u012cb\3"+
		"\2\2\2\u012d\u012e\7+\2\2\u012ed\3\2\2\2\u012f\u0130\7\17\2\2\u0130\u0133"+
		"\7\f\2\2\u0131\u0133\t\5\2\2\u0132\u012f\3\2\2\2\u0132\u0131\3\2\2\2\u0133"+
		"f\3\2\2\2\u0134\u0135\7}\2\2\u0135h\3\2\2\2\u0136\u0137\7\177\2\2\u0137"+
		"j\3\2\2\2\u0138\u0139\7(\2\2\u0139\u013a\7(\2\2\u013al\3\2\2\2\u013b\u013c"+
		"\7~\2\2\u013c\u013d\7~\2\2\u013dn\3\2\2\2\u013e\u0142\n\6\2\2\u013f\u0140"+
		"\7^\2\2\u0140\u0142\7$\2\2\u0141\u013e\3\2\2\2\u0141\u013f\3\2\2\2\u0142"+
		"p\3\2\2\2\u0143\u0144\7)\2\2\u0144\u0145\5s:\2\u0145\u0146\7)\2\2\u0146"+
		"r\3\2\2\2\u0147\u0148\13\2\2\2\u0148t\3\2\2\2\u0149\u014f\7$\2\2\u014a"+
		"\u014b\7^\2\2\u014b\u014e\7$\2\2\u014c\u014e\13\2\2\2\u014d\u014a\3\2"+
		"\2\2\u014d\u014c\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u0150\3\2\2\2\u014f"+
		"\u014d\3\2\2\2\u0150\u0152\3\2\2\2\u0151\u014f\3\2\2\2\u0152\u0153\7$"+
		"\2\2\u0153v\3\2\2\2\16\2\u0081\u008c\u009a\u009f\u00a5\u0114\u0116\u0132"+
		"\u0141\u014d\u014f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}