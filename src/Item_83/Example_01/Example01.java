package Item_83.Example_01;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (04.02.2026)
 */
public class Example01 {

    // Eager initialization
    private final FieldType field = computeFieldValue();

    // Lazy initialization
    private FieldType field2;

    public synchronized FieldType getField2() {
        if (field2 == null) {
            field2 = computeFieldValue();
        }
        return field2;
    }

    private FieldType computeFieldValue() {
        System.out.println("Computing FieldType...");
        return new FieldType("Lazy value");
    }
}
