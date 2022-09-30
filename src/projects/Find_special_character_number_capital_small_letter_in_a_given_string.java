package projects;

import java.util.Scanner;

public class Find_special_character_number_capital_small_letter_in_a_given_string {

	public static void main(String[] args) {
		System.out.println("please give a word contains defferent character");
		Scanner user = new Scanner(System.in);
		String word = user.nextLine();
		System.out.println("alright lets figure this out :");
		char character;
		for (int i = 0; i < word.length(); i++) {
			 character = word.charAt(i);
			System.out.print(character);
			if (Character.isDigit(character)) {
				System.out.println("-- is digit");
			}
			if (Character.isUpperCase(character)) {
				System.out.println("-- isUpperCase");
			}
			if (Character.isLowerCase(character)) {
				System.out.println("-- isLowerCase");
			}

			else if (!Character.isLetterOrDigit(character)) {
				System.out.println("-- Special character");
			}

		}
	}
}