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

public class ScientificCalculator extends Calculator {

	@Override
	public void add(int a , int b ) {
		int addition =  a + b;
		System.out.println("Overridden Integer Addition = = "+ " "+ addition);
	}
	
	public void power(int base, int exponent) {

        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result = result * base;
        }

        System.out.println("Power = " + result);
    }
	}
	

