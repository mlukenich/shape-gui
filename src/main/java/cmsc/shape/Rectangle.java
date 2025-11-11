/**
 * Name: Matthew Lukenich
 * Class: CMSC335
 * File: Rectangle.java
 * Date: 11/08/2025
 */
package cmsc.shape;

import java.awt.Graphics;

/**
 * Rectangle Class
 */
public class Rectangle extends  TwoDimensionalShape {

    private double length;
    private double width;

    /**
     * Constructor
     * @param length
     * @param width
     */
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    /**
     * Getter for length
     * @return length
     */
    public double getLength() {
        return length;
    }

    /**
     * Setter for length
     * @param length
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * Getter for width
     * @return width
     */
    public double getWidth() {
        return width;
    }

    /**
     * Setter for width
     * @param width
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * Calculate and return area
     * @return area
     */
    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void display(Graphics g, int x, int y) {
        g.drawRect(x - (int) width / 2, y - (int) length / 2, (int) width, (int) length);
    }

    @Override
    public String getDimensions() {
        return "Length: " + length + ", Width: " + width;
    }
}
