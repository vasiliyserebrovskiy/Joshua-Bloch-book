package Item_23.Example_02;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (18.11.2025)
 */
public class Rectangle extends Figure{
    final double length;
    final double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }
}
