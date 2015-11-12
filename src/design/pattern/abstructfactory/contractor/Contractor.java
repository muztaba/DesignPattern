package design.pattern.abstructfactory.contractor;

import design.pattern.abstructfactory.house.House;

/**
 * Created by seal on 11/11/2015.
 */
public abstract class Contractor {

    public abstract House makeHouse(String houseType);
}
