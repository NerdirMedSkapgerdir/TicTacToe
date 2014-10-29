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
		char curr = 'X';
		for(int i = 0; i < 2; i++) {
			if(states[0] == curr) {
				if(states[1] == curr) {
					if(states[2] == curr)
						return true;
				}
				if(states[4] == curr) {
					if(states[8] == curr)
						return true;
				}
				if(states[3] == curr) {
					if(states[6] == curr)
						return true;
				}
			}
			if(states[1] == curr) {
				if(states[4] == curr) {
					if(states[7] == curr)
						return true;
				}
			}
			if(states[2] == curr) {
				if(states[5] == curr) {
					if(states[8] == curr)
						return true;
				}
				if(states[4] == curr) {
					if(states[6] == curr)
						return true;
				}
			}
			if(states[3] == curr) {
				if(states[4] == curr) {
					if(states[5] == curr)
						return true;
				}
			}
			if(states[6] == curr) {
				if(states[7] == curr) {
					if(states[8] == curr)
						return true;
				}
			}
			curr = 'O';
		}
		return false;
	}

	public static String getPlayer() {
		if(player) return "Leikmaður 1";
		else return "Leikmaður 2";
	}

	public static String printResults() {
		return "";
	}
}
