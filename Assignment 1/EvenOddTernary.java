/*
33. Even or Odd (Ternary) 
Scenario: Take a number and check if it is even or odd using ternary operator. 
Input: 
Enter a number: 17 
Output: 
Number is Odd 
*/
import java.util.Scanner;

public class EvenOddTernary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        String result = (number % 2 == 0) ? "Number is Even" : "Number is Odd";
        System.out.println(result);
        sc.close();
    }
}
