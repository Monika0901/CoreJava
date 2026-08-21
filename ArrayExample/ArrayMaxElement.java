//Write a program to find the maximum element in a 1D array.


package ArrayExample;

public class ArrayMaxElement {

	public static void main(String [] args) {
		
		int max=0;
		
		int [] arr = {10,50,30,20,20,80,60};
		
		for(int i = 0; i<arr.length;i++) {
			
			if(max<=arr[i]) {
			max = arr[i];
			}
		}

			System.out.println(max);
		
		
}
	}
