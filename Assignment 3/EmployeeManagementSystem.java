/*29. Employee Management System 
Scenario: Manage employee details, calculate salaries, and differentiate employee types. 
Problem Statement: 
● Abstract Class Employee → instance variables: name, id 
○ Abstract method calculateSalary() → different calculation for each type 
● Class PermanentEmployee extends Employee → include basicSalary and hra → implement 
calculateSalary() 
● Class ContractEmployee extends Employee → include hourlyRate and hoursWorked → 
implement calculateSalary() 
● Interface BonusEligible → method calculateBonus() → applies only to permanent employees 
● In main(), create 2 permanent and 2 contract employees, display salary + bonus if eligible 
Sample Input: 
PermanentEmployee → name="Amit", basicSalary=50000, hra=5000 
ContractEmployee → name="Neha", hourlyRate=300, hoursWorked=100 
Sample Output: 
Amit Salary = 55000, Bonus = 5500 
Neha Salary = 30000
*/
interface BonusEligible {
    double calculateBonus();
}

abstract class Employee {
    String name;
    int id;
    static int idCounter = 1;

    public Employee(String name) {
        this.name = name;
        this.id = idCounter++;
    }

    abstract double calculateSalary();
}

class PermanentEmployee extends Employee implements BonusEligible {
    double basicSalary;
    double hra;

    PermanentEmployee(String name, double basicSalary, double hra) {
        super(name);
        this.basicSalary = basicSalary;
        this.hra = hra;
    }

    @Override
    public double calculateSalary() {
        return basicSalary + hra;
    }

    @Override
    public double calculateBonus() {
        return 0.10 * calculateSalary();
    }
}

class ContractEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;

    ContractEmployee(String name, double hourlyRate, int hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

public class EmployeeManagementSystem {
    public static void main(String args[]) {
        PermanentEmployee p1 = new PermanentEmployee("Amit", 50000.0, 5000);
        System.out.println(p1.name + " , Salary= " + p1.calculateSalary() + " , Bonus= " + p1.calculateBonus());

        PermanentEmployee p2 = new PermanentEmployee("Harsh", 55000.0, 5400);
        System.out.println(p2.name + " , Salary= " + p2.calculateSalary() + " , Bonus= " + p2.calculateBonus());

        ContractEmployee c1 = new ContractEmployee("Neha", 300.0, 100);
        System.out.println(c1.name + " , Salary= " + c1.calculateSalary());

        ContractEmployee c2 = new ContractEmployee("Viraj", 350.0, 150);
        System.out.println(c2.name + " , Salary= " + c2.calculateSalary());
    }
}