package tictactoe;

public class TicTacToe {	 
	static char[] states = new char[9];
	static boolean player;
	static String board;
	static boolean isTie;

	public TicTacToe() {
		for (int i = 0; i < 9; i++) {
			states[i] = 'E';
		}
		player = true;
		board = "||===========||\n||   |   |   ||\n||===========||\n||   |   |   ||\n||===========||\n||   |   |   ||\n||===========||";
		isTie = false;
	}

	public static String welcome() {
                return "Velkomin i myllu!\n";
        }

	public static String drawBoard() {
		return board;
	}

	public void clearBoard() {
		for (int i = 0; i < 9; i++) {
			states[i] = 'E';
		}
		player = true;
		board = "||===========||\n||   |   |   ||\n||===========||\n||   |   |   ||\n||===========||\n||   |   |   ||\n||===========||";
		isTie = false;
	}

	public static boolean updateBoard(String input) {
		int inp;
		try {  
		  inp = Integer.parseInt(input);
		}  catch (NumberFormatException nfe) {  
		  System.out.println(nfe.getMessage());
		  return false;  
		}
		if (inp < 1 || inp > 9) return false;
		if (states[inp - 1] != 'E') return false;
		char cPlayer;
		if (player == true) {
			cPlayer = 'X';
			states[inp - 1] = cPlayer;
			player = false;
		} else {
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
		for (int i = 0; i < 2; i++) {
			if (states[0] == curr) {
				
				if (states[1] == curr) {
			                if (states[5] == curr) 
					return true;
				}

				if (states[4] == curr &&
					states[8] == curr) {
					return true;
				}

				if (states[3] == curr &&
					states[6] == curr) {
						return true;
				}
			}
			if (states[1] == curr &&
				states[4] == curr &&
				states[7] == curr) {
				return true;
			}

			if (states[2] == curr) {
				if (states[5] == curr &&
					states[8] == curr) {
					return true;
				}
				if (states[4] == curr &&
					states[6] == curr) {
					return true;
				}
			}

			if (states[3] == curr &&
				states[4] == curr &&
				states[5] == curr) {
				return true;
			}

			if (states[6] == curr &&
				states[7] == curr &&
				states[8] == curr) {
				return true;
			}
			curr = 'O';
		}
		for (char state : states) {
			if (state == 'E')
				return false;
		}
		isTie = true;
		return isTie;
	}

	public static String getPlayer() {
		if (player) return "Leikmadur 1";
		else return "Leikmadur 2";
	}

	public static String printResults() {
		if (isTie) {
			return board + "\n\nJafntefli!";
		}
		if (player) player = false;
		else player = true;
		return board + "\n\n" + getPlayer() + " hefur unnid!";
	}
}
