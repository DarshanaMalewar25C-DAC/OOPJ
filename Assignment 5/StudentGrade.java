/*
Problem 11: Student Grade Management 
Use Case: A teacher needs to map student names to their exam marks. 
Requirements: 
● Store student name and marks pairs 
● Retrieve marks by student name 
● Display all student-marks mappings 
Sample Input: 
Students and marks: "Amit" → 85, "Priya" → 92, "Rohan" → 78 
Expected Output: 
Grade Report: Amit:85, Priya:92, Rohan:78 
*/


import java.util.HashMap;

class StudentGrade {
    public static void main(String args[]) {
        HashMap<String, Integer> grade = new HashMap<>();

        grade.put("Amit", 85);
        grade.put("Priya", 92);
        grade.put("Rohan", 78);

        System.out.print("Grade Report: ");

        int count = 0;
        int size = grade.size();

        for (String name : grade.keySet()) {
            System.out.print(name + ":" + grade.get(name));
            count++;

            if (count < size) {
                System.out.print(", ");
            }
        }
    }
}
