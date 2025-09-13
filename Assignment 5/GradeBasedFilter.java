/*
Problem 30: Grade-Based Student Filter 
Use Case: Filter students based on minimum grade requirements. 
Requirements: 
● Store student objects with grades 
● Remove students below grade B 
● Display filtered results 
Sample Input: 
Students: ("Amit", "A"), ("Priya", "C"), ("Rohan", "B") 
Filter: Grade >= B 
Expected Output: 
Qualified Students: Amit:A, Rohan:B 
*/
import java.util.*;
class Student{
	String name;
	String grade;
	
	Student(String name, String grade){
		this.name=name;
		this.grade=grade;
	}
}

public class GradeBasedFilter {
	public static void main(String args[]){
		List<Student> students = new ArrayList();
		students.add(new Student("Amit", "A"));
		students.add(new Student("Priya", "C"));
		students.add(new Student("Rohan", "B"));
		
		System.out.print("Qualified Students: ");
		boolean first = true;
		for(Student s: students){
			if(s.grade.equals("A")||s.grade.equals("B")){
				if(!first){
					System.out.print(", ");
				}
				System.out.print(s.name + ":" +s.grade);
				first=false;
			}
		}
	}
}