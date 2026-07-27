/*
 * 
Create overloaded methods area():
Circle → area(double radius)
Rectangle → area(int l, int b)
Triangle → area(int base, int height)
 */


package Practicesession;

public class Areamain {
  public static void main(String args[]) {
	  Area ar = new Area();
	  ar.area(8);
	  ar.area(3, 4);
	  ar.area(4, 7);
  }
}
