package design.pattern.abstructfactory.contractor;

import design.pattern.abstructfactory.builder.IHouseBuilder;
import design.pattern.abstructfactory.builder.OfficeBuilder;
import design.pattern.abstructfactory.builder.ResidentBuilder;
import design.pattern.abstructfactory.house.House;
import design.pattern.abstructfactory.house.Office;
import design.pattern.abstructfactory.house.Resident;

/**
 * Created by seal on 11/11/2015.
 */
public class BulidingContractor extends Contractor {

    House house;

    @Override
    public House makeHouse(String houseType) {
        if (houseType.equalsIgnoreCase("resident")) {
            IHouseBuilder residentBuilder = new ResidentBuilder();
            house = new Resident(residentBuilder);
            house.makeHouse();
        } else if (houseType.equalsIgnoreCase("office")) {
            IHouseBuilder officeBuilder = new OfficeBuilder();
            house = new Office(officeBuilder);
            house.makeHouse();
        }
        return house;
    }
}
