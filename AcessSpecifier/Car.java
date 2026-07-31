/*
 * Default Access

Create package com.demo

Class Vehicle

int speed = 80;
void showSpeed()

Create another class Car in the same package.

Access both members.

Now create another package com.test.


 */

package AcessSpecifier;

public class Car {
	
	 public static void main(String[] args) {
		 Vehicle v = new Vehicle();
		 v.showSpeed();
		 
	 }
}
