package tictactoe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestInterface {
	public static void main(String args[]) {
      org.junit.runner.JUnitCore.main("tictactoe.TestInterface");
    }
	@Test
	public void testEmptyBoard() {
		assertEquals("||===========||\n||   |   |   ||\n||===========||\n||   |   |   ||\n||===========||\n||   |   |   ||\n||===========||", new TicTacToe().drawBoard());
	}

	@Test
	public void testWelcomeMessage() {
		assertEquals("Velkomin í myllu!\nVeldu 's' til að byrja eða 'd' fyrir leiðbeiningar.", TTTInterface.welcome());
	}

	@Test
	public void testUpdateBoard() {
		assertEquals(true, new TicTacToe().updateBoard("1"));
	}

	@Test
	public void testGetPlayer() {
		assertEquals("Leikmaður 1", new TicTacToe().getPlayer());
	}
}
