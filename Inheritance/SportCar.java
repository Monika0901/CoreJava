/*
 * Create Vehicle → Car → SportsCar.
Each class prints a message.
Create object of SportsCar and show all messages.
 */

package Inheritance;

public class SportCar extends Carc {

	public void display() {
		System.out.println("This is SportsCar class.");
	}
	public static void main(String args[]) {
		
	SportCar sp = new SportCar();
	
	sp.show();
	sp.Disp();
	sp.display();
	
	}	
}
