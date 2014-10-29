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
		TicTacToe mylla = new TicTacToe();
		mylla.updateBoard("1");
		assertEquals("||===========||\n|| X |   |   ||\n||===========||\n||   |   |   ||\n||===========||\n||   |   |   ||\n||===========||", mylla.drawBoard());
	}

	@Test
	public void testUpdateBoard2() {
		TicTacToe mylla = new TicTacToe();
		mylla.updateBoard("1");
		mylla.updateBoard("5");
		assertEquals("||===========||\n|| X |   |   ||\n||===========||\n||   | O |   ||\n||===========||\n||   |   |   ||\n||===========||", mylla.drawBoard());
	}

	@Test
	public void testUpdateBoard3() {
		TicTacToe mylla = new TicTacToe();
		mylla.updateBoard("1");
		mylla.updateBoard("5");
		mylla.updateBoard("9");
		assertEquals("||===========||\n|| X |   |   ||\n||===========||\n||   | O |   ||\n||===========||\n||   |   | X ||\n||===========||", mylla.drawBoard());
	}

	@Test
	public void testUpdateBoardFail() {
		TicTacToe mylla = new TicTacToe();
		assertEquals(false, mylla.updateBoard("10"));
	}

	@Test
	public void testUpdateBoardFail2() {
		TicTacToe mylla = new TicTacToe();
		assertEquals(false, mylla.updateBoard("hallo"));
	}

	@Test
	public void testGetPlayer1() {
		assertEquals("Leikmaður 1", new TicTacToe().getPlayer());
	}

	@Test
	public void testGetPlayer2() {
		TicTacToe mylla = new TicTacToe();
		mylla.updateBoard("4");
		assertEquals("Leikmaður 2", mylla.getPlayer());
	}

	@Test
	public void testIsFinished1() {
		TicTacToe mylla = new TicTacToe();
		mylla.updateBoard("1");
		mylla.updateBoard("4");
		mylla.updateBoard("2");
		mylla.updateBoard("5");
		mylla.updateBoard("3");
		assertEquals(true, mylla.isFinished());	
	}

	@Test
	public void testIsFinished2() {
		TicTacToe mylla = new TicTacToe();
		mylla.updateBoard("1");
		mylla.updateBoard("4");
		mylla.updateBoard("6");
		mylla.updateBoard("5");
		mylla.updateBoard("3");
		assertEquals(false, mylla.isFinished());	
	}
}
