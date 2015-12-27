package design.pattern.observerpattern.client;

import design.pattern.Client;
import design.pattern.observerpattern.Observer;
import design.pattern.observerpattern.PostOffice;
import design.pattern.observerpattern.Subject;
import design.pattern.observerpattern.subscribers.Subscriber;

/**
 * Created by seal on 12/27/2015.
 */
public class ObserverClient implements Client {
    @Override
    public void test() {
        Subject postOffice = new PostOffice();

        Observer pranjol = new Subscriber("Pranjol");
        Observer rakib = new Subscriber("Rakib");
        Observer noyon = new Subscriber("Noyon");

        System.out.println("Adding subscriber in the post office");
        postOffice.add(pranjol);
        postOffice.add(rakib);
        postOffice.add(noyon);
        System.out.println(">>>>>>>>>>>>>");
        postOffice._notify();

        System.out.println();
        System.out.println("Removing subscriber from the post office");
        System.out.println(">>>>>>>>>>>>>");

        postOffice.remove(rakib);
        postOffice.remove(noyon);

        postOffice._notify();
    }
}
