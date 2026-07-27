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

public class ElectricityMain {

	public static void main(String args[]) {
		Electricity ec = new Electricity();
		int totalBill = ec.calculateElectricityBill(250);
		System.out.println("Total Electricity Bill = ₹" + totalBill);
	}
}
