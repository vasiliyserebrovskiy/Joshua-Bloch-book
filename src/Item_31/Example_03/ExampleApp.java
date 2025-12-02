package Item_31.Example_03;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (02.12.2025)
 */
public class ExampleApp {
    // Bad - did not work
    public static <T> void addAllBad(List<T> list, List<T> elems) {
        for (T e : elems) {
            list.add(e);
        }
    }

    // Work
    public static <T> void addAll(List<? super T> list,
                                  List<? extends T> elems) {
        for (T e : elems) {
            list.add(e);
        }
    }


    public static void main(String[] args) {
        // Bad
        List<Number> n = new ArrayList<>();
        List<Integer> i = List.of(1, 2, 3);

//        addAllBad(n, i);  // error: reason: Incompatible equality constraint: Integer and Number

        addAll(n, i);  //  Number takes an Integer

        System.out.println(n);
    }

    /*
     * The main rule of Item 31
     *  Always use bounded wildcards in the method parameters:
     *      ? extends T — when data is extracted from the container
     *      ? super T — when data is written to the container
     *  ! Never use wildcard in the return type.
     */
}
