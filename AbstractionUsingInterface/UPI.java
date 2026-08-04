package AbstractionUsingInterface;

public class UPI implements Payment{

	@Override
	public void processPayment(double amount) {
	     System.out.println("UPI Payment = " + amount);
		
	}

}
