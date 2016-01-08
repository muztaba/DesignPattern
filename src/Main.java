import design.pattern.Client;
import design.pattern.decorator.client.DecoratorClient;
import design.pattern.factorymethod.client.FactoryMethodClient;
import design.pattern.observerpattern.client.ObserverClient;
import design.pattern.visitor.client.VisitorPattern;

/**
 * Created by seal on 11/8/2015.
 */
public class Main {
    public static void main(String[] args) {
        Client client = new VisitorPattern();
        client.test();
    }
}



