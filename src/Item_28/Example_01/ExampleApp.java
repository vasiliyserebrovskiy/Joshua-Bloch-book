package Item_28.Example_01;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (26.11.2025)
 */
// Item 28: Prefer lists to array
public class ExampleApp {
    public static void main(String[] args) {
        // Fails at runtime!
        Object[] objectArray = new Long[1];
        objectArray[0] = "I don't fit in"; //Throws ArrayStoreException

        // Won't compile
//        List<Object> ol = new ArrayList<Long>(); // Incompatible types
//        ol.add("I don't fit in");
    }
}
