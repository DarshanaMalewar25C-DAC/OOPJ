/*
Problem 19: Grade Report Generator 
Use Case: Display all student grades using proper iteration techniques. 
Requirements: 
● Iterate through student-grade mappings 
● Display formatted grade report 
● Use Iterator pattern 
Sample Input: 
Student grades: "Amit" → 85, "Priya" → 92 
Expected Output: 
Grade Report: Amit:85, Priya:92 
*/
import java.util.*;

class GradeReportGenerator {
    public static void main(String args[]) {

        Map<String, Integer> studentGrade = new LinkedHashMap<>();

        studentGrade.put("Amit", 85);
        studentGrade.put("Priya", 92);

        Iterator<Map.Entry<String, Integer>> iterator = studentGrade.entrySet().iterator();

        System.out.print("Grade Report: ");
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.print(entry.getKey() + ":" + entry.getValue());
            if (iterator.hasNext()) {
                System.out.print(", ");
            }
        }
    }
}

