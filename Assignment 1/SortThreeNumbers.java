/*
45. Sort Three Numbers in Ascending Order 
Scenario: Take three numbers and print them in ascending order. 
 
Input: 
Enter numbers: 45, 12, 78

Output: 
Ascending order: 12, 45, 78
*/
import java.util.Scanner;

public class SortThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (a > c) {
            int temp = a;
            a = c;
            c = temp;
        }
        if (b > c) {
            int temp = b;
            b = c;
            c = temp;
        }

        System.out.println("Ascending order: " + a + ", " + b + ", " + c);
        sc.close();
    }
}
