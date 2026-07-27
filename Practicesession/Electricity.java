/*
 * 
Create a method calculateElectricityBill(int units):

First 100 units → ₹5/unit
Next 100 → ₹7/unit
Above 200 → ₹10/unit
Return total bill.
Q2.

 */

package Practicesession;

public class Electricity {

	public int calculateElectricityBill(int units) {
		
		int bill;
		if(units <= 100) {
			bill= units*5;
			
			}
		
		else if(units <= 200 ) {
			bill= (100 * 5) + ((units - 100) * 7);
			
			
		}
		else {
			bill= (100 * 5) + (100 * 7) + ((units - 200) * 10);
			
		}
		
		return bill;		 
	}
}
