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
 * @author 
 * @version
 *
 */
public class Card implements Comparable<Card>
	{
	private Suit suit;
	private Rank rank;
	
	
	/**
	 * Defines suit and rank of cards
	 */
	public Card(Rank rank, Suit suit)
		{
		// TODO Auto-generated constructor stub
		this.suit = suit;
		this.rank = rank;
		}	// end constructor

		public Suit getSuit() {
			return suit;
		}
		public Rank getRank() {
			return rank;
		}

		
		/* (non-Javadoc)
		 * @see java.lang.Comparable#compareTo(java.lang.Object)
		 * return 0 if ranks of cards match, dont need to compare suit
		 */
	@Override
	public int compareTo(Card card)
		{
		if (this.getRank()==card.getRank()) {
			return 0;
		}else {
			return -1;
		}
		
		}	// end compareTo()
	
	

	/* (non-Javadoc)
	 * @see java.lang.Comparable#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object card)
		{
		// TODO Auto-generated method stub
		return false ;
		
		}	// end equals()
	

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 * Display the rank + the picture of suit
	 */
	@Override
	public String toString()
		{
		
		return this.getRank().getGraphic()+ " " + this.getSuit().getDisplayName();
		
		}	// end toString()


	/**
	 * @param args
	 */
	public static void main( String[] args )
		{
		// TODO Auto-generated method stub

		}	// end main()

	}	// end class Card
