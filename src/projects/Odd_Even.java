package projects;
import java.util.Scanner;

public class Odd_Even {

	public static void main(String[] args) {
		System.out.println("how many try you want please?");
		Scanner user = new Scanner(System.in);
		int trynumber = user.nextInt();
		System.out.println("alright lets take :" + trynumber + " tries");
		System.out.println("please give me a number !");
		int givenNumber = user.nextInt();
		for (int i = 1; i <= trynumber; i++) {
			if (givenNumber % 2 == 1) {
				System.out.println("this is odd number");

			} else {
				System.out.println("this is even number");

			}
			if (i == trynumber) {
				break;
			}
			givenNumber = user.nextInt();
		}

		System.out.println("thank you, your tries done");
	}
}
