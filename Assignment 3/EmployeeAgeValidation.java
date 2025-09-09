/*
3. Employee Age Validation 
Scenario: HR wants to ensure employees entered in the system are adults. 
Problem Statement: 
Create a class Employee with private age. Provide getter/setter. Setter should reject age < 18. 
Fields: 
● private int age 
Methods: 
● setAge(int age) → if age >=18, set; else show error 
● getAge() → returns age 
Sample Input: 
age = 17 
Sample Output: 
“Invalid age
*/

import java.util.Scanner;
class Employees{
	private int age;
	
	public void setAge(int age){
		if(age>=18){
		this.age=age; 
		System.out.println("Valid age" );
		}
		else{
			System.out.println("Invalid age.");
		}
	}
			
				 
				
	public int getAge(){
		return age;
	}
}


class EmployeeAgeValidation{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Age = ");
		int age=sc.nextInt();
		Employees e1 = new Employees();
		e1.setAge(age);
		// if(age >= 18 && age <= 60) {
             // System.out.println("Valid age" + e1.getAge());
		// }
		// else{
			// System.out.println("Invalid age.");
		// }
		sc.close();
	}
}
