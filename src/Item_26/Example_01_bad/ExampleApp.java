package Item_26.Example_01_bad;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (24.11.2025)
 */
// Do not do like this
public class ExampleApp {
    public static void main(String[] args) {
        List numbers = new ArrayList();  // raw type
        numbers.add("Hello");
        numbers.add(123);

        // RunTime Error
        for (Object obj : numbers) {
            Integer number = (Integer) obj; // ClassCastException here!
            System.out.println(number);
        }
    }
}
