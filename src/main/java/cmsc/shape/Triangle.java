/**
 * Name: Matthew Lukenich
 * Class: CMSC335
 * File: Triangle.java
 * Date: 11/08/2025
 */
package cmsc.shape;

import java.awt.Graphics;

/**
 * Triangle class that extends TwoDimensionalShape
 */
public class Triangle extends TwoDimensionalShape {
    private double side;

    /**
     * Constructor
     * @param side
     */
    public Triangle(double side) {
        this.side = side;
    }

    /**
     * Getter for side
     * @return side
     */
    public double getSide() {
        return side;
    }

    /**
     * Setter for side
     * @param side
     */
    public void setSide(double side) {
        this.side = side;
    }

    /**
     * Calculate and return area
     * @return area
     */
    @Override
    public double getArea() {
        return (Math.sqrt(3) / 4) * side * side;
    }

    /**
     * Override for display method
     * @param g
     * @param x
     * @param y
     */
    @Override
    public void display(Graphics g, int x, int y) {
        int height = (int) (side * Math.sqrt(3) / 2);
        int halfSide = (int) side / 2;

        int[] xPoints = {x, x + halfSide, x - halfSide};
        int[] yPoints = {y - height / 2, y + height / 2, y + height / 2};

        g.drawPolygon(xPoints, yPoints, 3);
    }
}
