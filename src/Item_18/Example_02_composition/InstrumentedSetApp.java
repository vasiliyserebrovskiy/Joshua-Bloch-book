package Item_18.Example_02_composition;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (11.11.2025)
 */

public class InstrumentedSetApp {
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();
        InstrumentedSet<String> mySet = new InstrumentedSet<>(stringSet);
        System.out.println("AddCount before adding elements = " + mySet.getAddCount());

        mySet.addAll(List.of("First", "Second", "Third"));
        System.out.println("AddCount after adding elements = " + mySet.getAddCount()); // Here we will have the correct number of elements: 3

    }
}
