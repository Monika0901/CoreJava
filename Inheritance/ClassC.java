/*
 * Create classes A → B → C.
Each class has one method:
A.showA(), B.showB(), C.showC().
Call all three using C object.

 */

package Inheritance;

public class ClassC extends ClassB{
     
	public void showC() {
		System.out.println("this is method of C");
	}
	
	public static void main(String args []) {
		
		ClassC cc = new ClassC();
		cc.showA();// Inherited from A
		cc.showB(); // Inherited from B
		cc.showC();// Method of C

	}
}
