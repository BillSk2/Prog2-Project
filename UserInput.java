import java.util.Scanner;
import java.util.InputMismatchException;

public class UserInput {

	//eisagwgh ellhnikwn sth main

	//this method gets a String from the user
	protected static String getText() throws InputMismatchException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Write a word or a text...");
		String correctInput;
		if (!sc.hasNextLine()) {
			throw new InputMismatchException("That's not a word or a text...Please try again");
		}
		correctInput = sc.nextLine();
		return correctInput;
	}

// Exception for input of invalid type
	public static void handleException1() {

	  Scanner scanner = new Scanner(System.in);
	  boolean continueLoop = true;
	  do {
	  	try {
	 		getText();
	 		continueLoop = false;
	 	} catch (InputMismatchException e) {
	 		System.err.println("Invalid input...Please try again");
	 		scanner.nextLine();
	 	}
     } while (continueLoop);
   }

// Assertion for greek input


	//this method removes all punctuation and turns all the letters to lowercase
	protected static String Removepunctuation(String input) {
		String newinput = input.replaceAll("[^a-zA-Z ]", "").toLowerCase();
		return newinput;
	}

	//methodos gia eisagwgh tou keimenou se ena arxeio txt

}
