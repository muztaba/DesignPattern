package design.pattern.visitor.factory;

import design.pattern.visitor.visitors.Bangladesh;
import design.pattern.visitor.visitors.England;
import design.pattern.visitor.visitors.Visitor;

/**
 * Created by seal on 1/8/2016.
 */
public class VisitorsFactory {

    public static Visitor getVisitors(String str) {
        Visitor visitor = null;

        switch (str) {
            case "Bangladesh":
                visitor = new Bangladesh();
                break;
            case "England":
                visitor = new England();
                break;
        }

        return visitor;
    }

}
