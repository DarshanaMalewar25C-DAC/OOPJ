/*
Problem 16: Grade-Based Student Filter 
Use Case: Remove students with failing grades from the honor roll. 
Requirements: 
● Store student grades in a map 
● Remove students with marks below 60 
● Display remaining student 
Sample Input: 
Student grades: "Amit" → 85, "Priya" → 52, "Rohan" → 78 
Filter threshold: 60 
Expected Output: 
Honor Roll: Amit:85, Rohan:78
*/

import java.util.HashMap;
import java.util.Map;

public class GradeBasedStudent{
    public static void main(String[] args) {

        Map<String, Integer> studentGrades = new HashMap<>();
        studentGrades.put("Amit", 85);
        studentGrades.put("Priya", 52);
        studentGrades.put("Rohan", 78);

        int threshold = 60; 

        System.out.print("Honor Roll: ");

        boolean first = true; 
        for (String student : studentGrades.keySet()) {
            int grade = studentGrades.get(student);
            if (grade >= threshold) {
                if (!first) {
                    System.out.print(", ");
                }
                System.out.print(student + ":" + grade);
                first = false;
            }
        }
    }
}
