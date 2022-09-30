package projects;

public class Swap_string_without_3rd_variable {
public static void main(String[] args) {
		
		String s = "apple";
		System.out.println("value of s is:"+ s + " //before swap");
		String z = "fish";
		System.out.println("value of z is:"+ z + " //before swap");
		s = s.concat(z); //applefish
		z = s.substring(0,s.length()-z.length());
		s = s.substring(z.length());
		System.out.println("value of s is:"+ s + " //after swap");
		System.out.println("value of z is:"+ z + " //after swap");
		System.out.println();
		
		int a= 9;
		System.out.println("a before is " +a);
		int b= 1;
		System.out.println("b before is " +b);
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("a after is " +a);
		System.out.println("b after is " +b);
}	
}


