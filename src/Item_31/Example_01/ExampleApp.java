package Item_31.Example_01;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (02.12.2025)
 */

import java.util.ArrayList;
import java.util.List;

/**
 * Generics are invariant. This means that
 * List<Number> is not a supertype for List<Integer>,
 * even if Integer is a subtype of Number.
 * -
 * To make the API flexible, Bloch suggests using bounded wildcards:
 * ? extends T // producer — only reads
 * ? super T // consumer — only records
 * -
 * Bloch's Rule:
 * PECS — Producer Extends, Consumer Super
 * If the parameter produces values of type T → ? extends T
 * If the parameter consumes values of type T → ? super T
 */

public class ExampleApp {
    // Bad example
    public static <T> void copyBad(List<T> src, List<T> dst) {
        for (T t : src) {
            dst.add(t);
        }
    }

    // Good example
    public static <T> void copy(List<? extends T> src,
                                List<? super T> dst) {
        for (T t : src) {
            dst.add(t);
        }
    }

    public static void main(String[] args) {
        // Example 1 did not work
        List<Integer> intsBad = List.of(1, 2, 3);
        List<Number> numsBad = new ArrayList<>();
//        copyBad(intsBad, numsBad); // Error
        // src: List<T> List<Integer>
        //dst: List<T> List<Number>
        //reason: Incompatible equality constraint: Number and Integer


        // Example 2 - all work
        List<Integer> ints = List.of(1, 2, 3);
        List<Number> nums = new ArrayList<>();

        copy(ints, nums);  // ✔ work fine

        System.out.println("Ints = " + ints);
        System.out.println("Nums = " + nums);
    }
}
