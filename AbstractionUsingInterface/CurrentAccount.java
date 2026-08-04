package AbstractionUsingInterface;

public class CurrentAccount implements Account {

    @Override
    public void displayAccount(String accountNumber, double balance) {
        System.out.println("Current Account");
        System.out.println("Account Number = " + accountNumber);
        System.out.println("Balance = " + balance);
    }

}
