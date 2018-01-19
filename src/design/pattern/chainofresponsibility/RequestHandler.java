package design.pattern.chainofresponsibility;

public interface RequestHandler {

    void nextHandler(RequestHandler handler);

    DataClass process(DataClass dataClass);

}
