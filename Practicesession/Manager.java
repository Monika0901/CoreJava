/*
 * Create class Employee:

fields: name, salary

Subclass Manager:

add bonus
Calculate total salary
 */

package Practicesession;

import java.util.Scanner;

public class Manager extends Employee {
        
	public void bonus() {
		
       Double bonus =( salary * 10 ) / 100;
       Double totalSalary = salary + bonus;
       
      
       System.out.println("Salary  = "+ " "+ salary);
       System.out.println("Salary after 10 % bonus =" + " "+totalSalary);
		
	}
	
	public static void main(String args[]) {
		Manager mn = new Manager();
		mn.salary();
		mn.bonus();
	}

	}
