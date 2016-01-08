package design.pattern.visitor.factory;

import design.pattern.visitor.visitable.Chocolate;
import design.pattern.visitor.visitable.Laptop;
import design.pattern.visitor.visitable.Taxable;
import design.pattern.visitor.visitable.Water;

/**
 * Created by seal on 1/8/2016.
 */
public class VisitableFactory {

    public static Taxable getTaxableProduct(String str, double price) {
        Taxable taxable = null;

        switch (str) {

            case "Chocolate":
                taxable = new Chocolate(price);
                break;
            case "Water":
                taxable = new Water(price);
                break;
            case "Laptop":
                taxable = new Laptop(price);
                break;
        }

        return taxable;
    }

}
