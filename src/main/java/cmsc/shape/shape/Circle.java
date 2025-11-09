/**
 * Name: Matthew Lukenich
 * Class: CMSC335
 * File: Circle.java
 * Date: 10/28/2025
 */
package cmsc.shape.shape;

/**
 * Circle class that extends TwoDimensionalShape
 */
public class Circle extends TwoDimensionalShape {

    private double radius;

    /**
     * Constructor
     * @param radius
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Getter for radius
     * @return radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Setter for radius
     * @param radius
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Calculate and return area
     * @return area
     */
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

}
