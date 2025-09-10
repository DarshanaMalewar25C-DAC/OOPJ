/*
Problem 15: Meeting Notification 
Scenario: A corporate meeting scheduler needs to build complete meeting notifications by adding time 
and location details to basic meeting announcements. 
Task: Use StringBuffer to create detailed meeting notifications. 
Sample Input: 
Base text: Meeting: 
Text to append: Friday at 5 PM 
Expected Output: 
Meeting: Friday at 5 PM 
*/

class MeetingNotification {
	public static void main(String args[]){
		StringBuilder sb = new StringBuilder("Meeting:");
		sb.append(" Friday at 5 PM ");
		System.out.println(sb);
	}
}