package testPackage;

import java.util.Arrays;

public class Q7 {

	public static void main(String[] args) {

		// Write a java program to find the second largest number in the array?
		// Maximum and minimum number in the array?

		int[] numbers = { 32, 61, 16, 89, 74, 25 };
		
		//1st way
		
		Arrays.sort(numbers);
		System.out.println("Smallest "+numbers[0]);
		System.out.println("Biggest "+numbers[numbers.length-1]);
		System.out.println("Second Largest "+numbers[numbers.length-2]);
		
		//2nd way
		
		System.out.println("------Second Way------");
		
		int [] numbers2 = { 32, 61, 16, 89, 74, 25 };
		
		int smallest = numbers2[0];
		int largest = numbers2[0];
		int secondLargest = numbers2[0];
		
		for (int i = 0 ;i<numbers.length; i ++){
			
			int element = numbers2[i];
			if (element>largest) {
				secondLargest = largest;
				largest = element;
				
			}else if (element>secondLargest && element!=largest) {
				secondLargest =element;//check if it is bigger than second largest number
			}
			if (element<smallest) {
				smallest = element;
			}
		}

		System.out.println("Smallest "+smallest);
		System.out.println("Largest "+largest);
		System.out.println("Second largest "+secondLargest);
	}

}
