/*
 * Create a chain LivingThing → Animal → Dog.
Add one method in each class and call all using Dog object.
 */

package Inheritance;

public class DogD extends AnimalA {

	 public void shoeDog() {
		 System.out.println("Animal can eat.");
	 }
	 
	 public static void main(String args[]) {
		 DogD dg = new DogD();
		 dg.showLivingThing();
		 dg.showAnimal();
		 dg.shoeDog();
	 }
}

