package Item_47.Example_01;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (10.01.2026)
 */
public class ExampleApp {
    public static void main(String[] args) {

        // Example 1: using PowerSet class
        Set<String> set = Set.of("A", "B", "C");
        Collection<Set<String>> powerSet = PowerSet.of(set);

        for (Set<String> subset : powerSet) {
            System.out.println(subset);
        }

        System.out.println("================");
        // Example 2: using SubLists class
        List<String> list = List.of("A", "B", "C");

        Stream<List<String>> subLists = SubLists.of(list);

        subLists.forEach(System.out::println);
    }
}
