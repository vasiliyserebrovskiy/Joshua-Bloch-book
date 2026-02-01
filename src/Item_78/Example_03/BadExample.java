package Item_78.Example_03;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (01.02.2026)
 */
// Broken - required synchronization!
public class BadExample {
    private static volatile int nextSerialNumber = 0;

    public static int generateSerialNumber() {
        return nextSerialNumber++; // WARNING: Non-atomic operation on volatile field 'nextSerialNumber'
    }
}
