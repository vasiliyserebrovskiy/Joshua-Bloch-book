package Item_26.Example_02;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (24.11.2025)
 */
public class ExampleApp {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(123);
//         numbers.add("Hello");  // compile-time error! Required type: Integer - Provided type: String

        for (Integer number : numbers) {
            System.out.println(number);  // safe now
        }
    }
}
