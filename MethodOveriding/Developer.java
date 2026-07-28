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

public class Developer extends Employee {

	@Override
	public void calculateSalary(int id , String name , double salary) {
		
		System.out.println("Developer id = "+ id);
		 System.out.println("Developer name = "+ name);
		 System.out.println("Developer salary = "+ salary);

          double bonus = (salary*8)/100;
		 
		 double final_Salary = salary+ bonus;
		 System.out.println(" Developer 7% bonus = " + bonus);
		 System.out.println("Developer final salary = "+ final_Salary);
	}
}
