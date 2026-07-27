//Find highest among 4 numbers using nested if-else (no arrays)

package Practicesession;

public class HighestNumber {

	public void number( int num1, int num2 , int num3, int num4) {
		
		if(num1>num2 && num1> num3 && num1> num4) {
			System.out.println("Num1 is Greater");
		}
		
		if(num2>num1 && num2>num3 && num2>num4) {
			System.out.println("Num2 is Greater");
		}
		
		if(num3>num1 && num3> num2&& num3> num4) {
			System.out.println("Num3 is Greater");
		}
		
		if(num4>num1 && num4>num2 && num4>num3) {
			System.out.println("Num4 is Greater");
		}
		
	}
}
