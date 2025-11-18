package Item_23.Example_02;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (18.11.2025)
 */
public class ExampleApp {
    public static void main(String[] args) {
        Circle myCircle = new Circle(3.5);
        Rectangle myRectangle = new Rectangle(3.5,4.5);
        Square mySquare = new Square(5.0);

        System.out.println("myCircle area = " + myCircle.area());
        System.out.println("myRectangle area = " + myRectangle.area());
        System.out.println("mySquare area = " + mySquare.area());
    }
}
