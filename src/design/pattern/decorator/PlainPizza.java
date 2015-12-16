package design.pattern.decorator;

/**
 * Created by seal on 12/17/2015.
 */
public class PlainPizza implements Pizza{
    @Override
    public String getDescription() {
        return "Plain Pizza";
    }

    @Override
    public double getValue() {
        return 100.0;
    }
}
