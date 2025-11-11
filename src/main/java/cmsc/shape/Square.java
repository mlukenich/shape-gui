/**
 * Name: Matthew Lukenich
 * Class: CMSC335
 * File: Square.java
 * Date: 11/08/2025
 */
package cmsc.shape;

import java.awt.Graphics;

/**
 * Square class that extends TwoDimensionalShape
 */
public class Square extends  TwoDimensionalShape {
    private double side;

    /**
     * Constructor
     * @param side
     */
    public Square(double side) {
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
        return side * side;
    }

    /**
     * Override for display method
     * @param g
     * @param x
     * @param y
     */
    @Override
    public void display(Graphics g, int x, int y) {
        g.drawRect(x - (int) side / 2, y - (int) side / 2, (int) side, (int) side);
    }

    /**
     * Getter for dimensions
     * @return dimensions
     */
    @Override
    public String getDimensions() {
        return "Side: " + side;
    }
}
