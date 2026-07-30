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

public class Manager extends Employee  {

	@Override
	public void work() {
		System.out.println("Manegar manage all th work in office");
	}
	 
	@Override
	public void calculateSalary(double salary) {
		System.out.println("Manegar salary =  "+ salary);
		
		double bonus = (salary*10)/100;
		System.out.println("Manegar bouns =  "+ bonus);
		
		double totalSalary = salary + bonus;
		System.out.println("Manegar salary after 10% bonus =  "+ totalSalary );
		
	}
}
