import java.awt.image.BufferedImage;


public class Card {
	//---------------------------------------------
	//----------FIELD------------------------------
	//---------------------------------------------
	Suit 	suit;
	Rank 	rank;
	
	BufferedImage image;
	
	
	/*
	public FrenchCard(){
		
	}
	*/
	
	public Card(Suit suit, Rank rank){
		this.suit = suit;
		this.rank = rank;
		setImg();
	}
	
	private void setImg(){
		/*
		 * Can crop manually, or programmatically
		 */
		image = ImageRegistry.getImage(suit.toString()+"_"+rank.toString()+".png");
	}
	
	
}
