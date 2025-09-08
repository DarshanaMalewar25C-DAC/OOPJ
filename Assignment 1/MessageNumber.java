/*
25. Message Based on Number (1–5) 
Scenario: Take a number (1–5) and print a message according to the case. Useful for simple menu 
selection. 
Input: 
Enter a number: 3 
Output: 
You selected option 3.
*/
import java.util.Scanner;

public class MessageNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (1-5): ");
        int choice = sc.nextInt();
		
        switch (choice) {
            case 1:
                System.out.println("You selected option 1.");
                break;
            case 2:
                System.out.println("You selected option 2.");
                break;
            case 3:
                System.out.println("You selected option 3.");
                break;
            case 4:
                System.out.println("You selected option 4.");
                break;
            case 5:
                System.out.println("You selected option 5.");
                break;
            default:
                System.out.println("Invalid option. Please enter a number between 1 and 5.");
                break;
        }

        sc.close();
    }
}
