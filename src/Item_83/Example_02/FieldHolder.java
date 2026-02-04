package Item_83.Example_02;

import Item_83.Example_01.FieldType;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (04.02.2026)
 */
// Lazy initialization holder class idiom for static fields
public class FieldHolder {
    static final FieldType field = computeFieldValue();

    private static FieldType getField() {
        return FieldHolder.field;
    }

    private static FieldType computeFieldValue() {
        System.out.println("Computing FieldType...");
        return new FieldType("Lazy value");
    }
}
