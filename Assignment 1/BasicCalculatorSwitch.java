/*
23. Basic Calculator Using Switch-Case 
Scenario: Create a calculator that uses switch-case for operators (+, -, *, /) and prints result. 
Input: 
Enter first number: 15 
Enter second number: 3 
Enter operator: / 
Output: 
Result: 5 
*/
import java.util.Scanner;

public class BasicCalculatorSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double result;
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        System.out.print("Enter operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
                break;
        }

        scanner.close();
    }
}
