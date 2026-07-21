/*Question:
Create a Rectangle class with private variables:

length
breadth

Add:

setLength()
setBreadth()
getArea()

Display the area.*/

package Encapsulation;

public class Rectangle {
   private double length;
   private double breadth;
   
   
   public double getLength() {
	return length;
   }
   public void setLength(double length) {
	this.length = length;
   }
   
   
   public double getBreadth() {
	return breadth;
   }
   public void setBreadth(double breadth) {
	this.breadth = breadth;
   }
   
   double getArea( ) {
	  
	  double  area = length* breadth;
	  return  area;
   }
   
   
}
