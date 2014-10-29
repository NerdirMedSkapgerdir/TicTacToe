package tictactoe;

public class TicTacToe {	
	static char[] states = new char[9];
	static boolean player;
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
		int inp = Integer.parseInt(input);
		if(inp < 1 || inp > 9) return false;
		if(states[inp] != 'E') return false;
		char cPlayer;
		if(player == true) {
			cPlayer = 'X';
			states[inp] = cPlayer;
			player = false;
		}
		else {
			cPlayer = 'O';
			states[inp] = cPlayer;
			player = true;
		}
		StringBuilder newBoard = new StringBuilder(board);
		switch(inp) {
			case 1: newBoard.setCharAt(19, cPlayer);
					break;

			case 2: //DERK
					break;

			case 3: //DERK
					break;

			case 4: //DERK
					break;

			case 5: //DERK
					break;

			case 6: //DERK
					break;

			case 7: //DERK
					break;

			case 8: //DERK
					break;

			case 9: //DERK
					break;
		}
		board = newBoard.toString();
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
