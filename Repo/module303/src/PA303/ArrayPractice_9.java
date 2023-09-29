package PA303;

import java.util.Arrays;

public class ArrayPractice_9 {

	
		public static void main(String[] args) {
	        // Create the integer array
	        int[] numbers = {4, 2, 9, 13, 1, 0};

	        // Sort the array in ascending order
	        Arrays.sort(numbers);

	        // Print the sorted array
	        System.out.print("Array in ascending order: ");
	        for (int i = 0; i < numbers.length; i++) {
	            System.out.print(numbers[i]);
	            if (i < numbers.length - 1) {
	                System.out.print(", ");
	            }
	        }

	        // Print the smallest number
	        int smallest = numbers[0];
	        System.out.println("\nThe smallest number is " + smallest);

	        // Print the largest number
	        int largest = numbers[numbers.length - 1];
	        System.out.println("The biggest number is " + largest);
	   
	


	}

}
