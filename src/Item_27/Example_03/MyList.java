package Item_27.Example_03;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (25.11.2025)
 */
public class MyList<T> {

    //Bad
    /*
    private T[] items;

    public MyList(int size) {
        items = (T[]) new Object[size]; // unchecked cast
    }
     */

    // Correct
    private List<T> items = new ArrayList<>();

    // unchecked warnings in varargs
    public static <T> void addToList(List<T>... lists) { // unchecked
        // ...
    }
    // Generics + varargs = potential runtime-problem.
    @SafeVarargs
    public static <T> void addToList2(List<T>... lists) {
        for (List<T> list : lists) {
            // …
        }
    }

//    Example: Incorrect warning suppression is a bad practice
    @SuppressWarnings("unchecked")
    public <T> List<T> getList() {
        // Bad: The whole method is suppressed!
        return (List<T>) new ArrayList<>();
    }

    // Correct example
    public <T> List<T> getList2() {
        @SuppressWarnings("unchecked")
        List<T> list = (List<T>) new ArrayList<>();
        return list;
    }
}
