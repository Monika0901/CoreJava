/*
 * Create classes X → Y → Z.
Z contains method display() that prints variable from all three classes.
 */

package Inheritance;

public class Z extends Y  {
      int c = 30;
	public void display() {
		System.out.println("The Variable of class X" + " "+ a);
		System.out.println("The Variable of class Y" + " "+ b);
		System.out.println("The Variable of class Z" + " "+ c);
	}
	
	public static void main(String args[]) {
		Z z = new Z();
		z.display();
	}
}
