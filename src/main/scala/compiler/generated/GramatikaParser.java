// Generated from Gramatika.g4 by ANTLR 4.7
package compiler.generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramatikaParser extends Parser {
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
	public static final int
		RULE_init = 0, RULE_value_declaration = 1, RULE_value_type = 2, RULE_array_sufix = 3, 
		RULE_func_declaration = 4, RULE_param_list = 5, RULE_param_group = 6, 
		RULE_block = 7, RULE_stat = 8, RULE_if_statement = 9, RULE_for_range_list = 10, 
		RULE_for_range = 11, RULE_func_call = 12, RULE_bool_literal = 13, RULE_string_literal = 14, 
		RULE_char_literal = 15, RULE_expr = 16, RULE_array_id = 17;
	public static final String[] ruleNames = {
		"init", "value_declaration", "value_type", "array_sufix", "func_declaration", 
		"param_list", "param_group", "block", "stat", "if_statement", "for_range_list", 
		"for_range", "func_call", "bool_literal", "string_literal", "char_literal", 
		"expr", "array_id"
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

	@Override
	public String getGrammarFileName() { return "Gramatika.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GramatikaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class InitContext extends ParserRuleContext {
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
	 
		public InitContext() { }
		public void copyFrom(InitContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FunctionDefsContext extends InitContext {
		public Func_declarationContext fs;
		public TerminalNode EOF() { return getToken(GramatikaParser.EOF, 0); }
		public List<Func_declarationContext> func_declaration() {
			return getRuleContexts(Func_declarationContext.class);
		}
		public Func_declarationContext func_declaration(int i) {
			return getRuleContext(Func_declarationContext.class,i);
		}
		public FunctionDefsContext(InitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramatikaListener ) ((GramatikaListener)listener).enterFunctionDefs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramatikaListener ) ((GramatikaListener)listener).exitFunctionDefs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramatikaVisitor ) return ((GramatikaVisitor<? extends T>)visitor).visitFunctionDefs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_init);
		int _la;
		try {
			_localctx = new FunctionDefsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DEF) {
				{
				{
				setState(36);
				((FunctionDefsContext)_localctx).fs = func_declaration();
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(42);
			match(EOF);
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

	public static class Value_declarationContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(GramatikaParser.VAR, 0); }
		public TerminalNode ID() { return getToken(GramatikaParser.ID, 0); }
		public TerminalNode TYPE_ASSING() { return getToken(GramatikaParser.TYPE_ASSING, 0); }
		public Value_typeContext value_type() {
			return getRuleContext(Value_typeContext.class,0);
		}
		public TerminalNode END_C() { return getToken(GramatikaParser.END_C, 0); }
		public TerminalNode ASSIGN() { return getToken(GramatikaParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Value_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramatikaListener ) ((GramatikaListener)listener).enterValue_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramatikaListener ) ((GramatikaListener)listener).exitValue_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramatikaVisitor ) return ((GramatikaVisitor<? extends T>)visitor).visitValue_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Value_declarationContext value_declaration() throws RecognitionException {
		Value_declarationContext _localctx = new Value_declarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_value_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(VAR);
			setState(45);
			match(ID);
			setState(46);
			match(TYPE_ASSING);
			setState(47);
			value_type();
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(48);
				match(ASSIGN);
				setState(49);
				expr(0);
				}
			}

			setState(52);
			match(END_C);
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

	public static class Value_typeContext extends ParserRuleContext {
		public Token t;
		public TerminalNode INT_TYPE() { return getToken(GramatikaParser.INT_TYPE, 0); }
		public List<Array_sufixContext> array_sufix() {
			return getRuleContexts(Array_sufixContext.class);
		}
		public Array_sufixContext array_sufix(int i) {
			return getRuleContext(Array_sufixContext.class,i);
		}
		public TerminalNode BOOL_TYPE() { return getToken(GramatikaParser.BOOL_TYPE, 0); }
		public TerminalNode CHAR_TYPE() { return getToken(GramatikaParser.CHAR_TYPE, 0); }
		public TerminalNode STRING_TYPE() { return getToken(GramatikaParser.STRING_TYPE, 0); }
		public TerminalNode FLOAT_TYPE() { return getToken(GramatikaParser.FLOAT_TYPE, 0); }
		public Value_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramatikaListener ) ((GramatikaListener)listener).enterValue_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramatikaListener ) ((GramatikaListener)listener).exitValue_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramatikaVisitor ) return ((GramatikaVisitor<? extends T>)visitor).visitValue_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Value_typeContext value_type() throws RecognitionException {
		Value_typeContext _localctx = new Value_typeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_value_type);
		int _la;
		try {
			setState(89);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				((Value_typeContext)_localctx).t = match(INT_TYPE);
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(55);
					array_sufix();
					}
					}
					setState(60);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case BOOL_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				((Value_typeContext)_localctx).t = match(BOOL_TYPE);
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(62);
					array_sufix();
					}
					}
					setState(67);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case CHAR_TYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(68);
				((Value_typeContext)_localctx).t = match(CHAR_TYPE);
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(69);
					array_sufix();
					}
					}
					setState(74);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case STRING_TYPE:
				enterOuterAlt(_localctx, 4);
				{
				setState(75);
				((Value_typeContext)_localctx).t = match(STRING_TYPE);
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(76);
					array_sufix();
					}
					}
					setState(81);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case FLOAT_TYPE:
				enterOuterAlt(_localctx, 5);
				{
				setState(82);
				((Value_typeContext)_localctx).t = match(FLOAT_TYPE);
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(83);
					array_sufix();
					}
					}
					setState(88);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class Array_sufixContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Array_sufixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_sufix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramatikaListener ) ((GramatikaListener)listener).enterArray_sufix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramatikaListener ) ((GramatikaListener)listener).exitArray_sufix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramatikaVisitor ) return ((GramatikaVisitor<? extends T>)visitor).visitArray_sufix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_sufixContext array_sufix() throws RecognitionException {
		Array_sufixContext _localctx = new Array_sufixContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_array_sufix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(T__0);
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUM) | (1L << FLOAT) | (1L << TRUE) | (1L << FALSE) | (1L << NOT) | (1L << ID) | (1L << SUB) | (1L << LEFT) | (1L << CHAR) | (1L << STRING))) != 0)) {
				{
				setState(92);
				expr(0);
				}
			}

			setState(95);
			match(T__1);
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

	public static class Func_declarationContext extends ParserRuleContext {
		public Token name;
		public Param_listContext params;
		public Value_typeContext resultType;
		public TerminalNode DEF() { return getToken(GramatikaParser.DEF, 0); }
		public TerminalNode ARROW() { return getToken(GramatikaParser.ARROW, 0); }
		public TerminalNode ASSIGN() { return getToken(GramatikaParser.ASSIGN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode ID() { return getToken(GramatikaParser.ID, 0); }
		public Value_typeContext value_type() {
			return getRuleContext(Value_typeContext.class,0);
		}
		public Param_listContext param_list() {
			return getRuleContext(Param_listContext.class,0);
		}
		public Func_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramatikaListener ) ((GramatikaListener)listener).enterFunc_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramatikaListener ) ((GramatikaListener)listener).exitFunc_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramatikaVisitor ) return ((GramatikaVisitor<? extends T>)visitor).visitFunc_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_declarationContext func_declaration() throws RecognitionException {
		Func_declarationContext _localctx = new Func_declarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_func_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(DEF);
			setState(98);
			((Func_declarationContext)_localctx).name = match(ID);
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(99);
				((Func_declarationContext)_localctx).params = param_list();
				}
			}

			setState(102);
			match(ARROW);
			setState(103);
			((Func_declarationContext)_localctx).resultType = value_type();
			setState(104);
			match(ASSIGN);
			setState(105);
			block();
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

	public static class Param_listContext extends ParserRuleContext {
		public List<Param_groupContext> param_group() {
			return getRuleContexts(Param_groupContext.class);
		}
		public Param_groupContext param_group(int i) {
			return getRuleContext(Param_groupContext.class,i);
		}
		public List<TerminalNode> DELIM() { return getTokens(GramatikaParser.DELIM); }
		public TerminalNode DELIM(int i) {
			return getToken(GramatikaParser.DELIM, i);
		}
		public Param_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramatikaListener ) ((GramatikaListener)listener).enterParam_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramatikaListener ) ((GramatikaListener)listener).exitParam_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramatikaVisitor ) return ((GramatikaVisitor<? extends T>)visitor).visitParam_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_listContext param_list() throws RecognitionException {
		Param_listContext _localctx = new Param_listContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_param_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			param_group();
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DELIM) {
				{
				{
				setState(108);
				match(DELIM);
				setState(109);
				param_group();
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Param_groupContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(GramatikaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GramatikaParser.ID, i);
		}
		public TerminalNode TYPE_ASSING() { return getToken(GramatikaParser.TYPE_ASSING, 0); }
		public Value_typeContext value_type() {
			return getRuleContext(Value_typeContext.class,0);
		}
		public List<TerminalNode> DELIM() { return getTokens(GramatikaParser.DELIM); }
		public TerminalNode DELIM(int i) {
			return getToken(GramatikaParser.DELIM, i);
		}
		public Param_groupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_group; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramatikaListener ) ((GramatikaListener)listener).enterParam_group(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramatikaListener ) ((GramatikaListener)listener).exitParam_group(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramatikaVisitor ) return ((GramatikaVisitor<? extends T>)visitor).visitParam_group(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_groupContext param_group() throws RecognitionException {
		Param_groupContext _localctx = new Param_groupContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_param_group);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(ID);
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DELIM) {
				{
				{
				setState(116);
				match(DELIM);
				setState(117);
				match(ID);
				}
				}
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(123);
			match(TYPE_ASSING);
			setState(124);
			value_type();
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LEFT_BR() { return getToken(GramatikaParser.LEFT_BR, 0); }
		public TerminalNode RIGHT_BR() { return getToken(GramatikaParser.RIGHT_BR, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramatikaListener ) ((GramatikaListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramatikaListener ) ((GramatikaListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramatikaVisitor ) return ((GramatikaVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(LEFT_BR);
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << NUM) | (1L << FLOAT) | (1L << TRUE) | (1L << FALSE) | (1L << IF) | (1L << NOT) | (1L << FOR) | (1L << VAR) | (1L << ID) | (1L << SUB) | (1L << LEFT) | (1L << CHAR) | (1L << STRING))) != 0)) {
				{
				{
				setState(127);
				stat();
				}
				}
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(133);
			match(RIGHT_BR);
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

	public static class StatContext extends ParserRuleContext {
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	 
		public StatContext() { }
		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignmentContext extends StatContext {
		public TerminalNode ASSIGN() { return getToken(GramatikaParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode END_C() { return getToken(GramatikaParser.END_C, 0); }
		public TerminalNode ID() { return getToken(GramatikaParser.ID, 0); }
		public Array_idContext array_id() {
			return getRuleContext(Array_idContext.class,0);
		}
		public AssignmentContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramatikaListener ) ((GramatikaListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramatikaListener ) ((GramatikaListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramatikaVisitor ) return ((GramatikaVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprStatContext extends StatContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode END_C() { return getToken(GramatikaParser.END_C, 0); }
		public ExprStatContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramatikaListener ) ((GramatikaListener)listener).enterExprStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramatikaListener ) ((GramatikaListener)listener).exitExprStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramatikaVisitor ) return ((GramatikaVisitor<? extends T>)visitor).visitExprStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnContext extends StatContext {
		public TerminalNode RETURN() { return getToken(GramatikaParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode END_C() { return getToken(GramatikaParser.END_C, 0); }
		public ReturnContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramatikaListener ) ((GramatikaListener)listener).enterReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramatikaListener ) ((GramatikaListener)listener).exitReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramatikaVisitor ) return ((GramatikaVisitor<? extends T>)visitor).visitReturn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValueDeclarationContext extends StatContext {
		public Value_declarationContext value_declaration() {
			return getRuleContext(Value_declarationContext.class,0);
		}
		public ValueDeclarationContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramatikaListener ) ((GramatikaListener)listener).enterValueDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramatikaListener ) ((GramatikaListener)listener).exitValueDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramatikaVisitor ) return ((GramatikaVisitor<? extends T>)visitor).visitValueDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfStatContext extends StatContext {
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public IfStatContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramatikaListener ) ((GramatikaListener)listener).enterIfStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramatikaListener ) ((GramatikaListener)listener).exitIfStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramatikaVisitor ) return ((GramatikaVisitor<? extends T>)visitor).visitIfStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForContext extends StatContext {
		public TerminalNode FOR() { return getToken(GramatikaParser.FOR, 0); }
		public TerminalNode LEFT() { return getToken(GramatikaParser.LEFT, 0); }
		public For_range_listContext for_range_list() {
			return getRuleContext(For_range_listContext.class,0);
		}
		public TerminalNode RIGHT() { return getToken(GramatikaParser.RIGHT, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramatikaListener ) ((GramatikaListener)listener).enterFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramatikaListener ) ((GramatikaListener)listener).exitFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramatikaVisitor ) return ((GramatikaVisitor<? extends T>)visitor).visitFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_stat);
		try {
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new ValueDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				value_declaration();
				}
				break;
			case 2:
				_localctx = new AssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(136);
					match(ID);
					}
					break;
				case 2:
					{
					setState(137);
					array_id();
					}
					break;
				}
				setState(140);
				match(ASSIGN);
				setState(141);
				expr(0);
				setState(142);
				match(END_C);
				}
				break;
			case 3:
				_localctx = new ForContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(144);
				match(FOR);
				setState(145);
				match(LEFT);
				setState(146);
				for_range_list();
				setState(147);
				match(RIGHT);
				setState(148);
				block();
				}
				break;
			case 4:
				_localctx = new ReturnContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(150);
				match(RETURN);
				setState(151);
				expr(0);
				setState(152);
				match(END_C);
				}
				break;
			case 5:
				_localctx = new IfStatContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(154);
				if_statement();
				}
				break;
			case 6:
				_localctx = new ExprStatContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(155);
				expr(0);
				setState(156);
				match(END_C);
				}
				break;
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

	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(GramatikaParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> ARROW() { return getTokens(GramatikaParser.ARROW); }
		public TerminalNode ARROW(int i) {
			return getToken(GramatikaParser.ARROW, i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(GramatikaParser.ELSE, 0); }
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramatikaListener ) ((GramatikaListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramatikaListener ) ((GramatikaListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramatikaVisitor ) return ((GramatikaVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(IF);
			setState(161);
			expr(0);
			setState(162);
			match(ARROW);
			setState(163);
			block();
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(164);
				match(ELSE);
				setState(165);
				match(ARROW);
				setState(166);
				block();
				}
				break;
			case 2:
				{
				setState(167);
				match(ELSE);
				setState(168);
				if_statement();
				}
				break;
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

	public static class For_range_listContext extends ParserRuleContext {
		public List<For_rangeContext> for_range() {
			return getRuleContexts(For_rangeContext.class);
		}
		public For_rangeContext for_range(int i) {
			return getRuleContext(For_rangeContext.class,i);
		}
		public List<TerminalNode> DELIM() { return getTokens(GramatikaParser.DELIM); }
		public TerminalNode DELIM(int i) {
			return getToken(GramatikaParser.DELIM, i);
		}
		public For_range_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_range_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramatikaListener ) ((GramatikaListener)listener).enterFor_range_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramatikaListener ) ((GramatikaListener)listener).exitFor_range_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramatikaVisitor ) return ((GramatikaVisitor<? extends T>)visitor).visitFor_range_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_range_listContext for_range_list() throws RecognitionException {
		For_range_listContext _localctx = new For_range_listContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_for_range_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			for_range();
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DELIM) {
				{
				{
				setState(172);
				match(DELIM);
				setState(173);
				for_range();
				}
				}
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class For_rangeContext extends ParserRuleContext {
		public ExprContext from;
		public ExprContext to;
		public ExprContext by;
		public TerminalNode ID() { return getToken(GramatikaParser.ID, 0); }
		public TerminalNode LEFT_ARROW() { return getToken(GramatikaParser.LEFT_ARROW, 0); }
		public TerminalNode TO() { return getToken(GramatikaParser.TO, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode BY() { return getToken(GramatikaParser.BY, 0); }
		public For_rangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramatikaListener ) ((GramatikaListener)listener).enterFor_range(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramatikaListener ) ((GramatikaListener)listener).exitFor_range(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramatikaVisitor ) return ((GramatikaVisitor<? extends T>)visitor).visitFor_range(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_rangeContext for_range() throws RecognitionException {
		For_rangeContext _localctx = new For_rangeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_for_range);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(ID);
			setState(180);
			match(LEFT_ARROW);
			setState(181);
			((For_rangeContext)_localctx).from = expr(0);
			setState(182);
			match(TO);
			setState(183);
			((For_rangeContext)_localctx).to = expr(0);
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BY) {
				{
				setState(184);
				match(BY);
				setState(185);
				((For_rangeContext)_localctx).by = expr(0);
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

	public static class Func_callContext extends ParserRuleContext {
		public Token name;
		public TerminalNode LEFT() { return getToken(GramatikaParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(GramatikaParser.RIGHT, 0); }
		public TerminalNode ID() { return getToken(GramatikaParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> DELIM() { return getTokens(GramatikaParser.DELIM); }
		public TerminalNode DELIM(int i) {
			return getToken(GramatikaParser.DELIM, i);
		}
		public Func_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramatikaListener ) ((GramatikaListener)listener).enterFunc_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramatikaListener ) ((GramatikaListener)listener).exitFunc_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramatikaVisitor ) return ((GramatikaVisitor<? extends T>)visitor).visitFunc_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_callContext func_call() throws RecognitionException {
		Func_callContext _localctx = new Func_callContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_func_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			((Func_callContext)_localctx).name = match(ID);
			setState(189);
			match(LEFT);
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(190);
				expr(0);
				}
				break;
			case 2:
				{
				setState(191);
				expr(0);
				setState(194); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(192);
					match(DELIM);
					setState(193);
					expr(0);
					}
					}
					setState(196); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DELIM );
				}
				break;
			}
			setState(200);
			match(RIGHT);
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

	public static class Bool_literalContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(GramatikaParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(GramatikaParser.FALSE, 0); }
		public Bool_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramatikaListener ) ((GramatikaListener)listener).enterBool_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramatikaListener ) ((GramatikaListener)listener).exitBool_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramatikaVisitor ) return ((GramatikaVisitor<? extends T>)visitor).visitBool_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_literalContext bool_literal() throws RecognitionException {
		Bool_literalContext _localctx = new Bool_literalContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_bool_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
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

	public static class String_literalContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(GramatikaParser.STRING, 0); }
		public String_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramatikaListener ) ((GramatikaListener)listener).enterString_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramatikaListener ) ((GramatikaListener)listener).exitString_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramatikaVisitor ) return ((GramatikaVisitor<? extends T>)visitor).visitString_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_literalContext string_literal() throws RecognitionException {
		String_literalContext _localctx = new String_literalContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_string_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(STRING);
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

	public static class Char_literalContext extends ParserRuleContext {
		public TerminalNode CHAR() { return getToken(GramatikaParser.CHAR, 0); }
		public Char_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_char_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramatikaListener ) ((GramatikaListener)listener).enterChar_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramatikaListener ) ((GramatikaListener)listener).exitChar_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramatikaVisitor ) return ((GramatikaVisitor<? extends T>)visitor).visitChar_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Char_literalContext char_literal() throws RecognitionException {
		Char_literalContext _localctx = new Char_literalContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_char_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(CHAR);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprSubFloatContext extends ExprContext {
		public TerminalNode SUB() { return getToken(GramatikaParser.SUB, 0); }
		public TerminalNode FLOAT() { return getToken(GramatikaParser.FLOAT, 0); }
		public ExprSubFloatContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramatikaListener ) ((GramatikaListener)listener).enterExprSubFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramatikaListener ) ((GramatikaListener)listener).exitExprSubFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramatikaVisitor ) return ((GramatikaVisitor<? extends T>)visitor).visitExprSubFloat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprNumContext extends ExprContext {
		public TerminalNode NUM() { return getToken(GramatikaParser.NUM, 0); }
		public ExprNumContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramatikaListener ) ((GramatikaListener)listener).enterExprNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramatikaListener ) ((GramatikaListener)listener).exitExprNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramatikaVisitor ) return ((GramatikaVisitor<? extends T>)visitor).visitExprNum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprMultContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MUL() { return getToken(GramatikaParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(GramatikaParser.DIV, 0); }
		public ExprMultContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramatikaListener ) ((GramatikaListener)listener).enterExprMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramatikaListener ) ((GramatikaListener)listener).exitExprMult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramatikaVisitor ) return ((GramatikaVisitor<? extends T>)visitor).visitExprMult(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprStringContext extends ExprContext {
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public ExprStringContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramatikaListener ) ((GramatikaListener)listener).enterExprString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramatikaListener ) ((GramatikaListener)listener).exitExprString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramatikaVisitor ) return ((GramatikaVisitor<? extends T>)visitor).visitExprString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprArrayIdContext extends ExprContext {
		public Array_idContext array_id() {
			return getRuleContext(Array_idContext.class,0);
		}
		public ExprArrayIdContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramatikaListener ) ((GramatikaListener)listener).enterExprArrayId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramatikaListener ) ((GramatikaListener)listener).exitExprArrayId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramatikaVisitor ) return ((GramatikaVisitor<? extends T>)visitor).visitExprArrayId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprFloatContext extends ExprContext {
		public TerminalNode FLOAT() { return getToken(GramatikaParser.FLOAT, 0); }
		public ExprFloatContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramatikaListener ) ((GramatikaListener)listener).enterExprFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramatikaListener ) ((GramatikaListener)listener).exitExprFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramatikaVisitor ) return ((GramatikaVisitor<? extends T>)visitor).visitExprFloat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprCharContext extends ExprContext {
		public Char_literalContext char_literal() {
			return getRuleContext(Char_literalContext.class,0);
		}
		public ExprCharContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramatikaListener ) ((GramatikaListener)listener).enterExprChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramatikaListener ) ((GramatikaListener)listener).exitExprChar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramatikaVisitor ) return ((GramatikaVisitor<? extends T>)visitor).visitExprChar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprSubParenthContext extends ExprContext {
		public TerminalNode SUB() { return getToken(GramatikaParser.SUB, 0); }
		public TerminalNode LEFT() { return getToken(GramatikaParser.LEFT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RIGHT() { return getToken(GramatikaParser.RIGHT, 0); }
		public ExprSubParenthContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramatikaListener ) ((GramatikaListener)listener).enterExprSubParenth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramatikaListener ) ((GramatikaListener)listener).exitExprSubParenth(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramatikaVisitor ) return ((GramatikaVisitor<? extends T>)visitor).visitExprSubParenth(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprNotContext extends ExprContext {
		public TerminalNode NOT() { return getToken(GramatikaParser.NOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprNotContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramatikaListener ) ((GramatikaListener)listener).enterExprNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramatikaListener ) ((GramatikaListener)listener).exitExprNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramatikaVisitor ) return ((GramatikaVisitor<? extends T>)visitor).visitExprNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprBitOpContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode BIT_AND() { return getToken(GramatikaParser.BIT_AND, 0); }
		public TerminalNode BIT_OR() { return getToken(GramatikaParser.BIT_OR, 0); }
		public TerminalNode BIT_XOR() { return getToken(GramatikaParser.BIT_XOR, 0); }
		public ExprBitOpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramatikaListener ) ((GramatikaListener)listener).enterExprBitOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramatikaListener ) ((GramatikaListener)listener).exitExprBitOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramatikaVisitor ) return ((GramatikaVisitor<? extends T>)visitor).visitExprBitOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprCompareContext extends ExprContext {
		public Token comp;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQ() { return getToken(GramatikaParser.EQ, 0); }
		public TerminalNode NE() { return getToken(GramatikaParser.NE, 0); }
		public TerminalNode LT() { return getToken(GramatikaParser.LT, 0); }
		public TerminalNode GT() { return getToken(GramatikaParser.GT, 0); }
		public TerminalNode LE() { return getToken(GramatikaParser.LE, 0); }
		public TerminalNode GE() { return getToken(GramatikaParser.GE, 0); }
		public ExprCompareContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramatikaListener ) ((GramatikaListener)listener).enterExprCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramatikaListener ) ((GramatikaListener)listener).exitExprCompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramatikaVisitor ) return ((GramatikaVisitor<? extends T>)visitor).visitExprCompare(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprSubIdContext extends ExprContext {
		public TerminalNode SUB() { return getToken(GramatikaParser.SUB, 0); }
		public TerminalNode ID() { return getToken(GramatikaParser.ID, 0); }
		public ExprSubIdContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramatikaListener ) ((GramatikaListener)listener).enterExprSubId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramatikaListener ) ((GramatikaListener)listener).exitExprSubId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramatikaVisitor ) return ((GramatikaVisitor<? extends T>)visitor).visitExprSubId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprAddSubContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ADD() { return getToken(GramatikaParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(GramatikaParser.SUB, 0); }
		public ExprAddSubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramatikaListener ) ((GramatikaListener)listener).enterExprAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramatikaListener ) ((GramatikaListener)listener).exitExprAddSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramatikaVisitor ) return ((GramatikaVisitor<? extends T>)visitor).visitExprAddSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprAndContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AND() { return getToken(GramatikaParser.AND, 0); }
		public ExprAndContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramatikaListener ) ((GramatikaListener)listener).enterExprAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramatikaListener ) ((GramatikaListener)listener).exitExprAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramatikaVisitor ) return ((GramatikaVisitor<? extends T>)visitor).visitExprAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprSubNumContext extends ExprContext {
		public TerminalNode SUB() { return getToken(GramatikaParser.SUB, 0); }
		public TerminalNode NUM() { return getToken(GramatikaParser.NUM, 0); }
		public ExprSubNumContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramatikaListener ) ((GramatikaListener)listener).enterExprSubNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramatikaListener ) ((GramatikaListener)listener).exitExprSubNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramatikaVisitor ) return ((GramatikaVisitor<? extends T>)visitor).visitExprSubNum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprOrContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OR() { return getToken(GramatikaParser.OR, 0); }
		public ExprOrContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramatikaListener ) ((GramatikaListener)listener).enterExprOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramatikaListener ) ((GramatikaListener)listener).exitExprOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramatikaVisitor ) return ((GramatikaVisitor<? extends T>)visitor).visitExprOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprFunCallContext extends ExprContext {
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public ExprFunCallContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramatikaListener ) ((GramatikaListener)listener).enterExprFunCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramatikaListener ) ((GramatikaListener)listener).exitExprFunCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramatikaVisitor ) return ((GramatikaVisitor<? extends T>)visitor).visitExprFunCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprBoolContext extends ExprContext {
		public Bool_literalContext bool_literal() {
			return getRuleContext(Bool_literalContext.class,0);
		}
		public ExprBoolContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramatikaListener ) ((GramatikaListener)listener).enterExprBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramatikaListener ) ((GramatikaListener)listener).exitExprBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramatikaVisitor ) return ((GramatikaVisitor<? extends T>)visitor).visitExprBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprIdContext extends ExprContext {
		public TerminalNode ID() { return getToken(GramatikaParser.ID, 0); }
		public ExprIdContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramatikaListener ) ((GramatikaListener)listener).enterExprId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramatikaListener ) ((GramatikaListener)listener).exitExprId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramatikaVisitor ) return ((GramatikaVisitor<? extends T>)visitor).visitExprId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprParenthContext extends ExprContext {
		public TerminalNode LEFT() { return getToken(GramatikaParser.LEFT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RIGHT() { return getToken(GramatikaParser.RIGHT, 0); }
		public ExprParenthContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramatikaListener ) ((GramatikaListener)listener).enterExprParenth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramatikaListener ) ((GramatikaListener)listener).exitExprParenth(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramatikaVisitor ) return ((GramatikaVisitor<? extends T>)visitor).visitExprParenth(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				_localctx = new ExprFunCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(209);
				func_call();
				}
				break;
			case 2:
				{
				_localctx = new ExprNumContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(210);
				match(NUM);
				}
				break;
			case 3:
				{
				_localctx = new ExprFloatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(211);
				match(FLOAT);
				}
				break;
			case 4:
				{
				_localctx = new ExprBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(212);
				bool_literal();
				}
				break;
			case 5:
				{
				_localctx = new ExprStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(213);
				string_literal();
				}
				break;
			case 6:
				{
				_localctx = new ExprCharContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(214);
				char_literal();
				}
				break;
			case 7:
				{
				_localctx = new ExprIdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(215);
				match(ID);
				}
				break;
			case 8:
				{
				_localctx = new ExprArrayIdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(216);
				array_id();
				}
				break;
			case 9:
				{
				_localctx = new ExprNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(217);
				match(NOT);
				setState(218);
				expr(12);
				}
				break;
			case 10:
				{
				_localctx = new ExprParenthContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(219);
				match(LEFT);
				setState(220);
				expr(0);
				setState(221);
				match(RIGHT);
				}
				break;
			case 11:
				{
				_localctx = new ExprSubParenthContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(223);
				match(SUB);
				setState(224);
				match(LEFT);
				setState(225);
				expr(0);
				setState(226);
				match(RIGHT);
				}
				break;
			case 12:
				{
				_localctx = new ExprSubNumContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(228);
				match(SUB);
				setState(229);
				match(NUM);
				}
				break;
			case 13:
				{
				_localctx = new ExprSubFloatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(230);
				match(SUB);
				setState(231);
				match(FLOAT);
				}
				break;
			case 14:
				{
				_localctx = new ExprSubIdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(232);
				match(SUB);
				setState(233);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(256);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(254);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new ExprBitOpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(236);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(237);
						((ExprBitOpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BIT_AND) | (1L << BIT_OR) | (1L << BIT_XOR))) != 0)) ) {
							((ExprBitOpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(238);
						expr(10);
						}
						break;
					case 2:
						{
						_localctx = new ExprMultContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(239);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(240);
						((ExprMultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((ExprMultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(241);
						expr(9);
						}
						break;
					case 3:
						{
						_localctx = new ExprAddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(242);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(243);
						((ExprAddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((ExprAddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(244);
						expr(8);
						}
						break;
					case 4:
						{
						_localctx = new ExprCompareContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(245);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(246);
						((ExprCompareContext)_localctx).comp = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NE) | (1L << LT) | (1L << GT) | (1L << LE) | (1L << GE))) != 0)) ) {
							((ExprCompareContext)_localctx).comp = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(247);
						expr(4);
						}
						break;
					case 5:
						{
						_localctx = new ExprAndContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(248);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(249);
						match(AND);
						setState(250);
						expr(3);
						}
						break;
					case 6:
						{
						_localctx = new ExprOrContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(251);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(252);
						match(OR);
						setState(253);
						expr(2);
						}
						break;
					}
					} 
				}
				setState(258);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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

	public static class Array_idContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GramatikaParser.ID, 0); }
		public List<Array_sufixContext> array_sufix() {
			return getRuleContexts(Array_sufixContext.class);
		}
		public Array_sufixContext array_sufix(int i) {
			return getRuleContext(Array_sufixContext.class,i);
		}
		public Array_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramatikaListener ) ((GramatikaListener)listener).enterArray_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramatikaListener ) ((GramatikaListener)listener).exitArray_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramatikaVisitor ) return ((GramatikaVisitor<? extends T>)visitor).visitArray_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_idContext array_id() throws RecognitionException {
		Array_idContext _localctx = new Array_idContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_array_id);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(ID);
			setState(263);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(260);
					array_sufix();
					}
					} 
				}
				setState(265);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 16:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\38\u010d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\7\2(\n\2\f\2\16\2+\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\5\3\65\n\3\3\3\3\3\3\4\3\4\7\4;\n\4\f\4\16\4>\13\4\3\4\3\4\7\4B\n\4\f"+
		"\4\16\4E\13\4\3\4\3\4\7\4I\n\4\f\4\16\4L\13\4\3\4\3\4\7\4P\n\4\f\4\16"+
		"\4S\13\4\3\4\3\4\7\4W\n\4\f\4\16\4Z\13\4\5\4\\\n\4\3\5\3\5\5\5`\n\5\3"+
		"\5\3\5\3\6\3\6\3\6\5\6g\n\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\7\7q\n\7\f"+
		"\7\16\7t\13\7\3\b\3\b\3\b\7\by\n\b\f\b\16\b|\13\b\3\b\3\b\3\b\3\t\3\t"+
		"\7\t\u0083\n\t\f\t\16\t\u0086\13\t\3\t\3\t\3\n\3\n\3\n\5\n\u008d\n\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\5\n\u00a1\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00ac"+
		"\n\13\3\f\3\f\3\f\7\f\u00b1\n\f\f\f\16\f\u00b4\13\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\5\r\u00bd\n\r\3\16\3\16\3\16\3\16\3\16\3\16\6\16\u00c5\n\16"+
		"\r\16\16\16\u00c6\5\16\u00c9\n\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3"+
		"\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00ed"+
		"\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\7\22\u0101\n\22\f\22\16\22\u0104\13\22\3\23"+
		"\3\23\7\23\u0108\n\23\f\23\16\23\u010b\13\23\3\23\2\3\"\24\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$\2\7\3\2\n\13\3\2\17\21\3\2-.\3\2+,\3\2"+
		"\22\27\2\u012b\2)\3\2\2\2\4.\3\2\2\2\6[\3\2\2\2\b]\3\2\2\2\nc\3\2\2\2"+
		"\fm\3\2\2\2\16u\3\2\2\2\20\u0080\3\2\2\2\22\u00a0\3\2\2\2\24\u00a2\3\2"+
		"\2\2\26\u00ad\3\2\2\2\30\u00b5\3\2\2\2\32\u00be\3\2\2\2\34\u00cc\3\2\2"+
		"\2\36\u00ce\3\2\2\2 \u00d0\3\2\2\2\"\u00ec\3\2\2\2$\u0105\3\2\2\2&(\5"+
		"\n\6\2\'&\3\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*,\3\2\2\2+)\3\2\2\2,"+
		"-\7\2\2\3-\3\3\2\2\2./\7\32\2\2/\60\7(\2\2\60\61\7&\2\2\61\64\5\6\4\2"+
		"\62\63\7)\2\2\63\65\5\"\22\2\64\62\3\2\2\2\64\65\3\2\2\2\65\66\3\2\2\2"+
		"\66\67\7*\2\2\67\5\3\2\2\28<\7 \2\29;\5\b\5\2:9\3\2\2\2;>\3\2\2\2<:\3"+
		"\2\2\2<=\3\2\2\2=\\\3\2\2\2><\3\2\2\2?C\7!\2\2@B\5\b\5\2A@\3\2\2\2BE\3"+
		"\2\2\2CA\3\2\2\2CD\3\2\2\2D\\\3\2\2\2EC\3\2\2\2FJ\7\"\2\2GI\5\b\5\2HG"+
		"\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2K\\\3\2\2\2LJ\3\2\2\2MQ\7#\2\2N"+
		"P\5\b\5\2ON\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2R\\\3\2\2\2SQ\3\2\2\2"+
		"TX\7%\2\2UW\5\b\5\2VU\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y\\\3\2\2\2"+
		"ZX\3\2\2\2[8\3\2\2\2[?\3\2\2\2[F\3\2\2\2[M\3\2\2\2[T\3\2\2\2\\\7\3\2\2"+
		"\2]_\7\3\2\2^`\5\"\22\2_^\3\2\2\2_`\3\2\2\2`a\3\2\2\2ab\7\4\2\2b\t\3\2"+
		"\2\2cd\7\33\2\2df\7(\2\2eg\5\f\7\2fe\3\2\2\2fg\3\2\2\2gh\3\2\2\2hi\7\34"+
		"\2\2ij\5\6\4\2jk\7)\2\2kl\5\20\t\2l\13\3\2\2\2mr\5\16\b\2no\7\'\2\2oq"+
		"\5\16\b\2pn\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2s\r\3\2\2\2tr\3\2\2\2"+
		"uz\7(\2\2vw\7\'\2\2wy\7(\2\2xv\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{"+
		"}\3\2\2\2|z\3\2\2\2}~\7&\2\2~\177\5\6\4\2\177\17\3\2\2\2\u0080\u0084\7"+
		"\63\2\2\u0081\u0083\5\22\n\2\u0082\u0081\3\2\2\2\u0083\u0086\3\2\2\2\u0084"+
		"\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0087\3\2\2\2\u0086\u0084\3\2"+
		"\2\2\u0087\u0088\7\64\2\2\u0088\21\3\2\2\2\u0089\u00a1\5\4\3\2\u008a\u008d"+
		"\7(\2\2\u008b\u008d\5$\23\2\u008c\u008a\3\2\2\2\u008c\u008b\3\2\2\2\u008d"+
		"\u008e\3\2\2\2\u008e\u008f\7)\2\2\u008f\u0090\5\"\22\2\u0090\u0091\7*"+
		"\2\2\u0091\u00a1\3\2\2\2\u0092\u0093\7\30\2\2\u0093\u0094\7\60\2\2\u0094"+
		"\u0095\5\26\f\2\u0095\u0096\7\61\2\2\u0096\u0097\5\20\t\2\u0097\u00a1"+
		"\3\2\2\2\u0098\u0099\7\7\2\2\u0099\u009a\5\"\22\2\u009a\u009b\7*\2\2\u009b"+
		"\u00a1\3\2\2\2\u009c\u00a1\5\24\13\2\u009d\u009e\5\"\22\2\u009e\u009f"+
		"\7*\2\2\u009f\u00a1\3\2\2\2\u00a0\u0089\3\2\2\2\u00a0\u008c\3\2\2\2\u00a0"+
		"\u0092\3\2\2\2\u00a0\u0098\3\2\2\2\u00a0\u009c\3\2\2\2\u00a0\u009d\3\2"+
		"\2\2\u00a1\23\3\2\2\2\u00a2\u00a3\7\f\2\2\u00a3\u00a4\5\"\22\2\u00a4\u00a5"+
		"\7\34\2\2\u00a5\u00ab\5\20\t\2\u00a6\u00a7\7\r\2\2\u00a7\u00a8\7\34\2"+
		"\2\u00a8\u00ac\5\20\t\2\u00a9\u00aa\7\r\2\2\u00aa\u00ac\5\24\13\2\u00ab"+
		"\u00a6\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\25\3\2\2"+
		"\2\u00ad\u00b2\5\30\r\2\u00ae\u00af\7\'\2\2\u00af\u00b1\5\30\r\2\u00b0"+
		"\u00ae\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2"+
		"\2\2\u00b3\27\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b6\7(\2\2\u00b6\u00b7"+
		"\7\35\2\2\u00b7\u00b8\5\"\22\2\u00b8\u00b9\7\36\2\2\u00b9\u00bc\5\"\22"+
		"\2\u00ba\u00bb\7\37\2\2\u00bb\u00bd\5\"\22\2\u00bc\u00ba\3\2\2\2\u00bc"+
		"\u00bd\3\2\2\2\u00bd\31\3\2\2\2\u00be\u00bf\7(\2\2\u00bf\u00c8\7\60\2"+
		"\2\u00c0\u00c9\5\"\22\2\u00c1\u00c4\5\"\22\2\u00c2\u00c3\7\'\2\2\u00c3"+
		"\u00c5\5\"\22\2\u00c4\u00c2\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c4\3"+
		"\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c9\3\2\2\2\u00c8\u00c0\3\2\2\2\u00c8"+
		"\u00c1\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\7\61"+
		"\2\2\u00cb\33\3\2\2\2\u00cc\u00cd\t\2\2\2\u00cd\35\3\2\2\2\u00ce\u00cf"+
		"\78\2\2\u00cf\37\3\2\2\2\u00d0\u00d1\7\67\2\2\u00d1!\3\2\2\2\u00d2\u00d3"+
		"\b\22\1\2\u00d3\u00ed\5\32\16\2\u00d4\u00ed\7\b\2\2\u00d5\u00ed\7\t\2"+
		"\2\u00d6\u00ed\5\34\17\2\u00d7\u00ed\5\36\20\2\u00d8\u00ed\5 \21\2\u00d9"+
		"\u00ed\7(\2\2\u00da\u00ed\5$\23\2\u00db\u00dc\7\16\2\2\u00dc\u00ed\5\""+
		"\22\16\u00dd\u00de\7\60\2\2\u00de\u00df\5\"\22\2\u00df\u00e0\7\61\2\2"+
		"\u00e0\u00ed\3\2\2\2\u00e1\u00e2\7,\2\2\u00e2\u00e3\7\60\2\2\u00e3\u00e4"+
		"\5\"\22\2\u00e4\u00e5\7\61\2\2\u00e5\u00ed\3\2\2\2\u00e6\u00e7\7,\2\2"+
		"\u00e7\u00ed\7\b\2\2\u00e8\u00e9\7,\2\2\u00e9\u00ed\7\t\2\2\u00ea\u00eb"+
		"\7,\2\2\u00eb\u00ed\7(\2\2\u00ec\u00d2\3\2\2\2\u00ec\u00d4\3\2\2\2\u00ec"+
		"\u00d5\3\2\2\2\u00ec\u00d6\3\2\2\2\u00ec\u00d7\3\2\2\2\u00ec\u00d8\3\2"+
		"\2\2\u00ec\u00d9\3\2\2\2\u00ec\u00da\3\2\2\2\u00ec\u00db\3\2\2\2\u00ec"+
		"\u00dd\3\2\2\2\u00ec\u00e1\3\2\2\2\u00ec\u00e6\3\2\2\2\u00ec\u00e8\3\2"+
		"\2\2\u00ec\u00ea\3\2\2\2\u00ed\u0102\3\2\2\2\u00ee\u00ef\f\13\2\2\u00ef"+
		"\u00f0\t\3\2\2\u00f0\u0101\5\"\22\f\u00f1\u00f2\f\n\2\2\u00f2\u00f3\t"+
		"\4\2\2\u00f3\u0101\5\"\22\13\u00f4\u00f5\f\t\2\2\u00f5\u00f6\t\5\2\2\u00f6"+
		"\u0101\5\"\22\n\u00f7\u00f8\f\5\2\2\u00f8\u00f9\t\6\2\2\u00f9\u0101\5"+
		"\"\22\6\u00fa\u00fb\f\4\2\2\u00fb\u00fc\7\65\2\2\u00fc\u0101\5\"\22\5"+
		"\u00fd\u00fe\f\3\2\2\u00fe\u00ff\7\66\2\2\u00ff\u0101\5\"\22\4\u0100\u00ee"+
		"\3\2\2\2\u0100\u00f1\3\2\2\2\u0100\u00f4\3\2\2\2\u0100\u00f7\3\2\2\2\u0100"+
		"\u00fa\3\2\2\2\u0100\u00fd\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0100\3\2"+
		"\2\2\u0102\u0103\3\2\2\2\u0103#\3\2\2\2\u0104\u0102\3\2\2\2\u0105\u0109"+
		"\7(\2\2\u0106\u0108\5\b\5\2\u0107\u0106\3\2\2\2\u0108\u010b\3\2\2\2\u0109"+
		"\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a%\3\2\2\2\u010b\u0109\3\2\2\2"+
		"\32)\64<CJQX[_frz\u0084\u008c\u00a0\u00ab\u00b2\u00bc\u00c6\u00c8\u00ec"+
		"\u0100\u0102\u0109";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}