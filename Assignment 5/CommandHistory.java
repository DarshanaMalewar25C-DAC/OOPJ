/*
Problem 25: Command History Tracker 
Use Case: Store recent commands in a terminal with limited history. 
Requirements: 
● Maintain last 3 commands 
● Remove oldest when limit exceeded 
● Display recent commands 
Sample Input: 
Commands: "ls", "pwd", "cd ..", "mkdir" 
History limit: 3 
Expected Output: 
Recent Commands: pwd, cd .., mkdir 
*/

import java.util.LinkedList;

public class CommandHistory {
	public static void main(String args[]){
		LinkedList<String> history = new LinkedList();
		String[] commands = {"ls", "pwd", "cd ..", "mkdir" };
		
		for(String cmd : commands ){
			if(history.size()==3)history.removeFirst();
			history.add(cmd);
		}
		System.out.println("Recent Commands: " + String.join(", ",history));
	}
}
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// import java.util.LinkedList;

// public class CommandHistory {
    // public static void main(String[] args) {
        // LinkedList<String> history = new LinkedList<>();
        // String[] commands = {"ls", "pwd", "cd ..", "mkdir"};

        // for (String cmd : commands) {
            // if (history.size() == 3) history.removeFirst();
            // history.add(cmd);
        // }

        // System.out.println("Recent Commands: " + String.join(", ", history));
    // }
// }
