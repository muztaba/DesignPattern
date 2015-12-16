package design.pattern.decorator;

/**
 * Created by seal on 12/17/2015.
 */
public class TomatoSauce extends PizzaDecorator {
    public TomatoSauce(Pizza pizza) {
        super(pizza);
        System.out.println("Extra sauce");
    }

    @Override
    public String getDescription() {
        return pizza.getDescription();
    }

    @Override
    public double getValue() {
        return pizza.getValue() + 50.0;
    }
}
