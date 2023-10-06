package GLAB;

import java.util.ArrayList;
import java.util.List;

public class ArrayListGLAB_1 {

	public static void main(String[] args) {
		
		System.out.println("==========================================================");
		System.out.println("Example 1: Creating an ArrayList and Adding New Elements");
		System.out.println("==========================================================");
		// Creating an ArrayList of String
		List<String> animals = new ArrayList<>();
		// Adding new elements to the ArrayList
		animals.add("Lion");
		animals.add("Tiger");
		animals.add("Cat");
		animals.add("Dog");
		System.out.println(animals);
		// Adding an element at a particular index in an ArrayList
		animals.add(2, "Elephant");
		System.out.println(animals);
		
		System.out.println("==========================================================");
		System.out.println("Example 2: Creating an ArrayList From Another Collection");
		System.out.println("==========================================================");
		
		List<Integer> firstFivePrimeNumbers = new ArrayList<>();
		firstFivePrimeNumbers.add(2);
		firstFivePrimeNumbers.add(3);
		firstFivePrimeNumbers.add(5);
		firstFivePrimeNumbers.add(7);
		firstFivePrimeNumbers.add(11);
		// Creating an ArrayList from another collection
		List<Integer> firstTenPrimeNumbers = new
		ArrayList<>(firstFivePrimeNumbers);
		List<Integer> nextFivePrimeNumbers = new ArrayList<>();
		nextFivePrimeNumbers.add(13);
		nextFivePrimeNumbers.add(17);
		nextFivePrimeNumbers.add(19);
		nextFivePrimeNumbers.add(23);
		nextFivePrimeNumbers.add(29);
		// Adding an entire collection to an ArrayList
		firstTenPrimeNumbers.addAll(nextFivePrimeNumbers);
		System.out.println(firstTenPrimeNumbers);
			
		System.out.println("==========================================================");
		System.out.println("Example 3: Accessing Elements from an ArrayList");
		System.out.println("==========================================================");
		
			List<String> topCompanies = new ArrayList<>();
			// Check if an ArrayList is empty
			System.out.println("Is the topCompanies list empty? : " +
			topCompanies.isEmpty());
			topCompanies.add("Google");
			topCompanies.add("Apple");
			topCompanies.add("Microsoft");
			topCompanies.add("Amazon");
			topCompanies.add("Facebook");
			// Find the size of an ArrayList
			System.out.println("Here are the top " + topCompanies.size() + " companies in the world");
			System.out.println(topCompanies);
			// Retrieve the element at a given index
			
			String bestCompany = topCompanies.get(0);
			String secondBestCompany = topCompanies.get(1);
			String lastCompany = topCompanies.get(topCompanies.size() - 1);
			System.out.println("Best Company: " + bestCompany);
			System.out.println("Second Best Company: " + secondBestCompany);
			System.out.println("Last Company in the list: " + lastCompany);
			// Modify the element at a given index
			topCompanies.set(4, "Walmart");
			System.out.println("Modified top companies list: " +
			topCompanies);
			
			System.out.println("==========================================================");
			System.out.println("Example 4: Removing Elements from an ArrayList");
			
			System.out.println("==========================================================");
			
			
			
				List<String> programmingLanguages = new ArrayList<>();
				programmingLanguages.add("C");
				programmingLanguages.add("C++");
				programmingLanguages.add("Java");
				programmingLanguages.add("Kotlin");
				programmingLanguages.add("Python");
				programmingLanguages.add("Perl");
				programmingLanguages.add("Ruby");
				System.out.println("Initial List: " + programmingLanguages);
				// Remove the element at index `5`
				programmingLanguages.remove(5);
				
				System.out.println("After remove(5): " + programmingLanguages);
				// Remove the first occurrence of the given element from the ArrayList
				// (The remove() method returns false if the element does not exist in the
				//ArrayList)
				boolean isRemoved = programmingLanguages.remove("Kotlin");
				System.out.println("After remove(\"Kotlin\"): " + programmingLanguages);
				// Remove all the elements that exist in a given collection
				List<String> scriptingLanguages = new ArrayList<>();
				scriptingLanguages.add("Python");
				scriptingLanguages.add("Ruby");
				scriptingLanguages.add("Perl");
				programmingLanguages.removeAll(scriptingLanguages);
				System.out.println("After removeAll(scriptingLanguages): " + programmingLanguages);
				// Remove all elements from the ArrayList
				programmingLanguages.clear();
				System.out.println("After clear(): " + programmingLanguages);
			


	}
}
	
	

