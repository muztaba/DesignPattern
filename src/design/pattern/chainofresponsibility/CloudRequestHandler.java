package design.pattern.chainofresponsibility;

public class CloudRequestHandler implements RequestHandler  {

    private RequestHandler nextHandler;

    @Override
    public void nextHandler(RequestHandler handler) {
        nextHandler = handler;
    }

    @Override
    public DataClass process(DataClass dataClass) {
        if (dataClass.getId().equals("3"))
            return DataClass.builder()
                    .from(dataClass)
                    .setName(this.getClass().getName())
                    .build();
        return nextHandler != null ? nextHandler.process(dataClass)
                : DataClass.empty();
    }
}
