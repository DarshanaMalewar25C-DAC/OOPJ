/*
15. Lucky Number Check 
Scenario: A 4-digit number ABCD is lucky if A+B = C+D. Check if a number is lucky. 
Input: 
Enter 4-digit number: 3521 
Output: 
Not a lucky number 

*/
import java.util.Scanner;

class LuckyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 4-digit number: ");
        int number = sc.nextInt();

        if (number >= 1000 && number <= 9999) {
            int A = number / 1000;             // First digit
            int B = (number / 100) % 10;       // Second digit
            int C = (number / 10) % 10;        // Third digit
            int D = number % 10;               // Fourth digit
  
            if ((A + B) == (C + D)) {
                System.out.println("Lucky number");
            } else {
                System.out.println("Not a lucky number");
            }
        } else {
            System.out.println("Please enter a valid 4-digit number.");
        }

        sc.close();
    }
}