package projects;

import java.util.Scanner;

public class If_number_is_palindrome {

	public static void main(String[] args) {
		System.out.println("please give a number");
		Scanner user = new Scanner(System.in);
		int n = user.nextInt();
		int temp = n;
		int rev = 0;

		while (n != 0) {
			rev = rev * 10 + n % 10;
			n = n / 10;
		}
		//System.out.println("reverse number is  <" + rev + "> and your number is <" + temp + "> so:");
		if (temp == rev) {
			System.out.println("palindrome number");

		} else 
			System.out.println("not palindrome number");

		

	}
}