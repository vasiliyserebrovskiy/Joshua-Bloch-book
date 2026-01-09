package Item_45.Example_04;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (09.01.2026)
 */
public class ExampleApp {
    public static void main(String[] args) {

        "Hello world!".chars().forEach(System.out::print);
        System.out.println();
        "Hello world!".chars().forEach(x -> System.out.print((char) x));

    }
}
