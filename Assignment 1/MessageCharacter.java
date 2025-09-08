/*
27. Print Message Based on Character (A–E) 
Scenario: Take a character (A–E) and print a specific message using switch-case. 
Input: 
Enter a character: B 
Output: 
You selected option B. 
*/
import java.util.Scanner;

public class MessageCharacter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character (A-E): ");
        char character = sc.next().toUpperCase().charAt(0);

        switch (character) {
            case 'A':
                System.out.println("You selected option A.");
                break;
            case 'B':
                System.out.println("You selected option B.");
                break;
            case 'C':
                System.out.println("You selected option C.");
                break;
            case 'D':
                System.out.println("You selected option D.");
                break;
            case 'E':
                System.out.println("You selected option E.");
                break;
            default:
                System.out.println("Invalid option. Please enter a character from A to E.");
                break;
        }

        sc.close();
    }
}
