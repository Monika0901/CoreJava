/*
 * Create class structure:

       Animal
       /    \
   Dog      Cat
             |
           Tiger


Add one method in each class and call all methods using Tiger object.
 */



package Inheritance;

public class Dogg extends Animall{
    
	public void show2() {
		System.out.println("this is method of Dog");
	}
	// we are creating object for dog in dog class because we can not call from tiger.
	//because tiger class does not inherit the properties of dog 
	
	public static void main(String args[]) {
		
		Dogg dg = new Dogg();
		dg.Show1();//method for Animal
		dg.show2();//Method for Dog
	}
}
 