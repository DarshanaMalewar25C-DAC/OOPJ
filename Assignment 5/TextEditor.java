/*
Problem 21: Text Editor Undo System 
Use Case: Implement undo functionality for a text editor. 
Requirements: 
● Track user actions in order 
● Implement undo operation (LIFO) 
● Display current action history 
Sample Input: 
Actions: "Type A", "Type B", "Delete" 
Operation: Undo last action 
Expected Output: 
Current actions: Type A, Type B
*/

import java.util.*;
class TextEditor{
	public static void main(String args[]){
		
		Stack<String> actions = new Stack<>();
		actions.push("Type A");
        actions.push("Type B");
        actions.push("Delete");
		
		actions.pop();
		System.out.print("Current actions: ");
		for(String action : actions){
			System.out.print(action);
			if (!action.equals(actions.peek())) {
				System.out.print(", ");
			}
		}
	}
}