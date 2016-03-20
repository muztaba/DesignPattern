package design.pattern.command.executer;

import design.pattern.command.action.Command;

/**
 * Created by seal on 3/21/2016.
 */
public class RemoteControl {

    Command command;

    public RemoteControl(Command command) {
        this.command = command;
    }

    public RemoteControl() {
    }

    public void buttonPress() {
        command.execute();
    }

    public void buttonPress(Command command) {
        command.execute();
    }
}
