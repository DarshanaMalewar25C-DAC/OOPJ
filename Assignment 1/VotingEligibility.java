/*
34. Voting Eligibility (Ternary) 
Scenario: Ask user age and print “Eligible” or “Not Eligible” to vote using ternary operator. 
Input: 
Enter age: 20 
Output: 
Eligible to vote 
*/import java.util.Scanner;

public class VotingEligibility {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        String eligibilityStatus = (age >= 18) ? "Eligible to vote" : "Not Eligible to vote";
        System.out.println(eligibilityStatus);
        sc.close();
    }
}
