package design.pattern.visitor.visitable;

import design.pattern.visitor.visitors.Visitor;

/**
 * Created by seal on 1/8/2016.
 */
public class Water implements Taxable {

    private double price;

    public Water(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public double accept(Visitor visitor) {
        return visitor.addTax(this);
    }
}
