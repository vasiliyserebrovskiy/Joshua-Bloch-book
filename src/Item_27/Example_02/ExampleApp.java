package Item_27.Example_02;

import java.util.List;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (25.11.2025)
 */
public class ExampleApp {
    public static void main(String[] args) {

        // Bad
        List<String> data = Test.getData();  // unchecked conversion

        // Correct
        @SuppressWarnings("unchecked") // add SuppressWarnings only near a place with a casting.
        List<String> myData = (List<String>) Test.getData();
    }
}
