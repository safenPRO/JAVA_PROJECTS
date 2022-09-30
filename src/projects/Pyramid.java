package projects;

public class Pyramid {

	public static void main(String[] args) {
		int a = 5;
		for(int i=1;i<=a;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(j+1);
			}
			System.out.println();
		}
	}

}
