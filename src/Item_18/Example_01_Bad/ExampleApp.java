package Item_18.Example_01_Bad;

import java.util.List;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (11.11.2025)
 */
public class ExampleApp {
    public static void main(String[] args) {
        InstrumentedHashSet<String> s = new InstrumentedHashSet<>();
        s.addAll(List.of("Snap", "Crackle", "Pop"));

        System.out.println("getCount = " + s.getAddCount()); // Here we will have the incorrect number of elements: 6
    }
}
