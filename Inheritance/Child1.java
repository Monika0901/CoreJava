/*
 * Create class Parent with method p().
Create two child classes Child1 and Child2.
Call methods of all classes using objects of each child.
 */

package Inheritance;

  public class Child1  extends Parent1{
	
	  void show() {
  System.out.println("this is child 1");
	}
	   
	public  static void main(String args[]) {
	 Child1 ch = new Child1();
	 ch.P();
	 ch.show();
}
}
