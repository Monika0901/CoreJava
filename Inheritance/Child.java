/*Create class Parent with variable x = 10.
Create class Child extending Parent with variable y = 20.
Print both values using object of Child.*/


package Inheritance;

public class Child extends Parent{
  
	public void display() {
		
		int  y = 20;
		System.out.println(" Value of y = " + " "+ y);
	}
	
	public static void main (String args[]) {
		Child ch = new Child();
		ch.show();
		ch.display();
	}
}
