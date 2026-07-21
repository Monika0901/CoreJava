/*Question:
Create a ShoppingCart class with private variables:

itemName
price
quantity

Methods:

Calculate total
Apply 10% discount if bill > ₹5000
Display final bill*/



package Encapsulation;

public class ShoppingCart {

	//private variables:
	private String itemName;
	  private int price;
	  private int quantity;
	 
	  
	  public String getItemName() {
		return itemName;
	  }
	  public void setItemName(String itemName) {
		this.itemName = itemName;
	  }
	  public int getPrice() {
		return price;
	  }
	  public void setPrice(int price) {
		this.price = price;
	  }
	  public int getQuantity() {
		return quantity;
	  }
	  public void setQuantity(int quantity) {
		this.quantity = quantity;
	  }
	  
	  //Calculate total
	  int getCalculateTotal(){
		int total =price* quantity;
		return total;
	  }
	  
	  
	  int getdiscount() {

		    int total = getCalculateTotal();

		    if (total > 5000) {
		        total = total - (total * 10 / 100);
		    }

		    return total;
		}
		
	 }
	  

