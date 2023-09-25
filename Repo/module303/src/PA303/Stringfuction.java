package PA303;

import java.util.Arrays;

public class Stringfuction {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1=" welcome-   ";
		String s2="Welcome";
		String s6="Welcome";
		String s7="Hello World Java";
		
		//1. length() method
		int length1=s1.length();
		int length2=s2.length();
		System.out.println("length of the first string"+"\t"+length1);
		System.out.println("length of the second string"+"\t"+length2);

		
		
		//2. IsEmpty() method:
		String s3="Java";
		String s4="";
		System.out.println("Is Third sting empty !  True/False"+"\t"+s3.isEmpty());
		System.out.println("Is Fourth sting empty!  True/False"+"\t"+s4.isEmpty());
		
		
		
		//3. Trim() method:
		System.out.println("String-Before Trim----"+"\t"+s1+"To Java Programming World");
		System.out.println("String-After Trim----"+"\t"+s1.trim()+"To Java Programming World");
		
		
		//4. toLowerCase() method:
		
		String Lower=s1.toLowerCase();
		System.out.println("Lower Case String:"+Lower);
		
		
		
		//5. Java String toUpper() method:
		
		String Upper=s1.toUpperCase();
		System.out.println("Upper Case String:"+Upper);
		
		
		//6. concat() method
		// concatenate str3 and str2
		System.out.println("String Concat:"+s2.concat(s3));
		
		// concatenate using +
		
		System.out.println("String Concat using +:"+s2 + "to"+s3+"programming world");
		
		// String Chapter is concatenated with number 2
		
		System.out.println("String Concat with number 2  +:"+s2 + 2 +s3+"programming world");
		
		
		//String  concatenated with character 
		
		System.out.println("String Concat with character :"+s2 + 2 +s3+"programming world"+'s');
		
		
		
		//7. split() method
		String vowels = "a::b::c::d:e";
		// splitting the string at "::"
		// storing the result in an array of strings
		String[] result = vowels.split("::");
		String s5=Arrays.toString(result);
		// converting array to string and printing it
		System.out.println("result = " +s5);
		

		
		//8.charAt() method: Getting Characters From a String
		System.out.println("Getting Characters From a string"+""+s2.charAt(0));
		
		
		//9. compareTo() method:
		
		System.out.println("String s6 and s2 compareTo() method: !"+""+s6.compareTo(s2));
		System.out.println("String s1 and s2 compareTo() method: !"+""+s1.compareTo(s2));
		
		
		//10. Substrings() method:
        System.out.println("Substing:"+""+s7.substring(6, 11));
        

        
        //11. indexOf() method:
        System.out.println("Index Of character  'o' in String s7:"+""+s7.indexOf('o'));
        System.out.println("Getting Last Index of 'a' in String s7:"+""+s7.lastIndexOf('a'));
        //character not in the string
        System.out.println("Index Of character  'j' in String s7:"+""+s7.indexOf('j'));
        //getting the last occurrence of "ava"
        System.out.println("last occurrence of ava in String s7:"+""+s7.lastIndexOf("ava"));
       //substring not in the string
        System.out.println("last occurrence of java in String s7:"+""+s7.lastIndexOf("java"));
        System.out.println("last occurrence of Java in String s7:"+""+s7.lastIndexOf("Java"));
		
		
		
		
		//12. contains() method:
		System.out.println("String s7 contains quation true/false!:"+""+s7.contains(""));
		System.out.println("String s7 contains Java true/false!:"+""+s7.contains("Java"));
		System.out.println("String s7 contains java true/false!:"+""+s7.contains("java"));
		
		
		//13. replace() method

		String s=s1.replaceAll("e", "o");
		System.out.println("Before Replacement of String s1:"+"\t"+s1);
		System.out.println("After Replacement of String s1:"+"\t"+s1.replace('e', 'o'));
		System.out.println("Before Replacement of String s7:"+"\t"+s7);
		System.out.println("After Replacement of String s7:"+"\t"+s7.replace('l', 'i'));
		System.out.println("After Replacement of String s7:"+"\t"+s7.replace("Java", "C++"));
		//// all occurences of "aa" is replaced with "zz"
		System.out.println("aa bb aa zz".replace("aa", "zz"));
		System.out.println("Hello".replace('l', 'i'));
		
		
		//14. Java String replaceAll()

		String s8 = "Java123is456fun";
		// regex for sequence of digits
		String regex = "\\d+";
		/* replace all occurrences of numeric
		digits by a space*/
		System.out.println(s8.replaceAll(regex, " "));

		
		
		
		
		
		int lastindex=s1.lastIndexOf("e");
		System.out.println("lastindex"+lastindex);
		
		//15. Java String compares
		System.out.println(s2.compareTo(s6));
		//16. By Using equals() Method
		if(s1.equalsIgnoreCase(s2))
		{
			System.out.println("Same String");
		}
		else
		{
			System.out.println("Not Same String");
		}
		
		
		System.out.println(s2.equals(s6));
		
		
		//17. By Using == operator
		String s9="Perscholas";
		String s10="Perscholas";
		String s11=new String("Perscholas");
		System.out.println(s1==s2);//true (because both refer to same instance

		System.out.println(s1==s3);//false(because s3 refers to instance created in nonpool)
		
		
	}

}
