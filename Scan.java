package prog2.lexiko;

import java.util.ArrayList;
import java.util.Set;

public class Scan {

	//methodos pou elegxei an uparxei sta lexika
	public static void scandictionary(ArrayList<String> list, ArrayList<String> dic) {
		for (int i = 0; i < list.size(); i++ ){
			String word = list.get(i);
			if (dic.contains(word)) {
			} else {
				System.out.println(word);
			}
		}
	}
}