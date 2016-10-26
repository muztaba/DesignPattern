package design.pattern.flyweight;

/**
 * Created by muztaba.hasanat on 10/26/2016.
 */
public class Order {
    private final Table table;
    private final Coffee coffee;

    public Order(Table table, Coffee coffee) {
        this.table = table;
        this.coffee = coffee;
    }

    public Table getTable() {
        return table;
    }

    public Coffee getCoffee() {
        return coffee;
    }
}
