/*39. Bonus Eligibility (Ternary) 
Scenario: A company gives 5% bonus if years of service > 5. Take salary and years of service, print 
bonus eligibility using ternary. 
Input: 
Enter salary: 50000 
Enter years of service: 6 
Output: 
Bonus: 2500 
*/
import java.util.Scanner;

public class BonusEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter years of service: ");
        int yearsOfService = sc.nextInt();
        double bonus = (yearsOfService > 5) ? (salary * 0.05) : 0;
        if (bonus > 0) {
            System.out.println("Bonus: " + (int)bonus);
        } else {
            System.out.println("No Bonus");
        }
        
        sc.close();
    }
}
