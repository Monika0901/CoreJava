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

public class Developer extends Employee {

	@Override
	public void work() {
		System.out.println("Developer do coding in office");
	}
	 
	@Override
	public void calculateSalary(double salary) {
		System.out.println("Developer salary =  "+ salary);
		
		double bonus = (salary*7)/100;
		System.out.println("Developer bouns =  "+ bonus);
		
		double totalSalary = salary + bonus;
		System.out.println("Developer salary after 7% bonus =  "+ totalSalary );
		
	}
}
