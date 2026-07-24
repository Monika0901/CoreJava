/*
 * Create base class Animal.
Child classes: Dog, Cat.
Both children print a different message.

 */


package Inheritance;

public class Cat1 extends Animal1{

	public void showCat() {
		System.out.println("Cat can meow.");
	}
	
	public static void main (String args[]) {
		
		Cat1 ct = new Cat1();
		ct.showAnimal();
		ct.showCat();
	}
}

