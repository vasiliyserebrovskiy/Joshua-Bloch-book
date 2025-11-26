package Item_27.Example_04;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (25.11.2025)
 */
public class Example_01 {

    /*
    public static Set toSet(Object[] array) {
    Set result = new HashSet();
    for (Object o : array) {
        result.add(o);
    }
    return result;
}
     */
    public static <T> Set<T> toSet(T[] array) {
        Set<T> result = new HashSet<>();
        for (T element : array) {
            result.add(element);
        }
        return result;
    }
}
