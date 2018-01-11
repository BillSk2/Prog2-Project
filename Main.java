package prog2.lexiko;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;
import java.io.*;

public class Main {
	
	public static ArrayList<String> diccreation() {
		//Set<String> dic = new HashSet<String>();
		ArrayList<String> dic = new ArrayList<String>();
		try {

			Scanner sc = new Scanner(System.in);
			System.out.println("Type the path of the dictionary to read from : "+"\nexample C:\\Users\\Home\\Desktop\\Prog2-Project\\Prog2-Project\\Dictionary \n");
	 		String fileName = sc.nextLine() +"\\el_GRcorrect.dic";
			FileInputStream dict = new FileInputStream(fileName);
			DataInputStream in = new DataInputStream(dict);
			BufferedReader br = new BufferedReader(new InputStreamReader(in, "UTF-8"));
			String strline;
			while ((strline = br.readLine()) != null) {
				dic.add(strline);
			}
			in.close();
		} catch (FileNotFoundException e) {
			System.out.println("Dictionary not found!");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("While error");
			e.printStackTrace();
		}
		return dic;
	}


	public static void main(String[] args) throws InputMismatchException, FileNotFoundException, IOException {
		ArrayList<String> dict = new ArrayList<String>();
		dict = diccreation();
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
				String text = UserInput.getText();
				ArrayList<String> arraytext = new ArrayList<String>();
				arraytext = SplitText.StringSplit(text);
				Scan.scandictionary(arraytext, dict);
			}
			if (x == 2) {
				String[] text2 = UserInput.getFile();
				ArrayList<String> arraytext2 = new ArrayList<String>();
				for (String tex: text2){
					arraytext2.add(tex);
				}
				Scan.scandictionary(arraytext2, dict);

			}
			//menu
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