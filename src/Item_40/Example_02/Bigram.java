package Item_40.Example_02;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (18.12.2025)
 */
// Item 40: Consistently use the Overrotation
    // Can you spot the bug?
public class Bigram {
    private final char first;
    private final char second;

    public Bigram(char first, char second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Bigram))
            return false;
        Bigram b = (Bigram) o;
        return first == b.first && second == b.second;
    }

    public int hashCode() {
        return 31 * first + second;
    }

    public static void main(String[] args) {
        Set<Bigram> s = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            for (char ch = 'a'; ch <= 'z'; ch++) {
                s.add(new Bigram(ch, ch));
            }
            System.out.println(s.size());
        }
    }
}
