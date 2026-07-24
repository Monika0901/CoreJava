/* 
 * Create class Animal with method eat().
Create class Dog extending Animal with method bark().
Call both methods.
 */

package Inheritance;

public class Dog extends Animal{

	
public void bark() {
	System.out.println("Dog is barking.");
}

public static void main (String arg[] ) {
	
	Dog dg = new Dog();
	dg.eat(); // Inherited method from Animal
	dg.bark();// Method of Dog
}
}
