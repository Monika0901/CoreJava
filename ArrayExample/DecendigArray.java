//Write a program to sort a 1D array in descending order.
package ArrayExample;

public class DecendigArray {
    public static void main(String args[]) {
    	int temp;
    	int [] a= { 10,34,62,54,67};
    	
    	
    	for (int i = 0; i<a.length; i++) {
    		for (int j = 0; j<a.length; j++) {
    			 if(a[j]<a[i]) {
    				 temp = a[i];
    				 a[i]  = a[j];
    				 a[j] = temp;
    			 }
    			 }
    		}
    	
    	for (int i =0 ; i<a.length ;i++) {
    		System.out.println(a[i]);
    	}
    	}
    }

	

