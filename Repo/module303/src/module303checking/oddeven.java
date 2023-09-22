package module303checking;
import java.util.Scanner;
public class oddeven {

	public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");

        // Read the integer from the user
        int n = scanner.nextInt();

        // Close the scanner to free up resources
        scanner.close();

        // Perform conditional actions based on the value of n
        if (n % 2 == 1 || (n % 2 == 0 && n >= 6 && n <= 20)) {
            System.out.println("Weird");
        } else {
            System.out.println("Not Weird");
        }
    }
	
}
	


