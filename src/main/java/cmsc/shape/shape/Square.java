/**
 * Name: Matthew Lukenich
 * Class: CMSC335
 * File: Square.java
 * Date: 10/28/2025
 */
package cmsc.shape.shape;

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

}
