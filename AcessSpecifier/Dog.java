package AcessSpecifier;

import Encapsulation.Animal;

public class Dog extends Animal {

	void eat1() {
	 super.eat();
		System.out.println("DOg eat Dog food");
	}
	
	public static void main(String args[]) {
		Dog dg = new Dog();
		dg.eat1();
		
	}
}
