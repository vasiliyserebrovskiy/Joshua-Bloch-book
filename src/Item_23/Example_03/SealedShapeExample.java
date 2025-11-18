package Item_23.Example_03;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (18.11.2025)
 */
public class SealedShapeExample {
    public static void main(String[] args) {

        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);

        System.out.println("Circle area: " + circle.area());
        System.out.println("Rectangle area: " + rectangle.area());
    }
}
