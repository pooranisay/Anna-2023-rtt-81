package collections;

import java.util.Scanner;

public class ExceptionExamples {

	public static void main(String[] args) {
		ExceptionExamples ee=new ExceptionExamples();
		try {
			ee.Exceptionmessage();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		// TODO Auto-generated method stub
public void Exceptionmessage() throws Exception
{
Scanner scanner = new Scanner(System.in);

try {
	System.out.println("Please enter a number:");
	int x = scanner.nextInt();
	System.out.println("You Enter The Number: "+x);
} catch (Exception e) {
	System.out.println("The Error Message is: "+e.getMessage());
	System.out.println("You did not enter a number");
}
finally
{
	System.out.println("No Matter What ,this should Executed");
}
	}

}
