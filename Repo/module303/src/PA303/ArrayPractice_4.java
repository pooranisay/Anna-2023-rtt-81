package PA303;

public class ArrayPractice_4 {
	
	 public static void main(String[] args) {
	        // Create an integer array with 5 elements
	        int[] myArray = {1, 2, 3, 4, 5};

	        // Print the value at the first index
	        System.out.println("Value at the first index: " + myArray[0]);

	        // Print the value at the last index using length - 1
	        System.out.println("Value at the last index: " + myArray[myArray.length - 1]);

	        // Try to access an out-of-bounds index (myArray.length)
	        try {
	            int outOfBoundsValue = myArray[myArray.length]; // This will throw an ArrayIndexOutOfBoundsException
	            System.out.println("Value at index myArray.length: " + outOfBoundsValue);
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Exception caught: " + e.getMessage());
	        }

	        // Try to assign a value to an out-of-bounds index (index 5)
	        try {
	            myArray[5] = 6; // This will throw an ArrayIndexOutOfBoundsException
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Exception caught: " + e.getMessage());
	        }
	    }

}
