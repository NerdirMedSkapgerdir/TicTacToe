package tictactoe;
import java.util.Scanner;

public class TTTInterface {	
	
	public static String welcome() {
		return "Velkomin í myllu!\nVeldu 's' til að byrja\n      'd' fyrir leiðbeiningar.\n      'e' til að hætta.";
	}

	public static String run() {
		TicTacToe mylla = new TicTacToe();
		while(!mylla.isFinished()) {
			System.out.println(mylla.drawBoard());
			System.out.println(mylla.getPlayer() + " á leik.");
			Scanner scan = new Scanner(System.in);
			while(!mylla.updateBoard(scan.nextLine())) {
				System.out.println("Ógilt inntak eða reitur nú þegar fylltur, reyndu aftur.");
				System.out.println(mylla.getPlayer() + " á leik.");
			} 
		} 
		return mylla.printResults();
	}
	public static String instructions() {
		String inst = new String();
		inst += "Leikmaður velur eftirfarandi reiti með því að slá inn eina af tölunum á myndinni hér að neðan.\n";
		inst += "||===========||\n|| 1 | 2 | 3 ||\n||===========||\n|| 4 | 5 | 6 ||\n||===========||\n|| 7 | 8 | 9 ||\n||===========||\n";
		inst += "Alltaf er hægt að opna þessar leiðbeiningar með því að styðja á hnappinn 'd'.\n";
		inst += "Alltaf er hægt að loka þessu forriti með því að styðja á hnappinn 'e'.\n";

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
				System.out.println("Veldu 's' til að spila aftur\n      'e' til að hætta.");
			} else if (input.equals("d")){
				System.out.println(instructions());
			} else if (input.equals("e")){
				System.out.println("Bless.");
			} else {
				System.out.println("Ekki réttur innsláttur. Reyndu aftur.\nVeldu 's' til að byrja\n      'd' fyrir leiðbeiningar.\n      'e' til að hætta.");
			}
		} while (!input.equals("e"));
	}
}
