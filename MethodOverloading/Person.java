/* Overload details() method to display:
name
name and age*/

package MethodOverloading;

public class Person {

	 // Method to display name
	public void details( String name) {
		System.out.println("your name is  ="+ name );
	}
	
	// Overloaded method to display name and age

	public void details(String name ,int age) {
		System.out.println("your name is  ="+ name );
		System.out.println("your age is  ="+ age );
		
	}
}
