/*
31. Greatest of Two Numbers (Ternary) 
Scenario: You want to quickly compare two numbers. Take two numbers as input and print the greatest 
using a ternary operator. 
Input: 
Enter first number: 45 
Enter second number: 30 
Output: 
Greatest number: 45 
*/
import java.util.Scanner;

public class GreatestNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNumber = sc.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = sc.nextInt();
        int greatestNumber = (firstNumber > secondNumber) ? firstNumber : secondNumber;
        System.out.println("Greatest number: " + greatestNumber);

        sc.close();
    }
}
