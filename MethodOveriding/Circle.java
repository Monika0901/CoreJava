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

public class Circle extends Shape {

    @Override
    public void area() {

        double radius = 5;
        double area = 3.14 * radius * radius;

        System.out.println("Circle Area = " + area);
    }

}
