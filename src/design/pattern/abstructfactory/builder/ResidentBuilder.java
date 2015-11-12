package design.pattern.abstructfactory.builder;

import design.pattern.abstructfactory.component.IDoor;
import design.pattern.abstructfactory.component.IWindow;
import design.pattern.abstructfactory.component.ResidentDoor;
import design.pattern.abstructfactory.component.ResidentWindow;

/**
 * Created by seal on 11/10/2015.
 */
public class ResidentBuilder implements IHouseBuilder {
    @Override
    public IDoor addDoor() {
        return new ResidentDoor();
    }

    @Override
    public IWindow addWindow() {
        return new ResidentWindow();
    }
}
