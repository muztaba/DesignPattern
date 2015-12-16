package design.pattern.decorator.client;

import design.pattern.decorator.Cheese;
import design.pattern.decorator.Pizza;
import design.pattern.decorator.PlainPizza;
import design.pattern.decorator.TomatoSauce;

/**
 * Created by seal on 12/17/2015.
 */
public class DecoratorClient implements design.pattern.Client {

    @Override
    public void test() {
        Pizza pizza = new Cheese(new TomatoSauce(new PlainPizza()));

        System.out.println(pizza.getValue());
    }
}
