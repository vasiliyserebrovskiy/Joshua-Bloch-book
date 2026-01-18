package Item_52.Example_01;

import java.math.BigInteger;
import java.util.*;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (18.01.2026)
 */
// Broken! - what does this program print?
public class CollectionClassifier {
    public static String classify(Set<?> s) {
        return "Set";
    }

    public static String classify(List<?> lst) {
        return "List";
    }

    public static String classify(Collection<?> c) {
        return "Unknown Collections";
    }
    // Part 2 of Example
    // Assuming a static method is required, the best way to fix the CollectionClassifier program is to replace all three overloadings of classify,
    // with a single method that explicit instanceof tests:
    public static String classify2(Collection<?> c) {
        return c instanceof Set ? "Set" :
                c instanceof List ? "List" : "Unknown Collection";
    }

    public static void main(String[] args) {
        //Example 1:
        Collection<?>[] collections = {
                new HashSet<String>(),
                new ArrayList<BigInteger>(),
                new HashMap<String, String>().values()
        };

        for (Collection<?> c : collections) {
            System.out.println(classify(c));
        }

        /*
            The classify method is overloaded, and the choice of which overloading to invoke is made at compile time.
            For all three iterationis of the loop, the compile-time type of the parameter is the same: Collection<?>.
         */
        System.out.println("==============");
        // Example 2:
        for (Collection<?> c : collections) {
            System.out.println(classify2(c));
        }
    }
}
