//Write a program to find duplicate elements in a 1D array.

package ArrayExample;

public class DuplicsteElement {
	public static void main(String args[]) {
		 int [] arr = {10,30,25,67,30,10};

	for (int i = 0; i<arr.length; i++) {
		for ( int j=i+1 ;j<arr.length;j++) {
			if(arr[i] == arr[j]) {
				System.out.println("Duplicate element: " + arr[i]);
				
			}
		}
	}
	
 
}
}
