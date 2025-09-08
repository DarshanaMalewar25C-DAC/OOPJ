/*
19. Days in a Month 
Scenario: Take month number (1–12) and print number of days in that month. 
Input: 
Enter month number: 2 
Output: 
28 or 29 days 
*/
import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month number: ");
        int month = scanner.nextInt();

        switch (month) {
            case 1:  // January
            case 3:  // March
            case 5:  // May
            case 7:  // July
            case 8:  // August
            case 10: // October
            case 12: // December
                System.out.println("31 days");
                break;
            case 4:  // April
            case 6:  // June
            case 9:  // September
            case 11: // November
                System.out.println("30 days");
                break;
            case 2:  // February
                System.out.println("28 or 29 days");
                break;
            default:
                System.out.println("Invalid month number.");
        }

        scanner.close();
    }
}