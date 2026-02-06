package Item_88.Example_01;

import java.io.*;
import java.util.Date;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (06.02.2026)
 */
// Immutable class that uses defencive copying
public class Period implements Serializable {
    private final Date start;
    private final Date end;

    /**
     * @param start the beginning of the period
     * @param end the end of the period; must not precede start
     * @throw IllegalArgumentException if start is after end
     * @throw NullPointerException if start or end is null
     */
    public Period(Date start, Date end) {
        this.start = new Date(start.getTime());
        this.end = new Date(end.getTime());
        if (this.start.compareTo(this.end) > 0)
            throw new IllegalArgumentException(start + " after " + end);
    }

    public Date start() {
        return new Date(start.getTime());
    }

    public Date end() {
        return new Date(end.getTime());
    }
    @Override
    public String toString() {
        return start + " - " + end;
    }

    // Remainder omitted

    // readObject method with validity checking - insufficient!
    @Serial
    private void readObject(ObjectInputStream s) throws IOException, ClassNotFoundException {
        s.defaultReadObject();

        // Check that our invariants are satisfied
        if (start.compareTo(end) > 0)
            throw new InvalidObjectException(start + " after " + end);
    }

}
