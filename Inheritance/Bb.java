/*
 * Create base class A with method m1().
Child classes B and C with methods m2() and m3().
Test both child classes.
 */


package Inheritance;

public class Bb extends Aa{

	public void m2() {
        System.out.println("This is method m2 of class B.");
    }

    public static void main(String[] args) {

        Bb obj = new Bb();

        obj.m1();   // Inherited from A
        obj.m2();   // Method of B
    }
}
