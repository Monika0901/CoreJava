package Encapsulation;

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