package Item_50.Example_02;

import java.util.Date;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (17.01.2026)
 */
public class Period {
    private final Date start;
    private  final Date end;

    /**
     * @param start the beginning of the period
     * @param end the end of the period; must not precede start
     * @throws IllegalArgumentException if start is after end
     * @throws NullPointerException if start or end is null
     */

    //Repaired constructor - makes defensive copies of parameters
    public Period(Date start, Date end) {
        this.start = new Date(start.getTime());
        this.end = new Date(end.getTime());

        if (this.start.compareTo(this.end) > 0)
            throw new IllegalArgumentException(start + " after " + end);

        // Note that defencive copies are made BEFOR checking the validity of the parameters,
        // and the validity check is performed on the copies rather than on the originals.
        // While this may seem unnatural, it is necessary. It protects the class against changes
        // to the parameters from another thread during the window of vulnerability between the time the parameters are checked and the time they are copied.
        // In the computer security community, this is known as a time-of-check/time-of-use or TOCTOU attack!
    }

    public Date start() {
        return start;
    }

    public Date end() {
        return end;
    }

    @Override
    public String toString() {
        return "Period {" +
                "start=" + start +
                ", end=" + end +
                '}';
    }
}
