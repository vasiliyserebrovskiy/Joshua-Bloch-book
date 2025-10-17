### Summary — Essence of Item 14
The Comparable<T> interface defines the natural ordering of class objects (via the compareTo(T o) method).

Implementing compareTo makes objects sortable (used by Arrays.sort, Collections.sort, TreeSet, TreeMap, etc.).

If a class has a logical natural order, it should implement Comparable.

Important: compareTo should be consistent with equals when collections expect such behavior (not mandatory, but recommended). Inconsistency may lead to unexpected results in SortedSet or SortedMap.

### Within compareTo, you should:
- respect the contract (antisymmetry, transitivity, zero return value for equality);
- avoid expressions like a - b (they may cause overflow);
- use Integer.compare, Long.compare, Double.compare, etc., for primitives;
- for compound keys — compare by the primary field first, then the secondary, and so on.

Often, it’s better to implement Comparable using a chain of comparators (in Java 8+, Comparator.comparing(...).thenComparing(...) is very convenient) inside compareTo.

### Rules (briefly)
- x.compareTo(y) == 0 should mean the objects are equal in order. Ideally, x.equals(y) should then also return true.
- Never use return a - b; for int comparison — use Integer.compare(a, b) instead.
- For long, use Long.compare(a, b); for double, use Double.compare(a, b).
- Always document which fields define the ordering (so users know what to expect).

### Validation and Testing

When implementing compareTo, it’s helpful to write small unit tests:
- a.compareTo(a) == 0
- sign(a.compareTo(b)) == -sign(b.compareTo(a))
- Transitivity: if a > b and b > c → a > c
- Consistency with equals (if this is required)

### Quick Checklist for Implementing Comparable
1. Decide whether your class has a natural order. If yes — implement Comparable<T>.
2. Document the ordering (which fields, how null is handled, shallow vs. deep).
3. Use a Comparator chain or Integer.compare / Long.compare, etc. (avoid a - b).
4. Ensure consistency with equals (or clearly document if it differs).
5. Add unit tests to verify the compareTo contract.