package Item_81.Example_01;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (03.02.2026)
 */
public class Example01 {
    // Concurrent canonicalizing map atop ConcurrentMap - not optimal
    private static final ConcurrentMap<String,String> map = new ConcurrentHashMap<>();

    public static String intern(String s) {
        String previousValue = map.putIfAbsent(s,s);
        return previousValue == null ? s : previousValue;
    }

    // Concurrent canonizing map atop ConcurrentMap - faster!
    public static String intern2(String s) {
        String result = map.get(s);
        if (result == null) {
            result = map.putIfAbsent(s, s);
            if (result == null)
                result = s;
        }
        return result;
    }
}
