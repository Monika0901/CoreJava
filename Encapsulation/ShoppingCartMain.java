
package Encapsulation;

public class ShoppingCartMain {
  public static void main(String args[]) {
	  
   ShoppingCart sc = new ShoppingCart();
   
	  sc.setItemName("laptop");
      sc.setPrice(27000);
      sc.setQuantity(2);
      
      System.out.println("the name of product = " + " "+ sc.getItemName());
      System.out.println("the price of one  = " + " "+ sc.getPrice());
      System.out.println("The quantity is"+ " "+ sc.getQuantity());
      System.out.println("Total price is =" + " "+ sc.getCalculateTotal());
      System.out.println("price after discount is = " + " "+sc.getdiscount());
      
}
}
