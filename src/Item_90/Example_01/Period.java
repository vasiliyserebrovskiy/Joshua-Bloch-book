package Item_90.Example_01;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (09.02.2026)
 */
public class Period implements  Serializable {
    private final Date start;
    private final Date end;

    public Period(Date start, Date end) {
        if (start.after(end)) {
            throw new IllegalArgumentException("Start after end");
        }
        this.start = new Date(start.getTime());
        this.end = new Date(end.getTime());
    }

    public Date start() {
        return new Date(start.getTime());
    }

    public Date end() {
        return new Date(end.getTime());
    }

    // Instead of serializing the object, we return the proxy
    private Object writeReplace() {
        return new SerializationProxy(this);
    }

    // Blocking direct deserialization
    private void readObject(ObjectInputStream stream)
            throws InvalidObjectException {
        throw new InvalidObjectException("Proxy required");
    }

    // The proxy class itself
    private static class SerializationProxy implements Serializable {
        private final Date start;
        private final Date end;

        SerializationProxy(Period p) {
            this.start = p.start;
            this.end = p.end;
        }

        private Object readResolve() {
            return new Period(start, end);
        }

        @Serial
        private static final long serialVersionUID = 1;
    }

    private static final long serialVersionUID = 1;
}
