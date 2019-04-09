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
public class Hand extends Pile
	{
	
	private Hand hand;
	/**
	 * 
	 */
	public Hand()
		{
		// TODO Auto-generated constructor stub
		
		}	// end constructor
	
	

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		int x = 0;
		String s = "";
		while (x < this.Length()) {
			s += "[" +super.getcard(x).getrank()+"]";//+super.getcard(x).getsuit().getDisplayName()+"]";
			x++;
		}
		return s;
	}// end toString()


	/**
	 * @param args
	 */
	public static void main( String[] args )
		{
		// TODO Auto-generated method stub

		}	// end main()

	}	// end class Hand
