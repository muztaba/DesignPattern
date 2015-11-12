package design.pattern.abstructfactory.builder;

import design.pattern.abstructfactory.component.IDoor;
import design.pattern.abstructfactory.component.IWindow;

/**
 * Created by seal on 11/10/2015.
 */
public interface IHouseBuilder {
    IDoor addDoor();
    IWindow addWindow();
}
