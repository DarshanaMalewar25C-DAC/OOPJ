/*
Problem 23: Employee Age Management 
Scenario: An HR system stores employee ages in a database. The system needs to convert primitive int 
values to Integer objects for database storage and collection operations. 
Task: Demonstrate autoboxing by converting primitive int to Integer object. 
Sample Input: 
30 
Expected Output: 
Integer object: 30
*/


class EmployeeAge {
	public static void main(String args[]){
		int age = 30;
		Integer ageObj = age;
		System.out.println("Integer object: " + ageObj);
	}
}


