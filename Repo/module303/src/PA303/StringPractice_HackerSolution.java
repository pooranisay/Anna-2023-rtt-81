package PA303;
import java.util.Scanner;

public class StringPractice_HackerSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			        
		        Scanner sc=new Scanner(System.in);
		        String A=sc.next();
		        String B=sc.next();
		        /* Enter your code here. Print output to STDOUT. */
		        System.out.println(A.length()+B.length());
		        System.out.println( A.compareTo(B)>0 ? "Yes" : "No" );
		        System.out.println( A.substring(0,1).toUpperCase()+A.substring(1,A.length())+" "+B.substring(0,1).toUpperCase()+B.substring(1,B.length()) );

	}

}
