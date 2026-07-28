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

public class Rectangle extends Shape {

    @Override
    public void area() {

        int length = 10;
        int width = 5;

        int area = length * width;

        System.out.println("Rectangle Area = " + area);
    }

}
