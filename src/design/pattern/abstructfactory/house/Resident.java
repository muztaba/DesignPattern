package design.pattern.abstructfactory.house;

import design.pattern.abstructfactory.builder.IHouseBuilder;

/**
 * Created by seal on 11/10/2015.
 */
public class Resident extends House {

    IHouseBuilder builder;
    String houseName = "Resident";
    public Resident(IHouseBuilder builder) {
        this.builder = builder;
    }

    @Override
    public void makeHouse() {
        door = builder.addDoor();
        window = builder.addWindow();
        setHouseName(houseName);
    }
}
