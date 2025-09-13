/*
Problem 7: Alphabetical Student Directory 
Use Case: A school wants to maintain student names in alphabetical order. 
Requirements: 
● Add student names 
● Automatically maintain alphabetical sorting 
● Display sorted name 
Sample Input: 
Students: "Rohan", "Amit", "Priya" 
Expected Output: 
Students: Amit, Priya, Rohan 
*/

import java.util.ArrayList;
import java.util.Collections;

class StudentDirectory{
	public static void main(String args[]){
		ArrayList<String> student = new ArrayList();
		student.add("Rohan");
		student.add("Amit");
		student.add("Priya");
		
	    Collections.sort(student);

		System.out.println("Students:"+student);
	}
}