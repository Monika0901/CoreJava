/*
 * Hospital Management

Question:
Create a parent class Doctor with a method treatPatient().
Create child classes Cardiologist and Dentist.
Override the method and call it using a Doctor reference.
 */
package DynamicMethodDispatch;

public class Cardiologist extends Doctor{
	
	@Override
		public void treatPatient() {
		System.out.println("\"Cardiologist is treating a heart patient.");
		}
}
