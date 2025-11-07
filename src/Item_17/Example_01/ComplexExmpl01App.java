package Item_17.Example_01;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (07.11.2025)
 */
public class ComplexExmpl01App {
    public static void main(String[] args) {
        Complex complexFirst = new Complex(2.35, 0.5);
        System.out.println(complexFirst);
        Complex complexSecond = new Complex(3.0, 1.1);
        Complex complexPlus = complexFirst.plus(complexSecond);
        System.out.println(complexFirst + " + " + complexSecond + " = " + complexPlus);
//        System.out.println(complexPlus);
    }
}
