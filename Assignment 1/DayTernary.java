/*
21. Day of the Week (Ternary) 
Scenario: Take an int (1–7) and print the corresponding day of the week using ternary operators. 
Input: 
Enter day number: 3 
Output: 
Day is Wednesday
*/
import java.util.Scanner;

public class DayTernary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter day number (1-7): ");
        int dayNumber = scanner.nextInt();

        String dayName = (dayNumber == 1) ? "Monday" :
                         (dayNumber == 2) ? "Tuesday" :
                         (dayNumber == 3) ? "Wednesday" :
                         (dayNumber == 4) ? "Thursday" :
                         (dayNumber == 5) ? "Friday" :
                         (dayNumber == 6) ? "Saturday" :
                         (dayNumber == 7) ? "Sunday" :
                         "Invalid day number";

        System.out.println("Day is " + dayName);

        scanner.close();
    }
}
