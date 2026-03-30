package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.command.ComplexCommandFactory;
import edu.kis.powp.jobs2d.command.DriverCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectTestComplexCommandOptionListener implements ActionListener {

    private DriverManager driverManager;

    public SelectTestComplexCommandOptionListener(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Pobieramy złożone polecenie (prostokąt) z naszej fabryki
        DriverCommand command = ComplexCommandFactory.getRectangle(driverManager.getCurrentDriver(), -50, -50, 100, 100);
        // Wykonujemy całą sekwencję jednym wywołaniem
        command.execute();
    }
}