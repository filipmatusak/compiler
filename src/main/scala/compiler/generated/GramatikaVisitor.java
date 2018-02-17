// Generated from Gramatika.g4 by ANTLR 4.7
package compiler.generated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GramatikaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GramatikaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code FunctionDefs}
	 * labeled alternative in {@link GramatikaParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefs(GramatikaParser.FunctionDefsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramatikaParser#value_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_declaration(GramatikaParser.Value_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramatikaParser#value_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_type(GramatikaParser.Value_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramatikaParser#array_sufix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_sufix(GramatikaParser.Array_sufixContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramatikaParser#func_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_declaration(GramatikaParser.Func_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramatikaParser#param_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_list(GramatikaParser.Param_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramatikaParser#param_group}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_group(GramatikaParser.Param_groupContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramatikaParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(GramatikaParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValueDeclaration}
	 * labeled alternative in {@link GramatikaParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueDeclaration(GramatikaParser.ValueDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link GramatikaParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(GramatikaParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code For}
	 * labeled alternative in {@link GramatikaParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(GramatikaParser.ForContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Return}
	 * labeled alternative in {@link GramatikaParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(GramatikaParser.ReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfStat}
	 * labeled alternative in {@link GramatikaParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStat(GramatikaParser.IfStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprStat}
	 * labeled alternative in {@link GramatikaParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStat(GramatikaParser.ExprStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramatikaParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(GramatikaParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramatikaParser#for_range_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_range_list(GramatikaParser.For_range_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramatikaParser#for_range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_range(GramatikaParser.For_rangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramatikaParser#func_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_call(GramatikaParser.Func_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramatikaParser#bool_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_literal(GramatikaParser.Bool_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramatikaParser#string_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_literal(GramatikaParser.String_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramatikaParser#char_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChar_literal(GramatikaParser.Char_literalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprSubFloat}
	 * labeled alternative in {@link GramatikaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprSubFloat(GramatikaParser.ExprSubFloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprNum}
	 * labeled alternative in {@link GramatikaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNum(GramatikaParser.ExprNumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprMult}
	 * labeled alternative in {@link GramatikaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMult(GramatikaParser.ExprMultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprString}
	 * labeled alternative in {@link GramatikaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprString(GramatikaParser.ExprStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprArrayId}
	 * labeled alternative in {@link GramatikaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprArrayId(GramatikaParser.ExprArrayIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprFloat}
	 * labeled alternative in {@link GramatikaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprFloat(GramatikaParser.ExprFloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprChar}
	 * labeled alternative in {@link GramatikaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprChar(GramatikaParser.ExprCharContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprSubParenth}
	 * labeled alternative in {@link GramatikaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprSubParenth(GramatikaParser.ExprSubParenthContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprNot}
	 * labeled alternative in {@link GramatikaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNot(GramatikaParser.ExprNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprBitOp}
	 * labeled alternative in {@link GramatikaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBitOp(GramatikaParser.ExprBitOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprCompare}
	 * labeled alternative in {@link GramatikaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprCompare(GramatikaParser.ExprCompareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprSubId}
	 * labeled alternative in {@link GramatikaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprSubId(GramatikaParser.ExprSubIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link GramatikaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAddSub(GramatikaParser.ExprAddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprAnd}
	 * labeled alternative in {@link GramatikaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAnd(GramatikaParser.ExprAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprSubNum}
	 * labeled alternative in {@link GramatikaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprSubNum(GramatikaParser.ExprSubNumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprOr}
	 * labeled alternative in {@link GramatikaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprOr(GramatikaParser.ExprOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprFunCall}
	 * labeled alternative in {@link GramatikaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprFunCall(GramatikaParser.ExprFunCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprBool}
	 * labeled alternative in {@link GramatikaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBool(GramatikaParser.ExprBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprId}
	 * labeled alternative in {@link GramatikaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprId(GramatikaParser.ExprIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprParenth}
	 * labeled alternative in {@link GramatikaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprParenth(GramatikaParser.ExprParenthContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramatikaParser#array_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_id(GramatikaParser.Array_idContext ctx);
}