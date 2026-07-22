/* Create a method area() to calculate:
area of circle
area of rectangle*/

package MethodOverloading;

public class Area {


    // Method to calculate area of a circle
	public double area(double radius) {
		 return 3.14 * radius * radius; 
	}
	
	// Overloaded method to calculate area of a rectangle
     public double area(double length , double breadth) {
    	 return length*breadth;
     }
}
