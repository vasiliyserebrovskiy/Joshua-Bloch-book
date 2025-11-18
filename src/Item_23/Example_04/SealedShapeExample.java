package Item_23.Example_04;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (18.11.2025)
 */
// Functional style (area defined outside)
public class SealedShapeExample {
    public static void main(String[] args) {

        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);

        System.out.println("Circle area: " + area(circle));
        System.out.println("Rectangle area: " + area(rectangle));
    }

    // Area method
    public static double area(Shape shape) {
        return switch (shape) {
            case Circle c -> Math.PI * c.radius() * c.radius();
            case Rectangle r -> r.width() * r.height();
        };
        // No default is needed → sealed guarantees that there are no other types.
    }
}
