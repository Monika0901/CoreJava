/*
 * Create two interfaces A and B, each having a default method display(). 
 * Create a class C implementing both interfaces
 */
package AbstractionUsingInterface;

public class AMain {

	
	public static void main(String args[]) {
		
		A a;
		a = new C();
		a.display();
		
		B b ;
		b= new C();
		b.display();
	}
}
