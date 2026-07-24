/*
 * Create classes A → B → C.
Each class has a different integer variable.
Add a method in class C to print all three variables.

 */
package Inheritance;

public class C2 extends B2  {
   int c = 30;
   
   void show() {
	   System.out.println("The integer variable of class A ="+ " " + a);
	   System.out.println("The integer variable of class B ="+ " " + b);
	   System.out.println("The integer variable of class C ="+ " " + c);
   }
   public static void main(String args[]) {
	    C2 obj = new C2();
	    obj.show();
   }
}
