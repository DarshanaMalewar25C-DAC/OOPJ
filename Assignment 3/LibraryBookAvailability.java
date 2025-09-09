/*
4. Library Book Availability 
Scenario: A library wants to keep track of available copies without letting external code change it 
directly. 
Problem Statement: 
Create a class Book with private copiesAvailable. Provide getter/setter to update or read copies. 
Fields: 
● private int copiesAvailable 
Methods: 
● addCopies(int n) → add copies 
● removeCopies(int n) → subtract if enough copies 
● getCopiesAvailable() → return current copies 
Sample Input: 
add 3 copies, remove 1 copy 
Sample Output: 
Copies available = 2 
*/
class Book{
	private int copiesAvailable;
	//add n copies
	public void addCopies(int n){
		if(n>0){
			copiesAvailable += n;
		}
	}
	//remove n copies
	public void removeCopies(int n){
		if(n>0 && copiesAvailable >= n){
			copiesAvailable -= n;
		}
		else if(copiesAvailable<n){
			System.out.println("Enough copies not available to remove " + n);
		}
	}
	
	public int getCopiesAvailable(){
		return copiesAvailable;
	}
}
		


class LibraryBookAvailability {
	public static void main(String args[]){
		Book b1 = new Book();
		System.out.println("Initial copies: "+b1.getCopiesAvailable());
		
		b1.addCopies(3);
		System.out.println("add 3 copies"); 
		
		b1.removeCopies(1);
		System.out.println("remove 1 copy");
		
	    System.out.println("Copies available = "+ b1.getCopiesAvailable());
	}
}

		
		
		
		
