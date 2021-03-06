package design.pattern.visitor.visitors;

import design.pattern.visitor.visitable.Chocolate;
import design.pattern.visitor.visitable.Laptop;
import design.pattern.visitor.visitable.Water;

/**
 * Created by seal on 1/8/2016.
 */
public class England implements Visitor {
    @Override
    public double addTax(Chocolate chocolate) {
        return chocolate.getPrice() * 1212.0;
    }

    @Override
    public double addTax(Water water) {
        return water.getPrice() * 55.0;
    }

    @Override
    public double addTax(Laptop laptop) {
        return laptop.getPrice() * 45.0;
    }
}
