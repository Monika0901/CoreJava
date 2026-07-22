// Can you overload the main() method? Write a program to prove it.
//Ans:Yes, you can overload the main() method in Java.

package MethodOverloading;

public class MainDemo {
	
	  // Overloaded main() method with String parameter
	public static void main(String name) {
		System.out.println("The name is"+ " "+ name);
		
	}
	
	   // Overloaded main() method with int parameter
	public static void main(int age ) {
		System.out.println("The age is"+ " "+ age);
	}

}
