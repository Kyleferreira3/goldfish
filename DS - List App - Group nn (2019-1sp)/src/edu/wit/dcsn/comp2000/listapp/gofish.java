package edu.wit.dcsn.comp2000.listapp;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class gofish {
	public static boolean running = true;
	private static ArrayList<Player> players = new ArrayList<Player>();
	public static int selected = 0;
	private static Deck deck = new Deck();
	private static Pile discard = new Pile();
	private static Card topcard;
	private static int index = 1;
	private static int p1, p2;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		players.add(new Player("p1"));
		players.add(new Player("p2"));
		System.out.println("Lets play go fish!");
		System.out.println("Dealing hands...");
		ArrayList<Hand> hands = deck.deal(players.size());
		System.out.println("Hands Dealt.");
		
		for (Hand num : hands) {//prints both hands for testing purposes
			System.out.println(num);
		}
		Player current = players.get(index);
		System.out.println();
		while (running) {
		//loop checks for matches in dealt hand and gets rid of cards and adds a point
		for (int i = 0; i <hands.get(0).Length(); i++) {
			for (int j = 1; j < hands.get(0).Length(); j++) {
				if (i!=j) {
					if(hands.get(0).getcard(i) != null && hands.get(0).getcard(i).compareTo(hands.get(0).getcard(j))==0) {
						//System.out.println("match");
						hands.get(0).remove(i);
						hands.get(0).remove(j-1);
						p1++;
						System.out.println("\nPlayer 1 got a match!");
						printscore();
						//System.out.println(hands.get(0)+ " Player 1's hand");
						System.out.println();
					}
				}
			}
		}//end for loop
		
		for (int i = 0; i <hands.get(1).Length(); i++) {
			for (int j = 1; j < hands.get(1).Length(); j++) {
				if (i!=j) {
					if(hands.get(1).getcard(i) != null && hands.get(1).getcard(i).compareTo(hands.get(1).getcard(j))==0) {
						hands.get(1).remove(i);
						hands.get(1).remove(j-1);
						System.out.println("\nPlayer 2 got a match!");
						p2++;
						printscore();
						//System.out.println(hands.get(1) + " Player 2's hand");
						System.out.println();
					}
				}
			}
		}//end for loop
		
		
		
		try {
			System.out.println("player 2 hand: "+hands.get(1));
			System.out.println("Your Hand: "+ hands.get(0)+"\nSelect index of card to check pair.");
			
			selected = in.nextInt();
			if (selected < 0 && selected >= hands.get(0).Length()) {
				break;
			}
		}catch (InputMismatchException e) {
			System.out.println("Error: WRONG INPUT\nSelect index of card to check pair.");
			selected = in.nextInt();
		}
		
		for (int i = 0; i < hands.get(1).Length(); i++) {
			if (hands.get(0).getcard(selected).compareTo(hands.get(1).getcard(i))==0) {
				hands.get(0).remove(selected);
				hands.get(1).remove(i);
				System.out.println("\nYou got a match from Player 2's hand!");
				p1++;
				printscore();
			}else {
				System.out.println("Go Fish!");
				hands.get(0).add(deck.gettop());
				System.out.println("You drew a " + deck.gettop().toString());
				deck.removetop();
				break;
			}
		}
		
		}//end while
	}//end main
	
	
	private static void printscore() {
		System.out.println("Score: Player1-"+p1+" Player2-"+p2);
	}

}
