/*
46. Character Type Checker 
Scenario: Take a character as input and print whether it is an alphabet, digit, or special character. 
 
Input: 
Enter character: % 
 
Output: 
Special Character 
*/
import java.util.Scanner;

public class CharacterType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter character: ");
        
        char ch = scanner.next().charAt(0);
        
        if (Character.isLetter(ch)) {
            System.out.println("Alphabet");
        } else if (Character.isDigit(ch)) {
            System.out.println("Digit");
        } else {
            System.out.println("Special Character");
        }
        
        scanner.close();
    }
}
