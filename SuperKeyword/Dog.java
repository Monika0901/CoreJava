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

//Child class
public class Dog extends Animal {

	//Override parent method
	@Override
	public void sound () {
		System.out.println("Dog Barks");
		
		//call parent through Super keyword
		super.sound();
	}
		
}
