package AbstractionUsingInterface;

public class CreditCard implements Payment {

	@Override
	public void processPayment(double amount) {
		System.out.println("Credit Card Payment = " + amount);
		
	}

}
