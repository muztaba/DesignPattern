package design.pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by muztaba.hasanat on 10/26/2016.
 */
public class CoffeeFactory {
    private Map<String, Coffee> map;

    CoffeeFactory() {
        map = new HashMap<>();
    }

    public Coffee lookUp(String coffee){
        if (!map.containsKey(coffee))
            map.put(coffee, new Coffee(coffee));
        return map.get(coffee);
    }

}
