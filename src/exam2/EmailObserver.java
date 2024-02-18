package exam2;

public class EmailObserver implements Observer {
    private final String emailAddress;
    private String lastNotification;

    public EmailObserver(String emailAddress) {
        this.emailAddress = emailAddress;
        this.lastNotification = "";
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getLastNotification() {
        return lastNotification;
    }

    @Override
    public void update(Object object) {
        lastNotification = object.toString();
        sendLastNotification();
    }

    private void sendLastNotification() {
        System.out.println("Send notification \"" + lastNotification + "\" to email " + emailAddress);
    }
}
