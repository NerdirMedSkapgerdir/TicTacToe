package tictactoe;
import java.util.Scanner;

public class TTTInterface {	
	
	public static String welcome() {
		return "Velkomin í myllu!\nVeldu 's' til að byrja eða 'd' fyrir leiðbeiningar.";
	}

	public static String run() {
		TicTacToe mylla = new TicTacToe();
		while(!mylla.isFinished()) {
			mylla.drawBoard();
			System.out.println(mylla.getPlayer() + " á leik.");
			Scanner scan = new Scanner(System.in);
			while(!mylla.updateBoard(scan.nextLine())) {
				System.out.println("Ógilt intak, renydu aftur.");
			} 
		} 
		return mylla.printResults();
	}

	public static void main(String args[]) {
		System.out.println(welcome());
		System.out.println(run());

		String input;
		do {
			Scanner scan = new Scanner(System.in);
			input = scan.nextLine();

			if (input.equals("s")) {
				System.out.println(run());
				System.out.println("Veldu 's' til að spila aftur.");
			} else if (input.equals("d")){
				// Print directions
				System.out.println("*leidbeiningar*");
			} else if (input.equals("e")){
				System.out.println("Bless.");
			} else {
				System.out.println("Ekki réttur innsláttur. Reyndu aftur.\nVeldu 's' til að byrja\n      'd' fyrir leiðbeiningar.\n      'e' til að hætta.");
			}
		} while (!input.equals("e"));
	}
}
