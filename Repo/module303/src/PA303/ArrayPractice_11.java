package PA303;

import java.util.Scanner;

public class ArrayPractice_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many favorite things do you have? ");
        int numFavorites = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Create a String array of the correct size
        String[] favoriteThings = new String[numFavorites];

        // Ask the user to enter their favorite things and store them in the array
        for (int i = 0; i < numFavorites; i++) {
            System.out.print("Enter your favorite thing #" + (i+1) + ": ");
            favoriteThings[i] = scanner.nextLine();
        }

        // Close the scanner
        scanner.close();

        // Print out the contents of the array
        System.out.println("\nYour favorite things:");
        for (int i = 0; i < numFavorites; i++) {
            System.out.println((i + 1) + ". " + favoriteThings[i]);
        }

	}

}
