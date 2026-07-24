/*
 * Create class Shape with variable type.
Child classes: Circle, Square.
Each child prints its own type.

 */

package Inheritance;

public class Circle extends Shape  {
	   public void showCircle() {
	        type = "Circle";
	        System.out.println("Shape Type: " + type);
	    }

	    public static void main(String[] args) {

	        Circle c = new Circle();
	        c.showCircle();
	    }
}
