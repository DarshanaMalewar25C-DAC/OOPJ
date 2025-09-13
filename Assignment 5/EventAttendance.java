/*
Problem 9: Event Attendance Counter 
Use Case: Count unique attendees at an event, handling duplicate check-ins. 
Requirements: 
● Record attendee names 
● Count only unique attendees 
● Handle duplicate entries 
Sample Input: 
Attendees: "Amit", "Rohan", "Amit", "Priya" 
Expected Output: 
Total unique attendees: 3 
*/
import java.util.ArrayList;

class EventAttendance {
    public static void main(String args[]) {
        ArrayList<String> attendees = new ArrayList<String>();

        attendees.add("Amit");
        attendees.add("Rohan");
        attendees.add("Amit");   
        attendees.add("Priya");

        ArrayList<String> uniqueAttendees = new ArrayList<String>();

        for (String attendee : attendees) {
            if (!uniqueAttendees.contains(attendee)) {
                uniqueAttendees.add(attendee);
            }
        }

        System.out.println("Total unique attendees: " + uniqueAttendees.size());
    }
}		