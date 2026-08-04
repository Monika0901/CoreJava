
/*
 * E-commerce Return System (Interview Level) 
 * Interfaces: OrderService PaymentService ReturnService RefundService 
 * Create class Flipkart. 
 * Challenge: Simulate complete order flow. 
 * Demonstrate upcasting and interface-based design. 
 */

package AbstractionUsingInterface;

public class FlipkartMain {

    public static void main(String[] args) {

        OrderService order = new Flipkart();
        order.placeOrder();

        PaymentService payment = new Flipkart();
        payment.makePayment();

        ReturnService returns = new Flipkart();
        returns.returnOrder();

        RefundService refund = new Flipkart();
        refund.refundAmount();
    }
}
