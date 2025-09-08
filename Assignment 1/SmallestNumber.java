/*36. Smallest of Three Numbers (Nested Ternary) 
Scenario: Take three numbers as input and print the smallest using nested ternary operator. 
Input: 
Enter numbers: 12, 8, 19 
Output: 
Smallest number: 8
*/
public class SmallestNumber {
    public static void main(String[] args) {
        int a = 12;
        int b = 8;
        int c = 19;

        int smallest = (a < b) ? ((a < c) ? a : c) : ((b < c) ? b : c);

        System.out.println("Smallest number: " + smallest);
    }
}
