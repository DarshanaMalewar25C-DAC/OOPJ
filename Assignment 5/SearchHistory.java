/*
Problem 5: Recent Search History 
Use Case: A search application maintains the last 5 searches, removing the oldest when the limit is 
exceeded. 
Requirements: 
● Store recent searches (maximum 5) 
● Remove oldest search when limit exceeded 
● Maintain insertion order 
Sample Input: 
Searches: "Java", "Python", "C++", "DSA", "OOP", "Spring" 
Expected Output: 
Recent searches: Python, C++, DSA, OOP, Spring 
*/

import java.util.ArrayList;

class SearchHistory{
	public static void main(String args[]){
		ArrayList<String> search = new ArrayList();
		
		search.add("Java");
		search.add("Python");
		search.add("C++");
		search.add("DSA");
		search.add("OOP");
		
		
		search.add("Spring");
		if (search.size() > 5) {
             search.removeFirst();
		System.out.println("Recent searches: "+search);
		}
	}
}