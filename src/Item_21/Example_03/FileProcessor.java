package Item_21.Example_03;

/**
 * When designing an interface, it is important to think about how it may evolve in the future.
 * Adding new abstract methods to an existing interface can break all current implementations.
 * -
 * Providing default methods allows the interface to grow safely without forcing every
 * implementation to immediately support new functionality.
 * -
 * However, default methods that throw UnsupportedOperationException should be used with caution,
 * because they may still cause unexpected failures at runtime.
 */
public interface FileProcessor {

    void read();

    default void write() {
        throw new UnsupportedOperationException();
    }

    default void delete() {
        throw new UnsupportedOperationException();
    }

    default void copy() {
        throw new UnsupportedOperationException();
    }
}
