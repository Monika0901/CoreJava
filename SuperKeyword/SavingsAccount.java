package SuperKeyword;

public class SavingsAccount extends BankAccount {

	   // Child class variable
	double interestRate;
	
	// Child class constructor
	public SavingsAccount(int accountNumber, double interestRate) {
		

        // Call parent class constructor
		super(accountNumber);
		
		// Initialize child class variable
		this.interestRate =  interestRate;
	
	}
	
	// Display both parent and child variables

	 public void display() {
		   	System.out.println(" accountNumber = "+ " "+this.accountNumber );
			System.out.println(" interestRate = "+ " "+this.interestRate ); 
	 }

}
