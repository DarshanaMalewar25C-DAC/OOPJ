/*
Problem 23: Browser History Management 
Use Case: Maintain browser history with back functionality. 
Requirements: 
● Store visited pages 
● Implement back navigation (LIFO) 
● Display current history 
Sample Input: 
Pages visited: "Google", "YouTube", "GFG" 
Action: Back (1 page) 
Expected Output: 
Current history: Google, YouTube 
*/

import java.util.*;

class BrowserHistory {
	public static void main(String args[]){
		Stack<String> history = new Stack();
		history.push("Google");
        history.push("YouTube");
        history.push("GFG");
		history.pop();
		
		System.out.print("Current history: ");
		System.out.println(String.join(", ", history));
	}
}