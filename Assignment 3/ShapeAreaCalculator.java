/*
27. Shape Area Calculator  
Scenario: A drawing application needs to calculate area for different shapes: Circle, Rectangle, and 
Square. 
Problem Statement: 
● Interface Shape → method calculateArea() 
● Classes Circle, Rectangle, Square implement Shape → provide specific area calculation 
● In main(), create objects of each shape, input dimensions, display calculated area 
Sample Input: 
Circle → radius=5 
Rectangle → length=10, breadth=5 
Square → side=4 
Sample Output: 
Circle Area = 78.5 
Rectangle Area = 50 
Square Area = 16 
*/


interface Shape{
	 void calculateArea();
}
class Circle implements Shape{
	double radius;
	
	Circle(double radius){
		this.radius=radius;
	}
	public void calculateArea(){
		double area = 3.14*radius*radius;
		System.out.println("Circle Area = "+area);
	}
}
class Rectangle implements Shape{
	int length;
	int breadth;
	
	Rectangle(int length, int breadth){
		this.length=length;
		this.breadth=breadth;
	}
	public void calculateArea(){
		int area = length * breadth;
		System.out.println("Rectangle Area = "+area);
	}
}
class Square implements Shape{
	int side;
	
	Square(int side){
		this.side=side;
	}
	public void calculateArea(){
		int area =  side * side;
		System.out.println("Square Area = "+area);
	}
}
	

class ShapeAreaCalculator {
	
	public static void main(String args[]){
		Circle c1 = new Circle(5);
		c1.calculateArea();
		
		Rectangle r1 = new Rectangle(10,5);
		r1.calculateArea();
		
		Square s1 = new Square(4);
		s1.calculateArea();
	}
}
		