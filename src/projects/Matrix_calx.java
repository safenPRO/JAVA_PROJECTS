package projects;

public class Matrix_calx {

	public static void main(String[] args) {
		int N = 5;
//instead this	System.out.print(1);
//  	        System.out.print(2);
//     	    	System.out.print(3);
//doing for loop   123 viva l'algerie
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				System.out.print(i * j + "\t"); // Concatenate some spaces with tab
			}
			System.out.println(); // need break
		}

	}

}
//matrix ex : 2 directions loops(loop inside another loop)
//1 2 3  4
//2 4 6  8
//3 6 9  12
//4 8 12 16