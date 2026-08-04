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

public class SmartHomeMain {

	public static void main(String args[]) {
		
		Light l ;
		l = new SmartHome();
		l.turnOnLight();
		
		AC ac;
		ac = new SmartHome();
		ac.turnOnAC();
		
		Fan fn ;
		fn = new SmartHome();
		fn.turnOnFan();
	}
}
