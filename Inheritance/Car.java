/*
 * Create class Vehicle with method start().
Create class Car extending Vehicle with method drive().
Call both using child object.
 */

package Inheritance;

public class Car extends Vehical{

	public void drive(){
		System.out.println("this is the method of car");
	}
	
	public static void main(String args[]) {
		
	   Car cr = new Car();
	   cr.start();
	   cr.drive();
	}
}
