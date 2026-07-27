/*
 * Check loan eligibility
Salary > 25,000
Age between 21–60
If both true → Eligible
Else → Not Eligible
 */


package Practicesession;

import java.util.Scanner;

public class Loan {

	public void eligibility() {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter your Salary");
		  int salary = sc.nextInt();
		  
	
			 System.out.println("Enter your Age");
			  int age = sc.nextInt();
			  
			  if(salary >25000) {
				  if(age >= 21 && age <= 60  ) {
					  System.out.println("You are eligible for loan");
				  }
				  else {
					  System.out.println("You are not eligible for loan");
				  }
			  }
			  else {
				  System.out.println("You are not eligible for loan");
			  }
		 
	}
}
