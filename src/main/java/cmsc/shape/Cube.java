/**
 * Name: Matthew Lukenich
 * Class: CMSC335
 * File: Cube.java
 * Date: 11/08/2025
 */
package cmsc.shape;

import java.awt.Graphics;

/**
 * Cube class that extends ThreeDimensionalShape
 */
public class Cube extends ThreeDimensionalShape {
    private double side;

    /**
     * Constructor
     * @param side
     */
    public Cube(double side) {
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
    public double getVolume() {
        return Math.pow(side, 3);
    }

    @Override
    public void display(Graphics g, int x, int y) {
        int iSide = (int) side;
        int halfSide = iSide / 2;
        int offset = iSide / 4;

        //front square
        g.drawRect(x - halfSide, y - halfSide, iSide, iSide);

        //back square
        g.drawRect(x - halfSide + offset, y - halfSide - offset, iSide, iSide);

        //connect the corners
        g.drawLine(x - halfSide, y - halfSide, x - halfSide + offset, y - halfSide - offset);
        g.drawLine(x + halfSide, y - halfSide, x + halfSide + offset, y - halfSide - offset);
        g.drawLine(x - halfSide, y + halfSide, x - halfSide + offset, y + halfSide - offset);
        g.drawLine(x + halfSide, y + halfSide, x + halfSide + offset, y + halfSide - offset);
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
