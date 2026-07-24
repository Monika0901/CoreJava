/*
 * Create parent class Device.
Child classes: Mobile, Laptop.
Each child class defines one method.
Call methods using objects of both children.
 */

package Inheritance;

public class Mobile extends Device{
 
	public void showMobile() {
		System.out.println("This is the method of Mobile class");
	}
	
	public static void main(String args[]) {
		
		Mobile mb = new Mobile();
		mb.showDevice();
		mb.showMobile();
	}
	
}
