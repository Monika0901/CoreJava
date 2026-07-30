/*
 * Returning Current Object

Create a class Calculator with methods:

setValue(int value)
display()

Return this from setValue() so that the following works:
 */

package ThisKeyword;

public class Calculator {
	
	//instance Variable
	
	int value;
	
	public Calculator setValue(int value) {
		this.value = value;
		return this;
	}
	
	public void display() {
	System.out.println("Value = "+ this.value);
	}



public static void main(String [] args) {
    Calculator cl = new Calculator();
    		cl.setValue(45).display();
}
}