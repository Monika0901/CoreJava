/*
 * Write a Java program to demonstrate abstraction using an interface.

Create an interface Employee with the method:

void calculateSalary(double salary);
Implement the interface in the classes:
PermanentEmployee
ContractEmployee
Intern
Override the calculateSalary() method in each class.
In the EmployeeMain class, create an Employee reference, 
create objects of all three classes, and call calculateSalary() with different salary values
 */
package AbstractionUsingInterface;

public class Intern implements Employee {

	@Override
	public void calculateSalary(double salary) {
		System.out.println("Salary of  Intern = "+salary );
		
	}

}
