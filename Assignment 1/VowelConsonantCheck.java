/*
38. Vowel or Consonant (Ternary) 
Scenario: Take a character and check if it is a vowel or consonant using ternary operator. 
Input: 
Enter character: i 
Output: 
Vowel
*/
import java.util.Scanner;

public class VowelConsonantCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter character: ");
        char ch = sc.next().charAt(0);
        String result = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                         ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') 
                        ? "Vowel" 
                        : "Consonant";

        System.out.println(result);
        sc.close();
    }
}
