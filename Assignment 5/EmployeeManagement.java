/*
Problem 26: Employee Management System 
Use Case: Manage employee information including name and salary. 
Requirements: 
● Create Employee objects with name and salary 
● Store employees in a collection 
● Display employee information 
Sample Input: 
Employees: Employee("Amit", 50000), Employee("Priya", 60000) 
Expected Output: 
Employee List: Amit:50000, Priya:60000 
*/
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Employee{
	String name;
	int salary;
	
	Employee(String name, int salary){
		this.name=name;
		this.salary=salary;
	}
}

class EmployeeManagement {
	public static void main(String args[]){
		List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Amit", 50000));
        employees.add(new Employee("Priya", 60000));
		
		System.out.print("Employee List: ");
		Iterator<Employee> iterator = employees.iterator();
		
		while(iterator.hasNext()) {
			Employee e = iterator.next();
			System.out.print(e.name + ":" +e.salary);
			if(iterator.hasNext()) {
				System.out.print(", ");
			}
		}
	}
}