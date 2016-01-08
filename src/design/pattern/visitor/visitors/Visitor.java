package design.pattern.visitor.visitors;

import design.pattern.visitor.visitable.Chocolate;
import design.pattern.visitor.visitable.Laptop;
import design.pattern.visitor.visitable.Water;

/**
 * Created by seal on 1/8/2016.
 */
public interface Visitor {
    double addTax(Chocolate chocolate);
    double addTax(Water water);
    double addTax(Laptop laptop);
}
