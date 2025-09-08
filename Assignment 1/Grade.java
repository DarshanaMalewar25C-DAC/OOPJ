/*
24. Grade Using Switch (Ranges) 
Scenario: Take marks (0–100) and print grade using switch-case grouping: 
● 0–24 → F 
● 25–44 → E 
● 45–54 → D 
● 55–69 → C 
● 70–84 → B 
● 85–100 → A 
Input: 
Enter marks: 78 
Output: 
Grade: B 
*/
import java.util.Scanner;

public class Grade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = scanner.nextInt();

        String grade;

        if (marks < 0 || marks > 100) {
            grade = "Invalid marks";
        } else {
            int marksDividedByRanges = marks / 10;
            switch (marksDividedByRanges) {
                case 10:
                case 9:
                case 8:
                    if (marks >= 85) {
                        grade = "A";
                    } else {
                        grade = "B";
                    }
                    break;
                case 7:
                    if (marks >= 70) {
                        grade = "B";
                    } else {
                        grade = "C";
                    }
                    break;
                case 6:
                    if (marks >= 55) {
                        grade = "C";
                    } else {
                        grade = "D";
                    }
                    break;
                case 5:
                    if (marks >= 45) {
                        grade = "D";
                    } else {
                        grade = "E";
                    }
                    break;
                case 4:
                    if (marks >= 25) {
                        grade = "E";
                    } else {                     
                        grade = "F";
                    }
                    break;
                default:
                    grade = "F";
                    break;
            }
        }

        System.out.println("Grade: " + grade);

        scanner.close();
    }
}

		