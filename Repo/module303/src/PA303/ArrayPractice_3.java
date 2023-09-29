package PA303;
import java.util.*;
public class ArrayPractice_3 {
	
	public static void main(String[] args) {
        // Create an array of String type and initialize it
        String[] originalArray = {"red", "green", "blue", "yellow"};

        // Print the original array length
        System.out.println("Original array length: " + originalArray.length);

        // Make a copy of the original array using clone()
        String[] copiedArray = originalArray.clone();
        
        // Display Original and Copied array
        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("Copied Array: " + Arrays.toString(copiedArray));
    }
}





