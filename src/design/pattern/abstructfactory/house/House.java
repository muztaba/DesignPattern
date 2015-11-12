package design.pattern.abstructfactory.house;

import design.pattern.abstructfactory.component.IDoor;
import design.pattern.abstructfactory.component.IWindow;

/**
 * Created by seal on 11/10/2015.
 */
public abstract class House {
    protected IDoor door;
    protected IWindow window;
    protected String houseName;

    public void printHouseInfo() {
        door.doorSize();
        window.windowSize();
        System.out.println(houseName);
    }

    protected void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    public abstract void makeHouse();

}
