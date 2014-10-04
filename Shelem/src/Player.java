import java.util.ArrayList;


public class Player {
	private ArrayList<FrenchCard> handCards;
	private String name;
	private PlayerPosition position;
	
	public Player(PlayerPosition position, String name) {
		this.position = position;
		this.name = name;
		this.handCards = new ArrayList<FrenchCard>(12);
	}
	
	public boolean hasSuit(Suit s) {
		for(FrenchCard c : handCards) {
			if(c.suit == s)
				return true;
		}
		return false;
	}
}
