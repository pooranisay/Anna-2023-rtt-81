package loops;

public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int inner=1;inner<=10;inner++)
		{
			for(int outer=1;outer<inner;outer++)
		{
			System.out.print("X");
		}
		System.out.println();
		}
		

	}

}
