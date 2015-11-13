import design.pattern.Client;
import design.pattern.factorymethod.client.FactoryMethodClient;

/**
 * Created by seal on 11/8/2015.
 */
public class Main {
    public static void main(String[] args) {
        Client client = new FactoryMethodClient();
        client.test();
    }
}



