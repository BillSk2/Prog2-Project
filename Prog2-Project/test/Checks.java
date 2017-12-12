import java.util.ArrayList;

public class Checks {

	//methodos pou elegxei an antikatastathikan ta shmeia stixhs me kena
	public static void checkingRemovement() {
		System.out.printf("%s\n", UserInput.Removepunctuation("Kalhspera!Ti kaneis?Kala...Esy^?@"));
		System.out.printf("%s\n", UserInput.Removepunctuation("True&&True=True!! #poly !swsta^&*(%"));
		System.out.printf("%s\n", UserInput.Removepunctuation("Kata thn gnwmh mou to fainomeno tou thermokhpioy, einai kati poy prepei na antimetopistei amesa!@#!!';!!^%$TWRA"));
	}

	//methodos pou elegxei thn methodo StringSplit(Shmeiwsh: To keimeno pou dexetai exei kena anti gia shmeia sthxhs
	public static void checkingStringSplit(){

		String splitCheck[] = SplitText.StringSplit("ola kala mexri pou mphkes esy kai apo thn wra pou se eida exw entelws trelathei");
		for (int i = 0; i < splitCheck.length; i++) {
			System.out.printf("%s\n",splitCheck[i]);
		}
		String splitCheck2[] = SplitText.StringSplit("den einai tou goustou mou kopeles san ki esena alla kati exw pathei teleutaia kai den eimai kala");
				for (int i = 0; i < splitCheck2.length; i++) {
					System.out.printf("%s\n",splitCheck2[i]);
		}

	}
	//methodos pou elegxei thn methodo arrayToList
	public static void checkingArrayToList() {
		String[] input = { "ma", "ela", "den", "mporw", "pleon", "na", "antistathw"};
		ArrayList<String> stringList = SplitText.arrayToList(input);
		for (int i = 0; i < stringList.size(); i++) {
			System.out.printf("%s\n", stringList.get(i));
		}
	}


	public static void main(String[] args) {
		Checks.checkingRemovement();
		Checks.checkingStringSplit();
		Checks.checkingArrayToList();
	}

}