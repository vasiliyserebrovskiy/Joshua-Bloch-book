package Item_27.Example_01;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (25.11.2025)
 */
public class ExampleApp {
    public static void main(String[] args) {

        // EXAMPLE 1

        // Bad example
        List<String> strings = new ArrayList<>();
        List rawList = new ArrayList(); // raw
        rawList.add(10);

        strings = rawList;  // unchecked assignment

        // Good example
        List<String> myStrings = new ArrayList<>();
        List<String> other = new ArrayList<>();
        other.add("Hello");

        strings = other;

        // EXAMPLE 2
        // classic unchecked warnings
        //Bad
        List<String>[] array = new List[10]; // unchecked warning

        // correct
        List<List<String>> listOfLists = new ArrayList<>();


    }
}
