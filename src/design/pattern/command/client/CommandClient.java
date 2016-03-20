package design.pattern.command.client;

import design.pattern.Client;
import design.pattern.command.action.TVOff;
import design.pattern.command.action.TVOn;
import design.pattern.command.action.TVSoundDown;
import design.pattern.command.action.TVSoundUp;
import design.pattern.command.device.Television;
import design.pattern.command.executer.RemoteControl;

/**
 * Created by seal on 3/21/2016.
 */
public class CommandClient implements Client {
    @Override
    public void test() {
        Television tv = new Television();

        TVOn tVon = new TVOn(tv);
        TVOff tvOff = new TVOff(tv);
        TVSoundUp soundUp = new TVSoundUp(tv);
        TVSoundDown soundDown = new TVSoundDown(tv);

        RemoteControl remoteControl = new RemoteControl();

        remoteControl.buttonPress(tVon);
        remoteControl.buttonPress(soundUp);
        remoteControl.buttonPress(soundUp);
        remoteControl.buttonPress(soundDown);
        remoteControl.buttonPress(tvOff);
    }
}
