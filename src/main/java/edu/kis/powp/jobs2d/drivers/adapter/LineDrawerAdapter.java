package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.powp.jobs2d.Job2dDriver;

public class LineDrawerAdapter implements Job2dDriver {
    private int startX = 0;
    private int startY = 0;
    private DrawPanelController drawController;
    private ILine line;

    // Przekazujemy w konstruktorze kontroler oraz konkretny typ linii
    public LineDrawerAdapter(DrawPanelController drawController, ILine line) {
        this.drawController = drawController;
        this.line = line;
    }

    @Override
    public void setPosition(int x, int y) {
        this.startX = x;
        this.startY = y;
    }

    @Override
    public void operateTo(int x, int y) {
        // Używamy linii przekazanej w konstruktorze zamiast tworzyć nową bazową
        line.setStartCoordinates(this.startX, this.startY);
        line.setEndCoordinates(x, y);

        drawController.drawLine(line);
        setPosition(x, y);
    }

    @Override
    public String toString() {
        return "Line Drawer Adapter";
    }
}