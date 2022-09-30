package projects;

import java.util.Random;
import java.util.Scanner;

public class Random_number {

	public static void main(String[] args) {
		Random rn = new Random();
	      
		
	      int myNumber = rn.nextInt(9 - 0 + 1) + 0;
	      System.out.println("im thinking of number between 0 and 9, guess what it is?");
		Scanner ui = new Scanner(System.in);
		int userNumber = ui.nextInt();
		for(int i=1;i<=6 ;i++) {  //i<=2 can take 3 tries 
			if(myNumber==userNumber) {
				System.out.println("you win!");
				break; 
				}
			else {
				System.out.println("you lost, try again by antering another number ");
				userNumber = ui.nextInt();
			}
		}
		}
	}
