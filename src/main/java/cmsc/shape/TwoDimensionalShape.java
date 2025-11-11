/**
 * Name: Matthew Lukenich
 * Class: CMSC335
 * File: TwoDimensionalShape.java
 * Date: 11/08/2025
 */
package cmsc.shape;

/**
 * Abstract class that extends Shape and serves as the
 * base class for all 2D Shapes
 */
public abstract class TwoDimensionalShape extends Shape {

    /**
     * Constructor
     *
     * Always set numberOfDimenions to 2 since it is 2D.
     */
    public TwoDimensionalShape() {
        super(2);
    }

    /**
     * Abstract method for all 2D Shapes to implement. Ensure
     * all 2D Shapes has(have) an area.
     * @return area
     */
    public abstract double getArea();

}
