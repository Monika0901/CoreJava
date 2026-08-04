/*
 * Create an interface Notification with method:

void sendMessage();

Create classes:

Email
SMS
WhatsApp

All classes should implement Notification.
 */
package AbstractionUsingInterface;

public class Email implements Notification {

	@Override
	public void sendMessage() {
		System.out.println("Email notification sent.");
		
	}

}
