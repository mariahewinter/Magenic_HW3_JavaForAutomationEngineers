/**
 * TODO FOR HOMEWORK - EquilateralTriangle.java
 *      [ ] Update this class to inherit from BaseShape.java
 *      [ ] Update to a valid and logical constructor
 *      [ ] Override the area method
 *      [ ] Override the perimeter method
 *      [ ] Add a static main method
 */
public class EquilateralTriangle extends BaseShape{
    /**
     * TODO FOR HOMEWORK: Update the below constructor
     * NOTE: Remember you only need the length (Same thing as the base) to find the height of an equilateral triangle
     *       height = (sqrt(3)/2) * length
     * Creates an instance of the EquilateralTriangle class
     * @param length The base length of the triangle
     */
    public EquilateralTriangle(double length) {
        // Calls the base constructor
        super("EquilateralTriangle", length, Math.sqrt(3)/2 * length);
    }

    // TODO FOR HOMEWORK: Override the area() method from BaseShape to work for a triangle
    public double area(){
        return (this.getLength() * this.getHeight())/2;
    }

    // TODO FOR HOMEWORK: Override the perimeter() method from BaseShape to work for a triangle
    public double perimeter(){
        return (3 * this.getLength());
    }

    // TODO FOR HOMEWORK: Add a static main method for any debugging purposes
    public static void main(String[] args) {
        EquilateralTriangle triangle = new EquilateralTriangle(5);
        triangle.DEBUG_PrintOutAreaAndPerimeter();
    }

}