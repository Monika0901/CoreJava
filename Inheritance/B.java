
/*Create class A with method showA() and class B extending A with method showB().
Call both methods using object of B.*/

package Inheritance;

public class B extends A{
	
    public void showB() {
    System.out.println("This is the method of B");
         }
    
    
    public static void main(String args[]) {
    	
    B b = new B();
    b.showA();// Method inherited from class A
    b.showB();// Method of class B
    
    }
    
}
