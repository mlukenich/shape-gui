/**
 * Name: Matthew Lukenich
 * Class: CSMC335
 * File: Sphere.java
 * Data: 10/28/2025
 */
package cmsc.shape.shape;

/**
 * Sphere class that extends ThreeDimensionalShape
 */
public class Sphere extends  ThreeDimensionalShape {
    private double radius;

    /**
     * Constructor
     * @param radius
     */
    public Sphere(double radius) {
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
     * Calculate and return volume
     * @return volume
     */
    @Override
    public double getVolume() {
        return (4.0/3.0) * Math.PI * Math.pow(radius, 3);
    }

}
