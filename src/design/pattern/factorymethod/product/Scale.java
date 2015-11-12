package design.pattern.factorymethod.product;

/**
 * Created by seal on 11/13/2015.
 */
public class Scale implements Product {
    @Override
    public void printInfoProduct() {
        System.out.println("I am using Scale");
    }
}
