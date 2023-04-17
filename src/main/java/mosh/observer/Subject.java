package mosh.observer;

import java.util.ArrayList;
import java.util.List;

//a.k.a Observable
public class Subject {

    List<IObserver> observers = new ArrayList<>();

    public void addObserver(IObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (IObserver observer: observers) {
            observer.update();
        }
    }
}
