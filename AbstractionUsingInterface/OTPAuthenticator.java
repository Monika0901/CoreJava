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

public class OTPAuthenticator implements Authenticator {

	@Override
	public void authenticateUser() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter OTP");
		int OTP = sc.nextInt();
		
		if (OTP == 8999) {
			System.out.println("Carrect OTP");
		}
		else {
			System.out.println("invalid OTP");
		}
		
		
	}

}
