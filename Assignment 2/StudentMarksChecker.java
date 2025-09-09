/*Problem 10: Student Marks Checker 
Scenario: 
Create a Student class with rollNo, name, and marks. 
● Use a parameterized constructor to initialize all fields. 
● Create a getter and setter for marks. 
● In main, create one student, update marks using setter, and print student details.
*/

class Student{
	int rollno;
	String name;
	double marks;
	
	Student(int rollno, String name, double marks){
		this.rollno=rollno;
		this.name=name;
		this.marks=marks;
	}
	double getMarks(){
		return marks;
	}
	void setMarks(){
		this.marks=marks;
	}
	public void displayData(){
		System.out.println("Roll No: " + rollno+", Name: " + name+", Marks: " + marks);
	}
}
class StudentMarksChecker{
	public static void main(String args[]){
		Student s1 = new Student(101, "Kriti",94);
		s1.printData();
		Student s2 = new Student(202,"Drishti",99);
		s2.displayData();
	}
}