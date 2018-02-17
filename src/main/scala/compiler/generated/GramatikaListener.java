// Generated from Gramatika.g4 by ANTLR 4.7
package compiler.generated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GramatikaParser}.
 */
public interface GramatikaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code FunctionDefs}
	 * labeled alternative in {@link GramatikaParser#init}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefs(GramatikaParser.FunctionDefsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionDefs}
	 * labeled alternative in {@link GramatikaParser#init}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefs(GramatikaParser.FunctionDefsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramatikaParser#value_declaration}.
	 * @param ctx the parse tree
	 */
	void enterValue_declaration(GramatikaParser.Value_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramatikaParser#value_declaration}.
	 * @param ctx the parse tree
	 */
	void exitValue_declaration(GramatikaParser.Value_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramatikaParser#value_type}.
	 * @param ctx the parse tree
	 */
	void enterValue_type(GramatikaParser.Value_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramatikaParser#value_type}.
	 * @param ctx the parse tree
	 */
	void exitValue_type(GramatikaParser.Value_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramatikaParser#array_sufix}.
	 * @param ctx the parse tree
	 */
	void enterArray_sufix(GramatikaParser.Array_sufixContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramatikaParser#array_sufix}.
	 * @param ctx the parse tree
	 */
	void exitArray_sufix(GramatikaParser.Array_sufixContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramatikaParser#func_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunc_declaration(GramatikaParser.Func_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramatikaParser#func_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunc_declaration(GramatikaParser.Func_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramatikaParser#param_list}.
	 * @param ctx the parse tree
	 */
	void enterParam_list(GramatikaParser.Param_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramatikaParser#param_list}.
	 * @param ctx the parse tree
	 */
	void exitParam_list(GramatikaParser.Param_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramatikaParser#param_group}.
	 * @param ctx the parse tree
	 */
	void enterParam_group(GramatikaParser.Param_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramatikaParser#param_group}.
	 * @param ctx the parse tree
	 */
	void exitParam_group(GramatikaParser.Param_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramatikaParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(GramatikaParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramatikaParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(GramatikaParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValueDeclaration}
	 * labeled alternative in {@link GramatikaParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterValueDeclaration(GramatikaParser.ValueDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValueDeclaration}
	 * labeled alternative in {@link GramatikaParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitValueDeclaration(GramatikaParser.ValueDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link GramatikaParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(GramatikaParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link GramatikaParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(GramatikaParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code For}
	 * labeled alternative in {@link GramatikaParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterFor(GramatikaParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by the {@code For}
	 * labeled alternative in {@link GramatikaParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitFor(GramatikaParser.ForContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Return}
	 * labeled alternative in {@link GramatikaParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterReturn(GramatikaParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Return}
	 * labeled alternative in {@link GramatikaParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitReturn(GramatikaParser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStat}
	 * labeled alternative in {@link GramatikaParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterIfStat(GramatikaParser.IfStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStat}
	 * labeled alternative in {@link GramatikaParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitIfStat(GramatikaParser.IfStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprStat}
	 * labeled alternative in {@link GramatikaParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterExprStat(GramatikaParser.ExprStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprStat}
	 * labeled alternative in {@link GramatikaParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitExprStat(GramatikaParser.ExprStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramatikaParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(GramatikaParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramatikaParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(GramatikaParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramatikaParser#for_range_list}.
	 * @param ctx the parse tree
	 */
	void enterFor_range_list(GramatikaParser.For_range_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramatikaParser#for_range_list}.
	 * @param ctx the parse tree
	 */
	void exitFor_range_list(GramatikaParser.For_range_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramatikaParser#for_range}.
	 * @param ctx the parse tree
	 */
	void enterFor_range(GramatikaParser.For_rangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramatikaParser#for_range}.
	 * @param ctx the parse tree
	 */
	void exitFor_range(GramatikaParser.For_rangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramatikaParser#func_call}.
	 * @param ctx the parse tree
	 */
	void enterFunc_call(GramatikaParser.Func_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramatikaParser#func_call}.
	 * @param ctx the parse tree
	 */
	void exitFunc_call(GramatikaParser.Func_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramatikaParser#bool_literal}.
	 * @param ctx the parse tree
	 */
	void enterBool_literal(GramatikaParser.Bool_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramatikaParser#bool_literal}.
	 * @param ctx the parse tree
	 */
	void exitBool_literal(GramatikaParser.Bool_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramatikaParser#string_literal}.
	 * @param ctx the parse tree
	 */
	void enterString_literal(GramatikaParser.String_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramatikaParser#string_literal}.
	 * @param ctx the parse tree
	 */
	void exitString_literal(GramatikaParser.String_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramatikaParser#char_literal}.
	 * @param ctx the parse tree
	 */
	void enterChar_literal(GramatikaParser.Char_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramatikaParser#char_literal}.
	 * @param ctx the parse tree
	 */
	void exitChar_literal(GramatikaParser.Char_literalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprSubFloat}
	 * labeled alternative in {@link GramatikaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprSubFloat(GramatikaParser.ExprSubFloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprSubFloat}
	 * labeled alternative in {@link GramatikaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprSubFloat(GramatikaParser.ExprSubFloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprNum}
	 * labeled alternative in {@link GramatikaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprNum(GramatikaParser.ExprNumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprNum}
	 * labeled alternative in {@link GramatikaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprNum(GramatikaParser.ExprNumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprMult}
	 * labeled alternative in {@link GramatikaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprMult(GramatikaParser.ExprMultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprMult}
	 * labeled alternative in {@link GramatikaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprMult(GramatikaParser.ExprMultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprString}
	 * labeled alternative in {@link GramatikaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprString(GramatikaParser.ExprStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprString}
	 * labeled alternative in {@link GramatikaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprString(GramatikaParser.ExprStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprArrayId}
	 * labeled alternative in {@link GramatikaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprArrayId(GramatikaParser.ExprArrayIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprArrayId}
	 * labeled alternative in {@link GramatikaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprArrayId(GramatikaParser.ExprArrayIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprFloat}
	 * labeled alternative in {@link GramatikaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprFloat(GramatikaParser.ExprFloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprFloat}
	 * labeled alternative in {@link GramatikaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprFloat(GramatikaParser.ExprFloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprChar}
	 * labeled alternative in {@link GramatikaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprChar(GramatikaParser.ExprCharContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprChar}
	 * labeled alternative in {@link GramatikaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprChar(GramatikaParser.ExprCharContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprSubParenth}
	 * labeled alternative in {@link GramatikaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprSubParenth(GramatikaParser.ExprSubParenthContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprSubParenth}
	 * labeled alternative in {@link GramatikaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprSubParenth(GramatikaParser.ExprSubParenthContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprNot}
	 * labeled alternative in {@link GramatikaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprNot(GramatikaParser.ExprNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprNot}
	 * labeled alternative in {@link GramatikaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprNot(GramatikaParser.ExprNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprBitOp}
	 * labeled alternative in {@link GramatikaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprBitOp(GramatikaParser.ExprBitOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprBitOp}
	 * labeled alternative in {@link GramatikaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprBitOp(GramatikaParser.ExprBitOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprCompare}
	 * labeled alternative in {@link GramatikaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprCompare(GramatikaParser.ExprCompareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprCompare}
	 * labeled alternative in {@link GramatikaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprCompare(GramatikaParser.ExprCompareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprSubId}
	 * labeled alternative in {@link GramatikaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprSubId(GramatikaParser.ExprSubIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprSubId}
	 * labeled alternative in {@link GramatikaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprSubId(GramatikaParser.ExprSubIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link GramatikaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprAddSub(GramatikaParser.ExprAddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link GramatikaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprAddSub(GramatikaParser.ExprAddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprAnd}
	 * labeled alternative in {@link GramatikaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprAnd(GramatikaParser.ExprAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprAnd}
	 * labeled alternative in {@link GramatikaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprAnd(GramatikaParser.ExprAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprSubNum}
	 * labeled alternative in {@link GramatikaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprSubNum(GramatikaParser.ExprSubNumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprSubNum}
	 * labeled alternative in {@link GramatikaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprSubNum(GramatikaParser.ExprSubNumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprOr}
	 * labeled alternative in {@link GramatikaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprOr(GramatikaParser.ExprOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprOr}
	 * labeled alternative in {@link GramatikaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprOr(GramatikaParser.ExprOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprFunCall}
	 * labeled alternative in {@link GramatikaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprFunCall(GramatikaParser.ExprFunCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprFunCall}
	 * labeled alternative in {@link GramatikaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprFunCall(GramatikaParser.ExprFunCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprBool}
	 * labeled alternative in {@link GramatikaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprBool(GramatikaParser.ExprBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprBool}
	 * labeled alternative in {@link GramatikaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprBool(GramatikaParser.ExprBoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprId}
	 * labeled alternative in {@link GramatikaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprId(GramatikaParser.ExprIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprId}
	 * labeled alternative in {@link GramatikaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprId(GramatikaParser.ExprIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprParenth}
	 * labeled alternative in {@link GramatikaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprParenth(GramatikaParser.ExprParenthContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprParenth}
	 * labeled alternative in {@link GramatikaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprParenth(GramatikaParser.ExprParenthContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramatikaParser#array_id}.
	 * @param ctx the parse tree
	 */
	void enterArray_id(GramatikaParser.Array_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramatikaParser#array_id}.
	 * @param ctx the parse tree
	 */
	void exitArray_id(GramatikaParser.Array_idContext ctx);
}