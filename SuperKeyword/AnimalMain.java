/*
 * Parent Method using super

Create:
Parent Animal
method sound()

Child Dog
Override sound()
Call the parent method using super.sound().
 */
package SuperKeyword;

public class AnimalMain {

	//object creation
	public static void main(String [] args) {
		Dog dg = new Dog();
		dg.sound();
		
	}
}
