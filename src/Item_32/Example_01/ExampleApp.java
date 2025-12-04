package Item_32.Example_01;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (04.12.2025)
 */
public class ExampleApp {

    // Example 1: secure list printing
    @SafeVarargs
    static <T> void printLists(List<T>... lists) {
        for (List<T> list : lists) {
            System.out.println(list);
        }
    }

    // Example 2: how to properly wrap varargs in a list
    @SafeVarargs
    static <T> List<T> makeList(T... elements) {
        return List.of(elements);
    }

    // Example 3: IT'S NOT SAFE
    static <T> void dangerous(List<T>... lists) {
        Object[] array = lists;    // heap pollution
        array[0] = List.of(123);   // insert List<Integer>
    }

    // Example 4: a safe method without varargs
    static <T> void safe(List<List<T>> lists) {
        for (var list : lists) {
            System.out.println(list);
        }
    }

    // Example 5: An example where generics + varargs are useful (single value selection builder)
    @SafeVarargs
    static <T> T pick(T... items) {
        return items[(int) (Math.random() * items.length)];
    }

    public static void main(String[] args) {

        //Example 1:
        List<String> a = List.of("one", "two");
        List<String> b = List.of("three", "four");

        printLists(a, b);
        // Why is it safe?
        //Because inside the method, we do not write anything to lists, but only read.

        //Example 2:
        List<Integer> list = makeList(1, 2, 3);
        System.out.println(list);
        // Varargs are safe here: you just passed the elements and created an immutable list from them.

        //Example 3:
        List<String> c = new ArrayList<>();
        dangerous(c); // Unchecked generics array creation for varargs parameter // runtime ClassCastException - new java only warning??? need to check this

        // Problem:
        //List<String>[] is actually stored as an Object[], and you can put anything there → error runtime.

        // Example 4:
        safe(List.of(
                List.of("a"),
                List.of("b")
        ));

        // Example 5:
        Integer i = pick(1, 2, 3, 4);
        String s = pick("a", "b", "c");
        System.out.println("i = " + i);
        System.out.println("s = " + s);
        // It is useful and safe, since varargs are only used to transmit the value.
    }
}
