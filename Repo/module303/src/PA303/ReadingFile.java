package PA303;
import java.util.Scanner;

public class ReadingFile {
	
	private Scanner sc=new Scanner(System.in);
	public void space()
	{
		

		System.out.println("Enter three words with space");
		String s1=sc.next();
		String s2=sc.next();
		String s3=sc.next();
		System.out.println("String s1 is:"+s1);
		System.out.println("String s2 is:"+s2);
		System.out.println("String s3 is:"+s3);
	}
	public void character()
	{
		//Scanner input=new Scanner(System.in);

	System.out.print("Enter a new character: ");
	String s4= sc.nextLine();
	char ch = s4.charAt(0);
	System.out.println("The character entered is " + ch);
	}
 
	public static void main(String[] args) {
				// TODO Auto-generated method stub
		
		ReadingFile rd=new ReadingFile();
		rd.character();
		ReadingFile rd2=new ReadingFile();
		rd2.space();
		
		
		
			}
	
	

}
