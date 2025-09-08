/*2. Highest Salary Among Three Offers 
Scenario: You have three job offers. Take the offered salaries as input and print which company is 
offering the highest salary. 
Input: 
Enter salary for Company 1: 45000 
Enter salary for Company 2: 52000 
Enter salary for Company 3: 50000 
Output: 
Company 2 offers the highest salary
*/
import java.util.Scanner;
class SalaryOffers{
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter salary for company 1: ");
	double salary1 = sc.nextDouble();
	System.out.print("Enter salary for company 2: ");
	double salary2 = sc.nextDouble();
	System.out.print("Enter salary for company 3: ");
	double salary3 = sc.nextDouble();
	
	if(salary1 >= salary2 && salary1 >= salary3){
		System.out.println("Company 1 offers the highest salary.");
	}
	else if(salary2 >= salary1 && salary2 >= salary3){
		System.out.println("Company 2 offers the highest salary.");
	}
	else{
		System.out.println("Company 3 offers the highest salary.");
	}
	sc.close();
}
}
