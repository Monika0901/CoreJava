/*
 * Employee Salary Management
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

public class  Employee {
     
	int id;
	String name;
	double salary;
	
	public void calculateSalary(int id , String name , double salary) {
		
		  this.id = id;
	      this.name = name;
	       this.salary = salary;
		
		System.out.println("Employee id = "+ id);
		 System.out.println("Employee Name = "+ name);
		 System.out.println("Employee salary = "+ salary);

	}
}
