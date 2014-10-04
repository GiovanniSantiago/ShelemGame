import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ShelemGame {
	
	public static final int PLAYER_HAND_SIZE = 12;
	
	ArrayList<Card> deck = new ArrayList<Card>(52);
	Player[] players = new Player[4];
	Suit currentRule;
	int bid = 100;
	
	public ShelemGame() {
		Random random = new Random();
		PlayerPosition pos = PlayerPosition.NORTH;
		for (int i = 0; i < players.length; i++) {
			System.out.println("Enter player "+i+" name: ");
			players[i] = new Player(pos,receiveConsoleInput());
			pos = pos.getNext();
		}
		
		/*
		 * Create deck of cards
		 */
		{
			int cardIndex = 0;
			for(Rank r: Rank.values()) {
				for(Suit s : Suit.values()) {
					deck.add(new Card(s,r));
				}
			}
		}
		
		ArrayList<Card> widow = new ArrayList<Card>(4);
		
		/*
		 * Deal cards
		 */
		{
			ArrayList<Card> undealtCards = new ArrayList<Card>(deck);
			for(int i = 0; i < players.length; i++) {
				for(int j = 0; j < PLAYER_HAND_SIZE; j++) {
					Card c = undealtCards.remove(random.nextInt(undealtCards.size()));
					players[i].dealCard(c);
				}
				
			}
			widow.addAll(undealtCards);
		}
		
		
		
	}
	
	private void printStatus() {
		ArrayList<Card> widow = new ArrayList<Card>(deck);
		for(Player p : players) {
			System.out.println("Player: "+p.getPosition());
			for(int i = 0; i < p.getCardCount(); i++) {
				System.out.println("\t"+p.getCard(i).toString());
				widow.remove(p.getCard(i));
			}
		}
		System.out.println("Widow: ");
		for(Card c : widow) {
			System.out.println("\t"+c.toString());
		}
		
	}
	
	private String receiveConsoleInput() {
		Scanner s = new Scanner(System.in);
		return s.nextLine();
	}
}
