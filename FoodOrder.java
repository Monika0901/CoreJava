package PracticeQuestionMethod;

public class FoodOrder {
	
	    void placeOrder(String item, int quantity) {
	        int price = 150;
	        int bill = price * quantity;

	        System.out.println("Item : " + item);
	        System.out.println("Quantity : " + quantity);
	        System.out.println("Total Bill : " + bill);
	    }
	}

