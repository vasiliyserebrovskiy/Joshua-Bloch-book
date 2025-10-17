package Item_14.Example_02;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (17.10.2025)
 */
import java.util.*;

public final class Version implements Comparable<Version> {
    private final int[] parts;

    public Version(String version) {
        String[] tokens = version.split("\\.");
        parts = Arrays.stream(tokens).mapToInt(Integer::parseInt).toArray();
    }

    @Override
    public int compareTo(Version o) {
        int len = Math.max(this.parts.length, o.parts.length);
        for (int i = 0; i < len; i++) {
            int a = i < this.parts.length ? this.parts[i] : 0;
            int b = i < o.parts.length ? o.parts[i] : 0;
            int cmp = Integer.compare(a, b);
            if (cmp != 0) return cmp;
        }
        return 0;
    }

    @Override public String toString() { return Arrays.toString(parts); }

    public static void main(String[] args) {
        List<Version> vs = Arrays.asList(new Version("1.2.10"), new Version("1.2.2"), new Version("1.10"));
        Collections.sort(vs);
        vs.forEach(System.out::println);
        // Output in version order: 1.2.2, 1.2.10, 1.10
    }
}

