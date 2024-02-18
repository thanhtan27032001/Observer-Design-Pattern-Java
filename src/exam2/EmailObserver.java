package exam2;

public class EmailObserver implements Observer{
    @Override
    public void update(Object object) {
        System.out.println("Send notification to email: " + object.toString());
    }
}
