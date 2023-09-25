package PA303;

import java.util.Scanner;

public class Fifthprogram {

	public static void main(String[] args) {
		
		System.out.println("Please Enter Your Score");
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int score=sc.nextInt();
	   if(score < 0 || score > 100) 
		{
            System.out.println("Score out of range");
		}
	
	   else{
		   if((score>=90)&&(score<=100))
		   {
	   
		
			System.out.println("GRADE A");
		}
		   else if((score>=80)&&(score<=89))
		{
			System.out.println("GRADE B");
		}
		
		   else if((score>=70)&&(score<=79))
		{
			System.out.println("GRADE C");
		}
		   else if((score>=60)&&(score<=69))
		{
			System.out.println("GRADE D");
		}
	   
		else 
		{
			System.out.println("GRADE F");
		}

	}

}
}
