package Item_31.Example_02;

import java.util.List;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (02.12.2025)
 */
public class ExampleApp {
    // Bad example - without wildcard
    public static <T extends Comparable<T>> T maxBad(List<T> list) {
        T max = list.get(0);
        for (T t : list)
            if (t.compareTo(max) > 0)
                max = t;
        return max;
    }

    /**
     * Problem: Comparable is almost always used as a Comparable<? super T>.
     * For example, Integer implements Comparable<Number> could well be.
     */

    // Googd example
    public static <T extends Comparable<? super T>> T max(List<? extends T> list) {
        T max = list.get(0);
        for (T t : list)
            if (t.compareTo(max) > 0)
                max = t;
        return max;
    }

    /**
     * Meaning:
     * List<? extends T> — the list can be List<Integer>, List<Double>, …
     * Comparable<? super T> — can be compared with any supertype of T.
     */
}
