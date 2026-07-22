package MethodOverloading;

public class AreaMain {
	public static void main (String args[]) {
		Area ar = new Area();
		System.out.println("Area of Circle  ="+ " "+ ar.area(5.4));
		System.out.println("Area of Rectangle ="+ " "+ ar.area(4, 8.6));
	}
}
