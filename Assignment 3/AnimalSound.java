/*
9. Animal Sound 
Scenario: You are building a zoo management system to play animal sounds. 
Problem Statement: 
Create a superclass Animal with method makeSound(). Subclass Dog and Cat override makeSound(). 
Classes/Fields: 
● Animal → makeSound() 
● Dog → “Bark” 
● Cat → “Meow” 
Sample Output: 
Dog → Bark 
Cat → Meow 
*/

class Animal{
	public void makeSound(){
		System.out.println("Animal makes a sound");
	}
}
class Dog extends Animal{
	@Override
	public void makeSound(){
		System.out.println("Dog->Bark");
	}
}
class Cat extends Animal{
	@Override
	public void makeSound()
	{
		System.out.println("Cat->Meow");
	}
}	
	
class AnimalSound{
	public static void main(String args[]){
		Dog d1 = new Dog();
		d1.makeSound();
		
		Cat c1 = new Cat();
		c1.makeSound();
	}
}
		