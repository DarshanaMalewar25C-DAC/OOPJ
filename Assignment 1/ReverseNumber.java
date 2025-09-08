/*
14. Reverse a 4-Digit Number 
Scenario: Take a 4-digit number and print its reverse.  
Input: 
Enter 4-digit number: 1234 
Output: 
Reversed number: 4321
*/ 
import java.util.Scanner;

class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 4-digit number: ");
        int number = sc.nextInt();
		
        if (number >= 1000 && number <= 9999) {
            int reversed = 0;
            int original = number;

            while (number != 0) {
                int digit = number % 10;
                reversed = reversed * 10 + digit;
                number = number / 10;
            }

            System.out.println("Reversed number: " + reversed);
        } else {
            System.out.println("Please enter a valid 4-digit number.");
        }

        sc.close();
    }
}
