/*
 * Create class Vehicle:

method: start()

Create subclass Car:

method: showSpeed()

Call both methods using object
 */


package Practicesession;

public class Car extends Vehicle {

	 public void showSpeed() {
		 System.out.println("Car have Speed");
	 }
	
	 public static void main(String args[]) {
		 Car cr = new Car();
		 cr.start();
		 cr.showSpeed();
	 }
}
