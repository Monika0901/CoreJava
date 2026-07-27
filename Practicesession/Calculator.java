/*
 * Create a calculator using switch

Input: two numbers + operator (+, -, *, /)
Perform operation using switch
 */


package Practicesession;

import java.util.Scanner;

public class Calculator {
  public void m1() {
	Scanner sc = new Scanner(System.in);
	
	System.out.println ("Enter num1");
	int num1 =sc.nextInt();
	
	System.out.println ("Enter num2");
	int num2 =sc.nextInt();
	
	System.out.println ("Enter operator ");
	char operator = sc.next().charAt(0);
    
    switch(operator){
    
    
  //Addition
    case '+':
    	System.out.println("Result = " + (num1 + num2));
    break;
    
    
  //Subtraction
    case '-':
    	System.out.println("Result = " + (num1 - num2));
     break;
     
     
   //Multiplication
    case '*':
    	System.out.println("Result = " + (num1 * num2));
    break;
    
    
  //Division
     case '/':
  	System.out.println("Result = " + (num1 / num2));
     break;
  
  // Invalid operator
     default:
    	 System.out.println("Invalid Operator");
         
  
  }
  }
   
  }
 
