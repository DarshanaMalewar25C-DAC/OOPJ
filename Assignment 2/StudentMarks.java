/*
Problem 5: Student Marks Calculator 
Scenario: A school in Mumbai wants to calculate marks of students and also maintain total students in 
the class. 
Requirements: 
1. Create a class Student with instance variables: name (String), marks (int). 
2. Create static variable totalStudents to count total number of students. 
3. Constructor to initialize student details and increment totalStudents. 
4. Getter and Setter for marks. 
5. Method isPassed() returns true if marks >= 35, false otherwise. 
6. Static method showTotalStudents() prints total students. 
7. In main class, create 3 students, check if they passed, and show total students. 
Input Example: 
Student1: Name: "Rahul", Marks: 78 
Student2: Name: "Pooja", Marks: 34 
Student3: Name: "Amit", Marks: 65 
Expected Output: 
Student Rahul Passed? true 
Student Pooja Passed? false 
Student Amit Passed? true 
Total students: 3
*/

class Student{
	String name;
	int marks;
	static int totalStudents = 0;
	
	Student(String name, int marks){
		this.name= name;
		this.marks= marks;
		totalStudents++;
	}
	String getName(){
	return name;}
	void setName(){
		this.name = name;
	}
	
	int getMarks(){
		return marks;
	}
	void setMarks(){
		this.marks= marks;
	}
	
	 public boolean isPassed() { 
        return marks >= 35;
	}
	
	static void showTotalStudents(){
		System.out.println("Total students: "+ totalStudents);
	}
}
		

class StudentMarks{
	public static void main(String args[]){
		Student s1 = new Student("Rahul",78);
		System.out.println("Student " +s1.getName()+ " Passed? " + s1.isPassed());
		
		Student s2 = new Student("Pooja",34);
		System.out.println("Student " + s2.getName()+ " Passed? "+ s2.isPassed());
		
		Student s3 = new Student("Amit",65);
		System.out.println("Student " +s3.getName() +" Passed? "+ s3.isPassed());
		
		Student.showTotalStudents();
	}
}