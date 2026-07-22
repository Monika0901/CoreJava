package MethodOverloading;

public class TempreatureMain {

	

	    public static void main(String[] args) {

	        // Create object of Temperature class
	       Tempreature obj = new  Tempreature();
	       
	        System.out.println("25C = " + obj.convert(25.0) + "F");

	        System.out.println("98F = " + obj.convert(98) + "C");
	    }
	}
