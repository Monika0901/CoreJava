//Write a program to reverse a 1D array.
package ArrayExample;

public class ArrayReverse {
	public static void main(String args[]) {
		 int [] arr = {10, 4, 6,78,34,56,};
		 
		 System.out.println( "The Array");
		 for ( int i=0 ; i<arr.length ; i++) {
			 System.out.println( arr[i]);
		 }
		
		 System.out.println( "The reverse Array");
		 for ( int i = arr.length-1; i>=0 ; i--) {
			 System.out.println( arr[i]);
		 }
	}

}
