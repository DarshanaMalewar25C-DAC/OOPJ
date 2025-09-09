/*2. Student Marks 
Scenario: A teacher wants to update student marks but must ensure marks are valid. 
Problem Statement: 
Create a class Student with private marks. Create getter and setter with validation (0–100). 
Fields: 
● private int marks 
Methods: 
● setMarks(int marks) → validate and set 
● getMarks() → return marks 
Sample Input: 
marks = 85 
Sample Output: 
Marks = 85 
*/
import java.util.Scanner;

class Student{
	private int marks;
	 public void setMarks(int marks){
		 if(marks>=0 && marks<=100){
			 this.marks=marks;
		 }
		 else{
			 System.out.println("Invalid marks. please enter a value between 0 to 100.");
		 }
	 }
	 public int getMarks(){
		 return marks;
	 }
}
			 


class StudentMarks{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("marks = ");
		int marks= sc.nextInt();
		
		Student s1= new Student();
		s1.setMarks(marks);
		if (marks >=0 && marks <= 100) {
            System.out.println("Marks = " + s1.getMarks());
        }
		sc.close();
	}
}