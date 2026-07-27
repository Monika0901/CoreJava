/*
 * Create class Employee:

fields: name, salary

Subclass Manager:

add bonus
Calculate total salary
 */

package Practicesession;

import java.util.Scanner;

public class Employee {

	String name;
	double salary;
	public void salary() {
		
		 Scanner sc= new Scanner(System.in);
		 
			System.out.println("Enetr your name");
			 name = sc.nextLine();
			
			System.out.println("Enetr your salary");
			salary =sc.nextDouble();
			
			
			 System.out.println("Name  = "+ " "+ name);
		}

}
