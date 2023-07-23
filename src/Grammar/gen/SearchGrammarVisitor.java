// Generated from C:/Users/Amani Louendriz/Projects/TestingSEG3103/TypeAndSearch/src/Grammar\SearchGrammar.g4 by ANTLR 4.12.0
package Grammar.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SearchGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SearchGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SearchGrammarParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(SearchGrammarParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link SearchGrammarParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(SearchGrammarParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SearchGrammarParser#place}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlace(SearchGrammarParser.PlaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SearchGrammarParser#oneWord}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOneWord(SearchGrammarParser.OneWordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SearchGrammarParser#multiWord}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiWord(SearchGrammarParser.MultiWordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SearchGrammarParser#withStreetAddress}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithStreetAddress(SearchGrammarParser.WithStreetAddressContext ctx);
	/**
	 * Visit a parse tree produced by {@link SearchGrammarParser#cardinal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCardinal(SearchGrammarParser.CardinalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SearchGrammarParser#province}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProvince(SearchGrammarParser.ProvinceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SearchGrammarParser#checkIn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckIn(SearchGrammarParser.CheckInContext ctx);
	/**
	 * Visit a parse tree produced by {@link SearchGrammarParser#checkOut}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckOut(SearchGrammarParser.CheckOutContext ctx);
	/**
	 * Visit a parse tree produced by {@link SearchGrammarParser#nbreGuests}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNbreGuests(SearchGrammarParser.NbreGuestsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SearchGrammarParser#adult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdult(SearchGrammarParser.AdultContext ctx);
	/**
	 * Visit a parse tree produced by {@link SearchGrammarParser#children}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChildren(SearchGrammarParser.ChildrenContext ctx);
	/**
	 * Visit a parse tree produced by {@link SearchGrammarParser#infant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfant(SearchGrammarParser.InfantContext ctx);
	/**
	 * Visit a parse tree produced by {@link SearchGrammarParser#pet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPet(SearchGrammarParser.PetContext ctx);
	/**
	 * Visit a parse tree produced by {@link SearchGrammarParser#month}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMonth(SearchGrammarParser.MonthContext ctx);
}