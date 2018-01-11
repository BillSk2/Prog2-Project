package prog2.lexiko;

import java.util.ArrayList;

public class SplitText {

	//this method takes a String, trims it and then spit it in an array
	protected static ArrayList<String> StringSplit(String input) {
		String[] splitString = input.trim().split("\\s+");
		ArrayList<String> spStr = new ArrayList<String>();
		for (int i = 0; i < splitString.length; i++) {
			spStr.add(splitString[i]);
		}
		return spStr;
	}

}