package exam2;

public class SmsObserver implements Observer {
    @Override
    public void update(Object object) {
        System.out.println("Send notification to phone: " + object.toString());
    }
}
