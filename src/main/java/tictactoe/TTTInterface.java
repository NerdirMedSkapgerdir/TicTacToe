package tictactoe;
public class TTTInterface {	
	public static String drawBoard() {
		return "||===========||\n||   |   |   ||\n||===========||\n||   |   |   ||\n||===========||\n||   |   |   ||\n||===========||";
	}
	public static void main(String args[]) {
		System.out.println(drawBoard());
	}
}
