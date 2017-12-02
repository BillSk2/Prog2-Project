import java.util.Scanner;
public class UserInput {
 
	//eisagwgh ellhnikwn sth main
	
	//this method gets a String from the user
	protected static String getText(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Write a word or a text...");
		String usersinput = scanner.nextLine();
		return usersinput;
	}
	//exception gia to an tha dwsei ontws keimeno kai gia ellhnika
	
	//this method removes all punctuation and turns all the letters to lowercase
	protected static String Removepunctuation(String input) {
		String newinput = input.replaceAll("[^a-zA-Z ]", "").toLowerCase();
		return newinput;
	}
	
	//methodos gia eisagwgh tou keimenou se ena arxeio txt
	
}
