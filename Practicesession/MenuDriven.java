package Practicesession;

import java.util.Scanner;

public class MenuDriven {

	
	public void Menu() {
		
		Scanner sc = new Scanner(System.in);
		
		    System.out.println("===== MENU =====");
	        System.out.println("1. Check Even/Odd");
	        System.out.println("2. Check Prime");
	        System.out.println("3. Reverse Number");
	        System.out.print("Enter your choice: ");
	        
	        int choice = sc.nextInt();
	        
	        
		switch(choice) {
		
		case 1:
			 System.out.print("Enter a number: ");
             int num1 = sc.nextInt();

             if (num1 % 2 == 0) {
                 System.out.println(num1 + " is Even.");
             } else {
                 System.out.println(num1 + " is Odd.");
             }
	    break;
		
         
		 case 2:
             System.out.print("Enter a number: ");
             int num2 = sc.nextInt();

             boolean isPrime = true;

             if (num2 <= 1) {
                 isPrime = false;
             } else {
                 for (int i = 2; i <= num2 / 2; i++) {
                     if (num2 % i == 0) {
                         isPrime = false;
                         break;
                     }
                 }
             }
             
             if (isPrime) {
                 System.out.println(num2 + " is a Prime Number.");
             } else {
                 System.out.println(num2 + " is Not a Prime Number.");
             }
             break;
       

		 case 3:
             System.out.print("Enter a number: ");
             int num3 = sc.nextInt();

             int reverse = 0;

             while (num3 != 0) {
                 int digit = num3 % 10;
                 reverse = reverse * 10 + digit;
                 num3 = num3 / 10;
             }

             System.out.println("Reversed Number = " + reverse);
             break;
     
	      default:
              System.out.println("Invalid Choice!");
      }

      sc.close();
  }

}

