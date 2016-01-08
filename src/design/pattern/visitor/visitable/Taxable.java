package design.pattern.visitor.visitable;

import design.pattern.visitor.visitors.Visitor;

/**
 * Created by seal on 1/8/2016.
 */
public interface Taxable {
    public double accept(Visitor visitor);
}
