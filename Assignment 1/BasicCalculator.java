/*
20. Basic Calculator Using If-Else 
Scenario: Create a calculator that takes two numbers and an operator (+, -, *, /) and prints result using 
nested if-else. 
Input: 
Enter first number: 10 
Enter second number: 5 
Enter operator: * 
C-DAC MUMBAI
Output: 
Result: 50 
*/
import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double result;
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();     
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        System.out.print("Enter operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            if (num2 == 0) {
                System.out.println("Error: Division by zero is not allowed.");
                scanner.close();
                return; 
            }
            result = num1 / num2;
        } else {
            System.out.println("Error: Invalid operator.");
            scanner.close();
            return;
        }

        System.out.println("Result: " + result);

        scanner.close();
    }
}
