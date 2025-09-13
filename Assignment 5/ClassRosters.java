
/*Problem 1: Student Names Management System 
Use Case: A school administrator needs to maintain a list of student names for a class roster. 
Requirements: 
● Add student names to the roster 
● Display all students 
● Remove a student from the roster 
Sample Input: 
Add students: "Amit", "Priya", "Rohan" 
Remove student: "Priya" 
Expected Output: 
Students: Amit, Rohan
*/

import java.util.ArrayList;
import java.util.Scanner;
	
	
public class ClassRosters{
	public static void main(String args[]){
		ArrayList<String> students = new ArrayList<>();
		
		students.add("Amit");
		students.add("Priya");
		students.add("Rohan");
		//System.out.println(students);
		
		students.remove("Priya");
		
		System.out.print("Students: ");
		 for (int i = 0; i < students.size(); i++) {
            System.out.print(students.get(i));
			if (i < students.size() - 1) {
                System.out.print(",");
			}
		}
	}
}
		
		
		
		


