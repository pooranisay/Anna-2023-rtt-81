package module303checking;

public class StringBufferExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x= "ABCXYX";
		String x1=x.substring(0, 5)+"123"+x.substring(3);
		System.out.println(x1);
		StringBuffer buffer=new StringBuffer(x1);
		//String x2=x1(buffer);
		System.out.println(buffer);
		
		buffer.append('a');
		
		buffer.append("efg");
		buffer.insert(3, "EFG");
		System.out.println("Before Reverse\b\t"   +buffer);
		buffer.reverse();
		System.out.println(buffer.toString());
		buffer.delete(0, 3);
		System.out.println("After Deletion   ->"+buffer.toString().toUpperCase());
		buffer.replace(0, 3, "");
		System.out.println(buffer);
		int length=buffer.length();
		System.out.println(length);
		

	}

}
