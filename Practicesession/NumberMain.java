/*
 * Check if number is Armstrong (e.g., 153)
Return true/false
Call method from main() and print result
 */

package Practicesession;

import java.util.Scanner;

public class NumberMain {
  
	public static void main (String args[]) {
		
		  

		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter a number: ");
		        int num = sc.nextInt();

		       Number obj = new Number();

		        boolean result = obj.isArmstrong(num);

		        System.out.println(result);

		        sc.close();
		    
	}
}


