/*
 * Vehicle Rental System

Create a parent class Vehicle.

Create child classes:

Bike
Car
Bus

Requirements:

Override calculateRent().
Calculate rent based on the number of rental days.
Apply different discounts for each vehicle type.
Display the final rental amount.
 */


package MethodOveriding;

public class Vehical {
      int price;
      int days;
	
	public void calculateRent( int price ,int days) {
		
		
	     int total =  price* days;
	     
	     System.out.println("Price per Day = " + price);
	     System.out.println("Rental Days = " + days);
	     System.out.println("Total Rent = " + total);
	}
}
