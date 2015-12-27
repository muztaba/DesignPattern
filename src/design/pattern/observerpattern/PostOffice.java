package design.pattern.observerpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by seal on 12/27/2015.
 */
public class PostOffice implements Subject {
    List<Observer> subscriber;

    public PostOffice() {
        subscriber = new ArrayList<>();
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
        for (int i = 0; i < subscriber.size(); i++) {
            subscriber.get(i).update();
        }
    }

    public void updateAll() {
        _notify();
    }
}
