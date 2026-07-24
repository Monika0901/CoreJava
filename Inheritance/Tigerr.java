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

public class Tigerr extends Catt {
	
	public void show4() {
		System.out.println("this is method of tiger");
	}
  public static void main(String args[]) {
		
		Tigerr tr = new Tigerr();
		tr.Show1();//method for Animal
		tr.show3();//Method for Cat
		tr.show4();// method for Tiger

        // t.show4();   // Not allowed because Tiger does not inherit Dog
	}
   
}
