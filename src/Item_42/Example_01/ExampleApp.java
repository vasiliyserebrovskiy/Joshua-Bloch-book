package Item_42.Example_01;

import java.util.*;

import static java.util.Comparator.comparingInt;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (23.12.2025)
 */
public class ExampleApp {

    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("Spring");
        words.add("AOP");
        words.add("Framework");
        words.add("Java");
        words.add("Annotation");

        // anonymous class instance as a function object - obsolete!
        Collections.sort(words, new Comparator<String>() {
           public int compare(String s1, String s2) {
               return Integer.compare(s1.length(), s2.length());
           }
        });

        System.out.println(words);

        // Lambda expression as function object (replaces anonymous class)
        Collections.sort(words, (s1,s2) -> Integer.compare(s1.length(), s2.length()));

        // comparator construction method
        Collections.sort(words, comparingInt(String::length));

        // since Java 8: when sort method was added to the List interface we can write so
        words.sort(comparingInt(String::length));
    }

}
