package GLAB;
import java.util.Scanner;

public class palindromeexmaple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Original;
		String reverse = "";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your String:");
		Original=sc.nextLine();
		//int length = Original.length();
	

		for(int i=Original.length()-1;i>=0;i--)
		{
			reverse=reverse+Original.charAt(i);
		}
		
		if (Original.equals(reverse)) {
			System.out.println("Entered string/number is a palindrome.");
			}else
			{
			System.out.println("Entered string/number isn't a palindrome.");
			}
		}
		
		

	}


