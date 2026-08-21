//Write a program to sort a 1D array in ascending order
package ArrayExample;

public class ArrayAcending {
	
	public static void main(String args[]) {
		
   int [] a = {23,43,51,12,24};

   int temp;
   for(int i = 0; i< a.length; i++) {
	   
	   for(int j = 0; j< a.length; j++) {
		   if(a[i]< a[j]) {
			temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			
		   }
	   }
	   }
// Print the sorted array
   for (int i = 0; i < a.length; i++) {
       System.out.println(a[i]);
   }
   
		   
	   }
   }
 

