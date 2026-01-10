package Item_47.Example_01;

import java.util.*;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (10.01.2026)
 */
// Returns the power set of an input set as custom collection
public class PowerSet {

    public static final <E> Collection<Set<E>> of(Set<E> s) {
        List<E> src = new ArrayList<>(s);
        if (src.size() > 30)
            throw new IllegalArgumentException("Set too big" + s);
        return new AbstractList<Set<E>>() {
            @Override
            public int size() {
                return 1 << src.size();
            }

            @Override
            public boolean contains(Object o) {
                return o instanceof Set && src.containsAll((Set)o);
            }
            @Override
            public Set<E> get(int index) {
                Set<E> result = new HashSet<>();
                for (int i = 0; index != 0; i++, index >>= 1)
                    if ((index & 1) == 1)
                        result.add(src.get(i));
                return result;
            }
        };

    }
}
