package PA303;

public class ArrayPractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				
		int[] arr = {13, 5, 7, 68, 2};

        // Check if the array has an odd length
        if (arr.length % 2 != 0) {
            int middleIndex = arr.length / 2;
            System.out.println("Middle element: " + arr[middleIndex]);
        } else {
            System.out.println("The array does not have a middle element.");
        }
		
		
	}
	
	

}
