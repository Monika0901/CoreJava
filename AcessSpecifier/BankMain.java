package AcessSpecifier;

public class BankMain {
   
	public static void main(String args[]) {
		 Bank b = new Bank();
		 b.displayBalance();
		 //System.out.println(b.balance);  //balance is declared private, so it can only be accessed within the Bank class
		 // b.calculateInterest(); //calculateInterest() is private, so it can only be called inside the Bank class.
		 
	}
}
