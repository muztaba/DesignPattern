package design.pattern.flyweight;

/**
 * Created by muztaba.hasanat on 10/26/2016.
 */
public class Order {
    private final int tableno;
    private final Coffee coffee;

    public Order(int tableno, Coffee coffee) {
        this.tableno = tableno;
        this.coffee = coffee;
    }

    public int getTableno() {
        return tableno;
    }

    public Coffee getCoffee() {
        return coffee;
    }
}
