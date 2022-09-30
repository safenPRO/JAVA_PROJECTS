package projects;

import java.util.Scanner;

public class Reverse_the_code_without_using_the_built_in_method {

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
		System.out.println("reverse is: "+ rev);
		


	}

}
