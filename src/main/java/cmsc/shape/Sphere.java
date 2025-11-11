/**
 * Name: Matthew Lukenich
 * Class: CSMC335
 * File: Sphere.java
 * Data: 11/08/2025
 */
package cmsc.shape;

import java.awt.Graphics;

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

    @Override
    public void display(Graphics g, int x, int y) {
        g.drawOval(x - (int) radius, y - (int) radius, (int) (2 * radius), (int) (2 * radius));
    }

    @Override
    public String getDimensions() {
        return "Radius: " + radius;
    }
}
