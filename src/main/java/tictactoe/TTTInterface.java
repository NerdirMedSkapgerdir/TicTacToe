package tictactoe;
public class TTTInterface {	
	public static String drawBoard() {
		return "||===========||\n||   |   |   ||\n||===========||\n||   |   |   ||\n||===========||\n||   |   |   ||\n||===========||";
	}
	
	public static String welcome() {
		return "Velkomin í myllu!";
	}

	public static void main(String args[]) {
		System.out.println(welcome());
	}
}
