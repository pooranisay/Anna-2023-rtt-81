package module303checking;

public class Loop_sum_Exercise {
	
	//sum of all numbers between 1 and 100
	
	public void sum()
	{
		int sum=0;
	
		for (int i = 1; i < 100; i++) {
            sum += i;
            
            
		}		
		
		System.out.println("Sum of Number Between 1 and 100: "+sum);
	}
	
	//sum of divisor of each number divided by 2 between 1 and 100
	
		public void sumofdivisor()
		{
			int sumD = 0;
		
			for (int i = 1; i < 100; i++) {
	            int Divisor = i % 2; 
	            sumD += Divisor;
	            
			}
			System.out.println("Sum of Divisor of each Number Between 1 and 100: "+sumD);
		}

	//sum of Reminder of each number divided by 2 between 1 and 100
	
	public void sumofreminder()
	{
		int sumR = 0;
	
		for (int i = 1; i < 100; i++) {
            int remainder = i % 2; 
            sumR += remainder;
            
		}
		System.out.println("Sum of remainder of each Number Between 1 and 100: "+sumR);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Loop_sum_Exercise LS= new Loop_sum_Exercise();
		LS.sum();
		LS.sumofdivisor();
		LS.sumofreminder();
		
		int number = 10; // Initialize the number to 10

        // Use a while loop to subtract 1 from the number while it's greater than 0
        while (number > 0) {
            System.out.println("Subtracted Number: " + number);
            number--; // Subtract 1 from the number in each iteration
        }

        System.out.println("The loop has finished.");
		

	}

}
