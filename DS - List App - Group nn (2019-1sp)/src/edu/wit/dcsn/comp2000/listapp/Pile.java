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

import java.util.Collections;
import java.util.LinkedList;
import java.util.List ;
import java.util.NoSuchElementException;

/**
 * @author 
 * @version
 *
 */
public class Pile
	{
	private LinkedList<Card> Pile = new LinkedList<Card>();
	// instantiate this using either the JCL's ArrayList or LinkedList
	
	public Card remove(int card) {
		if (card<this.Length()) {
			return Pile.remove(card);
		}else throw new IndexOutOfBoundsException("");
	}
	public Card getcard(int card) {
		if (card < Pile.size()) {
			return Pile.get(card);
		} else {
			throw new IndexOutOfBoundsException();
		}
	}
	
	public void add(Card card) {//add card to pile
		Pile.add(card);
	}
	public void addtop(Card card) {
		Pile.add(0, card);
	}
	
	public Card gettop() {//returns top card in pile
		return Pile.getFirst();
	}
	
	public Card removetop() {
		if(!Pile.isEmpty()) {
			return Pile.removeFirst();
		}else throw new NoSuchElementException();
	}
	
	
	public int Length() {
		return Pile.size();
	}
	
	/**
	 * 
	 */
	public Pile()
		{
		// TODO Auto-generated constructor stub
		}	// end constructor
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 * Shuffles the pile
	 */
	public void shuffle() {
		Collections.shuffle(Pile);// self explanatory
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	
	 *returns true or false
	 */
	public boolean isEmpty() {
		return Pile.isEmpty();
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
		{
		return Pile.toString();
		
		}	// end toString()


	/**
	 * @param args
	 */
	public static void main( String[] args )
		{
		// TODO Auto-generated method stub

		}	// end main()

	}	// end class Pile
