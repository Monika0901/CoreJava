package AbstractionUsingInterface;

public class SavingsAccount implements Account {

    @Override
    public void displayAccount(String accountNumber, double balance) {
        System.out.println("Savings Account");
        System.out.println("Account Number = " + accountNumber);
        System.out.println("Balance = " + balance);
    }

}
