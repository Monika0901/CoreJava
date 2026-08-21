//Write a program to find the minimum element in a 1D array.
package ArrayExample;

public class ArrayMinElement {

	public static void main(String args[]) {
		
		 int min= 10;
		int [] arr = {10,50,3,20,80,60};
		
		for(int i = 0; i<arr.length;i++) {
			
			if(min>=arr[i]) {
				min= arr[i];
			}
		}
		System.out.println(min);
	}
}
