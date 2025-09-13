/*
Problem 27: Employee Salary Sorting 
Use Case: Sort employees by salary for payroll processing. 
Requirements: 
● Store employee objects 
● Sort by salary in ascending order 
● Display sorted employee list 
Sample Input: 
Employees: ("Amit", 50000), ("Priya", 60000), ("Rohan", 45000) 
Expected Output: 
Sorted by salary: Rohan:45000, Amit:50000, Priya:60000
*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee{
	String name;
	int salary;
	
	Employee(String name, int salary){
		this.name=name;
		this.salary=salary;
	}
}

class EmployeeSalarySorting {
	public static void main(String args[]){
		
		ArrayList<Employee> employees = new ArrayList();
		employees.add(new Employee("Amit", 50000));
		employees.add(new Employee("Priya", 60000));
        employees.add(new Employee("Rohan", 45000));
		
		Collections.sort(employees,(a,b) -> a.salary-b.salary);
		
		System.out.print("Sorted by salary: ");
		for(int i=0;i<employees.size();i++){
			System.out.print(employees.get(i).name+ ":" + employees.get(i).salary);
			if(i<employees.size()-1){
				System.out.print(", ");
			}
		}
	}
}