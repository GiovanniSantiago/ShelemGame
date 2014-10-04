import java.awt.image.BufferedImage;
import java.nio.file.FileSystems;


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
		//image = ImageRegistry.getImage(suit.toString()+"_"+rank.toString()+".png");
		image = ImageRegistry.getImage("h.png");
	}
	
	@Override
	public String toString(){
		return this.rank.toString() + " of " + this.suit.toString();
	}
}
