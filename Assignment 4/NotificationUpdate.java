/*
Problem 11: Notification Update 
Scenario: A university notification system needs to update announcements when exam schedules change. 
The system should efficiently replace old information with new information. 
Task: Use StringBuilder to update notification messages. 
Sample Input: 
Original text: Exam postponed 
Text to find: postponed 
Replacement Text: rescheduled 
Expected Output: 
Exam rescheduled
*/

class NotificationUpdate {
    public static void main(String args[]) {
        String originalText = "Exam postponed";
        String textToFind = "postponed";
        String replacementText = "rescheduled";
        
        StringBuilder sb = new StringBuilder(originalText);
        int start = sb.indexOf(textToFind);
        if (start != -1) {
            sb.replace(start, start + textToFind.length(), replacementText);
        }
        System.out.println(sb); 
    }
}
		