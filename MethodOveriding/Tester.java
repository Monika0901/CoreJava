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

public class Tester extends Employee {

	@Override
public void calculateSalary(int id , String name , double salary) {
		
		System.out.println("Tester id = "+ id);
		 System.out.println("Tester name = "+ name);
		 System.out.println("Tester salary = "+ salary);

         double bonus = (salary*5)/100;
		 
		 double final_Salary = salary+ bonus;
		 System.out.println("Tester 5 % bonus = " + bonus);
		 System.out.println("Tester final salary = "+ final_Salary);
	}
}
