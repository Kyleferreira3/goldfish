package edu.wit.dcsn.comp2000.listapp;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class gofish {
	public static boolean running = true;
	private static int playercount;
	private static ArrayList<Player> players = new ArrayList<Player>();
	public static int selected = 0;
	private static Deck deck = new Deck();
	private static Pile discard = new Pile();
	private static Card topcard;
	private static int index = 0;
	private static int p1, p2, p3, p4;
	private static ArrayList<Hand> hands;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		initialize();
		hands = deck.deal(playercount);
		System.out.println("Dealing hands");
		for (Hand num : hands) {//prints both hands for testing purposes
			System.out.println(num);
		}
		
		
		System.out.println();
		
		while (running) {
		//loop checks for matches in dealt hand and gets rid of cards and adds a point
			checkHands();
			for (Hand num : hands) {//prints both hands for testing purposes
				int handIndex = hands.indexOf(num);
				System.out.println(num + " Player "+ (handIndex+1)+"'s hand");
			}
			
			System.out.println("Select a card: ");
			int x = in.nextInt();
		
		/*try {
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
			if (hands.get(0).getCard(selected).compareTo(hands.get(1).getCard(i))==0) {
				hands.get(0).remove(selected);
				hands.get(1).remove(i);
				System.out.println("\nYou got a match from Player 2's hand!");
				p1++;
				printscore();
			}else {
				System.out.println("Go Fish!");
				hands.get(0).add(deck.getTop());
				System.out.println("You drew a " + deck.getTop().toString());
				deck.removeTop();
				break;
			}
		}*/
		
		}//end while
	}//end main
	
	private static void initialize() {
		Scanner in = new Scanner(System.in);
		System.out.println("Lets play go fish!");
		System.out.println("How many players? (2-4)");
		int count = in.nextInt();
		while (count < 2 || count > 4) {
			System.out.println("Error: wrong amount of players");
			System.out.println("How many players? (2-4)");
			count = in.nextInt();
		}
		playercount = count;
		
	}
	
	private static void draw() {
		
	}
	
	private static void playerTurn() {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Select a card: ");
		int x = in.nextInt();
	}
	
	private static void checkHands() {
		for (int x = 0; x < hands.size();x++) {
			for (int i = 0; i <hands.get(x).Length(); i++) {
				for (int j = 1; j < hands.get(x).Length(); j++) {
					if (i!=j) {
						if(hands.get(x).getCard(i) != null && hands.get(x).getCard(i).compareTo(hands.get(x).getCard(j))==0) {
							hands.get(x).remove(i);
							hands.get(x).remove(j-1);
							if (x == 0) {
								p1++;
							} else if(x == 1) {
								p2++;
							}else if(x == 2) {
								p3++;
							}else if (x == 3) {
								p4++;
							}
							
							System.out.println("\nPlayer " + x + " got a match!");
							System.out.println();
					}
				}
			}
		}//end for loop
		}
		/*
			for (int i = 0; i <hands.get(0).Length(); i++) {
				for (int j = 1; j < hands.get(0).Length(); j++) {
					if (i!=j) {
						if(hands.get(0).getCard(i) != null && hands.get(0).getCard(i).compareTo(hands.get(0).getCard(j))==0) {
							//System.out.println("match");
							hands.get(0).remove(i);
							hands.get(0).remove(j-1);
							p1++;
							System.out.println("\nPlayer 1 got a match!");
							//printscore();
							//System.out.println(hands.get(0)+ " Player 1's hand");
							System.out.println();
					}
				}
			}
		}//end for loop
		
		for (int i = 0; i <hands.get(1).Length(); i++) {
			for (int j = 1; j < hands.get(1).Length(); j++) {
				if (i!=j) {
					if(hands.get(1).getCard(i) != null && hands.get(1).getCard(i).compareTo(hands.get(1).getCard(j))==0) {
						hands.get(1).remove(i);
						hands.get(1).remove(j-1);
						System.out.println("\nPlayer 2 got a match!");
						p2++;
						//printscore();
						//System.out.println(hands.get(1) + " Player 2's hand");
						System.out.println();
					}
				}
			}
		}//end for loop
		*/
	}
	
	private static void printscore() {
		System.out.println("Score: Player1-"+p1+" Player2-"+p2);
	}

}
