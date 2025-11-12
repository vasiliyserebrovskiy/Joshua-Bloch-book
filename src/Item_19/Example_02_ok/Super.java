package Item_19.Example_02_ok;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (12.11.2025)
 */
public class Super {
    // constructor did not invoke overridable methods
    public Super() {
        printTest();
        printTest2();
    }

    void overrideMe() {
        System.out.println("Super overrideMe.");
    }

    static void printTest() {
        System.out.println("Doing something during initialization of Super.");
    }

    protected final void printTest2() {
        System.out.println("Protected final method doing something.");
    }
}
