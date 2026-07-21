package Encapsulation;

public class RectangleMain {
   
	public static void main(String args[]) {
		
		Rectangle gt = new Rectangle();
		gt.setLength(13);
		gt.setBreadth(12);
		
		System.out.println("the lenth of Rectangle= "+ " "+gt.getLength());
		System.out.println("The breadth of rectangle" + " " + gt.getBreadth());
		System.out.println("the Area of rectangle" + " "+gt.getArea());
	}
}
