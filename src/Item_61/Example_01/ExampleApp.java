package Item_61.Example_01;

import java.util.Comparator;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (24.01.2026)
 */
public class ExampleApp {
    public static void main(String[] args) {
        // Example 1:
        // Broken comparator - can you spot the flaw?
        Comparator<Integer> naturalOrder = (i, j) -> ( i < j ) ? -1 : ( i == j ? 0 : 1);

        System.out.println(naturalOrder.compare(1, 2)); // -1 this is wright
        System.out.println(naturalOrder.compare(new Integer(42), new Integer(42))); // 1 this is a wrong answer!

        //Example 2: fixed
        Comparator<Integer> naturalOrder2 = (iBoxed, jBoxed) -> {
            int i = iBoxed, j = jBoxed; // Auto-anboxing
            return i< j ? -1 : (i == j ? 0 : 1);
        };
        System.out.println("======");
        System.out.println(naturalOrder2.compare(1, 2));
        System.out.println(naturalOrder2.compare(new Integer(42), new Integer(42))); // 0 - this is the wright answer
    }
}
