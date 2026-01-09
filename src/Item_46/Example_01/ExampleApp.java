package Item_46.Example_01;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.*;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (09.01.2026)
 */
public class ExampleApp {

    public static void main(String[] args) {

        // Example 1:
        // Use the streams API but not the paradigm -- Don't do this!
        Map<String, Long> freq = new HashMap<>();
        String file = "Some long string some. Some long string some. New long string some. Long";
        try (Stream<String> words = new Scanner(file).tokens()) {
            words.forEach(word -> {
                freq.merge(word.toLowerCase(), 1L, Long::sum);
            });
        }
        System.out.println("freq: " + freq);

        // Proper use of streams to initialize a frequency table
        Map<String, Long> freq2;
        try (Stream<String> words = new Scanner(file).tokens()) {
            freq2 = words
                    .collect(groupingBy(String::toLowerCase, counting()));
        }

        System.out.println("freq2: " + freq2);

        // Example 2
        //Pipeline to get a top-three list of words from frequency table
        List<String> topThree = freq.keySet().stream()
                .sorted(comparing(freq::get).reversed())
                .limit(3)
                .collect(toList());

        System.out.println("topThree: " + topThree);

    }
}
