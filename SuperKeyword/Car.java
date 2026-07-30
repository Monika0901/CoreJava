/*
 * Create:

Parent Vehicle
variable: speed = 80

Child Car
variable: speed = 120

Display both speeds using super.speed and this.speed.
 */


package SuperKeyword;

//Child class
public class Car extends Vehicle {
	
	 // Child class instance variable
    // Same variable name as the parent class
	double speed = 120;
	
	
	 // Method to display both speeds
	void display() {
		
		 // super.speed refers to the parent class variable
	System.out.println("Parent Speed = "+ " "+ super.speed);
	
    // this.speed refers to the current class (Car) variable
	System.out.println("Car Speed = "+ " "+ this.speed);

	}
	}

