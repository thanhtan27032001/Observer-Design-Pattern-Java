package exam1;

public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();
        subject.attach(message -> System.out.println("New message of observer 1: " + message));

        Observer observer2 = message -> System.out.println("New message of observer 2: " + message);
        subject.attach(observer2);

        subject.notifyChange("Test 1");
        subject.detach(observer2);
        subject.notifyChange("Test 2");
    }
}