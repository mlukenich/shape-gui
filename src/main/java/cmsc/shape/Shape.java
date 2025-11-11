/**
 * Name: Matthew Lukenich
 * Class: CMSC335
 * File: Shape.java
 * Date: 11/08/2025
 */
package cmsc.shape;

import java.awt.Graphics;

/**
 * Abstract class as base for all Shapes.
 *
 * This is the "is-a" relationship foundation
 */
public abstract class Shape {

    private int numberOfDimensions;

    /**
     * Constructor
     * @param numberOfDimensions
     */
    public Shape(int numberOfDimensions) {
        this.numberOfDimensions = numberOfDimensions;
    }

    /**
     * Getter for number of dimensions
     * @return numberOfDimensions
     */
    public int getNumberOfDimensions() {
        return numberOfDimensions;
    }

    /**
     * Setter for number of dimensions
     * @param numberOfDimensions
     */
    public void setNumberOfDimensions(int numberOfDimensions) {
        this.numberOfDimensions = numberOfDimensions;
    }

    public String getName() {
        return getClass().getSimpleName();
    }

    public String getDimensions() {
        return "";
    }

    public abstract void display(Graphics g, int x, int y);
}
