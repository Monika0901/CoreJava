/*
 * Private Access
Create class Bank
private variable balance
private method calculateInterest()
public method displayBalance()

Questions:

Can another class access balance?
Can another class call calculateInterest()?
How can the balance be displayed?
 */
package AcessSpecifier;

public class Bank {
	private double balance = 10000;
	
	
	private void calculateInterest() {
		 double rate = 8;
	     double time = 2;
		double interest = (balance * rate * time) / 100;
        System.out.println("Simple Interest = " + interest);
    }
			
	public void displayBalance() {
		
		  System.out.println("Balance = " + balance);
		  this.calculateInterest();
	}
	
	
}

