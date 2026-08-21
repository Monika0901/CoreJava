//Write a program to search an element in a 1D array.

package ArrayExample;

import java.util.Scanner;

public class ArraySearchElement {
    public static void main(String args[]) {
    	
  int num= 3;
  boolean isFound = false;
	int[] arr = new int [5];
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the number");
	
	for(int i =0; i<arr.length;i++) {
		 arr[i]= sc.nextInt();
				 
	}
	
	 for (int i : arr) {
		 if (num == i) {
			isFound =true;
			
		 }
	}
	 if(isFound== true) {
		 System.out.println("element is found....");
	 }
	 else {
		System.out.println("element is not  found....");
	 }
		 
	     }
	
}

