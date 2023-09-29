package PA303;

public class PracticeAssignment_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   int[] myArray = {1, 2, 3, 4, 5};

	        // Loop through the array and print values except for the middle element
	        for (int i = 0; i < myArray.length; i++) {
	            if (i != 2) { // Skip the middle element (index 2)
	                System.out.println("Element at index " + i + ": " + myArray[i]);
	            }
	        }
	    }

	}


