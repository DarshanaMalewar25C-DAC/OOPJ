/*
21. Hospital Staff  
Scenario: Hospital has Staff members. Both Doctors and Nurses are Staff. 
Problem Statement: 
● Staff → name, staffId, displayDetails() 
● Doctor → specialization, displayDetails() override 
● Nurse → shift, displayDetails() override 
Sample Input: 
Doctor → name=Dr. Reddy, staffId=101, specialization=Cardiology 
Nurse → name=Nisha, staffId=102, shift=Night 
Sample Output: 
Dr. Reddy → Staff ID=101, Specialization=Cardiology 
Nisha → Staff ID=102, Shift=Night 
*/

class Staff {
	String name;
	int staffId;
	
	Staff(String name, int staffId){
		this.name=name;
		this.staffId=staffId;
	}
	public void displayDetails(){
		System.out.println(name+" -> Staff ID= "+staffId);
	}
}
class Doctor extends Staff{
	String specialization;
	
	Doctor(String name, int staffId, String specialization){
		super(name,staffId);
		this.specialization=specialization;
	}
	@Override
	public void displayDetails(){
		System.out.println(name+" -> Staff ID= "+staffId+" , Specialization="+ specialization);
	}
}
class Nurse extends Staff{
	String shift;
	
	Nurse(String name, int staffId, String shift){
		super(name,staffId);
		this.shift=shift;
	}
	@Override
	public void displayDetails(){
		System.out.println(name+" -> Staff ID= "+staffId+" , Shift="+ shift);
	}
}


class HospitalStaff{
	public static void main(String args[]){
		Doctor d1 = new Doctor("Dr. Reddy",101,"Cardiology");
		d1.displayDetails();
		
		Nurse n1 = new Nurse("Nisha",102,"Night");
		n1.displayDetails();
	}
}