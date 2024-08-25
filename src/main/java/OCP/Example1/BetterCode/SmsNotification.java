package OCP.Example1.BetterCode;

public class SmsNotification implements Notification{

    @Override
    public void send() {
        System.out.println("Sending sms...");
    }
}
