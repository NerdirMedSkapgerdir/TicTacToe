package tictactoe;

public class TicTacToe {	
	char[] states = new char[9];
	boolean player;

	public TicTacToe() {
		for(int i = 0; i < 9; i++) {
			states[i] = 'E';
		}
		player = true;
	}
}
