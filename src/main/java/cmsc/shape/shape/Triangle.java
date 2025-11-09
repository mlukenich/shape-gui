/**
 * Name: Matthew Lukenich
 * Class: CMSC335
 * File: Triangle.java
 * Date: 10/28/2025
 */
package cmsc.shape.shape;

/**
 * Triangle class that extends TwoDimensionalShape
 */
public class Triangle extends TwoDimensionalShape {
    private double base;
    private double height;

    /**
     * Constructor
     * @param base
     * @param height
     */
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    /**
     * Getter for base
     * @return base
     */
    public double getBase() {
        return base;
    }

    /**
     * Setter for base
     * @param base
     */
    public void setBase(double base) {
        this.base = base;
    }

    /**
     * Getter for height
     * @return height
     */
    public double getHeight() {
        return height;
    }

    /**
     * Setter for height
     * @param height
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Calculate and return area
     * @return area
     */
    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

}
