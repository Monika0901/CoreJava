/* Overload a method login() with:
username
username and password*/


package MethodOverloading;

public class Login {
    


	    // Method to login with username
	    public void login(String username) {
	        System.out.println("Username = " + username);
	    }

	    // Overloaded method to login with username and password
	    public void login(String username, String password) {
	        System.out.println("Username = " + username);
	        System.out.println("Password = " + password);
	    }
	}

