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

public class Triangle extends Shape {

    @Override
    public void area() {

        int base = 8;
        int height = 6;

        double area = 0.5 * base * height;

        System.out.println("Triangle Area = " + area);
    }

}
