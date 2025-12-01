package Item_30.Example_01;

import java.util.Set;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (01.12.2025)
 */
// Simple program to execute generic method
public class ExampleApp {
    public static void main(String[] args) {
        Set<String> guys = Set.of("Tom", "Dick","Harry");
        Set<String> stooges = Set.of("Larry","Moe","Curly");
        Set<String> aflCio = Example02.union(guys,stooges);
        System.out.println(aflCio);
    }
}
