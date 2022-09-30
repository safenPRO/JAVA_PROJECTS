package projects;

import java.util.Arrays;

public class Largest_Number_in_an_Array {

	public static void main(String[] args) {
		int numbers[] = { -100, 24, 50, -8800000, 986758,45345,2342,234,23423,-123123 };
		int largest = numbers[0]; // start from 0
		int smallest = numbers[0]; // start from 0
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] >= largest) {
				largest = numbers[i];
			} else if (numbers[i] <= smallest) {
				smallest = numbers[i];
			}

		}
		System.out.println("given array is:" + Arrays.toString(numbers));
		System.out.println("Largest number is::" + largest);
		System.out.println("Smallest number is::" + smallest);
	}
}
