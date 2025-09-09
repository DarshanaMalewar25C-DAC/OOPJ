/*
13. Shape Drawing 
Scenario: A graphics program needs to draw different shapes. 
Problem Statement: 
Create an abstract class Shape with abstract method draw(). Subclass Circle and Rectangle implement 
draw(). 
Classes/Fields: 
● Shape → draw() (abstract) 
● Circle → radius 
● Rectangle → length, breadth 
Sample Input: 
Circle → radius=7 
Rectangle → length=5, breadth=10 
Sample Output: 
Drawing Circle of radius 7 
Drawing Rectangle of length 5 and breadth 10 
*/

abstract class Shape{
	abstract void draw();
}
class Circle extends Shape{
	double radius;
	
	Circle(double radius){
		this.radius=radius;
	}
	@Override
	public void draw(){
		System.out.println("Drawing Circle of radius "+radius);
	}
}

class Rectangle extends Shape{
	double length;
	double breadth;
	
	Rectangle(double length, double breadth){
		this.length=length;
		this.breadth=breadth;
	}
	@Override
	public void draw(){
		System.out.println("Drawing Rectangle of length "+length+" and breadth "+breadth);
	}
}

class ShapeDrawing{
	public static void main(String args[]){
		Circle c1 = new Circle(7);
		c1.draw();
		
		Rectangle r1 = new Rectangle(5,10);
		r1.draw();
	}
}