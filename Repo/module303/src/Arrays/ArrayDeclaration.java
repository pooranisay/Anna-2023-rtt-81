package Arrays;

public class ArrayDeclaration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int arraysize=10;
     String[] stringarray=new String[arraysize];
     
     stringarray[0]="One";
     stringarray[1]="Two";
     stringarray[2]="Three";
     stringarray[3]="Four";
          
     //Getting array Position
     for(int i=0;i<stringarray.length;i++)
     {
    	 System.out.println("The Actual Value in  :"+"Position"+i+"="+stringarray[i]);    	 
     }
     
     //Getting array Value
     for(int i=0;i<stringarray.length;i++)
     {
     System.out.println("The Actual Value:" +stringarray[i]);
     }
     
     //write a for loop that counts the number of nulls in the array
     
     int nullcount=0;
     for(int i=0;i<stringarray.length;i++)
     {
    	 if(stringarray[i]==null)
    	 {
    		 nullcount++;
    	 }  	 
    	 
     }
     
     
     System.out.println("The Number of nulls in the Array:\t"+nullcount);     
     
     //write a for loop that tells me the location of the first null in the array
     int firstNullIndex=-1;
     
     for(int i=0;i<stringarray.length;i++)
     {
    	 if(stringarray[i]==null)
    	 {
    		  firstNullIndex = i;
    		  break;
    		  
    	 }    	  
     }
     if(firstNullIndex != -1) 
	 {
         System.out.println("The index of the first null in the array is: " + firstNullIndex);
     } else {
         System.out.println("No null values found in the array.");
         
     }
         
       //write a for loop that tells me the last position of null in the array

         int LastIndexofNull = 0;
     	
     	for(int i=stringarray.length-1;i>=0;i--)
         {
        	 if(stringarray[i]==null)
        	 {
        		LastIndexofNull = i;
        		  break;
        		  
        	 }    	  
         }
         if(LastIndexofNull != -1) 
     	 {
             System.out.println("The index of the Last null in the array is: " + LastIndexofNull);
         } else {
             System.out.println("No null values found in the array.");
         }
        
     // write a for loop that starts at the final position in the array and counts down to the first
        // int LastIndextoFirst;
      	
      	for(int i=stringarray.length-1;i>=0;i--)
      		
          {
      		
         	 System.out.println("Array From Last To First:  "+""+"Position of "+i+"="+stringarray[i]);    	  
          }
         
         
         
     
     // write a for loop that tells me how many values are not null

     int NotNullIndexCount=0;
     for(int i=0;i<stringarray.length;i++)
     {
    	 if(stringarray[i]!=null)
    	 {
    		  NotNullIndexCount++;
    		  
    		  
    	 }    	  
     }
     System.out.println("The Number of Not Null Values in the Array:\t "+NotNullIndexCount);
    
     
     //use letters.split(",") to make an array of letters
     
     String letters = "a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z";
     String[] lettersArray=letters.split(",");
     int ExceptVowelsCount=0;
    
     for(String lettersnew:lettersArray)
     {
    	 
    	 System.out.println("After Split   "+lettersnew);
    	
    	 
     }

     
     for(int i=0;i<letters.length();i++)
     {
    	
     char ch=letters.toLowerCase().charAt(i);
     if((ch!='a')&&(ch!='e')&&(ch!='i')&&(ch!='o')&&(ch!='u')&&(ch!=','))
     {
    	 
    	 ExceptVowelsCount++;
        System.out.println("Except Vowels\t"+ ch+"\tCount"+ExceptVowelsCount);
     }
   }
  
	}	  
}  
	



