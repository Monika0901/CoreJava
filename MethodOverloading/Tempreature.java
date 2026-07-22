/*Overload a method convert() to convert:
Celsius to Fahrenheit
Fahrenheit to Celsius*/

package MethodOverloading;

public class Tempreature {
	

	    // Method to convert Celsius to Fahrenheit
	    public double convert(double celsius) {
	        return (9.0 / 5.0) * celsius + 32;
	    }

	    // Overloaded method to convert Fahrenheit to Celsius
	    public double convert(int fahrenheit) {
	        return (5.0 / 9.0) * (fahrenheit - 32);
	    }
	}
