/* Question:
Create a BankAccount class with a private balance.
Add:
deposit(double amount)
withdraw(double amount)
getBalance()
*/

package Encapsulation;

public class BankAccount {

    // Private data member
    private double balance;

    // Setter for initial balance
    public void setBalance(double balance) {
        this.balance = balance;
    }
    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Deposit method
    public void setDeposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposited Amount = " + amount);
        } else {
            System.out.println("Invalid Deposit Amount");
        }
    }

    // Withdraw method
    public void setWithdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn Amount = " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}