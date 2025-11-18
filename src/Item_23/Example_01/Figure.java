package Item_23.Example_01;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (18.11.2025)
 */
// Tagged class - vastly inferior to a class hierarchy!
public class Figure {
    enum Shape {RECTANGLE, CIRCLE}

    // Tag field - the shape of this figure
    final Shape shape;

    // This fields are used only if shape is RECTANGLE
    double length;
    double width;

    // This field is use only if shape is CIRCLE
    double radius;

    // Constructor for circle
    Figure(double radius) {
        shape = Shape.CIRCLE;
        this.radius = radius;
    }

    // Constructor for rectangle
    Figure(double length, double width) {
        shape = Shape.RECTANGLE;
        this.length = length;
        this.width = width;
    }
    double area() {
        return switch (shape) {
            case RECTANGLE -> length * width;
            case CIRCLE -> Math.PI * (radius * radius);
            default -> throw new AssertionError(shape);
        };
    }
}
