package MethodOveriding;

public class VehicalMain {

	public static void main (String args[]) {
		System.out.println("This is the details of Vehical Rent");
		Vehical vc = new Vehical();
		vc.calculateRent(2300, 5);
		System.out.println("--------------------------------");
		
		
		System.out.println("This is the details of car Rent");
		Car cr = new Car();
		cr.calculateRent(3000, 6);
		System.out.println("--------------------------------");
		
		
		System.out.println("This is the details of Bike Rent");
		Bike b = new Bike ();
		b.calculateRent(2000, 8);
		System.out.println("--------------------------------");
		
		
		System.out.println("This is the details of Bus Rent");
		Bus bs = new Bus();
		bs.calculateRent(5000, 2);
		System.out.println("--------------------------------");
	}
}
