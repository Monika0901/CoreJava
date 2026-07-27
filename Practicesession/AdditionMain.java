/*
 * Create method add():

add(int, int)
add(int, int, int)
add(double, double)+
Print result for all cases
 */

package Practicesession;

public class AdditionMain {
   
	public static void main(String args[]) {
		
		Addition ad = new Addition();
		
	    System.out.println("Addition of two int number is = "+ "" +ad.add(6, 7));
		
	    System.out.println("Addition of three int number is = "+ "" +ad.add(6, 7 ,6));
	    
		
	    System.out.println("Addition of two double number is = "+ "" +ad.add(6.5, 7.4));
	}
}
