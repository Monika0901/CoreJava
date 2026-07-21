/*Car Information

Question:
Create a Car class with private variables:
brand
model
price

Use setters to assign values and getters to display them.*/

package Encapsulation;

public class Car {
	
	//private variables
     private String brand;
     private String model;
     private double price;
     
     
  //Getter and Setter
	 public String getBrand() {
		 return brand;
	 }
	 public void setBrand(String brand) {
		 this.brand = brand;
	 }
	 public String getModel() {
		 return model;
	 }
	 public void setModel(String model) {
		 this.model = model;
	 }
	 public double getPrice() {
		 return price;
	 }
	 public void setPrice(double price) {
		 this.price = price;
	 }
     
     
}
