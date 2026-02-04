package Item_83.Example_04;

import Item_83.Example_01.FieldType;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (04.02.2026)
 */
// Single-check idiom - can use repeated initialization!
public class FieldTypeSingleCheck {
    private volatile FieldType field;

    private FieldType getField() {
        FieldType result = field;

        if (field == null)
            field = result = computeFieldValue();
        return result;
    }

    private static FieldType computeFieldValue() {
        System.out.println("Computing FieldType...");
        return new FieldType("Lazy value");
    }

}
