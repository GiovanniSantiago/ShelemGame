import java.util.ArrayList;


public class Player {
	ArrayList<FrenchCard> handCards;
	String name;
	PlayerPosition position;
	
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
