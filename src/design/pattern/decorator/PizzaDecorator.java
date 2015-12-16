package design.pattern.decorator;

/**
 * Created by seal on 12/17/2015.
 */
public abstract class PizzaDecorator implements Pizza {
    Pizza pizza;

    PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription();
    }

    @Override
    public double getValue() {
        return pizza.getValue();
    }

}
