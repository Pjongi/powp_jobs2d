package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.shape.ILine;
import java.awt.Color;

/**
 * Niestandardowa linia pozwalająca na pełną konfigurację parametrów.
 */
public class CustomLine implements ILine, Cloneable {
    private int startX, startY, endX, endY;
    private Color color;
    private float thickness;
    private boolean dotted;

    public CustomLine(Color color, float thickness, boolean dotted) {
        this.color = color;
        this.thickness = thickness;
        this.dotted = dotted;
    }

    // --- Metody z interfejsu ILine ---

    @Override
    public Color getColor() { return color; }

    @Override
    public float getThickness() { return thickness; }

    @Override
    public boolean isDotted() { return dotted; }

    @Override
    public int getStartCoordinateX() { return startX; }

    @Override
    public int getEndCoordinateX() { return endX; }

    @Override
    public int getStartCoordinateY() { return startY; }

    @Override
    public int getEndCoordinateY() { return endY; }

    @Override
    public void setStartCoordinates(int x, int y) {
        this.startX = x;
        this.startY = y;
    }

    @Override
    public void setEndCoordinates(int x, int y) {
        this.endX = x;
        this.endY = y;
    }

    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public void setColor(Color color) { this.color = color; }
    public void setThickness(float thickness) { this.thickness = thickness; }
    public void setDotted(boolean dotted) { this.dotted = dotted; }
}