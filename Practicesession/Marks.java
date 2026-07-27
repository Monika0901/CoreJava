/*
 * Take student name, 3 subject marks
Calculate average
Print Grade:
A → >75
B → 60–75
C → 40–60
Fail → <40
 */

package Practicesession;

import java.util.Scanner;

public class Marks {
	
	public void Average() {
		
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter your name" );
		String name = sc.nextLine();
		
		
		System.out.println("Enter your Math MArks" );
		int M1=sc.nextInt();
		
		
		System.out.println("Enter your physics MArks" );
		int M2= sc.nextInt();
		
		
		System.out.println("Enter your Chemistry MArks" );
		int M3=sc.nextInt();
		
		int marks= M1+M2+M3 ;
		double percentage = (marks * 100.0) / 300;
		System.out.println("Student Name: " + name);
		System.out.println("your percentage" + " " +percentage);
	
	if(percentage >= 75) {
	System.out.println("Your Greade is A");
	}
	else if (percentage >= 60) {
		System.out.println("Your Greade is B");	
	}
	else if (percentage >= 40) {
		System.out.println("Your Greade is C");	
	}
	else  {
		System.out.println("Your  are fail");	
	}
	
	
	}
}
