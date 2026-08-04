package AbstractionUsingInterface;

public class Burger  implements Food{

	@Override
	public void displayPrice(double price) {
		 System.out.println("Burger Price = " + price);
		
	}

}
