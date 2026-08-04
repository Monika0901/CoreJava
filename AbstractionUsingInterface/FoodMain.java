package AbstractionUsingInterface;

public class FoodMain {
	 public static void main(String[] args) {

	        Food f;

	        f = new Pizza();
	        f.displayPrice(250);

	        f = new Burger();
	        f.displayPrice(150);
}
}
