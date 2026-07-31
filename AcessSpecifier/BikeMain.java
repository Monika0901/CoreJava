/*
 * Class Bike

Create four constructors:
private
default
protected
public

Now create classes in:

same package anaswer for this
 */


package AcessSpecifier;

public class BikeMain  {
 public static void main (String [] args) {
	 Bike b = new Bike();     //  Default
	 Bike ba = new Bike(10000.0); // Protected
	 Bike bc = new Bike(1);     //  Public
	 // Bike b1 = new Bike();     // Private  but we cannot access
 }
}
