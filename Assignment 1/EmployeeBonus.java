/*9. Employee Bonus Eligibility 
Scenario: A company gives a 5% bonus to employees with more than 5 years of service. Take salary and 
years of service as input and print bonus amount. 
Input: 
Enter salary: 50000 
Enter years of service: 6 
Output: 
Bonus amount: 2500
*/
import java.util.Scanner;
class EmployeeBonus {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter salary: ");
		double salary = sc.nextDouble();
		
		System.out.print("Enter years of service: ");
		int year = sc.nextInt();
		
		double bonus = 0;
		if(year > 5){
			bonus = salary * 0.05;
		}
		System.out.println("Bonus amount: "+ bonus);
		sc.close();
	}
}