/*
 * Bank Account

Create:

Parent class: BankAccount

Variable: accountNumber
Constructor: BankAccount(int accountNumber)

Child class: SavingsAccount

Variable: interestRate
Constructor: SavingsAccount(int accountNumber, double interestRate)

Requirements:

Use super(accountNumber) to call the parent constructor.
Use this.interestRate to initialize the child variable.
Create display() to print both details.
 */

package SuperKeyword;

public class BankAccount {

	// Parent class variable
 int accountNumber;
 
 public BankAccount(int accountNumber) {
	 
	// Parent class constructor
	 this.accountNumber =accountNumber;
 }
}
