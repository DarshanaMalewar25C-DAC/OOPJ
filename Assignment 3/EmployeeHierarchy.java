/*
7. Employee Hierarchy 
Scenario: A company has regular and contractual employees with different pay structures. 
Problem Statement: 
Create a superclass Employee with name and basicSalary. Subclass RegularEmployee adds HRA 10%, 
Subclass ContractEmployee adds allowance 5%. Display net salary. 
Classes/Fields: 
● Employee → name, basicSalary 
● RegularEmployee → HRA 10% 
● ContractEmployee → allowance 5% 
Sample Input: 
Regular → name=Rahul, basicSalary=20000 
Contract → name=Riya, basicSalary=15000 
Sample Output: 
Rahul Net Salary = 22000 
Riya Net Salary = 15750 
*/

class Employee{
	String name;
	double basicSalary;
	
	Employee(String name, double basicSalary){
		this.name=name;
		this.basicSalary=basicSalary;
	}
	public double getNetSalary() {
		return basicSalary;
	}
}

class RegularEmployee extends Employee {
	public RegularEmployee(String name,double basicSalary){
		super (name, basicSalary);
	}
	@Override 
	public double getNetSalary(){
		double hra=0.10*basicSalary;
		return basicSalary + hra;
	}
}

class ContractEmployee extends Employee{
	
	ContractEmployee(String name,double basicSalary){
		super (name, basicSalary);
	}
	@Override
	public double getNetSalary(){
		double allowance=0.05*basicSalary;
		return basicSalary + allowance;
	}
}



class EmployeeHierarchy {
	public static void main(String args[]){
		RegularEmployee r1 = new RegularEmployee("Rahul", 20000);
		System.out.println(r1.name+" Net Salary= "+r1.getNetSalary());
		
		ContractEmployee c1 = new ContractEmployee("Riya", 15000);
		System.out.println(c1.name+" Net Salary= "+c1.getNetSalary());
	}
}
		