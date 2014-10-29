package tictactoe;
import java.util.Scanner;

public class TTTInterface {	
	public static String drawBoard() {
		return "||===========||\n||   |   |   ||\n||===========||\n||   |   |   ||\n||===========||\n||   |   |   ||\n||===========||";
	}
	
	public static String welcome() {
		return "Velkomin í myllu!\nVeldu 's' til að byrja eða 'd' fyrir leiðbeiningar.";
	}

	public static String choices(String input) {
		if (input.equals("s")) {
			return drawBoard();
		} else if (input.equals("d")){
			// Print directions
			return "";
		} else if (input.equals("e")){
			// Print directions
			return "Bless.";
				
		} else {
			return "Ekki réttur innsláttur. Reyndu aftur.\nVeldu 's' til að byrja\n      'd' fyrir leiðbeiningar.\n      'e' til að hætta.";
		}
	}

	public static void main(String args[]) {
		System.out.println(welcome());
		String input;
		do {
			Scanner scan = new Scanner(System.in);
			input = scan.nextLine();
			System.out.println(choices(input));
		} while (!input.equals("e"));
	}
}
