package projects;
import java.util.Scanner;
public class Fibonacci_series {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n=sc.nextInt();   //Declare and Initialize the number of terms
        
        int t1 = 0, t2 = 1;
        for (int i = 1; i <= n; ++i){
            System.out.print(t1 + " ");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }//0 1 1 2 3 5 8 13
    }
}


