/*
 **Question: Shape Area**

Create a parent class Shape.

* Create a method area().

Create child classes:

* Circle
* Rectangle
* Triangle

Requirements:
* Override the `area()` method in each child class.
* Calculate and display the area of each shape.
* Create a `Main` class and call the `area()` method of all classes.

 */
package MethodOveriding;

public class ShapeMain {

	public static void main(String[] args) {

        System.out.println("Parent Class");
        Shape s = new Shape();
        s.area();

        System.out.println("--------------------");

        System.out.println("Circle");
        Circle c = new Circle();
        c.area();

        System.out.println("--------------------");

        System.out.println("Rectangle");
        Rectangle r = new Rectangle();
        r.area();

        System.out.println("--------------------");

        System.out.println("Triangle");
        Triangle t = new Triangle();
        t.area();
    }
}
