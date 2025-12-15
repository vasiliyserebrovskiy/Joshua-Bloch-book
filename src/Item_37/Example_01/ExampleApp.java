package Item_37.Example_01;

import java.util.*;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toSet;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (15.12.2025)
 */
public class ExampleApp {
    public static void main(String[] args) {
        List<Plant> garden = List.of(
                new Plant("Basil", Plant.LifeCycle.ANNUAL),
                new Plant("Tomato", Plant.LifeCycle.ANNUAL),
                new Plant("Carrot", Plant.LifeCycle.BIENNIAL),
                new Plant("Parsley", Plant.LifeCycle.BIENNIAL),
                new Plant("Rose", Plant.LifeCycle.PERENNIAL),
                new Plant("Tulip", Plant.LifeCycle.PERENNIAL)
        );
        // Using ordinal() to index into an array - DON'T DO THIS!
        Set<Plant>[] plantsByLifeCycle = (Set<Plant>[]) new Set[Plant.LifeCycle.values().length];

        for (int i = 0; i < plantsByLifeCycle.length; i++) {
            plantsByLifeCycle[i] = new HashSet<>();
        }


        for (Plant p : garden)
            plantsByLifeCycle[p.lifeCycle.ordinal()].add(p);

        //Print the result
        for (int i = 0; i < plantsByLifeCycle.length; i++) {
            System.out.printf("%s: %s\n", Plant.LifeCycle.values()[i], plantsByLifeCycle[i]);
        }

        /*
            this technique works, but it is fraught with problems. Because arrays are not compatible with generics,
            (Item 28), the program requires an unchecked cast and will not compile cleanly.
         */

        // Using an EnumMap to associate data with an enum
        Map<Plant.LifeCycle, Set<Plant>> plantsByLifeCycleMap = new EnumMap<>(Plant.LifeCycle.class);

        for (Plant.LifeCycle lc : Plant.LifeCycle.values())
            plantsByLifeCycleMap.put(lc, new HashSet<>());

        for (Plant p : garden)
            plantsByLifeCycleMap.get(p.lifeCycle).add(p);

        System.out.println(plantsByLifeCycleMap);

        System.out.println("=================");
        // Naive stream-based approach - unlikely to produce an EnumMap!
        System.out.println(garden.stream()
                .collect(groupingBy(p -> p.lifeCycle)));


        System.out.println("=================");
        // Using a stream and an EnumMap to associate data with an enum
        System.out.println(garden.stream()
                .collect(groupingBy(p -> p.lifeCycle, () -> new EnumMap<>(Plant.LifeCycle.class), toSet())));
    }
}
