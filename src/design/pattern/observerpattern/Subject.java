package design.pattern.observerpattern;

/**
 * Created by seal on 12/27/2015.
 */
public interface Subject {
    void add(Observer observer);

    void remove(Observer observer);

    void _notify();
}
