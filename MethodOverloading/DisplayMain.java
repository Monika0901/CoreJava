package MethodOverloading;

public class DisplayMain {

	
	public static void main (String args[]) {
		
		Display d = new Display();
		
		System.out.println("Display integer  number ="+ " "+ d.display(3));
		System.out.println("Display String ="+ " "+ d.display("Monika"));
}
}
