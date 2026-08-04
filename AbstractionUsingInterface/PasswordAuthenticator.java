/*
 * Authentication System Using Interface

Create an interface Authenticator with the method:

void authenticateUser();

Create the classes PasswordAuthenticator and OTPAuthenticator that implement the
 Authenticator interface. Each class should provide its own authentication logic using
  method overriding. Demonstrate abstraction using an interface reference.
 */
package AbstractionUsingInterface;

import java.util.Scanner;

public class PasswordAuthenticator implements Authenticator {

	@Override
	public void authenticateUser() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter password");
		int password = sc.nextInt();
		
		if (password == 1234) {
			System.out.println("login Successful !");
		}
		else {
			System.out.println("invalid password");
		}
		
	}

}
