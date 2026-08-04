package AbstractionUsingInterface;

public class AccountMain {
	public static void main(String[] args) {

        Account a;

        a = new SavingsAccount();
        a.displayAccount("SB12345", 25000);

        a = new CurrentAccount();
        a.displayAccount("CA67890", 50000);
    }
}
