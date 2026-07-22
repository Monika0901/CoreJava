// Write a program to show that return type alone cannot overload a method.

package MethodOverloading;

public class ReturnTypeDemo {
	 // First method
	    public int calculate(int a, int b) {
	        return a + b;
	    }

	    // Compile-time Error:
	    // Return type alone cannot overload a method
	    public double calculate(int a, int b) {
	        return a + b;
	    }
	}

