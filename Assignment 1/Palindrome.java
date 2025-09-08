/*
44. Reverse 4-Digit Number and Palindrome Check 
Scenario: Take a 4-digit number, reverse it, and check if it is a palindrome. 
 
Input: 
Enter 4-digit number: 1221 
 
Output: 
Reversed number: 1221 
Palindrome: Yes 
*/
import java.util.Scanner;

public class Palindrome{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter 4-digit number: ");
        int number = sc.nextInt();

        int originalNumber = number;
        int reversedNumber = 0;

        // Loop to reverse the number
        while (number > 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        System.out.println("Reversed number: " + reversedNumber);
        if (originalNumber == reversedNumber) {
            System.out.println("Palindrome: Yes");
        } else {
            System.out.println("Palindrome: No");
        }

        sc.close();
    }
}
