/*
16. Employee Salary Display 
Scenario: Company wants to display employee salary with different bonus calculations based on 
employee type. 
Problem Statement: 
Create class Employee with method displaySalary(). Subclass Manager and Developer override 
displaySalary() to include bonus. 
Classes/Fields: 
● Employee → name, salary, displaySalary() prints salary 
● Manager → overrides displaySalary() → adds 20% bonus 
● Developer → overrides displaySalary() → adds 10% bonus 
Sample Input: 
Manager → name=Anita, salary=50000 
Developer → name=Rohit, salary=40000 
Sample Output: 
Anita Total Salary = 60000 
Rohit Total Salary = 44000
*/

class Employee{
	String name;
	double salary;
	
	 Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
	
	public void displaySalary(){
		System.out.println(name + " Total Salary = " + salary);
	}
}
class  Manager extends Employee{
	
	Manager(String name, double salary) {
        super(name, salary);
	}
		
	@Override
	public void displaySalary(){
		double bonus = salary * 0.20;
        double totalBonus = salary + bonus;
		System.out.println(name + " Total Salary = " + totalBonus);
	}
}
class Developer extends Employee{
	Developer(String name, double salary) {
        super(name, salary);
    }
	
	@Override
	public void displaySalary(){
		double bonus = salary * 0.10;
        double totalBonus = salary + bonus;
		System.out.println(name + " Total Salary = " + totalBonus);
	}
}

class EmployeeSalaryDisplay {
	public static void main(String args[]){
		
		Manager m1 = new Manager("Anita",50000 );
		m1.displaySalary();
		
		Developer d1 = new Developer("Rohit", 40000);
		d1.displaySalary();
	}
}
		
