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

public class Maneger extends Employee {
   
	@Override
public void calculateSalary(int id , String name , double salary) {
		
		System.out.println("Maneger id = "+ id);
		 System.out.println("Maneger name = "+ name);
		 System.out.println("Maneger salary = "+ salary);
		 
		 double bonus = (salary*10)/100;
		 
		 double final_Salary = salary+ bonus;
		 System.out.println("Manager bonus = " + bonus);
		 System.out.println("Maneger final salary = "+ final_Salary);

		
	}
}
