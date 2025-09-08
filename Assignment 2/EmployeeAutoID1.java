/* Problem 16: Employee Net Salary 
Scenario: 
Extend previous problem. Add method calculateNetSalary(): 
● Add 10% HRA, 5% DA, deduct 2% PF from basicSalary 
● Print net salary for 2 employees 
*/

class Employee1{
	int id;
	String name;
	double basicSalary;
	static int counter = 1001;
	Employee1(){
		this.id= counter++;
		this.name="Unknown";
		this.basicSalary=20000;
	}
	Employee1(String name,double basicSalary){
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
	
	void calculateNetSalary(){
		double hra = 0.10* basicSalary;
		double da = 0.05 * basicSalary;
		double pf = 0.02 * basicSalary;
		double  netSalary=basicSalary + hra+da-pf;
		System.out.println("Net Salary for " + name+ "(ID: "+id+ "):" + netSalary);
	}
}
	

class EmployeeAutoID1{
	public static void main(String args[]){
		Employee1 e1 = new Employee1();
		Employee1 e2 = new Employee1("Aradhya",45000);
		System.out.println("--- Employee Details ---");
        e1.displayEmp();
        e2.displayEmp();
		
		System.out.println("--- Net Salaries ---");
        e1.calculateNetSalary();
        e2.calculateNetSalary();
	}
}
