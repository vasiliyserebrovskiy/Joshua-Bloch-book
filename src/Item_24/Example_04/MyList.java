package Item_24.Example_04;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (19.11.2025)
 */

/**
 * When a non-static inner class is appropriate
 * A non-static inner class is appropriate only when it needs access to the outer object's instance data.
 * A common example is an iterator that needs access to a collection stored in the outer object.
 */
public class MyList {
    private final int[] values = {1, 2, 3};

    public class MyIterator {
        private int index = 0;

        public boolean hasNext() {
            return index < values.length;  // uses the outer object's field
        }

        public int next() {
            return values[index++];
        }
    }

    public MyIterator iterator() {
        return new MyIterator();
    }
}
