/*29. Day Type Selection 
Scenario: Take user input for day type (1–Workday, 2–Weekend) and print working status. 
Input: 
Enter day type (1–Workday, 2–Weekend): 2 
Output: 
It’s weekend. No work today.
*/
import java.util.Scanner;

public class DayTypeSelection {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter day type (1–Workday, 2–Weekend): ");
        int dayType = sc.nextInt();

        switch (dayType) {
            case 1:
                System.out.println("It's a workday. Time to get to work.");
                break;
            case 2:
                System.out.println("It's weekend. No work today.");
                break;
            default:
                System.out.println("Invalid input. Please enter 1 for Workday or 2 for Weekend.");
                break;
        }

        sc.close();
    }
}
