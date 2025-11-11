/**
 * Name: Matthew Lukenich
 * Class: CMSC335
 * File: Cone.java
 * Date: 11/08/2025
 */
package cmsc.shape;

import java.awt.Graphics;

/**
 * Cone class that extends ThreeDimensionalShape
 */
public class Cone extends ThreeDimensionalShape {
    private double radius;
    private double height;

    /**
     * Constructor
     * @param radius
     * @param height
     */
    public Cone(double radius, double height) {
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
        return (1.0/3.0) * Math.PI * Math.pow(radius, 2) * height;
    }

    @Override
    public void display(Graphics g, int x, int y) {
        int iRadius = (int) radius;
        int iHeight = (int) height;

        int apexX = x;
        int apexY = y - iHeight / 2;

        int baseCenterY = y + iHeight / 2;
        int baseOvalHeight = Math.max(1, iRadius / 2);

        int ellipseX = x - iRadius;
        int ellipseY = baseCenterY - baseOvalHeight / 2;
        int ellipseWidth = 2 * iRadius;

        //draw the sides of the cone to connect apex to
        //widest points of the base
        g.drawLine(apexX, apexY, x - iRadius, baseCenterY);
        g.drawLine(apexX, apexY, x + iRadius, baseCenterY);

        //draw the front arc
        //connects two sides
        g.drawArc(ellipseX, ellipseY, ellipseWidth, baseOvalHeight, 180, -180);
    }

    @Override
    public String getDimensions() {
        return "Radius: " + radius + ", Height: " + height;
    }
}
