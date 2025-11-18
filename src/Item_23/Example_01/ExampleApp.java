package Item_23.Example_01;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (18.11.2025)
 */
public class ExampleApp {
    public static void main(String[] args) {

        Figure myCircle = new Figure(2.5);
        Figure myRectangle = new Figure(3.0, 4.5);
        System.out.println("Circle area = " + myCircle.area());
        System.out.println("Rectangle area = " + myRectangle.area());
    }
}
