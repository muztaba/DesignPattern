package design.pattern.observerpattern;

import design.pattern.observerpattern.subscribers.Subscriber;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by seal on 12/27/2015.
 */
public class PostOffice implements Subject {
    Set<Observer> subscriber;

    public PostOffice() {
        subscriber = new HashSet<>();
    }

    @Override
    public void add(Observer observer) {
        if (!subscriber.contains(observer)) {
            subscriber.add(observer);
        }
    }

    @Override
    public void remove(Observer observer) {
        if (subscriber.contains(observer)) {
            subscriber.remove(observer);
        }
    }

    @Override
    public void _notify() {
        for (Observer itr : subscriber) {
            itr.update();
        }
    }

    public void updateAll() {
        _notify();
    }
}
