/*
48. Grade with Plus/Minus 
Scenario: Take marks and print grade with plus/minus (e.g., 85 → A, 78 → A−). 
Input: 
Enter marks: 78 
Output: 
Grade: A−
*/
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        String grade;
        if (marks >= 85) {
            grade = "A";
        } else if (marks >= 78) {
            grade = "A-";
        } else if (marks >= 70) {
            grade = "B+";
        } else if (marks >= 60) {
            grade = "B";
        } else {
            grade = "F";
        }

        System.out.println("Grade: " + grade);
        sc.close();
    }
}
