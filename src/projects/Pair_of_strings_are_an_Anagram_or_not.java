package projects;

import java.util.Arrays;

public class Pair_of_strings_are_an_Anagram_or_not {

	public static void main(String[] args) {
		ana("qwer   t","tr  ewq");
	    ana("qwert","tre  wqr");
		ana("qwertr","tre  wq");
	}

	 static void ana(String s1, String s2) {
        //delete extra space
		String str1 = s1.replaceAll(" ", "");
		String str2 = s2.replaceAll(" ", "");
		
		boolean status = true;
		if (str1.length() != str2.length()) {
			status = false;

		} else {

			char[] c1 = str1.toLowerCase().toCharArray();
			char[] c2 = str2.toLowerCase().toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			status = Arrays.equals(c1, c2);
		}
		if(status) {
			System.out.println(str1 + " and " + str2 +" are anagram");
		}else {
			System.out.println(str1 + " and " + str2 +" are not anagram");
		}
		

	}

}
