/*
Problem 4: Employee Data 
Scenario: An HR system needs to calculate hourly wage by dividing an employee's salary by working 
hours. The system must handle both invalid employee indices and division by zero. 
 
Task: Create a method with nested try-catch blocks to handle multiple exception scenarios. 
 
Sample Input: 
2 
5000 6000 
0 
5 
 
Expected Output: 
Division by zero 
or 
Invalid index
*/

class EmployeeData{
	public static void main(String args[]){
		int[] salaries = {5000,6000};
		int workhr = 0;
		int index = 5 ;
		
		try{
			try{
		          int salary = salaries[index];
		          int wage = salary/workhr;
		          System.out.println("Hourly wages: "+wage);
			} catch(ArithmeticException e) {
                System.out.println("Division by zero");
			}
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Invalid index");
		}
	}
}
