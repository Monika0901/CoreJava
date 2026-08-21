//Write a program to find the sum of all elements in a 1D array.
package ArrayExample;

public class ArraySum {

	public static void main(String args[]) {
		
		int sum = 0;
	int [] s = {9,1,3,4,4,5,20,6,98,23,11,9};
	
    for(int i= 0; i<s.length ; i++) {
    	 sum= sum+s[i];
    }
    System.out.println(sum);
}
}