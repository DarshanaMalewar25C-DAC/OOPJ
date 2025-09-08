/*
50. Divisibility by 2, 3, 5 with Custom Messages 
Scenario: Take a number and check divisibility by 2, 3, and 5, printing custom messages for each. 
Input: 
Enter number: 30 
Output: 
Divisible by 2 
Divisible by 3 
Divisible by 5 
*/
import java.util.Scanner;

public class DivisibilityCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.println("Divisible by 2");
        }
        if (number % 3 == 0) {
            System.out.println("Divisible by 3");
        }
        if (number % 5 == 0) {
            System.out.println("Divisible by 5");
        }

        sc.close();
    }
}
