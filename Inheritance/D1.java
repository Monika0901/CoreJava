/*
 * Create class structure:
A → B, A → C, and C → D.
Write simple methods in each and call using object of D.
 */

package Inheritance;

public class D1 extends C1 {
       
	public void m4() {
        System.out.println("This is method of class D");
    }

    public static void main(String[] args) {

       D1 obj = new D1();
          obj.m1();    // Method of A
          obj.m3();   // Inherited from C
          obj.m4();   // Method of D

        // obj.showB();  Not allowed because D does not inherit from B  so here we are creating object for b in b class
    }
	}

