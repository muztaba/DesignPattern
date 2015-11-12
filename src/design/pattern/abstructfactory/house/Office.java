package design.pattern.abstructfactory.house;

import design.pattern.abstructfactory.builder.IHouseBuilder;

/**
 * Created by seal on 11/11/2015.
 */
public class Office extends House {

    IHouseBuilder builder;
    String houseName = "Office";
    public Office(IHouseBuilder builder) {
        this.builder = builder;
    }

    @Override
    public void makeHouse() {
        door = builder.addDoor();
        window = builder.addWindow();
        setHouseName(houseName);
    }
}
