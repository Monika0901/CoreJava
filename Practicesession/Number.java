/*
 * Check if number is Armstrong (e.g., 153)

Return true/false
Call method from main() and print result
 */

package Practicesession;


public class Number {
 
	public boolean isArmstrong(int num) {

        int original = num;
        int sum = 0;

        while (num != 0) {
            int digit = num % 10;
            sum = sum + (digit * digit * digit);
            num = num / 10;
        }

        return sum == original;
    }

	}

