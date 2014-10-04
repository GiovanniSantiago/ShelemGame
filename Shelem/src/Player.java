import java.util.ArrayList;


public class Player {
	private ArrayList<Card> handCards;
	private String name;
	private PlayerPosition position;
	
	public Player(PlayerPosition position, String name) {
		this.position = position;
		this.name = name;
		this.handCards = new ArrayList<Card>(12);
	}
	
	public boolean hasSuit(Suit s) {
		for(Card c : handCards) {
			if(c.suit == s)
				return true;
		}
		return false;
	}
	
	public void dealCard(Card c) {
		this.handCards.add(c);
	}
}
