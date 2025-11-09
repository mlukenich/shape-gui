/**
 * Name: Matthew Lukenich
 * Class: CMSC335
 * File: Rectangle.java
 * Date: 10/28/2025
 */
package cmsc.shape.shape;

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

}
