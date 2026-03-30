package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;
import java.util.ArrayList;
import java.util.List;

public class DriverCommandRecorder implements Job2dDriver {
    private List<DriverCommand> commands = new ArrayList<>();
    private Job2dDriver targetDriver;

    public DriverCommandRecorder(Job2dDriver targetDriver) {
        this.targetDriver = targetDriver;
    }

    @Override
    public void setPosition(int x, int y) {
        commands.add(new SetPositionCommand(x, y, targetDriver));
    }

    @Override
    public void operateTo(int x, int y) {
        commands.add(new OperateToCommand(x, y, targetDriver));
    }

    public ComplexCommand getComplexCommand() {
        return new ComplexCommand(commands);
    }
}