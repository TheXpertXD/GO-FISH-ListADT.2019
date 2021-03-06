/*
 * Dave Rosenberg
 * Comp 2000 - Data Structures
 * Lab: List application - card game
 * Spring, 2019
 * 
 * Usage restrictions:
 * 
 * You may use this code for exploration, experimentation, and furthering your
 * learning for this course. You may not use this code for any other
 * assignments, in my course or elsewhere, without explicit permission, in
 * advance, from myself (and the instructor of any other course).
 * 
 * Further, you may not post or otherwise share this code with anyone other than
 * current students in my sections of this course. Violation of these usage
 * restrictions will be considered a violation of the Wentworth Institute of
 * Technology Academic Honesty Policy.
 */

package edu.wit.dcsn.comp2000.listapp;

/**
 * @author Andrew Zemko
 * @version 1.3
 *Set up deal() and made instance variables
 */

public class Deck extends Pile {

	private Pile cards = new Pile();

	public Deck() {
		}	// end constructor

	
	/**
	 * Populates the deck with cards and shuffles
	 */
	public void populateDeck() {
		for (Suit suit : Suit.values()) {
		    for (Rank rank : Rank.values()) {
		      cards.add(new Card(rank,suit));
		    }
		}
		shuffle(cards.getPile());
	}

	
	/**
	 * Retrieves the cards in the deck
	 * @return pile object of cards
	 */
	public Pile getCards() {
		return cards;
	}
	
}	// end class Deck