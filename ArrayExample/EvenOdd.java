//Write a program to count even and odd numbers in a 1D array.
package ArrayExample;

public class EvenOdd {
	
	public static void main(String args[]) {
		int evenNo = 0;
		int oddNo = 0;
   int [] arr = {1,2,3,4,5,6,7,8,9,};
   
   System.out.println("Even no are");
   for (int i = 0; i<arr.length; i++) {
	   if(arr[i] % 2 ==0) {
		   evenNo = arr[i];
		   System.out.println(evenNo);
	   }
	  
   }
   System.out.println("Odd no are");
   for (int i = 0; i<arr.length; i++) {
	   if(arr[i] % 2 !=0) {
		   oddNo = arr[i];
		 System.out.println(oddNo);
	   }
	}
}
}
