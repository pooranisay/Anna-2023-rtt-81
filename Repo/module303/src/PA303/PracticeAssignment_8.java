package PA303;

public class PracticeAssignment_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		   // Create a String array of 5 elements
        String[] myArray = {"A", "B", "C", "D", "E"};
        
        //Original Array
        System.out.print("Original Array:\t");
        for(int i=0;i<myArray.length;i++)
        System.out.print(myArray[i].toString());

        //Finding  middle element
        int middleIndex = myArray.length / 2;
        
        // Ensure the array has at least two elements before swapping
        if (myArray.length >= 2 && middleIndex != 0) {
            String temp = myArray[0]; 
            myArray[0] = myArray[middleIndex]; 
            myArray[middleIndex] = temp; 
        }

        // Print the array to verify the swap
        System.out.print("\n"+"Array after swapping: ");
        for(int i=0;i<myArray.length;i++)
        {
            System.out.print(myArray[i].toString() + " ");
        }
	}

}
