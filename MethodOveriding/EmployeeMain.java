/*
 *  Employee Salary Management

Create a parent class Employee.

Create child classes:

Manager
Developer
Tester

Requirements:

Store employee details.
Override calculateSalary().
Add different bonus for each employee.
Display the final salary of each employee
 */

package MethodOveriding;

public class EmployeeMain {

	
	public static void main (String args[]) {
		
		System.out.println("This is the details of Employee");
		Employee ep = new Employee();
		ep.calculateSalary(1, "jiva", 23000);
		System.out.println("--------------------------------");
		
		System.out.println("This is the details of Maneger");
	    Maneger mn = new Maneger();
	    mn.calculateSalary(2, "Ram", 75000);
	    System.out.println("--------------------------------");
	    
		System.out.println("This is the details of  Developer");
	    Developer dv = new Developer();
	    dv.calculateSalary(3, "Joy", 55000);
	    System.out.println("--------------------------------");
	    
		System.out.println("This is the details of Maneger");
		Tester tv = new Tester();
		tv.calculateSalary(4, "Jack ", 45000);
		System.out.println("--------------------------------");
	}
}
