/*
 * Create a parent class Employee with methods:

work()
calculateSalary()

Create child classes:

Manager
Developer
Tester
 */


package DynamicMethodDispatch;

public class Employee {

	public void work() {
		System.out.println("Employee do work");
	}
	
	public void calculateSalary(double Salary) {
		System.out.println("Employee Salary ");
	}

	
}
