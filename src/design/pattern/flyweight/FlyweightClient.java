package design.pattern.flyweight;

import design.pattern.Client;

/**
 * Created by muztaba.hasanat on 10/26/2016.
 */
public class FlyweightClient implements Client {
    @Override
    public void test() {
        CoffeeShop coffeeShop = new CoffeeShop();

        coffeeShop.takeOrder("Bangladeshi coffee", 1);
        coffeeShop.takeOrder("Chaina Coffee", 2);

        coffeeShop.getOrderList()
                .forEach(System.out::println);
    }
}
