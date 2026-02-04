package Item_83.Example_03;

import Item_83.Example_01.FieldType;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (04.02.2026)
 */
// Double-check idiom for lazy initialization of instance fields
public class FieldDoubleCheck {
    private volatile FieldType field;

    private FieldType getField() {
        FieldType result = field;
        if (result != null)  // First check (no locking)
            return result;


        synchronized (this) {
            if (field == null)  // Second check (with locking)
                field = computeFieldValue();
            return field;
        }
    }

    private static FieldType computeFieldValue() {
        System.out.println("Computing FieldType...");
        return new FieldType("Lazy value");
    }
}
