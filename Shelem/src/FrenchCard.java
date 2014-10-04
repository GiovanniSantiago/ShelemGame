import java.awt.image.BufferedImage;


public class FrenchCard {
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
	
	public FrenchCard(Suit suit, Rank rank){
		this.suit = suit;
		this.rank = rank;
		setImg();
	}
	
	private void setImg(){
		image = ImageRegistry.getImage(suit.toString()+"_"+rank.toString()+".png");
	}
	
	
}
