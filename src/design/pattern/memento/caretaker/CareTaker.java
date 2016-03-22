package design.pattern.memento.caretaker;

import design.pattern.memento.memento.IMemento;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * Created by seal on 3/23/2016.
 */
public class CareTaker {

    Deque<Object> deque;

    public CareTaker() {
        deque = new ArrayDeque<>();
    }

    public void addMemento(Object obj) {
        deque.addLast(obj);
    }

    public void restore(IMemento obj) {
        Object object = deque.pollLast();
        if (object != null) {
            obj.restore(object);
        } else {
            System.out.println("No State left");
        }
    }

}
