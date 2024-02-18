package exam2;

public class Main {
    public static void main(String[] args) {
        Subject subject = new YoutubeSubject();
        subject.attach(new EmailObserver());
        subject.attach(new SmsObserver());

        subject.notifyChange("This is new message");
    }
}
