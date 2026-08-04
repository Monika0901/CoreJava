/*
 * Authentication System Using Interface

Create an interface Authenticator with the method:

void authenticateUser();

Create the classes PasswordAuthenticator and OTPAuthenticator that implement the
 Authenticator interface. Each class should provide its own authentication logic using
  method overriding. Demonstrate abstraction using an interface reference.
 */

package AbstractionUsingInterface;

public interface Authenticator {

	void authenticateUser();
}
