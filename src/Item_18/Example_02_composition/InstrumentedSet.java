package Item_18.Example_02_composition;

import java.util.Collection;
import java.util.Set;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (11.11.2025)
 */
public class InstrumentedSet<E> extends ForwardingSet<E> {
    private int addCount = 0;

    public InstrumentedSet(Set<E>e) {
        super(e);
    }

    @Override
    public boolean add(E e) {
        addCount++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        return super.addAll(c);
    }
    public int getAddCount() {
        return addCount;
    }
}
