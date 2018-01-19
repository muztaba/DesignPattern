package design.pattern.chainofresponsibility;

import design.pattern.Client;

import java.util.Arrays;
import java.util.List;

public class ChainOfResponsibilityClient implements Client {
    @Override
    public void test() {
        DataClass dataClass = DataClass.builder()
                .setId("4")
                .setName("SEAL")
                .setAdress("Dhaka")
                .build();

        List<RequestHandler> list = listOfRequestHandler();
        for (int i = 0; i < list.size() - 1; i++) {
            list.get(i).nextHandler(list.get(i + 1));
        }

        RequestHandler head = list.get(0);
        DataClass newData = head.process(dataClass);
        System.out.println(newData);
    }

    public List<RequestHandler> listOfRequestHandler() {
        return Arrays.asList(new CloudRequestHandler(), new FileRequestHandler(), new DBRequestHandler());
    }
}
