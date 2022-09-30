package projects;

public class Middle_word {

	public static void main(String[] args) {
		
		String a = "floppyggggggggggggghhhhhhhhhhhhhhhhhhhhhhhgggggggggghhhhhhh";
	    int size = a.length()-1;
	    int mid = size/2;
	   
	    System.out.println(a.substring(mid-1, mid+2));
	    
		System.out.println(a.charAt(mid));
	}

}
