/*
Problem 19: Message Update System 
Scenario: A communication system needs to update message status from "Old Notice" to "Updated 
Notice" when information is refreshed. 
Task: Use StringBuffer to update message status. 
Sample Input: 
Original text: Old Notice 
Text to find: Old 
Replacement text: Updated 
Expected Output: 
Updated Notice 
*/

class MessageUpdateSystem {
	public static void main(String args[]){
		StringBuilder sb = new StringBuilder("Old Notice");
		int start = sb.indexOf("Old");
		if(start!=-1){
			sb.replace(start,start + "Old".length(),"Updated");
		}
		System.out.println(sb);
	}
}
			
		
		
		