/*
14. Employee Bonus Calculation 
Scenario: A company has different types of employees with specific bonus calculation rules. 
Problem Statement: 
Create an abstract class Employee with abstract method calculateBonus(). Subclass Manager → 
bonus=20% of salary, Subclass Developer → bonus=10% of salary. 
Classes/Fields: 
● Employee → name, salary, calculateBonus() (abstract) 
● Manager → bonus=20% of salary 
● Developer → bonus=10% of salary 
Sample Input: 
Manager → name=Anita, salary=50000 
Developer → name=Rohit, salary=40000 
Sample Output: 
Anita Bonus = 10000 
Rohit Bonus = 4000 
*/

abstract class Employee{
	String name;
	double salary; 
	abstract double calculateBonus();
}

class Manager extends Employee{
	
	Manager(String name, double salary){
		this.name=name;
		this.salary=salary;
	}
	@Override
	public double calculateBonus(){
		return salary * 0.20;
	}
}
	

class Developer extends Employee{
	Developer(String name, double salary){
		this.name=name;
		this.salary=salary;
	}
	
	@Override
	public double calculateBonus(){
		return salary * 0.10;
	}
}

class EmployeeBonus {
	public static void main(String args[]) {
		Manager m1 = new Manager("Anita",50000);
		System.out.println(m1.name+ " Bonus = "+m1.calculateBonus());
		
		Developer d1 = new Developer("Rohit", 40000);
		System.out.println(d1.name + " Bonus = "+ d1.calculateBonus());
	}
}
		
		