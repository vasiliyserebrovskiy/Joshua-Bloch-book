package Item_83.Example_01;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (04.02.2026)
 */
public class FieldType {
    private final String value;

    public FieldType(String value) {
        // imitating an "expensive" operation
        try {
            Thread.sleep(1000); // 1 second
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
