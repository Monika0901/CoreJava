/*Overload a method calculate() to find:
square of a number
cube of a number*/


package MethodOverloading;

public class Number {

	public int calculate(int num) {
		return num*num ;
	}
	
	public int calculate(int num, int cube) {
		return num*num*num;
	}
}
