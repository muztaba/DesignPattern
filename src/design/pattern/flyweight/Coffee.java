package design.pattern.flyweight;

import java.util.Map;

/**
 * Created by muztaba.hasanat on 10/26/2016.
 */
public class Coffee {
    private final String name;

    public Coffee(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Coffee coffee = (Coffee) o;

        if (name != null ? !name.equals(coffee.name) : coffee.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
