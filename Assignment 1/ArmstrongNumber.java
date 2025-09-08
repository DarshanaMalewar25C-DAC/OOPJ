/*41. Check Armstrong Number (3-Digit) 
Scenario: Take a 3-digit number and check if it is an Armstrong number (sum of cubes of digits = 
number). 
Input: 
Enter number: 153 
Output: 
153 is an Armstrong number 
*/
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();

        int originalNumber = number;
        int sumOfCubes = 0;
        int remainder;

        while (number > 0) {
            remainder = number % 10; 
            sumOfCubes += remainder * remainder * remainder; 
            number /= 10;
        }

        if (sumOfCubes == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number");
        }

        sc.close();
    }
}
