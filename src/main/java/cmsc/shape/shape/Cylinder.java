/**
 * Name: Matthew Lukenich
 * Class: CMSC335
 * File: Cylinder.java
 * Date: 10/28/2025
 */
package cmsc.shape.shape;

/**
 * Cylinder class that extends ThreeDimensionalShape
 */
public class Cylinder extends ThreeDimensionalShape {
    private double radius;
    private double height;

    /**
     * Constructor
     * @param radius
     * @param height
     */
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
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
    public double getVolume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

}
