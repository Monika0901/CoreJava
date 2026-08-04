package AbstractionUsingInterface;

public class DebitCard implements Payment {

	@Override
	public void processPayment(double amount) {
		 System.out.println("Debit Card Payment = " + amount);
		
	}

}
