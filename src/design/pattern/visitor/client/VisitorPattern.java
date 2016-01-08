package design.pattern.visitor.client;

import design.pattern.Client;
import design.pattern.visitor.factory.VisitableFactory;
import design.pattern.visitor.factory.VisitorsFactory;
import design.pattern.visitor.visitable.Taxable;
import design.pattern.visitor.visitors.Visitor;

/**
 * Created by seal on 1/8/2016.
 */
public class VisitorPattern implements Client {
    @Override
    public void test() {
        Visitor visitorBangladesh = VisitorsFactory.getVisitors("Bangladesh");
        Visitor visitorEngland = VisitorsFactory.getVisitors("England");
        Taxable taxable = VisitableFactory.getTaxableProduct("Water", 30);

        System.out.println(taxable.accept(visitorBangladesh));
        System.out.println(taxable.accept(visitorEngland));
    }
}
