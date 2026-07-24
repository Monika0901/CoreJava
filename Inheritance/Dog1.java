/*
 * Create base class Animal.
Child classes: Dog, Cat.
Both children print a different message.

 */

package Inheritance;

public class Dog1 extends Animal1 {

	public void showDog() {
		System.out.println("Dog can Bark");
	}
	
	public static void main (String args[]) {
		
		Dog1 dg = new Dog1();
		dg.showAnimal();
		dg.showDog();
	}
}
