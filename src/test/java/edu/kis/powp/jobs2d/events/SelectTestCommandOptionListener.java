package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.command.OperateToCommand;
import edu.kis.powp.jobs2d.command.SetPositionCommand;
import edu.kis.powp.jobs2d.features.DriverFeature;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectTestCommandOptionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        Job2dDriver driver = DriverFeature.getDriverManager().getCurrentDriver();

        SetPositionCommand setPos = new SetPositionCommand(-100, -100, driver);
        OperateToCommand opTo1 = new OperateToCommand(100, -100, driver);
        OperateToCommand opTo2 = new OperateToCommand(100, 100, driver);
        OperateToCommand opTo3 = new OperateToCommand(-100, 100, driver);
        OperateToCommand opTo4 = new OperateToCommand(-100, -100, driver);

        setPos.execute();
        opTo1.execute();
        opTo2.execute();
        opTo3.execute();
        opTo4.execute();
    }
}