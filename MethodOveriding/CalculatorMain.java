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

public class CalculatorMain {

	public static void main(String args[]) {
		
		
		 System.out.println("Calculator");
		Calculator cl = new Calculator();
		cl.add(3, 7);
		cl.add(4.5, 3.8);
		System.out.println("------------------------");
		
		

        System.out.println("Scientific Calculator");
		ScientificCalculator sc = new ScientificCalculator();
		sc.add(3, 5);
		sc.add(4.6, 2.3);
		sc.power(5, 2);
		System.out.println("------------------------");
	}
}
