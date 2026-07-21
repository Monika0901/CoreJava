package Encapsulation;

public class CarMain {

	public static void main(String args[]) {
		
		Car cr = new Car();
		cr.setBrand("TATA");
		cr.setModel("34");
		cr.setPrice(500000);
		
		
		System.out.println("The brand of Car" + " "+ cr.getBrand());
		System.out.println("The model of Car" + " "+ cr.getModel());
		System.out.println("The price of Car" + " "+ cr.getPrice());
		
		
	}
}
