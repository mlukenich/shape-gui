/**
 * Name: Matthew Lukenich
 * Class: CMSC335
 * File: ThreeDimensionalShape.java
 * Date: 11/08/2025
 */
package cmsc.shape;

/**
 * Abstract class that extends Shape and serves as the
 * base class for all 3D Shapes
 */
public abstract class ThreeDimensionalShape extends Shape {

    /**
     * Constructor, always sets numberOfDimensions to 3 because
     * the shapes are 3D.
     */
    public ThreeDimensionalShape() {
        super(3);
    }

    /**
     * Abstract method to get volume, implemented by all
     * 3D Shapes, ensures 3D Shapes has(have) a volume.
     * @return volume
     */
    public abstract double getVolume();

}
