/*
 * Create class BankAccount:

Private variables: balance
Methods:
deposit(amount)
withdraw(amount) (check balance)
getBalance()
Perform operations in main()
 */


package Practicesession;

import Encapsulation.BankAccount;

public class BankAccountMain {

	  public static void main(String[] args) {

	        BankAccount account = new BankAccount();

	        account.setBalance(10000);

	        System.out.println("Starting Balance = " + account.getBalance());

	        account.setDeposit(5000);

	        System.out.println("Balance After Deposit = " + account.getBalance());

	        account.setWithdraw(3000);

	        System.out.println("Final Balance = " + account.getBalance());
	    }
	
}
