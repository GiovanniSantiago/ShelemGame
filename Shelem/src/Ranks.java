
public enum Ranks {
	A(10),
	ONE(0),
	TWO(0),
	THREE(0),
	FOUR(0),
	FIVE(5),
	SIX(0),
	SEVEN(0),
	EIGHT(0),
	NINE(0),
	TENTH(10),
	J(0),
	Q(0),
	K(0);
	
	
	private int value;
	
	private Ranks(int value){
		this.value = value;
	}
	
	public int getValue(){
		return this.value;
	}
	
	
	
}
