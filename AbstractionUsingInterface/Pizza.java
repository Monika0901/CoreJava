package AbstractionUsingInterface;

public class Pizza implements Food {

	@Override
	public void displayPrice(double price) {
		  System.out.println("Pizza Price = " + price);
		
	}

}
