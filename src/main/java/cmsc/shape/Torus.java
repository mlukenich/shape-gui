/**
 * Name: Matthew Lukenich
 * Class: CMSC335
 * File: Torus.java
 * Date: 11/08/2025
 */
package cmsc.shape;

import java.awt.Graphics;

public class Torus extends ThreeDimensionalShape {
    private double majorRadius; // distance from center of torus to center of the tube
    private double minorRadius; // radius of the tube

    /**
     * Constructor
     * @param majorRadius
     * @param minorRadius
     */
    public Torus(double majorRadius, double minorRadius) {
        if (majorRadius <= 0 || minorRadius <= 0) {
            throw new IllegalArgumentException("Radii must be positive.");
        }
        if (minorRadius > majorRadius) {
            throw new IllegalArgumentException("Minor radius cannot be greater than major radius.");
        }
        this.majorRadius = majorRadius;
        this.minorRadius = minorRadius;
    }

    /**
     * Getter for major radius
     * @return majorRadius
     */
    public double getMajorRadius() {
        return majorRadius;
    }

    /**
     * Setter for major radius
     * @param majorRadius
     */
    public void setMajorRadius(double majorRadius) {
        this.majorRadius = majorRadius;
    }

    /**
     * Getter for minor radius
     * @return minorRadius
     */
    public double getMinorRadius() {
        return minorRadius;
    }

    /**
     * Setter for minor radius
     * @param minorRadius
     */
    public void setMinorRadius(double minorRadius) {
        this.minorRadius = minorRadius;
    }

    /**
     * Calculates the volume of the torus.
     * 
     * @return volume
     */
    @Override
    public double getVolume() {
        return (Math.PI * Math.pow(minorRadius, 2)) * (2 * Math.PI * majorRadius);
    }

    @Override
    public void display(Graphics g, int x, int y) {
        //draw outer circle
        g.drawOval(x - (int) majorRadius, y - (int) majorRadius, (int) (2 * majorRadius), (int) (2 * majorRadius));
        //draw inner circle
        int innerRadius = (int) (majorRadius - minorRadius);
        int innerDiameter = 2 * innerRadius;
        int innerTopLeftX = x - innerRadius;
        int innerTopLeftY = y - innerRadius;
        g.drawOval(innerTopLeftX, innerTopLeftY, innerDiameter, innerDiameter);
    }

    @Override
    public String getDimensions() {
        return "Major Radius: " + majorRadius + ", Minor Radius: " + minorRadius;
    }
}
