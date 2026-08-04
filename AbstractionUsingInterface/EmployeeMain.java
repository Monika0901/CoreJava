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

public class EmployeeMain {
 public static void main(String []args) {
	 
	 Employee e;
	 e = new PermanentEmployee();
	 e.calculateSalary(45000);
	 
	 e= new ContractEmployee();
	 e.calculateSalary(35000);
	 
	 e= new Intern();
	 e.calculateSalary(15000);
 }
}
