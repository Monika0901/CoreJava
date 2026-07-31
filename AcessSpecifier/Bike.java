/*
 * Class

Bike

Create four constructors:
private
default
protected
public

Now create classes in:

same package anaswer for this
 */

package AcessSpecifier;

public class Bike {
	Bike(){
		System.out.println("This is default Constructor" );
	}
   private Bike(String name) {
	   System.out.println(" bike name"+ name);
   }
   protected Bike( double price) {
	   System.out.println(" bike price"+ price);
   }
   public Bike(int quantity) {
	   System.out.println(" bike quantity"+ quantity);
   }
}
