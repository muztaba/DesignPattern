package design.pattern.factorymethod.factory;

import design.pattern.factorymethod.product.Product;
import design.pattern.factorymethod.product.ProductList;

/**
 * Created by seal on 11/13/2015.
 */
public interface Factory {
    Product getProduct(ProductList type);
}
