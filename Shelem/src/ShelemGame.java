import java.util.Scanner;

public class ShelemGame {
	Player[] players = new Player[4];
	Suit currentRule;
	int bid = 100;
	
	public ShelemGame() {
		PlayerPosition pos = PlayerPosition.NORTH;
		for (int i = 0; i < players.length; i++) {
			System.out.println("Enter player "+i+" name: ");
			players[i] = new Player(pos,receiveConsoleInput());
			pos = pos.getNext();
		}
	}
	
	private String receiveConsoleInput() {
		Scanner s = new Scanner(System.in);
		return s.nextLine();
	}
}
