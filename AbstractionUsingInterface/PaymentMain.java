package AbstractionUsingInterface;

public class PaymentMain {
	

	    public static void main(String[] args) {

	        Payment p;

	        p = new CreditCard();
	        p.processPayment(5000);

	        p = new DebitCard();
	        p.processPayment(3000);

	        p = new UPI();
	        p.processPayment(1000);
	    }

}
