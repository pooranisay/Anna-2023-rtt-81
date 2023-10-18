package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class SetInterfaceExample {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String>stringset=new TreeSet<>();
		
		stringset.add("a");
		stringset.add("c");
		stringset.add("b");
		stringset.add("a");
		
		for(String i:stringset)
		{
		  System.out.println(i);
		}
		System.out.println("=======================");
		
		List<String>stringlist=new ArrayList<>();
		
		stringlist.add("one");
		stringlist.add("Two");
		stringlist.add("Three");
		
		for(String i:stringlist)
		{
		  System.out.println(i);
		}
		
		Map<Integer,String>stringmap=new TreeMap<>();
		stringmap.put(1, "One");
		stringmap.put(2, "Two");
		stringmap.put(3, "Three");
		
		for(int i:stringmap.keySet())
		{
			System.out.println(stringmap.get(i));
		}
		
		Map<String,String>stringmap1=new TreeMap<>();
		stringmap1.put("One", "One");
		stringmap1.put("Two", "Two");
		stringmap1.put("Three", "Three");
		
		for(String i:stringmap1.keySet())
		{
			System.out.println(stringmap1.get(i));
		}
		
		
	}

}
