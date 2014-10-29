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
		if(states[inp - 1] != 'E') return false;
		char cPlayer;
		if(player == true) {
			cPlayer = 'X';
			states[inp - 1] = cPlayer;
			player = false;
		}
		else {
			cPlayer = 'O';
			states[inp - 1] = cPlayer;
			player = true;
		}
		StringBuilder newBoard = new StringBuilder(board);
		switch(inp) {
			case 1: newBoard.setCharAt(19, cPlayer);
					break;

			case 2: newBoard.setCharAt(23, cPlayer);
					break;

			case 3: newBoard.setCharAt(27, cPlayer);
					break;

			case 4: newBoard.setCharAt(51, cPlayer);
					break;

			case 5: newBoard.setCharAt(55, cPlayer);
					break;

			case 6: newBoard.setCharAt(59, cPlayer);
					break;

			case 7: newBoard.setCharAt(83, cPlayer);
					break;

			case 8: newBoard.setCharAt(87, cPlayer);
					break;

			case 9: newBoard.setCharAt(91, cPlayer);
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
