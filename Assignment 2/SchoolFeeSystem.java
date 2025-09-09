/*+Problem 9: School Fee System 
Scenario: 
A school wants to initialize the tuition fee for all students once at program start. Each student has name 
and class. Use static blocks to set the fee and setters/getters to update/access student information. 
Tasks: 
1. Create a Student class. 
2. Use a static block to initialize tuitionFee to 30000. 
3. Create instance variables: name (String) and className (String). 
4. Create setters and getters for name and className. 
5. Print student details including tuition fee. 
Input Example: 
Student1: Name="Anjali", Class="10th" 
Student2: Name="Vikram", Class="12th" 
Expected Output: 
School Tuition Fee Initialized: 30000 
Student1: Name=Anjali, Class=10th, Tuition Fee=30000 
Student2: Name=Vikram, Class=12th, Tuition Fee=30000 
*/

class Student {
	static int tuitionFee;
	String name;
	String className;
	
	static{
		tuitionFee=30000;
		System.out.println("School Tuition Fee Initialized: " + tuitionFee);
	}
	
	Student(String name,String className,int tuitionfee){
		this.name=name;
		this.className=className;
	}
	String getName(){
		return name;
	}
	void setName(){
		this.name=name;
	}
	String getclassName(){
		return className;
	}
	void setclassName(){
		this.className=className;
	}
	static int gettuitionFee(){
		return tuitionFee;
	}
}
	

class SchoolFeeSystem{
	public static void main(String args[]){
		Student s1= new Student("Anjali","10th",30000);
		System.out.println("Student1: Name=" + s1.getName()+ ", Class="+ s1.getclassName()+", Tuition Fee= "+ s1.gettuitionFee());
		
		Student s2= new Student("Vikram","12th",30000);
		System.out.println("Student1: Name=" + s2.getName()+ ", Class="+ s2.getclassName()+", Tuition Fee= "+ s2.gettuitionFee());
	}
}
		