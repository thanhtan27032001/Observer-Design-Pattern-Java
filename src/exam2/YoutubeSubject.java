package exam2;

public class YoutubeSubject extends Subject{
    @Override
    public void notifyChange(Object object) {
        for (Observer observer: observerList) {
            observer.update(object);
        }
    }
}
