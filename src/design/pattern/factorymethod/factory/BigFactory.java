package design.pattern.factorymethod.factory;

import design.pattern.factorymethod.product.*;

/**
 * Created by seal on 11/13/2015.
 */
public class BigFactory implements Factory {
    @Override
    public Product getProduct(ProductList type) {

        switch (type) {
            case Pen:
                return new Pen();
            case Pencil:
                return new Pencil();
            case Scale:
                return new Scale();
        }

        return null;
    }
}
