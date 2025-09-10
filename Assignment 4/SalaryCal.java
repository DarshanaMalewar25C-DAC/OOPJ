/*Problem 24: Salary Calculation 
Scenario: A payroll system retrieves employee ages from a database as Integer objects but needs 
primitive int values for mathematical calculations. 
Task: Demonstrate unboxing by extracting primitive values from wrapper objects. 
Sample Input: 
25 
Expected Output: 
int value: 25 
*/

class SalaryCal{
	public static void main(String args[]){
		int EmpAge = 25;
		Integer ageObj = EmpAge;
		System.out.println("int value: " + ageObj);
	}
}