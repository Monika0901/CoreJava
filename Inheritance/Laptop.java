/*
 * Create parent class Device.
Child classes: Mobile, Laptop.
Each child class defines one method.
Call methods using objects of both children.
 */

package Inheritance;

public class Laptop extends Device {

	public void showLaptop() {
		System.out.println("this is the method of laptop class");
	}
	
	public static void main(String args[]) {
		
		Laptop lp = new Laptop();
		lp.showDevice();
		lp.showLaptop();
	}
}
