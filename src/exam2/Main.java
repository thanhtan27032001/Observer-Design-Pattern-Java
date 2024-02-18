package exam2;

public class Main {
    public static void main(String[] args) {
        Subject subject = new YoutubeSubject();
        subject.attach(new EmailObserver("thanhtan@gmail.com"));
        subject.attach(new SmsObserver("0123456789"));

        subject.notifyChange("This is new message");
    }
}
