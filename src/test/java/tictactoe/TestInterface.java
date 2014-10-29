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
		assertEquals("Velkomin í myllu!\nVeldu 's' til að byrja\n      'd' fyrir leiðbeiningar.\n      'e' til að hætta.", TTTInterface.welcome());
	}

	@Test
	public void testInstructions() {
		assertEquals("Leikmaður velur eftirfarandi reiti með því að slá inn eina af tölunum á myndinni hér að neðan.\n||===========||\n|| 1 | 2 | 3 ||\n||===========||\n|| 4 | 5 | 6 ||\n||===========||\n|| 7 | 8 | 9 ||\n||===========||\nAlltaf er hægt að loka þessu forriti með því að styðja á hnappinn 'e'.\n", TTTInterface.instructions());
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
		assertEquals("||===========||\n|| X | O | O ||\n||===========||\n||   | X |   ||\n||===========||\n||   |   | X ||\n||===========||\nLeikmaður 1 hefur unnið!", mylla.printResults());
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
		assertEquals("||===========||\n|| O | X | X ||\n||===========||\n|| O |   |   ||\n||===========||\n|| O | X |   ||\n||===========||\nLeikmaður 2 hefur unnið!", mylla.printResults());
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
		assertEquals("||===========||\n|| X | O | X ||\n||===========||\n|| X | X | O ||\n||===========||\n|| O | X | O ||\n||===========||\nJafntefli!", mylla.printResults());
	}


}
