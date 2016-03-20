package design.pattern.command.action;

import design.pattern.command.device.DeviceOperation;

/**
 * Created by seal on 3/21/2016.
 */
public class TVSoundUp implements Command {

    DeviceOperation device;

    public TVSoundUp(DeviceOperation device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.soundUp();
    }
}
