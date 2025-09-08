/*
22. Month Name from Number 
Scenario: Take month number (1–12) and print the month name using ternary operators or if-else. 
Input: 
Enter month number: 8 
Output: 
Month is August 
*/
import java.util.Scanner;

public class MonthNameIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month number: ");
        int monthNumber = scanner.nextInt();

        String monthName;

        if (monthNumber == 1) {
            monthName = "January";
        } else if (monthNumber == 2) {
            monthName = "February";
        } else if (monthNumber == 3) {
            monthName = "March";
        } else if (monthNumber == 4) {
            monthName = "April";
        } else if (monthNumber == 5) {
            monthName = "May";
        } else if (monthNumber == 6) {
            monthName = "June";
        } else if (monthNumber == 7) {
            monthName = "July";
        } else if (monthNumber == 8) {
            monthName = "August";
        } else if (monthNumber == 9) {
            monthName = "September";
        } else if (monthNumber == 10) {
            monthName = "October";
        } else if (monthNumber == 11) {
            monthName = "November";
        } else if (monthNumber == 12) {
            monthName = "December";
        } else {
            monthName = "Invalid month number";
        }

        System.out.println("Month is " + monthName);
        scanner.close();
    }
}
