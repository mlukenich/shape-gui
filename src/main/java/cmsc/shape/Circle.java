/**
 * Name: Matthew Lukenich
 * Class: CMSC335
 * File: Circle.java
 * Date: 11/08/2025
 */
package cmsc.shape;

import java.awt.Graphics;

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

    @Override
    public void display(Graphics g, int x, int y) {
        g.drawOval(x - (int) radius, y - (int) radius, (int) (2 * radius), (int) (2 * radius));
    }

    @Override
    public String getDimensions() {
        return "Radius: " + radius;
    }
}
