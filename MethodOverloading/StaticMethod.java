/* Overload a static method print() with:
one parameter
two parameters*/


package MethodOverloading;

public class StaticMethod 
     
{
    // Static method with one parameter
	public static void  print( String name) {
		System.out.println("The name is = "+ " "+ name);
	}
	
	 // Overloaded static method with two parameters
	public static void print( String name, String city) {
		System.out.println("The name and city is = " + " "+ name + " "+ city );
	}
}
