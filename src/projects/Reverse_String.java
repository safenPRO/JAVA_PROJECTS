package projects;

import java.util.Scanner;

public class Reverse_String {
	public static void main(String[] args) {

	System.out.println("give me a string please!");
	Scanner user = new Scanner(System.in);
	String ui = user.next();
	char[] StrTOChar = ui.toCharArray();
	
	String reverse = "";
	for(int i = ui.length()-1;i>=0;i--) {
	
	 reverse = reverse + StrTOChar[i];
	}
    System.out.println(reverse);
}
}
