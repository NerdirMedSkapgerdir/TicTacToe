package tictactoe;

public class TicTacToe {	
	char[] states = new char[9];
	boolean player;
	static String board;

	public TicTacToe() {
		for(int i = 0; i < 9; i++) {
			states[i] = 'E';
		}
		player = true;
		board = "||===========||\n||   |   |   ||\n||===========||\n||   |   |   ||\n||===========||\n||   |   |   ||\n||===========||";
	}

	public static String drawBoard() {
		return board;
	}

	public static boolean updateBoard(String input) {
		return true;
	}

	public static boolean isFinished() {
		return true;
	}

	public static String getPlayer() {
		return "Leikmaður 1";
	}

	public static String printResults() {
		return "";
	}
}
