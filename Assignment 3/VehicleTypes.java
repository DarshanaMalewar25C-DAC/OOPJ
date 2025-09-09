/*
8. Vehicle Types 
Scenario: You want to categorize vehicles. 
Problem Statement: 
Create a superclass Vehicle with brand, speed. Create subclasses Car and Bike with additional modelType. 
Display details of each vehicle. 
Classes/Fields: 
● Vehicle → brand, speed 
● Car → modelType 
● Bike → modelType 
Sample Input: 
Car → brand=Honda, speed=180, modelType=Civic 
Bike → brand=Yamaha, speed=120, modelType=R15 
Sample Output: 
Car → Honda Civic, Speed=180 
Bike → Yamaha R15, Speed=120 
*/

class Vehicle{
	String brand;
	int speed;
	
	Vehicle(String brand, int  speed){
		this.brand=brand;
		this.speed=speed;
	}
	public void displayDetails(){
		 System.out.println("Vehicle -> " + brand + ", Speed=" + speed);
	}
}

class Car extends Vehicle{
	String modelType;
	
	Car(String brand, int  speed, String modelType){
		super(brand, speed);
		this.modelType=modelType;
		}
		public void displayDetails(){
		 System.out.println("Car -> " + brand + " "+modelType+ " , Speed=" + speed);
	}
}

class Bike extends Vehicle{
	String modelType;
	
	Bike(String brand, int speed, String modelType) {
		super(brand, speed);
		this.modelType=modelType;
	}
	@Override
	public void displayDetails(){
		 System.out.println("Bike -> " + brand + " "+modelType+ " , Speed=" + speed);
	}
}
		

class VehicleTypes{
	public static void main(String args[]){
		Car c1 = new Car("Honda", 180, "Civic");
		c1.displayDetails();
		
		Bike b1 = new Bike("Yamaha", 120, "R15");
		b1.displayDetails();
	}
}
		