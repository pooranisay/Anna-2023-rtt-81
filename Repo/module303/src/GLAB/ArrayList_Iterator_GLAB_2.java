package GLAB;
import java.util.*;

public class ArrayList_Iterator_GLAB_2 {
	
	public static void main(String[] args) {
		
		
		System.out.println("====================================================");
		System.out.println("Example 5: Iterating over an ArrayList");
		System.out.println("====================================================");
		List<String> tvShows = new ArrayList<>();
		tvShows.add("Breaking Bad");
		tvShows.add("Game Of Thrones");
		tvShows.add("Friends");
		tvShows.add("Prison break");
		System.out.println("\n=== Iterate using an iterator() ===");
		Iterator<String> tvShowIterator = tvShows.iterator();
		while (tvShowIterator.hasNext()) {
		String tvShow = tvShowIterator.next();
		System.out.println(tvShow);
		}
		System.out.println("==Iterate using an iterator() and forEachRemaining() method ===");
		tvShowIterator = tvShows.iterator();
		tvShowIterator.forEachRemaining(tvShow -> {
		System.out.println(tvShow);
		});
		System.out.println("\n=== Iterate using simple for-each loop ===");
		for(String tvShow: tvShows) {
		System.out.println(tvShow);
		}
		System.out.println("\n=== Iterate using for loop with index ===");
		
		for(int i = 0; i < tvShows.size(); i++) {
		System.out.println(tvShows.get(i));
		}
		System.out.println("\n=== Iterate iterator ===");
		ListIterator iterator = tvShows.listIterator();
		System.out.println("Elements in forward direction");
		System.out.println("\n====== Iterate using while loop=======");
		while (iterator.hasNext())
		{
		System.out.println(iterator.next());
		}
		System.out.println("=========Elements in backward direction======");
		while (iterator.hasPrevious())
		{
		System.out.println(iterator.previous());

}
		System.out.println("====================================================");
		System.out.println("Example 6: Searching for Elements in an ArrayList");
		System.out.println("====================================================");
		
		List<String> names = new ArrayList<>();
		names.add("John");
		names.add("Alice");
		names.add("Bob");
		names.add("Steve");
		names.add("John");
		names.add("Steve");
		names.add("Maria");
		// Check if an ArrayList contains a given element
		System.out.println("Does names array contain \"Bob\"? : " +
		names.contains("Bob"));
		// Find the index of the first occurrence of an element in an ArrayList
		System.out.println("indexOf \"Steve\": " + names.indexOf("Steve"));
		System.out.println("indexOf \"Mark\": " + names.indexOf("Mark"));
		// Find the index of the last occurrence of an element in an ArrayList
		System.out.println("lastIndexOf \"John\" : " + names.lastIndexOf("John"));
		System.out.println("lastIndexOf \"Bill\" : " + names.lastIndexOf("Bill"));
	}
}
