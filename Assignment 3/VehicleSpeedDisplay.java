/*
17. Vehicle Speed Display  
Scenario: Vehicle management system needs to display speed differently for different vehicle types. 
Problem Statement: 
Create class Vehicle with method displaySpeed(). Subclass Car and Bike override it. 
Classes/Fields: 
● Vehicle → displaySpeed() prints “Vehicle speed unknown” 
● Car → overrides displaySpeed() → “Car speed 120 km/h” 
● Bike → overrides displaySpeed() → “Bike speed 80 km/h” 
Sample Input: 
Car 
Bike 
Sample Output: 
Car speed 120 km/h 
Bike speed 80 km/h
*/

class Vehicle{
	
	public void displaySpeed(){
		System.out.println("Vehicle speed unknown");
	}
}
class Car extends Vehicle {
	@Override
	public void displaySpeed(){
		System.out.println("Car speed 120 km/h");
	}
}
class Bike extends Vehicle {
	@Override
	public void displaySpeed(){
		System.out.println("Bike speed 80 km/h");
	}
}
class VehicleSpeedDisplay {
	public static void main(String args[]){
		Car c1 = new Car();
		c1.displaySpeed();
		
		Bike b1 = new Bike();
		b1.displaySpeed();
	}
}
		