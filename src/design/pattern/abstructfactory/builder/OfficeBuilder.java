package design.pattern.abstructfactory.builder;

import design.pattern.abstructfactory.component.IDoor;
import design.pattern.abstructfactory.component.IWindow;
import design.pattern.abstructfactory.component.OfficeDoor;
import design.pattern.abstructfactory.component.OfficeWindow;

/**
 * Created by seal on 11/10/2015.
 */
public class OfficeBuilder implements IHouseBuilder {
    @Override
    public IDoor addDoor() {
        return new OfficeDoor();
    }

    @Override
    public IWindow addWindow() {
        return new OfficeWindow();
    }
}
