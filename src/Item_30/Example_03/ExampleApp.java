package Item_30.Example_03;

import java.util.Collection;
import java.util.List;
import java.util.Objects;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (01.12.2025)
 */
public class ExampleApp {
    // Returns max value in a collection - uses recursive type bound
    public static <E extends Comparable<E>> E max(Collection<E> c) {
        if (c.isEmpty())
            throw new IllegalArgumentException("Empty collection");

        E result = null;
        for (E e : c)
            if (result == null || e.compareTo(result) > 0)
                result = Objects.requireNonNull(e);

        return result;
    }

    public static void main(String[] args) {

        List<Integer> numbers = List.of(3, 17, 5, 42, 9);
        Integer maxNumber = max(numbers);
        System.out.println("Max number = " + maxNumber);

        System.out.println("=======");

        List<String> names = List.of("Alex", "John", "Michael", "Bob");
        String maxName = max(names);
        System.out.println("Max name = " + maxName);

        System.out.println("=======");

        /**
         * In summary, generic methods, like generic types, are safer and easier to use than methods requiring their clients
         * to put explicit casts on input parameters and return values.
         * Like types, you should make sure that your methods can be used without cast,
         * which often means making them generic.
         */

    }
}
