package tictactoe;
import java.util.Scanner;

public class TTTInterface {	

	public static String run() {
		TicTacToe mylla = new TicTacToe();
		while(!mylla.isFinished()) {
			System.out.println(mylla.drawBoard());
			System.out.println(mylla.getPlayer() + " a leik.");
			Scanner scan = new Scanner(System.in);
			while(!mylla.updateBoard(scan.nextLine())) {
				System.out.println("Ogilt inntak eða reitur nu thegar fylltur, reyndu aftur.");
				System.out.println(mylla.getPlayer() + " a leik.");
			} 
		} 
		return mylla.printResults();
	}

	public static String welcome() {
		return "Velkomin í myllu!\n";
	}

	public static String instructions() {
		String inst = new String();
		inst += "Leikmadur slaer inn tolu a bilinu 1-9 til að velja reit til að setja taknid sitt i.\n";
		inst += "||===========||\n|| 1 | 2 | 3 ||\n||===========||\n|| 4 | 5 | 6 ||\n||===========||\n|| 7 | 8 | 9 ||\n||===========||\n";
		return inst;
	}

	public static void main(String args[]) {
		System.out.println(welcome());
		String input;
		do {
			Scanner scan = new Scanner(System.in);
			input = scan.nextLine();

			if (input.equals("s")) {
				System.out.println(run());
			} else if (input.equals("d")){
				System.out.println(instructions());
			} else if (input.equals("e")){
				System.out.println("Bless.");
			} else {
				System.out.println("Ekki rettur innslattur. Reyndu aftur.\nVeldu 's' til að byrja\n      'd' fyrir leidbeiningar.\n      'e' til að haetta.");
			}
		} while (!input.equals("e"));
	}
}
