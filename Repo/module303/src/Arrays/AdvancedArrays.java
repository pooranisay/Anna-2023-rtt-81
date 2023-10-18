package Arrays;
import java.util.*;

public class AdvancedArrays {
	
	public void DeleteElement()
	{
		int[] numbers= {0,1,2,3,4,5};
		System.out.println("Original Array: "+Arrays.toString(numbers));
		int positiontoDelete=0;
		for(int pos=positiontoDelete;pos<numbers.length-1;pos++)
		{
			numbers[pos]=numbers[pos+1];
		}
		System.out.println("Arrays After Move With dublicate="+Arrays.toString(numbers));
		//Make a New Array
		int[] target=new int[numbers.length-1];
		for(int pos=0;pos<target.length;pos++)
		{
			target[pos]=numbers[pos];
		}
		System.out.println("Arrays After Move="+Arrays.toString(target));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AdvancedArrays ar=new AdvancedArrays();
		ar.DeleteElement();

		double[] numbers= {6.0,4,4,1.9,2.9,3.4,3.5};
		double Minimum=numbers[0];
		double Maximum=numbers[0];
		
		for(double number : numbers)
		{
			if(number<Minimum)
			{
				Minimum=number;
			}
			if(number>Maximum)
			{
				Maximum=number;
			}
		}
		System.out.println("Minimum Value"+Minimum);
		System.out.println("Maximum Vlue"+Maximum);
		
	}

}
