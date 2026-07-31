/*
 * Create two classes in the same package:

Class A with a default variable.
Class B should access and print it.
 */

package AcessSpecifier;

public class B {
	
       
	public static void main(String args[]) {
		
		A  a = new A();
		
		 System.out.println("Number = "+ a.num);  	
	}
}
