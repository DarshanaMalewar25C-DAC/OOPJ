/*
Problem 14: Grade Update System 
Use Case: Update a student's marks in the grading system. 
Requirements: 
● Store student grades 
● Update existing student's marks 
● Display updated information 
Sample Input: 
Initial: "Rohan" → 78 
Update: "Rohan" → 88 
Expected Output: 
Updated Grade: Rohan:88 
*/
import java.util.HashMap;
import java.util.Map;

class GradeUpdate{
	public static void main(String args[]){
		Map<String,Integer> grade = new HashMap();
		grade.put("Rohan",78);
		grade.put("Rohan",88);//updated grade
		
		System.out.println("Updated Grade: Rohan: "+grade.get("Rohan"));
	}
}
		