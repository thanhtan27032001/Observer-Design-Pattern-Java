package exam2;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    protected final List<Observer> observerList = new ArrayList<>();

    public void attach(Observer observer){
        observerList.add(observer);
    }

    public void detach(Observer observer){
        observerList.remove(observer);
    }

    public abstract void notifyChange(Object object);
}
