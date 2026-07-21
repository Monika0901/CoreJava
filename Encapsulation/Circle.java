/* Question:
Create a Circle class with a private variable:

radius

Add:

setRadius()
getRadius()
calculateArea()

Print the area.
*/

package Encapsulation;

public class Circle {
	
// private variable
    private double radius;

    
    // Create the getter and setter
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        double area = 3.14 * radius * radius;
        return area;
    }
}
