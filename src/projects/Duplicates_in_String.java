package projects;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Duplicates_in_String {
	public static void main(String[] args) {
		Set<Character> myset = new LinkedHashSet<Character>();
		System.out.println("please give me word");
		Scanner ui = new Scanner(System.in);
		String name = ui.nextLine();
		int LN = name.length();
		char[] CH = name.toCharArray();
		for (int i = 0; i < LN; i++) {
			for (int j = i + 1; j < LN; j++) {
				if (CH[i] != CH[j]) {
					myset.add(CH[i]);
				}
			}
		}
		System.out.println(myset);

/////////////////////////////////////////////////////////		
//		int counter = 0;
//		char[] Mychar = name.toCharArray();
//		for (char x : Mychar) {
//			for (char y : Mychar) {
//				if (x == y) {
//					counter++;
//				}
//				if (counter > 1) {
//					myset.add(x);
//					counter = 0;
//				}
//			}
//			counter = 0;
//		}
//		System.out.println(myset);
	}
}