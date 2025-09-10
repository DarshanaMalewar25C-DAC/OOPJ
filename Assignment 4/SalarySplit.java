/*
Problem 1: Salary Split 
Scenario: You are developing a payroll system for a company. The HR department wants to distribute a 
bonus equally among employees in a department. However, sometimes a department might have zero 
employees due to restructuring. 
 
Task: Create a method that divides a bonus amount among employees and handles the case when the 
number of employees is zero. 
 
Sample Input: 
10000 
0 
 
Expected Output: 
Error: Division by zero not allowed 
*/


class SalarySplit{
	public static void main(String args[]){
		double bonus = 10000;
		int employee = 3;
		if(employee==0){
			System.out.println("Error: Division by zero not allowed");
		}
		else{
			double result = bonus/employee;
			System.out.println("you will get bonus amount: "+result);
		}
	}
}