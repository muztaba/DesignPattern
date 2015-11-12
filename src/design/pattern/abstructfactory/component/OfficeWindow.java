package design.pattern.abstructfactory.component;

/**
 * Created by seal on 11/10/2015.
 */
public class OfficeWindow implements IWindow {
    @Override
    public void windowSize() {
        System.out.println("This is a office window size");
    }
}
