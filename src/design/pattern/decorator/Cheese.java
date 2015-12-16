package design.pattern.decorator;

/**
 * Created by seal on 12/17/2015.
 */
public class Cheese extends PizzaDecorator {
    public Cheese(Pizza pizza) {
        super(pizza);
        System.out.println("Adding Cheese !!!!!");
    }

    @Override
    public String getDescription() {
        return pizza.getDescription();
    }

    @Override
    public double getValue() {
        return pizza.getValue() + 60.0;
    }
}
