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

public class Tester extends Employee {
	
	@Override
	public void work() {
		System.out.println("tester remove all bugs in code");
	}
	 
	@Override
	public void calculateSalary(double salary) {
		System.out.println("Tester salary =  "+ salary);
		
		double bonus = (salary*5)/100;
		System.out.println("Tester bouns =  "+ bonus);
		
		double totalSalary = salary + bonus;
		System.out.println("Tester salary after 5% bonus =  "+ totalSalary );
		
	}
}
