package Item_19.Example_02_ok;

import java.time.Instant;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (12.11.2025)
 */
public class Sub extends Super {
    // Blank final, set by constructor
    private final Instant instant;

    Sub() {
        instant = Instant.now();
    }

    // Override method
    @Override
    public void overrideMe() {
        System.out.println("SubClass overrideMe : " + instant);
    }

}
