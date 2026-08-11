
//Write a Java program to write data into a file and handle IOException.
package Exception;

import java.io.FileWriter;
import java.io.IOException;

public class Write {
  
	public static void main(String [] args) {
		
		
		try {
			FileWriter file = new FileWriter("data.txt");
		     file.write("hello this is java file exception");
		     file.close();
		     System.out.println("Data write successully");
		     
		}
		catch( IOException e) {
			System.out.println("Error while writing data into file");
		}
	}
}