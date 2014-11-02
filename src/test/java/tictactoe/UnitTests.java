package tictactoe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class UnitTests {
	public static void main(String args[]) {
      		org.junit.runner.JUnitCore.main("tictactoe.UnitTests");
    	}
	@Test
	public void testEmptyBoard() {
		assertEquals("||===========||||   |   |   ||\n||===========||\n||   |   |   ||\n||===========||\n||   |   |   ||\n||===========||", new TicTacToe().drawBoard());
	}

	@Test
	public void testWelcomeMessage() {
		assertEquals("Velkomin i myllu!\n", TicTacToe.welcome());
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
		assertEquals("Leikmadur 1", new TicTacToe().getPlayer());
	}

	@Test
	public void testGetPlayer2() {
		TicTacToe mylla = new TicTacToe();
		mylla.updateBoard("4");
		assertEquals("Leikmadur 2", mylla.getPlayer());
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
		mylla.updateBoard("2");
		mylla.updateBoard("9");
		mylla.updateBoard("5");
		mylla.updateBoard("1");
		mylla.updateBoard("8");
		assertEquals(true, mylla.isFinished());	
	}

		@Test
	public void testIsFinished3() {
		TicTacToe mylla = new TicTacToe();
		mylla.updateBoard("3");
		mylla.updateBoard("2");
		mylla.updateBoard("6");
		mylla.updateBoard("1");
		mylla.updateBoard("9");
		assertEquals(true, mylla.isFinished());	
	}

		@Test
	public void testIsFinished4() {
		TicTacToe mylla = new TicTacToe();
		mylla.updateBoard("3");
		mylla.updateBoard("9");
		mylla.updateBoard("5");
		mylla.updateBoard("6");
		mylla.updateBoard("7");
		assertEquals(true, mylla.isFinished());	
	}

		@Test
	public void testIsFinished5() {
		TicTacToe mylla = new TicTacToe();
		mylla.updateBoard("1");
		mylla.updateBoard("4");
		mylla.updateBoard("8");
		mylla.updateBoard("5");
		mylla.updateBoard("9");
		mylla.updateBoard("6");
		assertEquals(true, mylla.isFinished());	
	}

	@Test
	public void testIsFinished6() {
		TicTacToe mylla = new TicTacToe();
		mylla.updateBoard("1");
		mylla.updateBoard("7");
		mylla.updateBoard("2");
		mylla.updateBoard("8");
		mylla.updateBoard("6");
		mylla.updateBoard("9");
		assertEquals(true, mylla.isFinished());	
	}



	@Test
	public void testIsFinished7() {
		TicTacToe mylla = new TicTacToe();
		mylla.updateBoard("1");
		mylla.updateBoard("4");
		mylla.updateBoard("6");
		mylla.updateBoard("5");
		mylla.updateBoard("3");
		assertEquals(false, mylla.isFinished());	
	}

	@Test
	public void testPrintResultsWinning() {
		TicTacToe mylla = new TicTacToe();
		mylla.updateBoard("1");
		mylla.updateBoard("2");
		mylla.updateBoard("5");
		mylla.updateBoard("3");
		mylla.updateBoard("9");
		assertEquals(true, mylla.isFinished());
		assertEquals("||===========||\n|| X | O | O ||\n||===========||\n||   | X |   ||\n||===========||\n||   |   | X ||\n||===========||\n\nLeikmadur 1 hefur unnid!", mylla.printResults());
	}

	@Test
	public void testPrintResultsWinning2() {
		TicTacToe mylla = new TicTacToe();
		mylla.updateBoard("2");
		mylla.updateBoard("1");
		mylla.updateBoard("3");
		mylla.updateBoard("4");
		mylla.updateBoard("8");
		mylla.updateBoard("7");
		assertEquals(true, mylla.isFinished());
		assertEquals("||===========||\n|| O | X | X ||\n||===========||\n|| O |   |   ||\n||===========||\n|| O | X |   ||\n||===========||\n\nLeikmadur 2 hefur unnid!", mylla.printResults());
	}

	@Test
	public void testPrintResultsThai() {
		TicTacToe mylla = new TicTacToe();
		mylla.updateBoard("1");
		mylla.updateBoard("2");
		mylla.updateBoard("3");
		mylla.updateBoard("6");
		mylla.updateBoard("4");
		mylla.updateBoard("7");
		mylla.updateBoard("5");
		mylla.updateBoard("9");
		mylla.updateBoard("8");
		assertEquals(true, mylla.isFinished());
		assertEquals("||===========||\n|| X | O | X ||\n||===========||\n|| X | X | O ||\n||===========||\n|| O | X | O ||\n||===========||\n\nJafntefli!", mylla.printResults());
	}


}
