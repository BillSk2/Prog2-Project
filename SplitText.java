import java.util.ArrayList;

public class SplitText {

	//methodos pou pairnei to txt arxeio kai to metatrepei se string(an to kanoume se txt san 2h epilogh)

	//SHMEIWSH: to String anti gia shmeia sth3hw exei kena

	//this method takes a String, trims it and then spit it in an array
	protected static String[] StringSplit(String input) {
		String[] splitString = input.trim().split("\\s+");
		return splitString;
	}

	//this method takes an array and makes it a collection (++++exception gia keno pinaka)
	protected static ArrayList<String> arrayToList(String[] inputarray) throws IllegalArgumentException {
		if (inputarray == null) {
			throw new NullPointerException("Can't handle an empty array");
		}
		if (inputarray.length == 0) {
			throw new IllegalArgumentException("Can't handle zero-length array");
		}
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < inputarray.length; i++) {
			list.add(inputarray[i]);
		}
		return list;
	}

}
