/*
Problem 15: Library Book Inventory 
Use Case: Track available copies of books in a library system. 
Requirements: 
● Map book titles to available copies 
● Update copies when books are borrowed 
● Display current inventory 
Sample Input: 
Initial inventory: "Java" → 3, "Python" → 5 
Borrow: "Java" (1 copy) 
Expected Output: 
Current inventory: Java:2, Python:5 
*/
 
 import java.util.HashMap;
 
 class LibraryBook {
	 public static void main(String args[]){
		 HashMap<String, Integer> inventory = new HashMap();
		 inventory.put("Java",3);
		 inventory.put("Python",5);
		 
		 int copies = inventory.get("Java");
		 inventory.put("Java",copies - 1);
		 System.out.println("Current inventory: Java:" + inventory.get("Java")+ ", Python: " + inventory.get("Python"));
	 }
 }
 
		 