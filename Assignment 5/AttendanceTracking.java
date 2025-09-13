/*
Problem 12: Attendance Tracking System 
Use Case: Track student attendance percentages in alphabetical order. 
Requirements: 
● Map student names to attendance percentages 
● Maintain alphabetical order of students 
● Display sorted attendance report 
Sample Input: 
Attendance: "Amit" → 90, "Rohan" → 85, "Priya" → 95 
Expected Output: 
Attendance Report: Amit:90, Priya:95, Rohan:85
*/
import java.util.TreeMap;
import java.util.Map;
import java.util.*;

public class AttendanceTracking {
    public static void main(String[] args) {
        HashMap<String, Integer> attendance = new HashMap<>();
        attendance.put("Amit", 90);
        attendance.put("Rohan", 85);
        attendance.put("Priya", 95);

        List<String> students = new ArrayList<>(attendance.keySet());
        Collections.sort(students);

        System.out.print("Attendance Report: ");

        for (int i = 0; i < students.size(); i++) {
            String name = students.get(i);
            System.out.print(name + ":" + attendance.get(name));
            if (i < students.size() - 1) {
                System.out.print(", ");
            }
        }
    }
}
	
		
		
		
		
		
		
		
/*int count = 0;
        int size = attendance.size();

        for (Map.Entry<String, Integer> entry : attendance.entrySet()) {
            System.out.print(entry.getKey() + ":" + entry.getValue());
            count++;
            if (count < size) {
                System.out.print(", ");
				*/