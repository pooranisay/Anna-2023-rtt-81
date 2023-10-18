package Hackerranker;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Substring {

	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        String S = in.next();
	        int start = in.nextInt();
	        int end = in.nextInt();
	      in.close();
	        System.out.println(S.substring(start, end));
	        
	        //Class Excercise
	        String string="This is  a string";
	        String sub=string.substring(5, 7);
	        System.out.println("Substring :"+sub);
	    }
}
