package GLAB;

public class SubsstringDemo {
	

	public static void main(String[] args) {
		
		// --------------0123456789012345
		String string = "This is a string";
		String example = "This is an example Java method for string";
		
		// substring with a start and an end
		String sub = string.substring(5, 7);
		System.out.println(sub);
		
		// substring with just a start
		String sub1 = string.substring(5);
		System.out.println(sub1);
		
		// ----------------0123456789012
		String filename = "someimage.jpg";
		
		int lastDot = filename.lastIndexOf(".");
		
		String ext = filename.substring(filename.lastIndexOf(".") + 1);
		System.out.println(ext);
		
		// ------------01234567890
		String name = "Eric Heilig";
		
		int spacePosition = name.indexOf(" ");
		String firstname = name.substring(0, spacePosition);
		System.out.println(firstname);
		
		String lastname = name.substring(name.indexOf(" ") + 1);
		System.out.println(lastname);
		
		
		// find the position of the first space in the string
		
		int FirstSpacePosition=string.indexOf(" ");
		
		if(FirstSpacePosition!=-1)
		{
			System.out.println("The First Space position in the String :"+FirstSpacePosition);
		}
		else
		{
			System.out.println("There is no Space in the position");
		}
		
		
		// find the position of the last space in the string
		 int LastSpacePosition=string.lastIndexOf(" ");
		 if(LastSpacePosition!=-1)
			{
				System.out.println("The Last Space position in the String :"+LastSpacePosition);
			}
			else
			{
				System.out.println("There is no Space in the position");
			}
		 
		// substring of the characters between the first and last space of the string
		 
		 String substring1=example.substring(example.indexOf(" "), example.lastIndexOf(" "));
		 System.out.println(substring1);
			
		 
	// do the same thing to find the substring of the first and last vowel of the string
	
		 String result = findFirstAndLastVowelSubstring(string);

	        if (result != null) {
	            System.out.println("The substring of the first and last vowel is: " + result);
	        } 
	        else 
	        {
	            System.out.println("No vowels found in the string");
	        }
	        
	        
	     // using only indexOf(" ") print the substring that contains the word "is"
			// use 2 substrings to do this.
	        
	        int startIndex = example.indexOf(" is ");
		    int endIndex = example.indexOf(" ", startIndex + 1);

		    if (startIndex != -1 && endIndex != -1) {
		        String extractedSubstring = example.substring(startIndex, endIndex);
		        System.out.println("The extracted substring containing 'is': " + extractedSubstring);
		    } else {
		        System.out.println("The word 'is' was not found in the string.");
		    }
		    
		    
		 // Change to Java / Very Easy or Easy / Strings and try to do some of them
		    int startIndex1 = example.indexOf(" Java ");
		    int endIndex1 = example.indexOf(" ", startIndex1 + 1);

		    if (startIndex1!= -1 && endIndex != -1) {
		        String extractedSubstring1= example.substring(startIndex1, endIndex1);
		        System.out.println("The extracted substring containing 'Java': " + extractedSubstring1);
		    } else {
		        System.out.println("The word 'Java' was not found in the string.");
		    }
		    
		    
		 // use the string.charAt function and use a for loop to loop over the entire string
	 		// and print out each character with a new line after it.
	 		// you need to use the string.length() function also
	 		
	    for (int i = 0; i < example.length(); i++) {
            char character = example.charAt(i);
            System.out.println(character);
        }

	   }
	    

	    public static String findFirstAndLastVowelSubstring(String string) {
	        String vowels = "AEIOUaeiou";
	        int firstVowelIndex = -1;
	        int lastVowelIndex = -1;

	        // Find the index of the first vowel
	        for (int i = 0; i < string.length(); i++) {
	            if (vowels.contains(String.valueOf(string.charAt(i)))) {
	                firstVowelIndex = i;
	                break;
	            }
	        }

	        // Find the index of the last vowel
	        for (int i = string.length() - 1; i >= 0; i--) {
	            if (vowels.contains(String.valueOf(string.charAt(i)))) {
	                lastVowelIndex = i;
	                break;
	            }
	        }

	        // If both first and last vowels are found, extract the substring
	        if (firstVowelIndex != -1 && lastVowelIndex != -1) {
	            return string.substring(firstVowelIndex, lastVowelIndex + 1);
	        }

	        return null; // Return null if no vowels are found in the string
	    }
	    
	 


	  
}
		
	
	   
	
		
		
		
		
	
		
		
		
		

		
		// https://edabit.com/challenges
		
		
	


