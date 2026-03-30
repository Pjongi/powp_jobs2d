package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.command.ComplexCommand;
import edu.kis.powp.jobs2d.command.DriverCommandRecorder;
import edu.kis.powp.jobs2d.features.DriverFeature;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectTestRecordedJoeOptionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        Job2dDriver realDriver = DriverFeature.getDriverManager().getCurrentDriver();

        DriverCommandRecorder recorder = new DriverCommandRecorder(realDriver);

        FiguresJoe.figureScript1(recorder);

        ComplexCommand recordedCommand = recorder.getComplexCommand();

        recordedCommand.execute();
    }
}