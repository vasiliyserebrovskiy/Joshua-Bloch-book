package Item_79.Example_01;
/**
 * Observer interface from Effective Java, Item 79.
 * Used to demonstrate problems with excessive synchronization.
 */
public interface SetObserver<E> {
    void added(ObservableSet<E> set, E element);
}
