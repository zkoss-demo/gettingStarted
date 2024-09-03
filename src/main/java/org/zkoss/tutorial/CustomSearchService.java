package org.zkoss.tutorial;


import java.util.List;

/**
 * simulate a search service
 */
public class CustomSearchService {

	// a list of fruits
	private static final String[] fruits = new String[] { "apple", "banana", "cherry", "date", "fig", "grape", "kiwi",
			"lemon", "mango", "orange", "pear", "quince", "raspberry", "strawberry", "tangerine", "watermelon" };

	public List<String> search(String keyword){
		// search the keyword in the list of fruits
		List<String> resultList = new java.util.ArrayList<String>();
		for (String fruit : fruits) {
			if (fruit.contains(keyword)) {
				resultList.add(fruit);
			}
		}
		
		return resultList;
	}

}
