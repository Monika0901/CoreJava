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

import MethodOveriding.Developer;
import MethodOveriding.Tester;

public class EmplyeeMain {
    
	
	public static void main(String args[]) {
		
		Employee em;
		
		em = new Manager();
		em.work();
		em.calculateSalary(65000);
	
		em = new DynamicMethodDispatch.Developer();
		em.work();
		em.calculateSalary(45000);
		
		em = new DynamicMethodDispatch.Tester();
		em.work();
		em.calculateSalary(30000);
		
	}
}
