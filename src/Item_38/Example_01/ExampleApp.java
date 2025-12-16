package Item_38.Example_01;

import java.util.Arrays;
import java.util.Collection;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (16.12.2025)
 */
public class ExampleApp {
    // Example 01
    private static <T extends Enum<T> & Operation> void test(Class<T> opEnumType, double x, double y) {
        for (Operation op : opEnumType.getEnumConstants())
            System.out.printf("%f %s %f = %f\n", x, op, y, op.apply(x,y));
    }
    // Example 02
    private static void test2(Collection<? extends Operation> opSet, double x, double y) {
        for(Operation op : opSet)
            System.out.printf("%f %s %f = %f\n", x, op,  y, op.apply(x,y));
    }

    public static void main(String[] args) {
        // Example 01
        double x = 4.0;
        double y = 2.0;
        test(ExtendedOperation.class, x, y);

        System.out.println("==================");
        // Example 02
        test2(Arrays.asList(ExtendedOperation.values()), x, y);
    }

    /*
        While you cannot write an extensible enum type, you can emulate it by writing an interface to accompany a basic enum type that implements the interface.
     */
}
