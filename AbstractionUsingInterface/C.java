/*
 * Create two interfaces A and B, each having a default method display(). 
 * Create a class C implementing both interfaces
 */
package AbstractionUsingInterface;

public class C implements A,B {

	@Override
	public void display() {
		System.out.println("this is Display method");
		
	}

}
