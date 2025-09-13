
/*Problem 4: Grocery Shopping List 
Use Case: A person maintains a grocery list and removes items as they purchase them. 
Requirements: 
● Add items to grocery list 
● Remove purchased items 
● Display remaining items 
Sample Input: 
Add items: "Milk", "Eggs", "Bread" 
Purchase: "Milk" 
Expected Output: 
Items to buy: Eggs, Bread 
*/

import java.util.ArrayList;

public class GloceryShopping {
	public static void main(String args[]){
		ArrayList<String> list = new ArrayList();
		
		list.add("Milk");
		list.add("Eggs");
		list.add("Bread");
		//System.out.println(list);
		
		list.remove("Milk");
		System.out.println("Items to buy: "+list);
	}
}
		