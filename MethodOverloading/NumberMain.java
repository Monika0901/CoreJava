package MethodOverloading;

public class NumberMain {
   
	public static void  main(String args[]) {
		 
		Number nm = new Number();
		System.out.println("Square of a number =" + " "+ nm.calculate(5));
		System.out.println(" Cube of a number =" + " "+ nm.calculate(5,1));
	}
}
