/*
 * Smart Home Automation

Create the following interfaces:

Light
void turnOnLight();
Fan
void turnOnFan();
AC
void turnOnAC();

Create a class SmartHome that implements all three interfaces and provides appropriate
 implementations for all the methods.
 */


package AbstractionUsingInterface;

public class SmartHome implements Fan ,AC ,Light{

	
	@Override
	public void turnOnLight() {
		System.out.println("Turn on Light");
		
	}

	@Override
	public void turnOnAC() {
		System.out.println("Turn on AC");
		
	}

	@Override
	public void turnOnFan() {
		System.out.println("Turn on Fan");
		
	}

}
