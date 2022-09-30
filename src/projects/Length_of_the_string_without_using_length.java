package projects;

public class Length_of_the_string_without_using_length {

	public static void main(String[] args) {

		String str = "testing";
		
		System.out.println("get length with .length :" + str.length());

		System.out.println("get length with .lastIndexOf :"+ str.lastIndexOf(""));

		int count = 0;
		for (char c : str.toCharArray()) {
			count++;
		}
		System.out.println("get length with for each loop :"+ count);
	}
}
