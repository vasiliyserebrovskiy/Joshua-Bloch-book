package Item_26.Example_04;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (24.11.2025)
 */
public class Box<T> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}
