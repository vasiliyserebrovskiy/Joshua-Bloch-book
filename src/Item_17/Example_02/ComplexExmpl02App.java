package Item_17.Example_02;



/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (07.11.2025)
 */
public class ComplexExmpl02App {
    public static void main(String[] args) {
        Complex complexFirst = Complex.valueOf(2.35, 0.5);
        System.out.println(complexFirst);
        Complex complexSecond = Complex.valueOf(3.0, 1.1);
        Complex complexPlus = complexFirst.plus(complexSecond);
        System.out.println(complexFirst + " + " + complexSecond + " = " + complexPlus);
    }
}
