//Write a program to count even and odd numbers in a 1D array.
package ArrayExample;

public class ArrayEvenOdd {
   public static void main (String args[]) {
	   boolean isEven = false;
	   int [] arr = {1,40,5,30,70};
	   
	   for(int i=0; i<arr.length; i++) {
		   
		   if(arr[i] % 2 == 0) {
			 
		 System.out.println(arr[i] +" "+ " : Number is Even"  );
		   } 
		   
		   else {
			   System.out.println(arr[i]+ " " + " : Number is Odd" );
		   }
	   }
	   
	  
	   
   };
}
