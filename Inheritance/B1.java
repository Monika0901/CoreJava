/*
 * Create class structure:
A → B, A → C, and C → D.
Write simple methods in each and call using object of D.
 */

package Inheritance;

public class B1 extends A1{
     
	public void m2() {
		  System.out.println("This is method of class B");
	}
	
	  public static void main(String[] args) {

	        // Creating an object of B to test the methods of class B.
	        // The object can access both the inherited method m1()
	        // and its own method m2().
		  // we can call Bb in Dd because D does not inherit from B  so here we are creating object for b in b class
	        Bb obj = new Bb();

	        obj.m1();   // Method inherited from class A
	        obj.m2();   // Method of class B
	    }
}
