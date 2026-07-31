/*
 * Protected Constructor (Different Package)

Create two packages:

Create class Employee

protected variable: salary
protected constructor Employee(int salary)
protected method displaySalary()
Package com.office

Create class Manager that extends Employee

Call the parent constructor using super().
Call displaySalary() using super.
Create an object of Manager in main() and execute the program
 */
package AcessSpecifier;

import Encapsulation.Employee1;

public class Manager1 extends Employee1 {

	protected Manager1(int salary) {
		super(salary);
		
	}
	@Override
	protected  void displaySalary() {
		super.displaySalary();
	}
	
	
	public static  void main(String args []) {
		Manager1 m = new Manager1(34000) ; 
		m.displaySalary();
	}

}


