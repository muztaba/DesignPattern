package design.pattern.flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by muztaba.hasanat on 10/26/2016.
 */
public class CoffeeShop {
    private List<Order> orderList;
    private CoffeeFactory coffeeFactory;

    public CoffeeShop() {
        this.orderList = new ArrayList<>();
        coffeeFactory = new CoffeeFactory();
    }

    public void takeOrder(String coffee, int table) {
        // Here is the pattern
        Coffee coffee1 = coffeeFactory.lookUp(coffee);
        orderList.add(new Order(table, coffee1));
    }

    public List<Order> getOrderList() {
        return orderList;
    }
}
