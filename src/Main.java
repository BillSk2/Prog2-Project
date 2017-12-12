import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	//eisagvgh ellhnikwn
	//dhmiourgia 24 collection apo to txt tou lexikou + toLowercase()
	
	//TA EXCEPTIONS PAIDIAAA
	public static void main(String[] args) throws InputMismatchException, FileNotFoundException, IOException {
		int y = 2;
		do {
			System.out.printf("Press 1  to enter text from the keyboard \nPress 2 to enter txt file ");
			Scanner scanner = new Scanner(System.in);
			int x = scanner.nextInt();
			
			while(x!=1 && x!= 2) {
				System.out.printf("Wrong input\n");
				System.out.printf("Press 1  to enter text from the keyboard \nPress 2 to enter txt file ");
				x = scanner.nextInt();
			}

			if (x == 1) {
				UserInput.getText();
			}
			if (x == 2) { 
				UserInput.getFile();
			}
			//edw ginontai ta pragmata
			System.out.printf("Press 1 to exit \nPress 2 to continue");
			y = scanner.nextInt();
			while(y!=1 && y!= 2) {
				System.out.printf("Wrong input\n");
				System.out.printf("Press 1 to exit \nPress 2 to continue");
				y = scanner.nextInt();
			}
		}while(y != 1);

	}

}


