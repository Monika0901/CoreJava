//Write a program to copy elements from one array to another.

package ArrayExample;

public class duplicateArray {

	public static void main(String []args) {
		
		int [] a = {1,2,3,4,5,6,7,8,9};
		int [] b = new int[a.length];
		
		System.out.println("First array");
		for (int i =0 ;i<a.length;i++) {
			System.out.println(a[i]);
			b[i]=a[i] ;
		
		}
		System.out.println("Copied array");
		for (int i =0 ;i<a.length;i++) {
			System.out.println(b[i]);
		
		
		}
		
	}
	}

