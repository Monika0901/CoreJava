/*
 * Create base class A with method m1().
Child classes B and C with methods m2() and m3().
Test both child classes.
 */

package Inheritance;

public class Cc extends Aa {
	
	public void m3() {
        System.out.println("This is method m3 of class C.");
    }

    public static void main(String[] args) {

        Cc obj = new Cc();

        obj.m1();   // Inherited from A
        obj.m3();   // Method of C
    }
}
