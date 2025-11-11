/**
 * Name: Matthew Lukenich
 * Class: CMSC335
 * File: Cylinder.java
 * Date: 11/08/2025
 */
package cmsc.shape;

import java.awt.Graphics;

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

    @Override
    public void display(Graphics g, int x, int y) {
        int iRadius = (int) radius;
        int iHeight = (int) height;
        int halfHeight = iHeight / 2;
        int ovalHeight = iRadius / 2; // Make the ellipse look foreshortened

        //draw top and bottom
        g.drawOval(x - iRadius, y - halfHeight, 2 * iRadius, ovalHeight);
        g.drawOval(x - iRadius, y + halfHeight - ovalHeight, 2 * iRadius, ovalHeight);
        //draw vertical sides
        g.drawLine(x - iRadius, y - halfHeight + ovalHeight / 2, x - iRadius, y + halfHeight - ovalHeight / 2);
        g.drawLine(x + iRadius, y - halfHeight + ovalHeight / 2, x + iRadius, y + halfHeight - ovalHeight / 2);
    }

    @Override
    public String getDimensions() {
        return "Radius: " + radius + ", Height: " + height;
    }
}
