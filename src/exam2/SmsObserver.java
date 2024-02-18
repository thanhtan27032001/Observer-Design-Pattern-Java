package exam2;

public class SmsObserver implements Observer {
    private String phoneNumber;
    private String lastSMS;

    public SmsObserver(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        this.lastSMS = "";
    }

    public void changePhoneNumber(String newPhoneNumber) {
        this.phoneNumber = newPhoneNumber;
    }

    @Override
    public void update(Object object) {
        lastSMS = object.toString();
        sendNotification();
    }

    private void sendNotification() {
        System.out.println("Send notification \"" + lastSMS + "\" to phone " + phoneNumber);
    }
}
