package module303checking;
import java.util.Scanner;

public class Array {
	
	public void gettingpositivenumber()
	{
		int number=-1;
		while(number<=0)
		{
			System.out.println("Please Enter a Valid Positive Number");
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int input=scanner.nextInt();
		if(input>0)
		{
			System.out.println("The Given Positive Number Is"+input);
		}
		else
		{
			System.out.println("Enter the Valid Positive Number");
		}
		//scanner.close();
		System.out.println("Enter the Second Positive Number");
		int input2=scanner.nextInt();
		if(input2>0)
		{
			System.out.println("The Given Positive Second Number"+input2);
		}
		else
		{
			System.out.println("Enter the Valid Positive Number");
		}
	
		
		
		
		//Check whether k (for k = 2, 3, 4, and so on) is a common divisor 
				// for n1 and n2, until k is greater than n1 or n2.
				
				// 5 and 15
				// 5 / 1 = 5   , 15 / 1 = 15    = Good !!! 
				// 5 / 2 = 2.x , 15 / 2 = 7.x   = No good
				// 5 / 3 = 1.x , 15 / 3 = 5     = No good
				// 5 / 4 = 1.x , 15 / 4 = 3.x   = No good
				// 5 / 5 = 1   , 15 / 5 = 3     = Good !!!
				// 5 / 6 = 0.x ,
				// 5 / 7 = 0.x ,
		
		

	}

}
