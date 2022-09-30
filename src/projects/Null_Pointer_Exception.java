package projects;

public class Null_Pointer_Exception {
	public static Null_Pointer_Exception example() {
		return null;
	}

	String convert(String s) {
		return s.toUpperCase();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Null_Pointer_Exception NPE = Null_Pointer_Exception.example();
		System.out.println(NPE.convert("jtp"));
	}

}
