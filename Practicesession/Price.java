/*
 * Take input:


Product name, quantity, price
Calculate total bill
If bill > 5000 → apply 10% discount
Print final amount
 */



package Practicesession;

import java.util.Scanner;

public class Price {

	public void Calculate() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Product name");
		String name = sc.nextLine();
		
		
		System.out.println("Enter Product quantity");
		int quantity =sc.nextInt();
		
		System.out.println("Enter  Product price");
		 int price = sc.nextInt();
		 
		 
		 System.out.println("product Name"+ " "+ name);
		 int totalBill = price * quantity;
		 System.out.println("Your total bill before Dicaunt = " + " "+ totalBill); 
		
		 
		 if(totalBill > 5000 ) {
			  int Discaunt= (totalBill*10)/100;
			  totalBill = totalBill - Discaunt;
			  System.out.println("your bill After Discaunt ="+ " "+ totalBill);
			  }
		 
		 else {
			 System.out.println("you are not eligiable for discaunt and your final bill id"+ " "+ totalBill);

		 }
	}
}
