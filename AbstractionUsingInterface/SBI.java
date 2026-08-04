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

public class SBI implements Bank {

	@Override
	public void interestRate(int interest) {
		System.out.println("The interestRate of SBI " + interest);
		
	}

}
