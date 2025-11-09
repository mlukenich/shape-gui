/**
 * Name: Matthew Lukenich
 * Class: CMSC335
 * File: Cube.java
 * Date: 10/28/2025
 */
package cmsc.shape.shape;

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

}
