/*
 *Question: Calculator Using Method Overloading and Overriding

Create a parent class Calculator.

* Create overloaded methods:

  * add(int, int)
  * add(double, double)

Create a child class ScientificCalculator.

* Override add(int, int).
* Create a new method `power(int base, int exponent).

Create a Main class and call all methods.

 */

package MethodOveriding;



public class Calculator {

	
	public void add( int a , int b) {
		int addition =  a+ b;
		System.out.println("Addition of int Number = "+ " "+ addition);
	}
	
	public void add( double a , double b) {
		double addition =  a+ b;
		System.out.println("Addition of double NUmber = "+ " "+ addition);
	}
}
