package design.pattern.command.device;

/**
 * Created by seal on 3/21/2016.
 */
public class Television implements DeviceOperation{

    private int soundLevel = 10;

    @Override
    public void on() {
        System.out.println("TV is on");
    }

    @Override
    public void off() {
        System.out.println("TV is off");
    }

    @Override
    public void soundUp() {
        soundLevel++;
        System.out.println("TV sound " + soundLevel);
    }

    @Override
    public void soundDown() {
        soundLevel--;
        System.out.println("TV sound " + soundLevel);
    }
}
