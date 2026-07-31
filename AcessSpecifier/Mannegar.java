/*
 * Create a class Employee with:

protected variable: salary

Create a child class Manager and print the salary.
 */


package AcessSpecifier;

public class Mannegar extends Employee {
	
	public void displaySalary() {
	
		  System.out.println("Salary: " + salary);
		}
	
	public static void main(String args []) {
		 
		Mannegar m = new Mannegar();
        m.displaySalary();
    }

	}


