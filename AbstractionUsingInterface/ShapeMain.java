package AbstractionUsingInterface;

public class ShapeMain {
   public static void main(String args[]) {
	   
	   Shape sc;
	   sc = new Triangle();
	   
	   sc.area();
	   
	   sc = new Circle();
	   sc.area();
	   
	   sc = new Rectangle();
	   sc.area();
	   
   }
}
