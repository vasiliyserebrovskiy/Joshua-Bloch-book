package Item_23.Example_02;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (18.11.2025)
 */
public class Circle extends Figure{
    final double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area () {
        return Math.PI * (radius * radius);
    }
}
