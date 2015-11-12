package design.pattern.abstructfactory.client;

import design.pattern.abstructfactory.contractor.BulidingContractor;
import design.pattern.abstructfactory.contractor.Contractor;
import design.pattern.abstructfactory.house.House;

/**
 * Created by seal on 11/11/2015.
 */
public class Client {
    public void abstractFactory() {
        Contractor contractor = new BulidingContractor();
        House house = contractor.makeHouse("office");
        House home = contractor.makeHouse("resident");
        home.printHouseInfo();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>");
        house.printHouseInfo();
    }
}