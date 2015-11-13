package design.pattern.factorymethod.client;


import design.pattern.Client;
import design.pattern.factorymethod.factory.BigFactory;
import design.pattern.factorymethod.factory.Factory;
import design.pattern.factorymethod.product.Product;
import design.pattern.factorymethod.product.ProductList;

/**
 * Created by seal on 11/13/2015.
 */
public class FactoryMethodClient implements Client {
    @Override
    public void test() {
        Factory factory = new BigFactory();
        Product product = factory.getProduct(ProductList.Scale);
        product.printInfoProduct();
    }
}
