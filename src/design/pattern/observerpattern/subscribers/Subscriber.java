package design.pattern.observerpattern.subscribers;

import design.pattern.observerpattern.Observer;

/**
 * Created by seal on 12/27/2015.
 */
public class Subscriber implements Observer {
    private String name;

    public Subscriber(String subscriberName) {
        this.name = subscriberName;
    }

    @Override
    public void update() {
        System.out.println("Notification for Subscriber " + name);
    }


    @Override
    public boolean equals(Object obj) {
        return ((obj == this) || (hashCode() == obj.hashCode()));
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
