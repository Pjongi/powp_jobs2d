package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;
import java.util.ArrayList;
import java.util.List;

public class ComplexCommandFactory {

    public static DriverCommand getRectangle(Job2dDriver driver, int x, int y, int width, int height) {
        List<DriverCommand> commands = new ArrayList<>();
        commands.add(new SetPositionCommand(x, y, driver));
        commands.add(new OperateToCommand(x + width, y, driver));
        commands.add(new OperateToCommand(x + width, y + height, driver));
        commands.add(new OperateToCommand(x, y + height, driver));
        commands.add(new OperateToCommand(x, y, driver)); // powrót

        return new ComplexCommand(commands);
    }
}