package projects;

import java.util.Scanner;

public class Palindrom_String {
	public static void main(String[] args) {
		System.out.println("please give a word ");
		Scanner user = new Scanner(System.in);
		String word = user.next();

		char[] palindromeWord = word.toCharArray();
		String reverse = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			reverse = reverse + palindromeWord[i];

		}
		// System.out.println(reverse);
		if (reverse.equals(word)) {
			System.out.println("this is palindrome string");
		} else {
			
			System.out.println("this is not palindrome string because reverse forme is: " + reverse);
		}
		

	}
}
