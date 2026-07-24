/*
 * Create class Shape with variable type.
Child classes: Circle, Square.
Each child prints its own type.

 */

package Inheritance;

public class Square extends Shape{
	public void showSquare() {
        type = "Square";
        System.out.println("Shape Type: " + type);
    }

    public static void main(String[] args) {

        Square s = new Square();
        s.showSquare();
    }

}
