/*
 * 
Create overloaded methods area():

Circle → area(double radius)
Rectangle → area(int l, int b)
Triangle → area(int base, int height)
 */


package Practicesession;

public class Area {

	public void area(double radius) {
		 double CircleArea = 3.14 * radius * radius;
		 System.out.println("The area of circle is ="+ " "+ CircleArea);		 
		 
	}
	
	public void area(int l, int b) {
		int rectrangleArea = l*b;
		System.out.println("The area  of Rectangle is = "+ " "+rectrangleArea);
		
	}
	
	public void area(double base , double height ) {
		System.out.println("The area of Triangle  is ="+ " "+0.5 *base * height);
	}
}
