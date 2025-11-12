package Item_19.Example_01_bad;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (12.11.2025)
 */
public class Super {
    // Broken - constructor invokes an overridable method
    public Super() {
        overrideMe();
    }

    public void overrideMe() {
        System.out.println("Super overrideMe.");
    }
}
