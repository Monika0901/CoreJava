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

public class NotificationMain {
    public static void main(String args[]) {
    	
    Notification n;
    
     n = new SMS();
    n.sendMessage();
    
    n = new WhatsApp();
    n.sendMessage();
    
    n = new Email();
    n.sendMessage();
    
    }
}
