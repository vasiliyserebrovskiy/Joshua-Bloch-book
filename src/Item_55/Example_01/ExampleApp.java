package Item_55.Example_01;

import java.util.*;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (19.01.2026)
 */
public class ExampleApp {
    // Example 1:
    // Returns maximum value in collection - throws exception if empty
    public static <E extends Comparable<E>> E max(Collection<E> c) {
        if(c.isEmpty())
                throw new IllegalArgumentException("Empty collection");
         E result = null;
         for (E e : c)
             if (result == null || e.compareTo(result) > 0)
                 result = Objects.requireNonNull(e);

         return result;
    }

    // Example 2:
    // Returns maximum value in collection as an Optional<E>
    public static <E extends Comparable<E>> Optional<E> max2(Collection<E> c) {
        if (c.isEmpty())
            return Optional.empty();

        E result = null;
        for (E e : c)
            if (result == null || e.compareTo(result) > 0)
                result = Objects.requireNonNull(e);

        return Optional.of(result);
    }

    // Example 3:
    // Returns max val in collection as Optional<E> - uses stream
    public static <E extends Comparable<E>> Optional<E> maxStream(Collection<E> c) {
        return c.stream().max(Comparator.naturalOrder());
    }

    public static void main(String[] args) {

        // Example 1:
        List<Integer> myInt = List.of(1, 2, 3, 4, 5);

        Integer myMax = max(myInt);
        System.out.println(myMax);

        System.out.println("======");

        // Example 2:
        Optional<Integer> myMax2 = max2(myInt);
        System.out.println(myMax2);

        List<Integer> myInt2 = List.of();
        Optional<Integer> myMax3 = max2(myInt2);
        System.out.println(myMax3);
        System.out.println("======");

        // Example 3:


        Optional<Integer> myMax4 = maxStream(myInt);
        if (myMax4.isPresent())
            System.out.println(myMax4.get());

        myMax4.ifPresent(System.out::println);

    }
}
