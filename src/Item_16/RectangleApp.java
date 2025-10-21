package Item_16;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (21.10.2025)
 */
public class RectangleApp {
    public static void main(String[] args) {
        Rectangle newRectangle = new Rectangle(25.20, 55.10);
        System.out.println("Width = " + newRectangle.getWidth());
        System.out.println("Height = " + newRectangle.getHeight());

        System.out.println("==============");
        newRectangle.setHeight(33.40);
        newRectangle.setWidth(15.30);
        System.out.println("Width = " + newRectangle.getWidth());
        System.out.println("Height = " + newRectangle.getHeight());
    }
}
