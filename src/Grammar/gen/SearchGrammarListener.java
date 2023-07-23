// Generated from C:/Users/Amani Louendriz/Projects/TestingSEG3103/TypeAndSearch/src/Grammar\SearchGrammar.g4 by ANTLR 4.12.0
package Grammar.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SearchGrammarParser}.
 */
public interface SearchGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SearchGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SearchGrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SearchGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SearchGrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SearchGrammarParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(SearchGrammarParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SearchGrammarParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(SearchGrammarParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SearchGrammarParser#place}.
	 * @param ctx the parse tree
	 */
	void enterPlace(SearchGrammarParser.PlaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SearchGrammarParser#place}.
	 * @param ctx the parse tree
	 */
	void exitPlace(SearchGrammarParser.PlaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SearchGrammarParser#oneWord}.
	 * @param ctx the parse tree
	 */
	void enterOneWord(SearchGrammarParser.OneWordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SearchGrammarParser#oneWord}.
	 * @param ctx the parse tree
	 */
	void exitOneWord(SearchGrammarParser.OneWordContext ctx);
	/**
	 * Enter a parse tree produced by {@link SearchGrammarParser#multiWord}.
	 * @param ctx the parse tree
	 */
	void enterMultiWord(SearchGrammarParser.MultiWordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SearchGrammarParser#multiWord}.
	 * @param ctx the parse tree
	 */
	void exitMultiWord(SearchGrammarParser.MultiWordContext ctx);
	/**
	 * Enter a parse tree produced by {@link SearchGrammarParser#withStreetAddress}.
	 * @param ctx the parse tree
	 */
	void enterWithStreetAddress(SearchGrammarParser.WithStreetAddressContext ctx);
	/**
	 * Exit a parse tree produced by {@link SearchGrammarParser#withStreetAddress}.
	 * @param ctx the parse tree
	 */
	void exitWithStreetAddress(SearchGrammarParser.WithStreetAddressContext ctx);
	/**
	 * Enter a parse tree produced by {@link SearchGrammarParser#cardinal}.
	 * @param ctx the parse tree
	 */
	void enterCardinal(SearchGrammarParser.CardinalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SearchGrammarParser#cardinal}.
	 * @param ctx the parse tree
	 */
	void exitCardinal(SearchGrammarParser.CardinalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SearchGrammarParser#province}.
	 * @param ctx the parse tree
	 */
	void enterProvince(SearchGrammarParser.ProvinceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SearchGrammarParser#province}.
	 * @param ctx the parse tree
	 */
	void exitProvince(SearchGrammarParser.ProvinceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SearchGrammarParser#checkIn}.
	 * @param ctx the parse tree
	 */
	void enterCheckIn(SearchGrammarParser.CheckInContext ctx);
	/**
	 * Exit a parse tree produced by {@link SearchGrammarParser#checkIn}.
	 * @param ctx the parse tree
	 */
	void exitCheckIn(SearchGrammarParser.CheckInContext ctx);
	/**
	 * Enter a parse tree produced by {@link SearchGrammarParser#checkOut}.
	 * @param ctx the parse tree
	 */
	void enterCheckOut(SearchGrammarParser.CheckOutContext ctx);
	/**
	 * Exit a parse tree produced by {@link SearchGrammarParser#checkOut}.
	 * @param ctx the parse tree
	 */
	void exitCheckOut(SearchGrammarParser.CheckOutContext ctx);
	/**
	 * Enter a parse tree produced by {@link SearchGrammarParser#nbreGuests}.
	 * @param ctx the parse tree
	 */
	void enterNbreGuests(SearchGrammarParser.NbreGuestsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SearchGrammarParser#nbreGuests}.
	 * @param ctx the parse tree
	 */
	void exitNbreGuests(SearchGrammarParser.NbreGuestsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SearchGrammarParser#adult}.
	 * @param ctx the parse tree
	 */
	void enterAdult(SearchGrammarParser.AdultContext ctx);
	/**
	 * Exit a parse tree produced by {@link SearchGrammarParser#adult}.
	 * @param ctx the parse tree
	 */
	void exitAdult(SearchGrammarParser.AdultContext ctx);
	/**
	 * Enter a parse tree produced by {@link SearchGrammarParser#children}.
	 * @param ctx the parse tree
	 */
	void enterChildren(SearchGrammarParser.ChildrenContext ctx);
	/**
	 * Exit a parse tree produced by {@link SearchGrammarParser#children}.
	 * @param ctx the parse tree
	 */
	void exitChildren(SearchGrammarParser.ChildrenContext ctx);
	/**
	 * Enter a parse tree produced by {@link SearchGrammarParser#infant}.
	 * @param ctx the parse tree
	 */
	void enterInfant(SearchGrammarParser.InfantContext ctx);
	/**
	 * Exit a parse tree produced by {@link SearchGrammarParser#infant}.
	 * @param ctx the parse tree
	 */
	void exitInfant(SearchGrammarParser.InfantContext ctx);
	/**
	 * Enter a parse tree produced by {@link SearchGrammarParser#pet}.
	 * @param ctx the parse tree
	 */
	void enterPet(SearchGrammarParser.PetContext ctx);
	/**
	 * Exit a parse tree produced by {@link SearchGrammarParser#pet}.
	 * @param ctx the parse tree
	 */
	void exitPet(SearchGrammarParser.PetContext ctx);
	/**
	 * Enter a parse tree produced by {@link SearchGrammarParser#month}.
	 * @param ctx the parse tree
	 */
	void enterMonth(SearchGrammarParser.MonthContext ctx);
	/**
	 * Exit a parse tree produced by {@link SearchGrammarParser#month}.
	 * @param ctx the parse tree
	 */
	void exitMonth(SearchGrammarParser.MonthContext ctx);
}