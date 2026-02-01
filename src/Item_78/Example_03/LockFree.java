package Item_78.Example_03;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (01.02.2026)
 */
// Lock-free synchronization with java.util.concurrent.atomic
public class LockFree {
    private static final AtomicLong nextSerialNum = new AtomicLong();

    public static long generateSerialNumber() {
        return nextSerialNum.getAndIncrement();
    }
}
