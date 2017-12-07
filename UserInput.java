import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;

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
	protected static String[] getFile() throws InputMismatchException,FileNotFoundException {
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Write the name of the file");
		if (!sc2.hasNextLine()) {
					throw new InputMismatchException("That's not a file name");
		}
		String correctInput2 = sc2.nextLine();
		BufferedReader reader = new BufferedReader(new FileReader(new File(correctInput2)));
		String inputLine = null;

		while((inputLine = reader.readLine()) != null) {

			String[] words = inputLine.split("\\s+");

			 // Ignore empty lines.
			if(inputLine.equals(""))
				continue;

			for(String word: words) {

				word = word.replace(".", "");
				word = word.replace(",", "");

			}

				//μεθοδος που ψαχνει στο  λεξικο
		}
			reader.close();

		return //πινακα string με τις λαθος λεξεις//


	}
}
