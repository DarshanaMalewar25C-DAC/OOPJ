/*
Problem 29: Student Record System 
Use Case: Maintain student records with name and grade information. 
Requirements: 
● Create Student objects with name and grade 
● Store in a collection 
● Display student records 
Sample Input: 
Students: Student("Amit", "A"), Student("Priya", "B") 
Expected Output: 
Student Records: Amit:A, Priya:B
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
	

public class StudentRecordSystem {
	public static void main(String args[]){
		List<Student> students = new ArrayList();
		students.add(new Student("Amit", "A"));
		students.add(new Student("Priya", "B"));
		
		System.out.print("Student Records: ");
		
		for(int i=0;i<students.size();i++){
			Student s= students.get(i);
			System.out.print(s.name+":"+s.grade);
			if(i<students.size()-1){
				System.out.print(", ");
			}
		}
	}
}
		