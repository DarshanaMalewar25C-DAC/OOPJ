/*Problem 15:  Employee Auto-ID Generator 
Scenario: 
Create Employee class with id, name, basicSalary. 
● Add static counter starting from 1001 for IDs. 
● Default constructor → name = "Unknown", salary = 20000 
● Parameterized constructor → accept name and salary 
● Getter for all variables 
● Create 2 employees and display their IDs, names, salary. 
*/
class Employee{
	int id;
	String name;
	double basicSalary;
	static int counter = 1001;
	Employee(){
		this.id= counter++;
		this.name="Unknown";
		this.basicSalary=20000;
	}
	Employee(String name,double basicSalary){
		this.id= counter++;
		this.name=name;
		this.basicSalary=basicSalary;
	}
	int getId(){
		return id;
	}
	String getName(){
		return name;
	}
	double getbasicSalary(){
		return basicSalary;
	}
	
	void displayEmp(){
		System.out.println("ID: "+ id+ " , Name: "+ name+" ,Salary: "+ basicSalary);
	}
}	

class EmployeeAutoId{
	public static void main(String args[]){
		Employee e1 = new Employee();
		Employee e2 = new Employee("Aradhya",45000);
		System.out.println("--- Employee Details ---");
        e1.displayEmp();
        e2.displayEmp();
	}
}
		