/*
 * Create interface

Bank

Method

void interestRate();

Classes

SBI
HDFC
ICICI

Print different interest rates.
 */
package AbstractionUsingInterface;

public class BankMain {

	public static void main(String args[]) {
		
		Bank b;
		
		b = new SBI();
		b.interestRate(5);
		
		b= new HDFC();
		b.interestRate(9);
		
		b= new ICICI();
		b.interestRate(7);
	}
}
