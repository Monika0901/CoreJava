/*Create a class Demo and overload show() using:
(int, String)
(String, int)*/

package MethodOverloading;

public class Demo {
	// Method to display int and String
	public void show(int num , String name) {
		System.out.println("Integer Value = "+ " " +num );
		System.out.println("String Value = "+ " " + name );
     }
	
	// Overloaded method to display String and int
	public void show( String name ,int num ) {
		System.out.println("String Value = "+ " " + name );
		System.out.println("Integer Value = "+ " " +num );

     }

}
