package collections;

import java.util.*;


public class IteratorExamjple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// pos 012345
				// val abcdef

				ArrayList<String> strings = new ArrayList<String>();

				strings.add("one");
				strings.add("two");
				strings.add("three");

				for (String string : strings) {
					System.out.println(string);
				}

				Iterator<String> itr = strings.iterator();
				while (itr.hasNext()) {
					String string = (String)itr.next();
					System.out.println(string);
				}

	}

}
