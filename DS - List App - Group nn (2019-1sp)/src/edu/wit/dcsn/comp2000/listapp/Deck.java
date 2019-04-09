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

import java.util.ArrayList;

/**
 * @author 
 * @version 
 *
 */
public class Deck extends Pile
	{

	/**
	 * 
	 */
	public Deck()
		{
		super.add(new Card(Rank.ACE, Suit.CLUBS));
		super.add(new Card(Rank.ACE, Suit.SPADES));
		super.add(new Card(Rank.ACE, Suit.HEARTS));
		super.add(new Card(Rank.ACE, Suit.DIAMONDS));//A
		super.add(new Card(Rank.TWO, Suit.CLUBS));
		super.add(new Card(Rank.TWO, Suit.SPADES));
		super.add(new Card(Rank.TWO, Suit.HEARTS));
		super.add(new Card(Rank.TWO, Suit.DIAMONDS));//2
		super.add(new Card(Rank.THREE, Suit.CLUBS));
		super.add(new Card(Rank.THREE, Suit.SPADES));
		super.add(new Card(Rank.THREE, Suit.HEARTS));
		super.add(new Card(Rank.THREE, Suit.DIAMONDS));//3
		super.add(new Card(Rank.FOUR, Suit.CLUBS));
		super.add(new Card(Rank.FOUR, Suit.SPADES));
		super.add(new Card(Rank.FOUR, Suit.HEARTS));
		super.add(new Card(Rank.FOUR, Suit.DIAMONDS));//4
		super.add(new Card(Rank.FIVE, Suit.CLUBS));
		super.add(new Card(Rank.FIVE, Suit.SPADES));
		super.add(new Card(Rank.FIVE, Suit.HEARTS));
		super.add(new Card(Rank.FIVE, Suit.DIAMONDS));//5
		super.add(new Card(Rank.SIX, Suit.CLUBS));
		super.add(new Card(Rank.SIX, Suit.SPADES));
		super.add(new Card(Rank.SIX, Suit.HEARTS));
		super.add(new Card(Rank.SIX, Suit.DIAMONDS));//SIX
		super.add(new Card(Rank.SEVEN, Suit.CLUBS));
		super.add(new Card(Rank.SEVEN, Suit.SPADES));
		super.add(new Card(Rank.SEVEN, Suit.HEARTS));
		super.add(new Card(Rank.SEVEN, Suit.DIAMONDS));//SEVEN
		super.add(new Card(Rank.EIGHT, Suit.CLUBS));
		super.add(new Card(Rank.EIGHT, Suit.SPADES));
		super.add(new Card(Rank.EIGHT, Suit.HEARTS));
		super.add(new Card(Rank.EIGHT, Suit.DIAMONDS));//EIGHT
		super.add(new Card(Rank.NINE, Suit.CLUBS));
		super.add(new Card(Rank.NINE, Suit.SPADES));
		super.add(new Card(Rank.NINE, Suit.HEARTS));
		super.add(new Card(Rank.NINE, Suit.DIAMONDS));//NINE
		super.add(new Card(Rank.TEN, Suit.CLUBS));
		super.add(new Card(Rank.TEN, Suit.SPADES));
		super.add(new Card(Rank.TEN, Suit.HEARTS));
		super.add(new Card(Rank.TEN, Suit.DIAMONDS));//Ten
		super.add(new Card(Rank.JACK, Suit.CLUBS));
		super.add(new Card(Rank.JACK, Suit.SPADES));
		super.add(new Card(Rank.JACK, Suit.HEARTS));
		super.add(new Card(Rank.JACK, Suit.DIAMONDS));//JACK
		super.add(new Card(Rank.QUEEN, Suit.CLUBS));
		super.add(new Card(Rank.QUEEN, Suit.SPADES));
		super.add(new Card(Rank.QUEEN, Suit.HEARTS));
		super.add(new Card(Rank.QUEEN, Suit.DIAMONDS));//QUEEN
		super.add(new Card(Rank.KING, Suit.CLUBS));
		super.add(new Card(Rank.KING, Suit.SPADES));
		super.add(new Card(Rank.KING, Suit.HEARTS));
		super.add(new Card(Rank.KING, Suit.DIAMONDS));//King
		
		}	// end constructor
	public ArrayList<Hand> deal(int players){
		ArrayList<Hand> hands = new ArrayList<Hand>();
		super.shuffle();
		System.out.println(super.toString());
		for(int i = 0; i < players; i++)		//makes a hand and adds the cards to it
		{
			Hand hand = new Hand();
			for(int j = 0; j < 7; j++)		//adds seven cards to the hand
			{
				hand.add(super.removetop());
			}
			hands.add(hand);
		}
		return hands;
	}

	/**
	 * @param args
	 */
	public static void main( String[] args )
		{
		// TODO Auto-generated method stub

		}	// end main()

	}	// end class Deck
