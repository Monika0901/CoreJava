/*
 * Create class Parent with method p().
Create two child classes Child1 and Child2.
Call methods of all classes using objects of each child.
 */

package Inheritance;

public class Child2 extends Parent1{
	
	void show2() {
		  System.out.println("this is child 2");
			}
			   
			public  static void main(String args[]) {
			 Child2 ch = new Child2();
			 ch.P();
			 ch.show2();
		}

}
