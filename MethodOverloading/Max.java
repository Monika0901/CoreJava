/*Create a method max() to find maximum of:
two numbers
three numbers */


package MethodOverloading;

public class Max {
  
	//method for two numbers
	public void max(int a , int b) {
		System.out.println("In given two number");
		
		if(a>= b) {
			System.out.println("a is greater");
			}
		else {
			System.out.println("b is greater");
		}
	}
	
	//method for three numbers
	
	public void max( int a, int b, int c) {
		System.out.println("In given three number");
		
		if(a>=b && a>=c) {
			System.out.println("a is greater");
		}
		else if(b>=a && b>=c) {
			System.out.println("b is greater");
		}
		else {
			System.out.println("c is greater");
		}
	}
}
