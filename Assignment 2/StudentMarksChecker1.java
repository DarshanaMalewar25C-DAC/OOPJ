/*Problem 11: Student Grade Calculator 
Scenario: 
Extend previous problem. Add method calculateGrade() which returns: 
● "A" if marks ≥ 80 
● "B" if marks ≥ 60 
● "C" if marks ≥ 40 
● "Fail" otherwise 
● Create 2 students, print marks and grades.
*/
class Student1{
	int rollno;
	String name;
	double marks;
	
	Student1(int rollno, String name, double marks){
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
	
	public String calculateGrade() {
        if (marks >= 80) {
            return "A";
        } else if (marks >= 60) {
            return "B";
        } else if (marks >= 40) {
            return "C";
        } else {
            return "Fail";
        }
    }
	
	public void displayData(){
		System.out.println("Roll No: " + rollno+", Name: " + name+", Marks: " + marks + ", Grade: "+calculateGrade());
	}
}
	
class StudentMarksChecker1 {
	public static void main(String args[]){
		Student1 s1= new Student1(101,"Suresh",85);
		s1.displayData();
		
		Student1 s2= new Student1(108,"Siddhart",93);
		s2.displayData();
		
		Student1 s3= new Student1(112,"Rahul",79);
		s3.displayData();
	}
}
		