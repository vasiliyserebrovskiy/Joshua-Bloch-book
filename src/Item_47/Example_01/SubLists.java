package Item_47.Example_01;

import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (10.01.2026)
 */
// Returns a stream of all the sublists of its input list
public class SubLists {
    public static <E>Stream<List<E>> of (List<E> list)  {
        return Stream.concat(Stream.of(Collections.emptyList()), prefixes(list).flatMap(SubLists::suffixes));
    }

    private static <E>Stream<List<E>> prefixes(List<E> list) {
        return IntStream.rangeClosed(1,list.size())
                .mapToObj(end -> list.subList(0,end));
    }

    private static <E>Stream<List<E>> suffixes(List<E> list) {
        return IntStream.range(0, list.size())
                .mapToObj(start -> list.subList(start, list.size()));
    }
}
