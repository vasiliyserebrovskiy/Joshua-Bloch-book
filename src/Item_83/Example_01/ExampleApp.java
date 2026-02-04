package Item_83.Example_01;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (04.02.2026)
 */
public class ExampleApp {
    public static void main(String[] args) {
        Example01 example = new Example01();

        System.out.println("Object created");

        // computeFieldValue() didn't called
        System.out.println("Before first call");

        FieldType ft = example.getField2(); // ← here we are creating an Object

        System.out.println(ft.getValue());
    }
}
