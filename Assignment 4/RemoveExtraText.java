/* 
Problem 12: Remove Extra Text 
Scenario: An automated message system sometimes adds extra text that needs to be removed before 
sending messages to students. 
Task: Use StringBuilder to clean up message content. 
Sample Input: 
Original Text: Please read - Do not disturb 
Exact substring to delete: - Do not disturb 
Expected Output: 
Please read
*/

class RemoveExtraText{
	public static void main(String args[]){
		String originalText = "Please read - Do not disturb";
		String substringToDelete = "- Do not disturb";
		
		StringBuilder sb = new StringBuilder(originalText);
		int start = sb.indexOf(substringToDelete); 
		if(start!= -1){
			sb.delete(start, start + substringToDelete.length());
		}
		System.out.println(sb);
	}
}
		