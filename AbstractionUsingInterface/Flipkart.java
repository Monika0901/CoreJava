

/*
 * E-commerce Return System (Interview Level) 
 * Interfaces: OrderService PaymentService ReturnService RefundService 
 * Create class Flipkart. 
 * Challenge: Simulate complete order flow. 
 * Demonstrate upcasting and interface-based design. 
 */


package AbstractionUsingInterface;

public class Flipkart implements OrderService, PaymentService,ReturnService,RefundService {

	@Override
	public void refundAmount() {
		 System.out.println("Order Placed Successfully");
		
	}

	@Override
	public void returnOrder() {  
		System.out.println("Payment Successful");
		
	}

	@Override
	public void makePayment() {
		  System.out.println("Order Returned Successfully");
		
	}

	@Override
	public void placeOrder() {
		 System.out.println("Refund Initiated");
		
	}

}
