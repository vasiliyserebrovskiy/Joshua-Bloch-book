package Item_29.Example_02;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (27.11.2025)
 */
// Initial attempt to generify Stack - won't compile
public class Stack<E> {
    private E[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    /*
    The elements array will contain only E instances from push(E).
    This is sufficient to ensure type safety, but the runtime
    type of the array won't be E[]; it will always be Object[]!
     */
    @SuppressWarnings("unchecked")
    public Stack() {
//        elements = new E[DEFAULT_INITIAL_CAPACITY]; // generic array creation - Type parameter 'E' cannot be instantiated directly
        elements = (E[]) new Object[DEFAULT_INITIAL_CAPACITY]; // Unchecked cast: 'java.lang.Object[]' to 'E[]'
    }

    public void push(E e) {
        ensureCapacity();
        elements[size++] = e;
    }

    // Appropriate suppression of unchecked warning
    public E pop() {
        if (size == 0)
            throw new EmptyStackException();
        // Now we did not need to do so.
        // push requires elements to be of type E, so cast is correct
//        @SuppressWarnings("unchecked") //Redundant suppression
        E result = elements[--size]; //
        elements[size] = null; // Eliminate obsolete reference
        return result;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void ensureCapacity() {
        if (elements.length == size)
            elements = Arrays.copyOf(elements, 2 * size + 1);
    }
}
