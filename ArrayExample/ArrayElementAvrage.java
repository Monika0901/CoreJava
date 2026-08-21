//Write a program to find the average of elements in a 1D array.

package ArrayExample;

public class ArrayElementAvrage {
   public static void main(String args[]) {
	   
	    int sum = 0;
	    
	   int [] arr = {10,20,30,40,50,60,70,80,90};
	   
	   for (int i = 0; i<arr.length; i++) {
		   sum= sum+arr[i];
	   }
	   
	   System.out.println("Sum of array element : "+sum);
	   
	   
	   int avrage = sum/arr.length;
	   System.out.println("Avrage of array element: "+avrage);
   }
}
