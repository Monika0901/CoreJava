package MethodOverloading;

public class ClaculatorMain {

	
	
	public static void main (String args[]) {
		Calculator cl = new Calculator();
		System.out.println("Addition of two number ="+ " "+ cl.add(23,2));
		System.out.println("Addition of three number ="+ " "+ cl.add(23,2,8));
	}
}
