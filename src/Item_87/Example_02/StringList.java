package Item_87.Example_02;

import java.io.Serializable;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (06.02.2026)
 */
// Awful candidate for default serialized form
public class StringList implements Serializable {
    private int size = 0;
    private Entry head = null;

    private static class Entry implements Serializable{
        String data;
        Entry next;
        Entry previous;
    }

    // Remainder omitted
}
