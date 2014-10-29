package tictactoe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestInterface {
	public static void main(String args[]) {
      org.junit.runner.JUnitCore.main("tictactoe.TestInterface");
    }
	@Test
	public void testEmptyBoard() {
		assertEquals("||===========||\n||   |   |   ||\n||===========||\n||   |   |   ||\n||===========||\n||   |   |   ||\n||===========||",TTTInterface.drawBoard());
	}

	@Test
	public void testWelcomeMessage() {
		assertEquals("Velkomin í myllu!\nVeldu 's' til að byrja eða 'd' fyrir leiðbeiningar.", TTTInterface.welcome());
	}

	@Test
	public void testChoices() {
		assertEquals("||===========||\n||   |   |   ||\n||===========||\n||   |   |   ||\n||===========||\n||   |   |   ||\n||===========||", TTTInterface.choices("s"));
		assertEquals("Ekki réttur innsláttur. Reyndu aftur.\nVeldu 's' til að byrja eða 'd' fyrir leiðbeiningar.", TTTInterface.choices("e"));
		assertEquals("", TTTInterface.choices("d"));
	}
}