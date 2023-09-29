package GLAB;

import java.util.Scanner;

public class Calculator {
	
    public static void main(String[] args) {
       
    	Scanner scanner = new Scanner(System.in);

        double num1 = getUserInput("Enter the first number: ");
        double num2 = getUserInput("Enter the second number: ");

        int choice = getMenuChoice(scanner);

        double result = performOperation(num1, num2, choice);

        System.out.println("Result: " + result);

        scanner.close();
    }

    public static double getUserInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextDouble();
    }

    public static int getMenuChoice(Scanner scanner) {
        System.out.println("Select an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter your choice (1/2/3/4): ");

        return scanner.nextInt();
    }

    public static double performOperation(double num1, double num2, int choice) {
        double result = 0;

        switch (choice) {
            case 1:
                result = add(num1, num2);
                break;
            case 2:
                result = subtract(num1, num2);
                break;
            case 3:
                result = multiply(num1, num2);
                break;
            case 4:
                if (num2 != 0) {
                    result = divide(num1, num2);
                } else {
                    System.out.println("Error: Division by zero.");
                }
                break;
            default:
                System.out.println("Invalid choice.");
        }

        return result;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }
}