/*
 * Create classes GrandParent → Parent → Child.
Each class has one variable:
a=1, b=2, c=3.
Print all values using object of Child.

 */


package Inheritance;

public class ChildC extends ParentP {
  int c= 3;
  
 public static void main(String args[]) {
	 
	 ChildC ch =new ChildC();
	 System.out.println("The Value of a "+ " "+ch.a);
	 System.out.println("The Value of b "+ " "+ch.b);
	 System.out.println("The Value of c "+ " "+ch.c);
 }
}
