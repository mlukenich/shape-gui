/**
 * Name: Matthew Lukenich
 * Class: CMSC335
 * File: Torus.java
 * Date: 10/28/2025
 */
package cmsc.shape.shape;

public class Torus extends ThreeDimensionalShape {
    private double majorRadius; // distance from center of torus to center of the tube
    private double minorRadius; // radius of the tube

    /**
     * Constructor
     * @param majorRadius
     * @param minorRadius
     */
    public Torus(double majorRadius, double minorRadius) {
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
}